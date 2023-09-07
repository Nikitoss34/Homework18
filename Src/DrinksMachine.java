public enum DrinksMachine {

    COFFEE(3),
    TEA( 1.5),
    LEMONADE(1),
    MOJITO(2),
    MINERAL_WATER(0.5),
    COCA_COLA(2.0);
    private double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
