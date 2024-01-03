// State Interface
interface State {
    void next(BakeryContext context, Input input);

     String getname();

     String getCurrentState();

}