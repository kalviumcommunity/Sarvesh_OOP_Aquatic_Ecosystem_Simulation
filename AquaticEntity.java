public abstract class AquaticEntity {
    private String location;

    public AquaticEntity(String location) {
        this.location = location;
    }

    public abstract void display(); 

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}