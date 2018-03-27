package challenges;

import java.time.LocalDateTime;

public class OrderRetriever {
    public OrderRequest retreive(){
        User user = new User("John", "Smith", "Stone Road, 1234 Ncity");

        LocalDateTime dateOfOrder = LocalDateTime.of(2018, 3, 26, 12, 51);

        String productName = "Game X";

        return new OrderRequest(user, dateOfOrder, productName);
    }
}
