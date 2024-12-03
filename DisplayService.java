public class DisplayService {
    public void display(Fish fish) {
        System.out.println("Fish Name: " + fish.getName() + ", Location: " + fish.getLocation());
    }

    public void display(Plant plant) {
        System.out.println("Plant Type: " + plant.getType() + ", Location: " + plant.getLocation());
    }

    public void display(Shark shark) {
        System.out.println("Fish Name: " + shark.getName() + ", Location: " + shark.getLocation() +
                ", Speed: " + shark.getSpeed() + " mph.");
    }
}