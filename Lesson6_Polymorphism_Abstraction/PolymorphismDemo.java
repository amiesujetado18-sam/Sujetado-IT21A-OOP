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

}

class EWallet extends Payment {

    String paymentType = "E-Wallet";

}