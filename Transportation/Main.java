// Main class
public class Main {
    public static void main(String[] args) {
    // Attributes of each vehicle
        ToyotaVIOS car = new ToyotaVIOS(100, "Red", 250000.0, "Radial");
        U2SpyPlane plane = new U2SpyPlane(500, "Gray", 1000000.0, 80.5);
        FandangoYacht boat = new FandangoYacht(30, "White", 500000.0, "Blue");

        System.out.println("Car Details:");
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Tire Type: " + car.getTireType());
        car.drive();
        car.stop();

        System.out.println("\nPlane Details:");
        System.out.println("Speed: " + plane.getSpeed());
        System.out.println("Color: " + plane.getColor());
        System.out.println("Price: " + plane.getPrice());
        System.out.println("Wingspan: " + plane.getWingspan());
        plane.fly();
        plane.stop();

        System.out.println("\nBoat Details:");
        System.out.println("Speed: " + boat.getSpeed());
        System.out.println("Color: " + boat.getColor());
        System.out.println("Price: " + boat.getPrice());
        System.out.println("Main Sail Color: " + boat.getMainSailColor());
        boat.floatBoat();
        boat.stop();
    }
}
