package pkg;

import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Connor Byrd, Chad Baxter, Chris Vasquez
 * @Description Handles persistency of the program
 */

public class DatabaseHandler {

  private static final String path = "";
  //private static String invUpdate = "";

  /**
   *
   */
  public static void loadDatabase() {
    Gson gson = new GsonBuilder().create();
    try {
      JsonElement jsonList = new JsonParser()
              .parse(new BufferedReader(new FileReader("database.json")).readLine());
      JsonObject jsonWarehouseList = jsonList.getAsJsonObject().get("WarehouseList").getAsJsonObject();
      JsonObject jsonAccountList = jsonList.getAsJsonObject().get("AccountList").getAsJsonObject();
      WarehouseList warehouseList = gson.fromJson(jsonWarehouseList, WarehouseList.class);
      HashMap<String, ArrayList<Object>> accountList = gson.fromJson(jsonAccountList, HashMap.class);
      WarehouseFactory.getInstance().populate(warehouseList);
      OutputBuffer.getInstance().add("Warehouses populated.");
      ArrayList<Account> al = new ArrayList<>();
      for(int i = 0; i < accountList.size(); i++) {
        Object[] names = accountList.keySet().toArray();
        ArrayList<ArrayList<Object>> fields = new ArrayList<ArrayList<Object>>(accountList.values());
        switch ((int)fields.get(i).get(0)) {
          case 0 : {
            al.add(new Nobody());
          }
          case 1 : {
            al.add(new Employee((String)names[i], (byte[])fields.get(i).get(1),(byte[])fields.get(i).get(2)));
          }
          case 2 : {
            al.add(new WarehouseManager((String)names[i], (byte[])fields.get(i).get(1),(byte[])fields.get(i).get(2)));
          }
          case 3 : {
            al.add(new OfficeManager((String)names[i], (byte[])fields.get(i).get(1),(byte[])fields.get(i).get(2)));
          }
          case 4 : {
            al.add(new Admin((String)names[i], (byte[])fields.get(i).get(1),(byte[])fields.get(i).get(2)));
          }
        }
      }
      OutputBuffer.getInstance().add("Accounts populated.");
      OutputBuffer.getInstance().add("Database fully loaded.");
    } catch (Exception e) {
      OutputBuffer.getInstance().add("Failed to load database.");
    }
  }

  /**
   *
   */
  public static void saveDatabase() {
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    HashMap<String,ArrayList<Object>> accounts = new HashMap<>();
    for(Account a : LoginHandler.getInstance().getAccounts().values()) {
      ArrayList<Object> al = new ArrayList<>();
      al.add(a.PERM_LEVEL);
      al.add(a.passHash);
      al.add(a.passSalt);
      accounts.put(a.getUserName(), al);
    }
    JsonElement jsonWarehouseList = gson.toJsonTree(WarehouseFactory.getInstance().getWarehouseList());
    JsonElement jsonAccountList = gson.toJsonTree(accounts);
    JsonElement jsonBundleList = gson.toJsonTree(BundleFactory.getInstance().getBundleList());
    JsonObject jsonList = new JsonObject();
    jsonList.add("WarehouseList", jsonWarehouseList);
    jsonList.add("AccountList", jsonAccountList);
    jsonList.add("BundleList", jsonBundleList);
    try (Writer writer = new FileWriter("database.json")) {
      writer.write(gson.toJson(jsonList));
      writer.close();
      OutputBuffer.getInstance().add("Saved database.");
    } catch (Exception e) {
      OutputBuffer.getInstance().add("Failed to save database.");
    }
  }

  /**
   * @return file path
   */
  public static String getPath() {
    return path;
  }

