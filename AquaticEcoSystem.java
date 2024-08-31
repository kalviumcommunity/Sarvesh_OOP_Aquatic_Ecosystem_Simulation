public class AquaticEcoSystem {
    public static void main(String[] args) {

        Fish shark = new Fish("Shark", 300.0, "Smaller Fish", "Coral Reef");
        Fish clownfish = new Fish("Clownfish", 5.0, "Algae and Plankton", "Sea Anemone");

        Plant seaweed = new Plant("Seaweed", "Coral Reef");
        Plant algae = new Plant("Algae", "Shallow Waters");

        shark.move();
        shark.feed();

        clownfish.move();
        clownfish.feed();

        seaweed.grow();
        seaweed.spread();

        algae.grow();
        algae.spread();
    }
}