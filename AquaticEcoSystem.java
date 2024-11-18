public class AquaticEcoSystem {
   public static void main(String[] args) {
       // Fish and Shark
       Fish fish1 = new Fish("Clownfish", 5.0, "Algae and Plankton", "Coral Reef");
       fish1.display();
       fish1.move();
       fish1.feed();

       Shark shark1 = new Shark("Great White Shark", 1500.0, "Seals", "Ocean", 35.0);
       shark1.display();
       shark1.move();
       shark1.hunt();

       // Plant and Algae
       Plant plant1 = new Plant("Seaweed", "Shallow Waters");
       plant1.display();
       plant1.grow();
       plant1.spread();

       Algae algae1 = new Algae("Green Algae", "Pond", true);
       algae1.display();
       algae1.photosynthesize();

       // Totals
       System.out.println("Total Fish: " + Fish.getTotalFish());
       System.out.println("Total Plants: " + Plant.getTotalPlants());
   }
}
