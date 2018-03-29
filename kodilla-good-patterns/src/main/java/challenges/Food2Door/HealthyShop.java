package challenges.Food2Door;

import java.util.ArrayList;

public class HealthyShop implements Supplier {
    private ArrayList<String> healthyShopList;

    public HealthyShop() {
        healthyShopList = new ArrayList<>();
        healthyShopList.add("Vegan Tofu");
        healthyShopList.add("Salmon");
        healthyShopList.add("Cranberry Bites");
        healthyShopList.add("Soy Milk");
    }

    public boolean process() {
        System.out.println("HealthyShop supply service - processing your request.");
        SupplyRetriever supplyRetriever = new SupplyRetriever();
        SupplyRequest supplyRequest = supplyRetriever.retrieveSupply();
        if (healthyShopList.contains(supplyRequest.getProductName())) {
            return true;
        } else {
            return false;
        }
    }
}
