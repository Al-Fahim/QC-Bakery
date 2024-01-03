// BakeryContext
class BakeryContext {
    private State state;

    public BakeryContext() {
        state = new StartState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void processInput(Input input) {
        state.next(this, input);
    }
}
