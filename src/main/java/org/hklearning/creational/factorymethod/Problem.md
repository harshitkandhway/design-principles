# Practice Exercise: Factory Method Design Pattern

## 1. Project Overview: Multi-Channel Notification System
You are tasked with building a notification module for a large-scale application. The application needs to send various types of alerts to users based on their activity (e.g., "Welcome" emails, "OTP" SMS, or "Flash Sale" Push notifications).

### The Challenge
As the application grows, the number of notification types increases. If you instantiate these objects directly in your business logic, your code will become tightly coupled and difficult to maintain. Every time a new channel (like WhatsApp or Slack) is added, you would have to modify your core logic.

---

## 2. Design Pattern Architecture
The **Factory Method Pattern** will be used to decouple the client code (the business logic) from the specific classes being instantiated.



### Key Components
| Component | Description |
| :--- | :--- |
| **Product (Interface)** | `Notification` - Defines the common behavior (e.g., `send()`). |
| **Concrete Products** | `EmailNotification`, `SMSNotification`, `PushNotification` - Specific implementations. |
| **Creator (Factory)** | `NotificationFactory` - Contains the logic to decide which object to create. |
| **Client** | The main application that uses the Factory to get a Product. |

---

## 3. Implementation Requirements

### Phase 1: The Interface
Create a `Notification` interface or abstract class.
* It must include a method `void notifyUser(String message)`.

### Phase 2: Concrete Classes
Implement the interface in three separate classes:
1. **EmailNotification**: Prints `"Sending an Email: [message]"`
2. **SMSNotification**: Prints `"Sending an SMS: [message]"`
3. **PushNotification**: Prints `"Sending a Push Notification: [message]"`

### Phase 3: The Factory
Create a `NotificationFactory` class.
* Implement a method `createNotification(String channel)`.
* This method should return an instance of the corresponding notification class based on the input string.
* Handle cases where an invalid channel is provided (return `null` or throw an exception).

### Phase 4: Execution
In your `Main` class:
* Use the Factory to create an **SMS** notification.
* Use the Factory to create an **Email** notification.
* Call the `notifyUser()` method on both without ever using the `new` keyword for the specific classes.

---

## 4. Evaluation Criteria
- [ ] **Decoupling:** Does the `Main` class know about the existence of `EmailNotification`? (It shouldn't).
- [ ] **Extensibility:** How easy is it to add a `WhatsAppNotification`?
- [ ] **Type Safety:** Are you using constants or Enums for the channel types?

---

## 5. Bonus Challenges
* **Level 1:** Refactor the factory to use a **Properties file** or **Configuration** to determine which notification types are active.
* **Level 2:** Implement the factory as a **Singleton** since you only need one instance of the factory to manage object creation.