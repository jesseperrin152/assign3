

class Item {

    private int itemCode;
    private String Name;

    public Item(String itemCode, String name)
    {
        // number 1-1
        this.itemCode = itemCode;
        this.Name = name;
    }

    //number 1-2
    public void display()
    {
        System.out.print("Item code - " + this.itemCode + " Name - " + this.Name);
    }
}
