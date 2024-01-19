package application;
//DTO{DATA TRANSFER OBJECT

public class Product {

    private int productId;
    private String productName;
    private  double productPrice;
    private  String productType;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public String setProductName() {
        this.productName = productName;
        return null;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double setProductPrice() {
        this.productPrice = productPrice;
        return 0;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }



}