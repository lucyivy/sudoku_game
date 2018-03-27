package challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrdersRepository ordersRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final OrdersRepository ordersRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.ordersRepository = ordersRepository;
    }

    public OrdersDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getDateOfOrder(),
                orderRequest.getProductName());

        if (isOrdered) {
            System.out.println("Order of " + orderRequest.getProductName() + " has been completed.");
            informationService.inform(orderRequest.getUser());
            ordersRepository.createOrder(orderRequest.getUser(), orderRequest.getDateOfOrder(),
                    orderRequest.getProductName());
            return new OrdersDto(orderRequest.getUser(), true);
        } else {
            return new OrdersDto(orderRequest.getUser(), false);
        }
    }
}
