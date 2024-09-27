public class Plant {
    private String type;
    private String location;
    public static int totalPlants = 0;
    public Plant(String type, String location) {
        this.type = type;
        this.location = location;
        totalPlants++;
    }

    public void grow() {
        System.out.println(type + " is growing in the " + location + ".");
    }

    public void spread() {
        System.out.println(type + " is spreading to a new area in the " + location + ".");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int getTotalPlants() {
        return totalPlants;
    }
}