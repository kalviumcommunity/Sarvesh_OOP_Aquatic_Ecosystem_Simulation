public class AquaticEcoSystem {
    public static void main(String[] args) {
        AquaticEntity fish = new Fish("Clownfish", "Coral Reef", "Plankton");
        AquaticEntity plant = new Plant("Seaweed", "Shallow Waters");

        // Display using DisplayServices
        DisplayServices.display(fish);  // Fish-specific display
        DisplayServices.display(plant); // Plant-specific display
    }
}