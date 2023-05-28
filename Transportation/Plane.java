class Plane extends Vehicle {
    private double wingspan;

    public Plane(int speed, String color, double price, double wingspan) {
        super(speed, color, price);
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println("The plane is flying.");
    }

    public double getWingspan() {
        return wingspan;
    }
}
