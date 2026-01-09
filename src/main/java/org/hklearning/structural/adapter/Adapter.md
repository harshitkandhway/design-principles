# Adapter Pattern

Adapter pattern is one of the structural design pattern which can be used when a client wants to use a method from a specific interface 
whereas the method is available as a part of different class which does not implement that specific interface.

To resolve this scenario we can use the adapter pattern.

There are two variation df Adapter pattern which can be used.
1) **Class Adapter**  (also known as two-way adapter)
2) **Object Adapter**

## Class Adapter 
Here we create an Adapter class and implement this to the interface required by the client, and we also extend the class where the 
method is available.

## Object Adapter
Here we create the Abstract class and implement it to the interface required by the client.
We dont have to extend the class to use the method rather we focus on composition instead of inheritance to solve the issue.

### Which adapter pattern to prefer and why?
We should always prefer the Object Adapter way instead of the class adapter way because of the two reasons:
1) In class adapter way of implementation we extend the class where the methods are present, which means in the adapter class we have access to all the methods of the extended bases class, even if they are not required. This way we are polluting the codebase.
2) If we have a concrete class or abstract class instead of an interface we won't be able to extend two different classes in the adapter class because java wont allow multiple inheritance.
3) Object Adapter way of implementation makes sure that we get the object of the class through constructor that is we focus on composition rather than inheritance, and this is a better way of implementation.

## Example of Adapter Pattern : 
1) java.io.InputStreamReader 
2) java.io.OutputStreamWriter