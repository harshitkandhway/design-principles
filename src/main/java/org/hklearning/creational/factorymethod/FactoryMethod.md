# Factory Method Pattern
We use this pattern:
1) when we want to move the object creation logic away from the client code to a separate class.
2) When we want to add new classes and their object creation logic to code without affecting current code.

This is similar to simple factory pattern but the difference is, we are not aware of all the classes which needs to be instantiated beforehand.
In this pattern the object creation is taken care by the subclasses after overriding the factory method.

For each and every product whose instance will be created through factory method we will have similar concrete creator replicating similar hierarchy.

### Other patterns which uses factory method
1) Abstract Factory Pattern
2) Template Pattern

### Examples of Factory Method Pattern
1) iterator() present in java.util.collection(java.util.AbstractCollection)

## Limitations
1) Complex to implement, more classes means more unit testing
2) We need to implement this from scratch, refactoring current code to factory method pattern is challenging. 
3) We will have to create subclasses just to create appropriate instances.



