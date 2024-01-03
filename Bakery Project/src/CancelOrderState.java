public class CancelOrderState implements State{
    @Override
    public void next(BakeryContext context, Input input) {
        if (input == Input.YES) {
            System.exit(0);
        }
    }

    @Override
    public String getname() {
        return "This is Cancel Order";
    }

    @Override
    public String getCurrentState() {
        return "Cancel Order";
    }
}
