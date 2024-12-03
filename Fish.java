public class Fish extends AquaticEntity {
    private String name;
    private String dietType;
    private FishActions actions; // Using actions class

    public Fish(String name, String location, String dietType) {
        super(location);
        this.name = name;
        this.dietType = dietType;
        this.actions = new FishActions();
    }

    @Override
    public void display() {
        System.out.println("Fish Name: " + name + ", Location: " + getLocation());
    }

    public void swim() {
        actions.swim(getLocation()); 
    }

    public void feed() {
        actions.feed(dietType);
    }
}
