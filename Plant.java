public class Plant {
    private String type;
    private String location;

    public Plant(String type, String location) {
        this.type = type;
        this.location = location;
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
}