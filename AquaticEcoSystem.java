public class AquaticEcoSystem {
    public static void main(String[] args) {

        Fish fish = new Fish("Clownfish", 5.0, "Algae and Plankton", "Coral Reef");
        Plant plant = new Plant("Seaweed", "Shallow Waters");

        AquaticAction swimAction = new SwimAction("forward", 10);
        AquaticAction feedAction = new FeedAction("Plankton");
        AquaticAction growAction = new GrowAction();

        swimAction.perform(fish);
        feedAction.perform(fish);
        growAction.perform(plant);

        AquaticAction spreadAction = new AquaticAction() {
            @Override
            public void perform(AquaticEntity entity) {
                System.out.println(entity.getClass().getSimpleName() + " is spreading in the " + entity.getLocation() + ".");
            }
        };

        spreadAction.perform(plant);
    }
}
