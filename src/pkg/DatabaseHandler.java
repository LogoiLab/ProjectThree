package pkg;

import java.io.*;
import java.lang.reflect.Type;

import com.google.gson.*;

public class DatabaseHandler {
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
}