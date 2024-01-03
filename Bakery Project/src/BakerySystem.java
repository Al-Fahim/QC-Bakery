import java.util.Scanner;

public class BakerySystem {
    public static void main(String[] args) {
        BakeryContext bakeryContext = new BakeryContext();
        Scanner scanner = new Scanner(System.in);

        //This is Start State
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Are you here to order? (YES/NO)");
            String userInput = scanner.nextLine().toUpperCase();
            Input input;

            try {
                input = Input.valueOf(userInput);
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter YES or NO.");
                continue;
            }

            bakeryContext.processInput(input);
            // Continue processing further inputs based on user choices

        }

        //This is Order State
        while(bakeryContext.getState().getCurrentState().equals("Order")) {
            System.out.println("What do you want? ");

            bakeryContext.processInput(Input.YES);
            break;
        }

        //This is Confirm State
        while(bakeryContext.getState().getCurrentState().equals("Confirm Order")){

            System.out.println("Confirm Order? (YES/NO)");
            String userInput = scanner.nextLine().toUpperCase();
            Input input;
            try {
                input = Input.valueOf(userInput);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter YES or NO.");
                continue;
            }
            bakeryContext.processInput(input);
            break;
        }

        //This is Payment State
        while(bakeryContext.getState().getCurrentState().equals("Payment")){
            System.out.println("Cash or Card?");
            String userInput = scanner.nextLine().toUpperCase();
            
            if(userInput.equals("CASH")){
                PaymentStrat payment;
                payment = new PaymentByCash();
                payment.pay(20.50);
                
            } else if (userInput.equals("CARD")) {
                System.out.println("Type in card number");
                String cardNumber = scanner.nextLine().toUpperCase();
                System.out.println("Type in expire date");
                String exp = scanner.nextLine().toUpperCase();
                System.out.println("Type in Card Name");
                String cardName = scanner.nextLine().toUpperCase();

                PaymentStrat payment;
                payment = new PaymentByCard(cardNumber, exp, cardName);
                payment.pay(20.50);

            }
            break;
        }

        scanner.close();
        System.out.println("bye");
    }
}
