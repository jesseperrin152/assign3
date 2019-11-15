public class Grocery extends Item implements Discount, Tax {
    double price;
    double units;
    double discount;

    //number 4-1, get info from Item.java and above
    public Grocery(String itemCode, String name, double price, double units, double discount){
        super(itemCode, name);
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    //number 4-2
    public double computeDiscount() {
        //compute and return discount
        return (units * price) * (discount / 100.0);
    }

    //number 4-3, pass 0 when there is no discount or certain percentage
    public double computeTax() {
        return 0;
    }

    //number 4-4
    public double computeTotalPrice() {
        //needs to return total, units*price - discount
        double discount = computeDiscount();
        return (units * price) - discount + computeTax();
    }

    //number 4-5
    public void displayGrocery(){

        super.display();
        System.out.println(" units - " + this.units + ", price - $" + this.price + ", Discount - " + this.discount + "%, Tax - 0");
    }
}
