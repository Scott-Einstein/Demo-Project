public class Food {

    public Food(int id, String name, String type, int size, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    //New branch modification
    @Override
    public String toString() {
        return String.format("%s %s: (%d Inches) %.2f $", getType(), getName(), getSize(), getPrice());
    }

    private int id;
    private String name;
    private String type;
    private int size;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInformation() {
        System.out.printf("[id] %-2d [type] %-10s [name] %-10s [size] %2d (Inches) %.2f $\n",
                this.id, this.type, this.name, this.size, this.price);
    }

}
