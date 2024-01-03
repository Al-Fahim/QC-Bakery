public class PaymentByCard implements PaymentStrat{
    String cardNumber, exp, cardName;


    public PaymentByCard(String cardNumber,String exp,String cardName){
        setCardNumber(cardNumber);
        setExp(exp);
        setCardName(cardName);
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }


    public void pay(double amount){
        System.out.println("You payed: $"+ amount +" with card");
    }

}
