public class AquaticEcoSystem {
    public static void main(String[] args) {

        Fish shark = new Fish("Shark", 300.0, "Smaller Fish", "Coral Reef");
        Fish clownfish = new Fish("Clownfish", 5.0, "Algae and Plankton", "Sea Anemone");
        Fish tuna = new Fish("Tuna", 3.5, "Small Fish", "Deep Sea");


        Plant seaweed = new Plant("Seaweed", "Coral Reef");
        Plant algae = new Plant("Algae", "Shallow Waters");
        Plant kelp = new Plant("Kelp", "Shallow Waters");
        Plant seagrass = new Plant("Seagrass", "Coastal Areas");
        

          Fish[] fishes = {
            new Fish("Guppy", 400, "Algae", "Freshwater Pond"),
            new Fish("Swordfish", 340, "Squid", "Deep Ocean"),
            new Fish("Barracuda", 20, "Small Fish", "Coral Reef")
          };

            Plant[] plants = {
            new Plant("Water Lily", "Still Waters"),
            new Plant("Mangrove", "Coastal Swamps")
            };

         for (Fish fish : fishes) {
            fish.move();
            fish.feed();
        }

        for (Plant plant : plants) {
            plant.spread();
        }
        
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