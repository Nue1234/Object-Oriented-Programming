class Vehicle {
    public int speed;
    public String color;
    public double price;

    public Vehicle(int speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }
    	// This line declares a public method named stop() that is responsible for printing the message vehicle has stopped.
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
