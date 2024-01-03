// Concrete States
class StartState implements State {
    @Override
    public void next(BakeryContext context, Input input) {
        if (input == Input.YES) {
            context.setState(new OrderState());
        } else {
            System.out.println("Check Order?");
            context.setState(new CheckOrderState());
        }
    }

    @Override
    public String getname() {
        return "This is Start state";
    }

    @Override
    public String getCurrentState() {
        return "Start";
    }
}
