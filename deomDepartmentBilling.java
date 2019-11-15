public class deomDepartmentBilling {

    public static void main(String[] args) {
        //number 6-A
        Grocery grocery1 = new Grocery("11", "Bread", 1.50, 2, 0);
        Grocery grocery2 = new Grocery("12", "Apple", 0.75, 6, 1);

        //number 6-B
         Clothing clothing1 = new Clothing("21", "Jeans", "Levis", 35, 1, 0);
        Clothing clothing2 = new Clothing("22", "Dress Shirt", "Izod", 25, 2, 10);
        double totalPrice = 0;
        totalPrice = grocery1.computeTotalPrice() + grocery2.computeTotalPrice() + clothing1.computeTotalPrice() + clothing2.computeTotalPrice();

        //number 6 at bottom
        grocery1.displayGrocery();
        grocery2.displayGrocery();
        clothing1.displayClothing();
        clothing2.displayClothing();

        //number 6-C
        System.out.println("\nThe total bill amount is - $" + totalPrice);
    }
}
