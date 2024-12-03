public class AquaticEcoSystem {
    public static void main(String[] args) {
        // Create instances
        Fish fish1 = new Fish("Clownfish", 5.0, "Algae and Plankton", "Coral Reef");
        Plant plant1 = new Plant("Seaweed", "Shallow Waters");

        Shark shark1 = new Shark("Great White Shark", 1500.0, "Seals", "Ocean", 35.0);

        // Services
        FishActions fishActions = new FishActions();
        PlantActions plantActions = new PlantActions();
        DisplayService displayService = new DisplayService();

        // Fish operations
        displayService.display(fish1);
        fishActions.move(fish1);
        fishActions.feed(fish1);

        // Plant operations
        displayService.display(plant1);
        plantActions.grow(plant1);
        plantActions.spread(plant1);

        // Shark operations
        displayService.display(shark1);
        fishActions.move(shark1, "forward", 20);
        shark1.hunt();

        // Totals
        System.out.println("Total Fish: " + Fish.getTotalFish());
        System.out.println("Total Plants: " + Plant.getTotalPlants());
    }
}
