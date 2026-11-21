package abstractiondemo.java;

abstract class InternetConnection {

    // Abstract method
    abstract void connect();

    // Concrete method
    void showMessage() {
        System.out.println("Preparing internet connection...");
    }
}
