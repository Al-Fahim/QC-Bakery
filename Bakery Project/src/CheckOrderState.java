class CheckOrderState implements State {
    @Override
    public void next(BakeryContext context, Input input) {
        // Implement the transitions and behavior for CheckOrderState
    }

    @Override
    public String getname() {
        return "This is check order state";
    }

    @Override
    public String getCurrentState() {
        return "Check Order";
    }
}
