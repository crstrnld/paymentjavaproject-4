class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String name, float amount, String cardNumber) {
        super(name, amount);
        this.cardNumber = cardNumber;
    }

    CreditCardPayment(String name, float amount, int discount, String cardNumber) {
        super(name, amount, discount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentInfo() {
        System.out.println("Credit Card Payment");
        super.paymentInfo();
        System.out.println("Card Number: " + cardNumber);
    }
}
