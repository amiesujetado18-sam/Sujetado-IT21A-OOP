package abstractiondemo.java;

abstract class InternetConnection {

    abstract void connect();

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

public class AbstractionDemoJava {

    public static void main(String[] args) {

        InternetConnection wifi = new WiFiConnection();
        InternetConnection mobileData = new MobileDataConnection();

        System.out.println("BASIC INTERNET CONNECTION SYSTEM");
        System.out.println("--------------------------------");

        wifi.connect();

        System.out.println();

        mobileData.connect();
    }
}
