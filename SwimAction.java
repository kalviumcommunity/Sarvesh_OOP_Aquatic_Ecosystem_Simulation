public class SwimAction implements AquaticAction {

    private String direction;
    private double speed;

    public SwimAction(String direction, double speed) {
        this.direction = direction;
        this.speed = speed;
    }

    @Override
    public void perform(AquaticEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + " is swimming " + direction +" at " + speed + " mph in the " + entity.getLocation() + ".");
    }
}