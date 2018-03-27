package challenges;

public class OrdersDto {
    private User user;
    private boolean isOrdered;

    public OrdersDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
