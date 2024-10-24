public class Plant extends AquaticEntity {

    private String type;
    public static int totalPlants = 0;


    public Plant() {
        super();
        this.type = "Unknown";
        totalPlants++;
        System.out.println("Plant default constructor called.");
    }

    public Plant(String type, String location) {
        super(location);
        this.type = type;
        totalPlants++;
    }

    public void grow() {
        System.out.println(type + " is growing in the " + getLocation() + ".");
    }

    public void spread() {
        System.out.println(type + " is spreading to a new area in the " + getLocation() + ".");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getTotalPlants() {
        return totalPlants;
    }
    @Override
    public void display() {
        System.out.println("Plant Type: " + type + ", Location: " + getLocation());
    }
}