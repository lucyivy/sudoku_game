package challenges.Food2Door;

public class SupplyRetriever {

    public SupplyRequest retrieveSupply() {
        String supplierName = "GlutenFreeShop";
        String productName = "Vegan Tofu";
        int productQuantity = 3000;

        return new SupplyRequest(supplierName, productName, productQuantity);
    }
}

