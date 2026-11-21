package abstractiondemo.java;

abstract class InternetConnection {

    // Abstract method
    abstract void connect();

    // Concrete method
    void showMessage() {
        System.out.println("Preparing internet connection...");
    }
}

class WiFiConnection extends InternetConnection {

    @Override
    void connect() {
        super.showMessage();
        System.out.println("Connected to the internet through WiFi.");
    }
}

class MobileDataConnection extends InternetConnection {

    @Override
    void connect() {
        super.showMessage();
        System.out.println("Connected to the internet through Mobile Data.");
    }
}
