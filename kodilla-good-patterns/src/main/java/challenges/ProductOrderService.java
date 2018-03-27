package challenges;

import java.time.LocalDateTime;

public interface ProductOrderService {
    public boolean order(User user, LocalDateTime dateOfOrder, String productName);
}
