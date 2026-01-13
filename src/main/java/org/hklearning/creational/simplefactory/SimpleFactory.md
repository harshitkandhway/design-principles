# Simple Factory Pattern
This design pattern is used when you want to encapsulate the object instantiation logic to a static method in a different class.
Although this pattern is not a part of the 23 design patterns in GOF but can be covered as part of creational design patterns.

When to use this : When we have options to create multiple objects on a basis of a simple criteria.

Simple factory does not require any state tracking hence it is best to add the simple factory method as a static method ina different class.

--- 
### Example of Simple Factory Pattern : 
1) getInstance() of java.text.NumberFormat Class 

### Difference between SimpleFactory and Factory Method Design Pattern
| Feature | Simple Factory (Pattern Idiom) | Factory Method (GoF Pattern) |
| :--- | :--- | :--- |
| **Creation Logic** | Moves object creation away from the client code into a single class using a **static method**. | Moves object creation logic to **subclasses** which override a factory method. |
| **Class Knowledge** | The factory **knows all concrete classes** it will create in advance. | The base creator **does not know** about the concrete subclasses in advance. |
| **Responsibility** | Centralized: One class is responsible for all instantiations. | Decentralized: Responsibilty is delegated to various subclasses. |
| **Extension** | Requires modifying the factory class to add new types (Violates Open/Closed Principle). | Allows adding new types by adding new subclasses (Follows Open/Closed Principle). |



### Limitation:
1) If the criteria to decide which object is to be created gets complex over time, that is the indication to switch to factory method pattern.
