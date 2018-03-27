package challenges;

import java.time.LocalDateTime;

public interface OrdersRepository {
    public void createOrder(User user, LocalDateTime dateOfOrder, String productName);
}
