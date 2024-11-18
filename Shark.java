public class Shark extends Fish {
    private double speed; // Speed in miles per hour

    public Shark() {
        super(); // Calls Fish constructor
        this.speed = 0;
        System.out.println("Shark default constructor called.");
    }

    public Shark(String name, double size, String dietType, String location, double speed) {
        super(name, size, dietType, location); // Calls Fish constructor
        this.speed = speed;
    }

    @Override
    public void display() {
        super.display(); // Calls Fish display method
        System.out.println("This Shark swims at a speed of " + speed + " mph.");
    }

    public void hunt() {
        System.out.println("The Shark is hunting in the " + getLocation() + ".");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}