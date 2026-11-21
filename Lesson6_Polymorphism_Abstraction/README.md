### &#x09;		Lesson 6: Polymorphism and Abstraction



*Part 1 – Polymorphism*



&#x09;**Program: Online Shopping Payment System**



* The `PolymorphismDemo.java` program shows how different payment methods can use the same method but perform different actions. It uses Cash on Delivery and E-Wallet as examples. When the program runs, each payment method displays its own message.



&#x09;**How Polymorphism Works in the Code**



* The parent class is `Payment`, while the child classes are `CashOnDelivery` and `EWallet`. Both child classes use `extends` to inherit from the parent class.



* The method `processPayment()` is overridden in both child classes. The `CashOnDelivery` class displays a message about paying when the order arrives, while the `EWallet` class displays a message about completing the payment digitally.



* In the `main()` method, parent-class references are used to create objects of the two child classes. When `processPayment()` is called, Java runs the version of the method that belongs to the actual object.



*Part 2 – Abstraction*



&#x09;**Program: Basic Internet Connection System**



* The `AbstractionDemo.java` program demonstrates how different internet connections work. It uses WiFi and Mobile Data as examples. Both can connect to the internet, but they have their own ways of doing it.



&#x09;**How Abstraction Works in the Code**



* The abstract class is `InternetConnection`. It contains the abstract method `connect()` and the concrete method `showMessage()`.



* The child classes are `WiFiConnection` and `MobileDataConnection`. Both classes extend `InternetConnection` and provide their own implementation of the `connect()` method. WiFi displays that the connection is through WiFi, while Mobile Data displays that the connection is through mobile data.



* The `showMessage()` method is inherited from the abstract class and displays a message before each connection is made.
