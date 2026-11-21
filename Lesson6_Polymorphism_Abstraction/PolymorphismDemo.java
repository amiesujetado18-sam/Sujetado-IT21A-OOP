package polymorphismdemo.java;

class Payment {

    String paymentType = "General Payment";

    Payment() {
        System.out.println("Payment system initialized.");
    }

    void processPayment() {
        System.out.println("Processing payment...");
    }
} 
class CashOnDelivery extends Payment {

    String paymentType = "Cash on Delivery";

    CashOnDelivery() {
        super();
    }

    @Override
    void processPayment() {
        super.processPayment();

        System.out.println("Parent payment type: " + super.paymentType);
        System.out.println("Selected payment: " + paymentType);
        System.out.println("Pay when the order arrives.");
    }
}

class EWallet extends Payment {

    String paymentType = "E-Wallet";

    EWallet() {
        super();
    }

    @Override
    void processPayment() {
        super.processPayment();

        System.out.println("Parent payment type: " + super.paymentType);
        System.out.println("Selected payment: " + paymentType);
        System.out.println("Payment completed digitally.");
    }
}