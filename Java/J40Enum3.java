enum Laptop {
    // constructor
    Macbook(2000), XPS(2200), Surface, ThinkPad;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    /*
     * in Laptop Macbook
     * in Laptop XPS
     */
    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        this.price = p;
    }

}

public class J40Enum3 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        // System.out.println(lap +" : "+ lap.getPrice());//Macbook : 2000

        for (Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
        /*
         * Macbook : 2000
         * XPS : 2200
         * Surface : 500
         * ThinkPad : 500
         */
    }
}
