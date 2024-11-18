public abstract class AquaticEntity {
    
    private String location;

    public AquaticEntity() {
        this.location = "unknown";
        System.out.println("AquaticEntity default constructor called.");
    }
    
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