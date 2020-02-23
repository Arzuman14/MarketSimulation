public class Customer extends Market {
    myBag bag = new myBag();
    private String username;
    private String password;

    Customer() {
    }

    Customer(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addmyBagItem(String key, Market m) {
        if (m.validateProducts(key)) {
            bag.arr.add(m.products.get(key));
            m.products.get(key).setAvailable(m.products.get(key).getAvailable() - 1);
            m.setIncome(m.getIncome() + m.products.get(key).getPrice());
        }

    }

    public void viewMyBag() {
        System.out.println("            MY BAG ITEMS ARE:");
        for (int i = 0; i < bag.arr.size(); i++) {
            System.out.println(bag.arr.get(i).getProductName() + ": " + bag.arr.get(i).getPrice());
        }

    }


}
