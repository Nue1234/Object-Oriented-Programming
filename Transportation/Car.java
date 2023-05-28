class Car extends Vehicle {
    private String tireType;

    public Car(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    public void drive() { // This line declares a public method named drive(), which is specific to the Car class. It is responsible for printing a message indicating that the car is being driven.
        System.out.println("The car is being driven.");
    }

    public String getTireType() { // This line declares a public method named getTireType(), which returns the value of the tireType variable.
        return tireType; // This line returns the value of the tireType variable when the getTireType() method is called.
    }
}
