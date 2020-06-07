## The Template Method Pattern
    The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
    
    The Hollywood Principle - Don’t call us, we’ll call you.
    
    
```java
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
```

### What is compareTo()?
    The compareTo() method compares two objects and returns whether one is less than, greater than, or equal to the other. sort() uses this as the basis of its comparison of objects in the array.

### Template Method vs Strategy vs Factory Method
    Tempated Method - Subclasses decide how to implement steps in an algorithm
    Strategy - Encapsulate interchangable behaviors and use delegation to decide which behavior to use.
    Factory Method - Subclasses decide which concrete classes to create.

### BULLET POINTS
    A “template method” defines the steps of an algorithm, deferring to subclasses for the implementation of those steps.
    
    The Template Method Pattern gives us an important technique for code reuse.
    
    The template method’s abstract class may define concrete methods, abstract methods, and hooks.
    
    Abstract methods are implemented by subclasses.
    
    Hooks are methods that do nothing or default behavior in the abstract class, but may be overridden in the subclass.
    
    To prevent subclasses from changing the algorithm in the template method, declare the template method as final.
    
    The Hollywood Principle guides us to put decision making in high-level modules that can decide how and when to call low-level modules.
    
    You’ll see lots of uses of the Template Method Pattern in real-world code, but don’t expect it all (like any pattern) to be designed “by the book.”
    
    The Strategy and Template Method Patterns both encapsulate algorithms, one by inheritance and one by composition.
    
    The Factory Method is a specialization of Template Method.