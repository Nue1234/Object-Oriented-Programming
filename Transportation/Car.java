class Car extends Vehicle {
    private String tireType;

    public Car(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    public void drive() { // This is a method named drive responsible for printing the message drive telling that the car is being driven.
        System.out.println("The car is being driven.");
    }

    public String getTireType() {
        return tireType; // This line returns the value of the tireType variable when the getTireType() method is called.
    }
}
