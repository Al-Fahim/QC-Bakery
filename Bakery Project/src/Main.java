import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Choose payment method: cash or card");
        Scanner sin = new Scanner(System.in);
        String input = sin.nextLine();
        PaymentStrat payment;

        switch (input) {
            case "card":
                payment = new PaymentByCard("1234567", "12/23", "Al");
                payment.pay(20.50);
                break;
            case "cash":
                payment = new PaymentByCash();
                payment.pay(20.50);
                break;
            default:
                System.out.println("Not a correct option");
        }

    }
}