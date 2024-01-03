
class OrderState implements State {
    @Override
    public void next(BakeryContext context, Input input) {
        // Implement the transitions and behavior for OrderState
        context.setState(new ConfirmOrderState());
    }

    @Override
    public String getname()
    {
        return "This is Order State";
    }

    @Override
    public String getCurrentState() {
        return "Order";
    }
}
