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
&#x09;**Difference Between Polymorphism and Abstraction**



* Polymorphism allows the same method to perform different actions depending on the object using it. In the payment program, `processPayment()` displays different messages for Cash on Delivery and E-Wallet.



* Abstraction focuses on showing the important features while leaving the specific details to the child classes. In the internet connection program, `InternetConnection` requires its child classes to provide their own version of `connect()`.





**Following questions:**


**1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?**



* Method overriding is important because it allows each child class to perform its own action using the same method name. In my payment program, `CashOnDelivery` and `EWallet` have different versions of `processPayment()`. If a child class does not override the method, it will use the parent's original method instead.



**2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?**



* An abstract class cannot be used to create objects directly. It serves as a parent class that provides a common structure for its child classes. Some of its methods may not have a body, so the child classes must provide their own implementation.


**3. If you need to add another child class to your polymorphism program, how would your existing code handle it?**



* I can add another child class, such as `CreditCard`, that extends the `Payment` class and overrides the `processPayment()` method. Then, I can create a parent-class reference for the new object and call the same method. The existing `CashOnDelivery` and `EWallet` classes do not need to be changed.



**4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.**



* Yes, polymorphism and abstraction can work together in one program. In my `AbstractionDemo.java`, `InternetConnection` is an abstract class, while `WiFiConnection` and `MobileDataConnection` provide their own implementations of `connect()`. The parent-class references can call the method, and Java runs the implementation based on the actual child object. This demonstrates both abstraction and polymorphism.



**5. As a future programmer, when would you use polymorphism, and when would you use abstraction?**



* I would use polymorphism when different objects need to perform different actions using the same method, such as the payment methods in my online shopping program. I would use abstraction when I want to create a common structure for related classes while allowing each child class to provide its own details, such as the different internet connections in my program, Through these programs, I learned how polymorphism allows different objects to use the same method in different ways, while abstraction provides a common structure for related classes. Both concepts help make Java programs more organized and easier to understand..

