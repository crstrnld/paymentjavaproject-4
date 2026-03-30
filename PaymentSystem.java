import java.util.ArrayList;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("Alice", 1000f, 10, "1234-5678-9876"); 
        Payment p2 = new PayPalPayment("Bob", 500f, "bob@example.com");           
        Payment p3 = new CryptoPayment("Charlie", 750f, 20, "0xABC123XYZ");      

        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(p1);
        payments.add(p2);
        payments.add(p3);

        for (Payment p : payments) {
            p.paymentInfo();
            System.out.println("-------------------");
        }
    }
}
