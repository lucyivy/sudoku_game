package challenges.Food2Door;

public class SupplyRequest {
    private String supplierName;
    private String productName;
    private int productQuantity;

    public SupplyRequest(String supplierName, String productName, int productQuantity) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "SupplyRequest{" +
                "supplierName='" + supplierName + '\'' +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplyRequest that = (SupplyRequest) o;

        if (productQuantity != that.productQuantity) return false;
        if (supplierName != null ? !supplierName.equals(that.supplierName) : that.supplierName != null) return false;
        return productName != null ? productName.equals(that.productName) : that.productName == null;
    }

    @Override
    public int hashCode() {
        int result = supplierName != null ? supplierName.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + productQuantity;
        return result;
    }
}
