
public class PaymentState implements State{

    @Override
    public void next(BakeryContext context, Input input) {

    }

    @Override
    public String getname() {
        return "This is Payment State";
    }

    @Override
    public String getCurrentState() {
        return "Payment";
    }
}
