public class Algae extends Plant {
    private boolean isMicroscopic;

    public Algae() {
        super(); // Calls Plant constructor
        this.isMicroscopic = true;
        System.out.println("Algae default constructor called.");
    }

    public Algae(String type, String location, boolean isMicroscopic) {
        super(type, location); // Calls Plant constructor
        this.isMicroscopic = isMicroscopic;
    }

    @Override
    public void display() {
        super.display(); // Calls Plant display method
        System.out.println("This algae is " + (isMicroscopic ? "microscopic" : "visible to the naked eye") + ".");
    }

    public void photosynthesize() {
        System.out.println("The Algae is photosynthesizing in the " + getLocation() + ".");
    }

    public boolean isMicroscopic() {
        return isMicroscopic;
    }

    public void setMicroscopic(boolean isMicroscopic) {
        this.isMicroscopic = isMicroscopic;
    }
}
