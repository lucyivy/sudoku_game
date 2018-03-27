package challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime dateOfOrder;
    private String productName;

    public OrderRequest(User user, LocalDateTime dateOfOrder, String productName) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.productName = productName;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public String getProductName() {
        return productName;
    }
}