  /**
   * @return strings to the OutputBuffer
   */
  public static void updateInventory(File file) {
    //File file = new File(invUpdate);
    ArrayList<BikePart> parts = new ArrayList<>();
    try {
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String line = br.readLine();
      while ((line = br.readLine()) != null) {
        parts.add(new BikePart(line.split(",")[0], Long.parseLong(line.split(",")[1]),
                Double.parseDouble(line.split(",")[2]), Double.parseDouble(line.split(",")[3]),
                Boolean.parseBoolean(line.split(",")[4]), Integer.parseInt(line.split(",")[5])));
      }
      for (int i = 0; i < parts.size(); i++) {
        BikePart p = parts.get(i);
        if (!WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().getCurrentList().contains(p)) {
          WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().addPart(p);
        }
        if (!p.getListPrice().equals(parts.get(i).getListPrice())) {
          WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().getByName(parts.get(i).getPartName())
                  .setListPrice(parts.get(i).getListPrice());
        }
        if (!p.getSalePrice().equals(parts.get(i).getSalePrice())) {
          WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().getByName(parts.get(i).getPartName())
                  .setSalePrice(parts.get(i).getSalePrice());
        }
        if (p.isOnSale() != parts.get(i).isOnSale()) {
          WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().getByName(parts.get(i).getPartName())
                  .setOnSale(parts.get(i).isOnSale());
        }
        WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList().getByName(parts.get(i).getPartName())
                .setQuantity((WarehouseFactory.getInstance().getWarehouse("mainWarehouse").getiList()
                        .getByName(parts.get(i).getPartName()).getQuantity()) + parts.get(i).getQuantity());
      }
    } catch (FileNotFoundException e) {
      OutputBuffer.getInstance()
              .add("The file " + file + " could not be found. Please check spelling and try again");

    } catch (IOException e) {
      OutputBuffer.getInstance().add("The BufferedReader was unable to attach to the FileReader");
    }
  }

  /**
   * @param file
   * @return Strings to the OutputBuffer
   */
  public static void readInventoryFile(File file) {
    String originWarehouse = "";
    String destinationWarehouse = "";

    try {
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line = bufferedReader.readLine();
      if (line.split(",")[0].equals("mainWarehouse")) {
        originWarehouse = "mainWarehouse";
        if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[1]) != null) {
          destinationWarehouse = line.split(",")[1];
        } else {
          OutputBuffer.getInstance().add(
                  "The Warehouse " + line.split(",")[1] + " does not exist. Please add it and try again.");
          return;
        }
      } else {
        if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[0]) != null) {
          originWarehouse = line.split(",")[0];
        } else {
          OutputBuffer.getInstance().add(
                  "The Warehouse " + line.split(",")[0] + " does not exist. Please add it and try again.");
          return;
        }
        if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[1]) != null) {
          destinationWarehouse = line.split(",")[1];
        } else {
          OutputBuffer.getInstance().add(
                  "The Warehouse " + line.split(",")[1] + " does not exist. Please add it and try again.");
          return;
        }
      }
      if (originWarehouse.equals("mainWarehouse")) {
        while ((line = bufferedReader.readLine()) != null) {
          String partName = line.split(",")[0];
          Integer quantity = Integer.parseInt(line.split(",")[1]);
          if (quantity > WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList()
                  .getByName(partName).getQuantity()) {
            OutputBuffer.getInstance().add("Not enough parts available.");
            return;
          }
          try {
            WarehouseFactory.getInstance().getWarehouse(destinationWarehouse).getiList()
                    .getByName(partName);
          } catch (Exception e) {
            BikePart temp = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList()
                    .getByName(partName);
            WarehouseFactory.getInstance().getWarehouse(destinationWarehouse).getiList()
                    .addPart(new BikePart(temp.getPartName(), temp.getPartNumber(), temp.getListPrice(),
                            temp.getSalePrice(), temp.isOnSale(), quantity));
          }
        }
      } else {
        if (!originWarehouse.equals("") && !destinationWarehouse.equals("")) {
          while ((line = bufferedReader.readLine()) != null) {
            readInventoryLine(line, originWarehouse, destinationWarehouse);
          }
        }
      }
      fileReader.close();
      OutputBuffer.getInstance().add("Read file successfully.");
    } catch (IOException e) {
      OutputBuffer.getInstance().add("Failed to read file.");
      return;
    }
  }

  /**
   * @param line
   * @param origin
   * @param dest
   * @return String to the OutputBuffer
   */
  private static void readInventoryLine(String line, String origin, String dest) {
    String partName = null;
    int quantity = 0;
    boolean addToDB = true;
    try {
      partName = line.split(",")[0];
      quantity = Integer.parseInt(line.split(",")[1]);
    } catch (Exception e) {
      OutputBuffer.getInstance().add("Failed to parse input.");
      addToDB = false;
    } finally {
      if (addToDB) {
        if (WarehouseFactory.getInstance().getWarehouse(origin).getiList().getByName(partName)
                .decrement(quantity)) {
          if (WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(partName) != null) {
            BikePart temp = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList()
                    .getByName(partName);
            WarehouseFactory.getInstance().getWarehouse(dest).getiList()
                    .addPart(new BikePart(temp.getPartName(), temp.getPartNumber(), temp.getListPrice(),
                            temp.getSalePrice(), temp.isOnSale(), quantity));
          } else {
            WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(partName)
                    .increment(quantity);
          }
        } else {
          OutputBuffer.getInstance().add("Insufficient amount of parts.");
        }

      }
    }
  }
}
