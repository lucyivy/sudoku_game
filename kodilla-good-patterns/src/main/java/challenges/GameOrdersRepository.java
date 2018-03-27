package challenges;

import java.time.LocalDateTime;

public class GameOrdersRepository implements OrdersRepository {

    public void createOrder(User user, LocalDateTime dateOfOrder, String productName) {
        System.out.println("Adding the order to the Game Orders Repository.");
    }
}
