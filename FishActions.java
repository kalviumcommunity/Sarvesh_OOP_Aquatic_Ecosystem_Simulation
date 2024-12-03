public class FishActions {
    public void move(Fish fish) {
        System.out.println(fish.getName() + " is swimming in the " + fish.getLocation() + ".");
    }

    public void move(Fish fish, String direction) {
        System.out.println(fish.getName() + " is swimming " + direction + " in the " + fish.getLocation() + ".");
    }

    public void move(Fish fish, String direction, double speed) {
        System.out.println(fish.getName() + " is swimming " + direction + " at " + speed + " mph in the " + fish.getLocation() + ".");
    }

    public void feed(Fish fish) {
        System.out.println(fish.getName() + " is feeding on " + fish.getDietType() + ".");
    }
}