import java.security.Principal;
import java.util.HashMap;

 class Products {

    private  String productName;
    private int productID;
    private int available;
    private int price;




    Products(){}

    Products(String name, int ID, int count, int price){
        productName = name;
        productID = ID;
        available = count;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getProductID(){
        return productID;
    }

    public void setProductID(int ID){
        productID = ID;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;

    }

//    public static void main(String[] args) {
//        Products products1 = new Products("Pringlce", 11, 4,1000);
//        HashMap<String, Integer>  map = new HashMap<>();
//        map.put("Pringlce", 11);
//        System.out.println(map.get("Pringlce"));
//
//
//    }
}
