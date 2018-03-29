package challenges.Food2Door;

public class ExtraFoodShop implements Supplier {

    public boolean process() {
        System.out.println("Thank you for using Extra Food Shop supply service. " +
                "We're processing your order. If any of the requested items will not be available we will contact you within 24h");
        return true;
    }
}
