class CryptoPayment extends Payment {
    String walletAddress;

    CryptoPayment(String name, float amount, String walletAddress) {
        super(name, amount);
        this.walletAddress = walletAddress;
    }

    CryptoPayment(String name, float amount, int discount, String walletAddress) {
        super(name, amount, discount);
        this.walletAddress = walletAddress;
    }

    @Override
    public void paymentInfo() {
        System.out.println("Crypto Payment");
        super.paymentInfo();
        System.out.println("Wallet: " + walletAddress);
    }
}
