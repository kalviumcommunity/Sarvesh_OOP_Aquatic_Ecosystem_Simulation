public class PlantActions {
    public void grow(Plant plant) {
        System.out.println(plant.getType() + " is growing in the " + plant.getLocation() + ".");
    }

    public void spread(Plant plant) {
        System.out.println(plant.getType() + " is spreading to a new area in the " + plant.getLocation() + ".");
    }
}