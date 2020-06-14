## The State Pattern

### The State Pattern
    Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
    
    A little-known fact: the Strategy and State Patterns were twins separated at birth.
    

### Mighty Gumball, Inc.

    Gumball Machine is the Context

    Circle is a state - (No Quarter, Has Quarter, Gumball Sold, Out of Gumballs)
    
    Arrow is a state transition - (Inserts quarter, Ejects quarter, Turns crank, Dispense)
    
    No Quarter
        inserts quarter() -> Has Quarer
    Has Quarter
        ejects quarter() -> No Quarter
        turns crank() -> Gumball Sold
    Gumball Sold
        disperse gumball()
            gumballs > 0 ==> No Quarter
            gumballs = 0 ==> Out of Gumballs
    Out of Gmballs
    
    Change Request - Winner(1/10 chance client can get double gumballs)


### State Vs Strategy
    

### BULLET POINTS
    The State Pattern allows an object to have many different behaviors that are based on its internal state.
    
    Unlike a procedural state machine, the State Pattern represents state as a full-blown class.
    
    The Context gets its behavior by delegating to the current state object it is composed with.
    
    By encapsulating each state into a class, we localize any changes that will need to be made.
    
    The State and Strategy Patterns have the same class diagram, but they differ in intent.
    
    Strategy Pattern typically configures Context classes with a behavior or algorithm.
    
    State Pattern allows a Context to change its behavior as the state of the Context changes.
    
    State transitions can be controlled by the State classes or by the Context classes.
    
    Using the State Pattern will typically result in a greater number of classes in your design.
    
    State classes may be shared among Context instances.
    

### Code Snippet
```java
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARER = 2;
    final static int SOLD = 3;

    public void insertQuarter() {
        // insert quarter code here
    }
    
    public void ejectQuarter() {
        // eject quarter code here
    }

    public void turnCrank() {
        // turn crank code here
    }
    
    public void dispense() {
        // dispense code here
    }
}
```

### GitHub code reference
    https://github.com/fitchdev/reading_notes/tree/master/hf-design-patterns/chapter10
