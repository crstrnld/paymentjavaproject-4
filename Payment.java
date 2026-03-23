class Payment {
    String name;
    float amount;
    int discount; 

    Payment(String name, float amount) {
        this.name = name;
        this.amount = amount;
        this.discount = 0; 
    }

    Payment(String name, float amount, int discount) {
        this.name = name;
        this.discount = discount;
        float disc = (float) discount / 100;
        this.amount = amount - (amount * disc);
    }

    public void paymentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Amount after discount: " + amount);
        if (discount > 0) {
            System.out.println("Discount applied: " + discount + "%");
        } else {
            System.out.println("No discount applied");
        }
    }
}
