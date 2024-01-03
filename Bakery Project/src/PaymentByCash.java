import javax.swing.*;
import java.sql.SQLOutput;

public class PaymentByCash implements PaymentStrat{
    public void pay(double amount){
        System.out.println("You payed: $" + amount + " in cash");
    }
}
