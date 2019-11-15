public class Clothing {
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp=8.5;

    //number 5-1
    public Clothing(String itemCode, String Name, String brand,double price, double units, double discount){
        super(itemCode, Name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    //number 5-2, override this
    @Override
    public double computeDiscount() {
        return (units * price) * (discount / 100.00);
    }

    // number 5-3
    @Override
    public double computeTax() {
        return ((units * price) - computeDiscount()) * 8.5 / 100;
    }

    //number 5-4
    double computeTotalPrice() {
        return (units * price) - computeDiscount() + computeTax();
    }

    //number 5-5
    public void displayClothing() {
        super.display();
        System.out.println(" units - " + this.units + "\n price - $" + this.price + "\n brand - " + this.brand + "\n discount - " + this.discount + "%");
    }
}
