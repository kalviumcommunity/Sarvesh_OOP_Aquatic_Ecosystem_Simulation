public class Plant extends AquaticEntity {
    private String type;

    public Plant(String type, String location) {
        super(location);
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Plant Type: " + type + ", Location: " + getLocation());
    }

    public void photosynthesize() {
        System.out.println(type + " is photosynthesizing in the " + getLocation() + ".");
    }
}
