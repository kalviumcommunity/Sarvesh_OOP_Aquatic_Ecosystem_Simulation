public class FeedAction implements AquaticAction {
    
    private String foodType;

    public FeedAction(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public void perform(AquaticEntity entity) {
        System.out.println(entity.getClass().getSimpleName() + " is feeding on " + foodType + ".");
    }
}