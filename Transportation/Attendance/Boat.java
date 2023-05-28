class Boat extends Vehicle {
    private String mainSailColor;

    public Boat(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    public void floatBoat() {
        System.out.println("The boat is floating.");
    }

    public String getMainSailColor() {
        return mainSailColor;
    }
}
