class Plane extends Vehicle {
    private double wingspan;

    public Plane(int speed, String color, double price, double wingspan) {
        super(speed, color, price);
        this.wingspan = wingspan;
    }

    public void fly() { // This is a method named fly responsible for printing the message telling that the plane is flying.
        System.out.println("The plane is flying."); 
    }

    public double getWingspan() { 
        return wingspan; // This line returns the value of the tireType variable when the getTireType() method is called.
    }
}
