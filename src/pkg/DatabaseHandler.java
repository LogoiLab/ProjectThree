package pkg;

import java.io.*;
import java.lang.reflect.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.*;

public class DatabaseHandler {

    private static final String path = "";
    private static String invUpdate = "";

    public static void loadDatabase() {
/*	    Gson gson = new GsonBuilder().create();
        try {
			JsonElement jsonList = new JsonParser().parse(new BufferedReader(new FileReader("database.json")).readLine());
			for (int i = 0; i < jsonList.getAsJsonObject().get("PartList").getAsJsonArray().size(); i++) {
				JsonObject jsonPart = jsonList.getAsJsonObject().get("PartList").getAsJsonArray().get(i).getAsJsonObject();
				Part part = gson.fromJson(jsonPart, Part.class);
				PartList.getInstance().add(part);
			}
			for (int i = 0; i < jsonList.getAsJsonObject().get("WarehouseList").getAsJsonArray().size(); i++) {
				JsonObject jsonWarehouse = jsonList.getAsJsonObject().get("PartList").getAsJsonArray().get(i).getAsJsonObject();
				Warehouse warehouse = gson.fromJson(jsonWarehouse, Warehouse.class);
				WarehouseFactory.getInstance().add(warehouse);
			}
			OutputBuffer.getInstance().add("Database loaded.");
		} catch (Exception e) {
			OutputBuffer.getInstance().add("Failed to load database.");
		} */
    }

    public static void saveDatabase() {
/*		GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
		JsonElement jsonPartList = gson.toJsonTree(partList.getPartListCurr());
		JsonElement jsonWarehouseList = gson.toJsonTree(WarehouseFactory.getInstance().getWarehouseList());
		JsonObject jsonList = new JsonObject();
		jsonList.add("PartList", jsonPartList);
		jsonList.add("WarehouseList", jsonWarehouseList);
		try (Writer writer = new FileWriter("database.json")) {
			writer.write(gson.toJson(jsonList));
			writer.close();
			OutputBuffer.getInstance().add("Saved database.");
		} catch (Exception e) {
			OutputBuffer.getInstance().add("Failed to save database.");
		}*/
    }

    public static void readMoveFile(String path) {
        String wh1 = "";
        String wh2 = "";
        Long partnum = new Long(0);
        int quantity = 0;
        WarehouseFactory.getInstance().moveParts(wh1, wh2, partnum, quantity);
    }

    public static String getPath() {
        return path;
    }


    public static void updateInventory() {
        String dest = "";
        File file = new File(invUpdate);
        ArrayList<BikePart> parts = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[0]) != null)
                dest.equals(WarehouseFactory.getInstance().getWarehouse(line.split(",")[0]));
            else
                OutputBuffer.getInstance().add("the Warehouse " + line.split(",")[0] + " does not exist. Please add it and try again");
            while ((line = br.readLine()) != null) {
                parts.add(new BikePart(line.split(",")[0],Long.parseLong(line.split(",")[1]),Double.parseDouble(line.split(",")[2]),Double.parseDouble(line.split(",")[3]),
                        Boolean.parseBoolean(line.split(",")[4]),Integer.parseInt(line.split(",")[5])));
            }
            for(int i=0;i<parts.size();i++){
                BikePart p = WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName());
                if(!WarehouseFactory.getInstance().getWarehouse(dest).getiList().getCurrentList().contains(p)){
                    WarehouseFactory.getInstance().getWarehouse(dest).getiList().addPart(p);
                    break;
                }
                if(!p.getListPrice().equals(parts.get(i).getListPrice())){
                    WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName()).setListPrice(parts.get(i).getListPrice());
                }
                if(!p.getSalePrice().equals(parts.get(i).getSalePrice())){
                    WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName()).setSalePrice(parts.get(i).getSalePrice());
                }
                if(p.isOnSale() != parts.get(i).isOnSale()){
                    WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName()).setOnSale(parts.get(i).isOnSale());
                }
                WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName()).setQuantity(
                        (WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(parts.get(i).getPartName()).getQuantity())+parts.get(i).getQuantity());
            }
        } catch (FileNotFoundException e) {
            OutputBuffer.getInstance().add("The file "+invUpdate+" could not be found. Please check spelling and try again");

        } catch (IOException e) {
            OutputBuffer.getInstance().add("The BufferedReader was unable to attach to the FileReader");
        }
    }

    private static void readInventoryFile(File file) {
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
                    OutputBuffer.getInstance().add("The Warehouse " + line.split(",")[1] + " does not exist. Please add it and try again.");
                    return;
                }
            } else {
                if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[0]) != null) {
                    originWarehouse = line.split(",")[0];
                } else {
                    OutputBuffer.getInstance().add("The Warehouse " + line.split(",")[0] + " does not exist. Please add it and try again.");
                    return;
                }
                if (WarehouseFactory.getInstance().getWarehouse(line.split(",")[1]) != null) {
                    destinationWarehouse = line.split(",")[1];
                } else {
                    OutputBuffer.getInstance().add("The Warehouse " + line.split(",")[1] + " does not exist. Please add it and try again.");
                    return;
                }
            }
            if (originWarehouse.equals("mainWarehouse")) {
                while ((line = bufferedReader.readLine()) != null) {
                    String partName = line.split(",")[0];
                    int quantity = Integer.parseInt(line.split(",")[1]);
                    if (quantity > WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList().getByName(partName).getQuantity()) {
                        OutputBuffer.getInstance().add("Not enough parts available.");
                        return;
                    }
                    try {
                        WarehouseFactory.getInstance().getWarehouse(destinationWarehouse).getiList().getByName(partName);
                    } catch (Exception e) {
                        BikePart temp = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList().getByName(partName);
                        WarehouseFactory.getInstance().getWarehouse(destinationWarehouse).getiList().addPart(new BikePart(temp.getPartName(), temp.getPartNumber(), temp.getListPrice(), temp.getSalePrice(), temp.isOnSale(), quantity));
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
                if (WarehouseFactory.getInstance().getWarehouse(origin).getiList().getByName(partName).decrement(quantity)) {
                    if (WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(partName) != null) {
                        BikePart temp = WarehouseFactory.getInstance().getWarehouse("MainWarehouse").getiList().getByName(partName);
                        WarehouseFactory.getInstance().getWarehouse(dest).getiList().addPart(new BikePart(temp.getPartName(), temp.getPartNumber(), temp.getListPrice(), temp.getSalePrice(), temp.isOnSale(), quantity));
                    } else {
                        WarehouseFactory.getInstance().getWarehouse(dest).getiList().getByName(partName).increment(quantity);
                    }
                } else {
                    OutputBuffer.getInstance().add("Insufficient amount of parts.");
                }

            }
        }
    }
}
