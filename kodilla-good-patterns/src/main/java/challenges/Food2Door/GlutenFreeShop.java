package challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {
    private Map<String, Integer> glutenFreeShopMap;

    public GlutenFreeShop() {
        glutenFreeShopMap = new HashMap<>();
        glutenFreeShopMap.put("Vegan Tofu", 7000);
        glutenFreeShopMap.put("Strawberry Jam", 3000);
        glutenFreeShopMap.put("Egg", 1000);
    }

    public boolean process() {
        System.out.println("Checking the availability.");
        SupplyRetriever supplyRetriever = new SupplyRetriever();
        SupplyRequest supplyRequest = supplyRetriever.retrieveSupply();
        boolean available = false;
        for (Map.Entry<String, Integer> entry : glutenFreeShopMap.entrySet()) {
            if (entry.getKey().equals(supplyRequest.getProductName()) && entry.getValue() > supplyRequest.getProductQuantity()) {
                available = true;
                break;
            } else {
                available = false;
            }
        }
        return available;
    }
}
