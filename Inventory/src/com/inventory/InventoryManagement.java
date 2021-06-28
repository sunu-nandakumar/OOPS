package com.inventory;
import java.io.FileReader;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
public class InventoryManagement {

	public static void main(String[] args) {
		
			JSONParser parser = new JSONParser();
			try {
				Object obj = parser.parse(new FileReader(".//src/inventoryDetails.json"));
				JSONObject jsonObject = (JSONObject) obj;
				JSONArray inventory = (JSONArray) jsonObject.get("inventory");
				
				System.out.println(inventory);
				JSONObject jsobj = (JSONObject) inventory.get(0);
				System.out.println(jsobj);
				Double price = (double) jsobj.get("Price_Per_Kg");
				System.out.println(price);

			} catch (Exception e) {
				e.printStackTrace();
			}

			

	}

}
