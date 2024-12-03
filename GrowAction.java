public class GrowAction implements AquaticAction {
    @Override
    public void perform(AquaticEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + " is growing in the " + entity.getLocation() + ".");
    }
}