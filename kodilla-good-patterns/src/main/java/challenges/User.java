package challenges;

public class User {
    private String firstName;
    private String secondName;
    private String shippingAddress;

    public User(String firstName, String secondName, String shippingAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.shippingAddress = shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
