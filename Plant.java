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

    @Override
    public void display() {
        System.out.println("Plant Type: " + type + ", Location: " + getLocation());
    }

    public String getType() {
        return type;
    }

    public static int getTotalPlants() {
        return totalPlants;
    }
}