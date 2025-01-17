package Day06.Level02;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " more items added.");
    }

    public void removeItem(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " items removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    public void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cartItem = new CartItem("Book", 500, 2);
        cartItem.addItem(3);
        cartItem.removeItem(1);
        cartItem.displayTotalCost();
    }
}
