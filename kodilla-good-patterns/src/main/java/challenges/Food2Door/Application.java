package challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        SupplyRetriever supplyRetriever = new SupplyRetriever();
        SupplyRequest supplyRequest = supplyRetriever.retrieveSupply();

        SupplyProcessor supplyProcessor = new SupplyProcessor(new GlutenFreeShop(),
                new SupplyServiceInitiator());
        supplyProcessor.processSupply(supplyRequest);
    }
}
