public class Fish extends AquaticEntity {
    private String name;
    private double size; 
    private String dietType;    
    public static int totalFish = 0;

    public Fish() {
        super();
        this.name = "Unnamed";
        this.size = 0;
        this.dietType = "Unknown";
        totalFish++;
        System.out.println("Fish default constructor called.");
    }

    public Fish(String name, double size, String dietType, String location) {
        super(location);
        this.name = name;
        this.size = size;
        this.dietType = dietType;
        totalFish++;
    }

    @Override
    public void display() {
        System.out.println("Fish Name: " + name + ", Location: " + getLocation());
    }

    public void move() {
        System.out.println(name + " is swimming in the " + getLocation() + ".");
    }

    public void feed() {
        System.out.println(name + " is feeding on " + dietType + ".");
    }

    public static int getTotalFish() {
        return totalFish;
    }
}