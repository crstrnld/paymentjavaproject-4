class PayPalPayment extends Payment {
    String email;

    PayPalPayment(String name, float amount, String email) {
        super(name, amount);
        this.email = email;
    }

    PayPalPayment(String name, float amount, int discount, String email) {
        super(name, amount, discount);
        this.email = email;
    }

    @Override
    public void paymentInfo() {
        System.out.println("PayPal Payment");
        super.paymentInfo();
        System.out.println("Email: " + email);
    }
}
