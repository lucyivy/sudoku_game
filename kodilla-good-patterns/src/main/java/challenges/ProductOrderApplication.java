package challenges;

public class ProductOrderApplication {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retreive();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new EmailInformationService(),
                new GameProductService(), new GameOrdersRepository());
        productOrderProcessor.process(orderRequest);
    }
}
