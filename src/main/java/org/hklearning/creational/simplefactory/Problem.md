# Practice Exercise: Simple Factory Pattern

## 🎯 Objective
Implement the **Simple Factory** design pattern to manage the creation of different notification objects. This exercise will help you understand how to encapsulate instantiation logic and decouple your client code from concrete classes.

---

## 🏢 Scenario: Multi-Channel Notification System
You are developing a notification module for an e-commerce platform. The system must send alerts to users based on their delivery status. Users can choose to receive updates via **Email**, **SMS**, or **Push Notifications**.

Currently, the logic for creating these notifications is scattered throughout the business logic. Your goal is to move this "object creation" responsibility into a dedicated **Factory** class.



---

## 🛠️ Requirements

### 1. The Product Interface
Create an interface named `Notification`.
* **Method:** `void notifyUser();`

### 2. Concrete Products
Implement three classes that realize the `Notification` interface:
* **`EmailNotification`**: `notifyUser()` should print: *"Sending an Email notification..."*
* **`SMSNotification`**: `notifyUser()` should print: *"Sending an SMS notification..."*
* **`PushNotification`**: `notifyUser()` should print: *"Sending a Push notification..."*

### 3. The Factory Class
Create a class named `NotificationFactory`.
* **Method:** `public Notification createNotification(String channel)`
* **Logic:** Based on the input string (e.g., "EMAIL", "SMS", "PUSH"), it should return the corresponding object instance.
* **Error Handling:** If an unknown string is passed, it should return `null` or throw an `IllegalArgumentException`.

### 4. The Client (Main Class)
Create a class with a `main` method to test your implementation.
* **Rule:** The client should **not** use the `new` keyword to create specific notification types (e.g., no `new EmailNotification()`).
* **Workflow:** The client must interact only with the `Notification` interface and the `NotificationFactory`.

---

## 🚦 Constraints & Best Practices
* **Case Sensitivity:** Ensure your factory handles input consistently (e.g., using `.toUpperCase()` or `.equalsIgnoreCase()`).
* **Encapsulation:** Keep your concrete product classes in the same package; consider making them package-private to ensure they are only accessible through the factory.
* **Naming Conventions:** Follow standard Java CamelCase naming (e.g., `NotificationFactory` rather than `notification_factory`).

---

## ✅ Checklist for Completion
- [ ] Created `Notification.java` (Interface).
- [ ] Created three concrete implementation classes.
- [ ] Created `NotificationFactory.java` with the creation logic.
- [ ] Created a `Main` class that requests a notification from the factory.
- [ ] Handled the case for an invalid notification type.