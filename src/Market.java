import java.util.HashMap;
import java.util.Scanner;

/**This method is for simulating online market activates. Here you can
 *     1. add products (as administrator)
 *     2. change characteristics of the products (as an administrator )
 *     3. add employees (as an  administrator)
 *     4. change some characteristics of the employees (as an administrator)
 *     5. view income  of the market (as an administrator )
 *     6. view available products (as customer as well as administrator)
 *     7. add products to your bag(by items as a customer)
 *     8. view already purchased items (as a customer)
 *     . */

public class Market {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Products> products = new HashMap<>();
    HashMap<String, Employees> employees = new HashMap<>();
    private int income;

    public static void main(String[] args) {
        Market superMarket = new Market();


        //This is the list of the products
        // You can add an product  calling addProduct method on object of your market by mentioning ProductName, ProductID, quantity of that product in the market and the price



        superMarket.addProduct("Pringlse", 11, 4, 1000);
        superMarket.addProduct("LM", 12, 10, 460);
        superMarket.addProduct("Head&Shoulders", 13, 20, 2500);
superMarket.productAvailability();

        //End of the product list


        //  This is section of customer's Bag in case they buy a product their purchases goes to there
        //  This object has 2 options addingBagItem and viewing all items of the bag*/
        Customer cos1 = new Customer();
        cos1.addmyBagItem("Pringlse", superMarket);
        cos1.addmyBagItem("LM", superMarket);
        cos1.viewMyBag();

        // End of the Bag demonstration  */


        //This is the list of the employees and
        //  1.You can add them  using addEmployees method by mention name surname and position
        //  2.You can see all the employees list by calling printingEmployeeSet method on the object of your Market
        // 3.You can remove certain Employee by calling removeEmployee method on the object of your market by mentioning his/her position


        superMarket.addEmployees("Arzuman", "Aboyan", "accountant");
        superMarket.addEmployees("Vigen", "Torosyan", "secretary");
        superMarket.addEmployees("Poghos", "Poghosyan", "CTO");
        superMarket.removeEmployees("secretary");



        //End of Employees



    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int i) {
        income = i;
    }
// This method checks if the certain key is valid or not if it is not valid validateProduct calls as much until getting right key
    public boolean validateProducts(String Key) {
        if (products.containsKey(Key)) {
            return true;
        } else {
            System.out.println("Your imputed key is not valid please input another key");
            return validateProducts(sc.nextLine());
        }
    }
//printing all the products in the Market available in the store
    public void productAvailability() {

        System.out.println("                     Here is product list" );
        for (String key : products.keySet()) {
            if (products.get(key).getAvailable()>0)
            System.out.println("Product name: " +key+ "    " +"available amount: "+products.get(key).getAvailable());
        }


    }
    // Shows all the Employees of the market

    private void printingEmployeeSet() {
        for (String key : employees.keySet()) {
            System.out.println(key);
        }
    }


    // you can add Employees by mentioning name surname and position it adds the certain employee to the hashMap of employees

    private void addEmployees(String name, String surname, String position) {
        Employees emp = new Employees(name, surname, position);
        employees.put(position, emp);

    }

    //This method removes employees form the hashMap of the employees

    private void removeEmployees(String position) {
        if (employees.containsKey(position)) {
            employees.remove(position);
        } else {
            System.out.println("There is no such position please try another one");
            removeEmployees(sc.nextLine());
        }

    }

    // You can add products by calling this method on the object of market by mentioning productName, ProductID, count and price in the same order
    private void addProduct(String productName, int ProductID, int count, int price) {
        Products prod = new Products(productName, ProductID, count, price);
        products.put(productName, prod);

    }

    //This method is for removing certain product by mentioning product Name as a key

    private void removeProducts(String productName) {
        if (products.get(productName).getAvailable() == 0) {
            System.out.println("You dont have this kind of product");
        } else {
            products.get(productName).setAvailable(products.get(productName).getAvailable() - 1);
        }
    }

    // By calling this method  on your object of the market you can remove multiple items of the ame key at once

    private void removeMultiple(String key, int a) {

        if (products.get(key).getAvailable() >= a) {
            for (int i = 0; i < a; i++) {
                removeProducts(key);
            }
        }
    }
}
