public class ConfirmOrderState implements State{

    @Override
    public void next(BakeryContext context, Input input) {
        if (input == Input.YES) {
            context.setState(new PaymentState());
        } else {
            context.setState(new CancelOrderState());
        }
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public String getCurrentState() {
        return "Confirm Order";
    }
}
