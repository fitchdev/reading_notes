# Intro to Design Patterns: Welcome to Design Patterns

### Strategy Pattern
    Defines a family of algorithms,
    encapsulates each one, 
    and makes them interchangeable. 
    Strategy lets the algorithm vary independently from clients that use it.

### DESIGN PRINCIPLE
    1. Identify the aspects of your application that vary and separate them from what stays the same.
    2. Program to an interface, not an implementation.
    3. Favor compisition over inheritance

Take what varies and “encapsulate” it so it won’t affect the rest of your code.

The result? Fewer unintended consequences from code changes and more flexibility in your systems!


HAS-A can be better that IS-A

#### Integrating the Duck Behavior
    The key is that a Duck will now delegate its flying and quacking behavior, instead of using quacking and flying methods defined in the Duck class(or subclass)
    
Design Patterns give you a shared vocabulary with other developers. Once you've got the vocabulary you can easily communicate with other developers and inspire those who don't know patterns to start learning them. It also elevates your thinking about architectures by letting you think at the pattern level, not the nitty-gritty object level.

### OO Basics
    Abstraction
    Encapsulation
    Polymorphism
    Inheritance
### OO Principles
    Encapsulate what varies
    Favor Composition over Inheritance
    Program to interface, not implementations
### OO Patterns
    Strategy - 
        defines a family of algorithms,
        encapsulates each one,
        and makes them interchangeable
        Strategy lets the algorithm vary independently from clients that use it
        
### Bullet Points
    - Knowing the OO basics does not make you a good OO designer
    - Good OO designs are resuable, extensible, and maintainable
    - Patterns show you how to build systems with good OO design qualities
    - Patterns are proven object-oriented experience
    - Patterns don't give you code, they give you general solutions to design problems. You apply them to you specific application
    - Patterns aren't invented, they are discovered
    - Most patterns and principles address issues of change in software
    - Most patterns allow some part of a system to vary independently of all other parts
    - We often try to take what varies in a system and encapsulate it
    - Patterns provide a shared language that can maximie the value of your communication with other developers

### Q & A
    extends vs implements
    Super-Class vs Sub-Class
    Abstract class vs Interface
    Inheritance vs Composition
    Constructor vs Setter
    HAS-A vs IS-A
    

`public abstract class ...{
}`

`public interface ...{
}`

`public class ... extends ...{
}`

`public class ... implements ...{
}`

`public class ... extends ... implements ...{
}`

