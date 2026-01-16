# Prototype Pattern
When a complex object is present which is costly to create because of performance, 
calculation or external resource dependency, and we want to create multiple instances 
of this class we use this pattern where we use already present instance and clone them 
to create others rather than creating new instances from scratch.

### Implementation Considerations
1) When we are using clone to create objects, we can create either shallow copy or a deep copy.
2) We can use shallow copy when we have the class fields as immutable type.
3) The problem with shallow copy is that if you create a prototype having some object or list inside, they will point to the same memory location as the original object, hence changing those will impact both the prototype and the original object.
4) clone() is protected in Object class, to override this method we must change this to public so that it can be called from outside world.
5) Cloneable is a marker interface which suggest that the class supports cloning.

### Design Considerations
1) Prototype pattern is helpful when we have a large object where some of the fields change and most of them remain same in multiple similar objects.
2) A prototype Registry is a class where you can register various prototypes which the other code can access to clone out instances.
3) This prototype Registry helps in providing the initial instance of the class.
4) This pattern further help in two other patterns : composite and decorator.

### Example
1) Object.clone() 

### Difference between prototype and Singleton
1) In prototype pattern we can clone one instance to many and have different values assigned to fields, whereas in the singleton pattern we always create and return only one object of a class.

### Limitations
1) The clone() return a shallow copy, in case you want a deep copy, the case must be handled manually.
2) If the class has multiple mutable fields, the implementation becomes challenging as we have to provide deep copy for all the mutable fields.
3) We can throw a CloneNotSupportedException when a subclass dont support the feature of cloning, in such cases we have to do extra implementations making this pattern a bit complex.