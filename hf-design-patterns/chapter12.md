## The Compound Patterns
    A Compound Pattern combines two or more patterns into a solution that solves a recurring or general problem.

## Rebuild duck simulator from scratch
    ① First, we’ll create a Quackable interface.
    ② Now, some Ducks that implement Quackable
    ③ Okay, we’ve got our ducks; now all we need is a simulator.
    ④ When ducks are around, geese can’t be far.
    ⑤ We need a goose adapter.
    ⑥ Now geese should be able to play in the simulator, too.
    ⑦ Now let’s give this a quick run....
    ⑧ We’re going to make those Quackologists happy and give them some quack counts.
    ⑨ We need to update the simulator to create decorated ducks.
    ⑩ We need a factory to produce ducks!
    ⑪ Let’s set up the simulator to use the factory.
    ⑫ Let’s create a flock of ducks (well, actually a flock of Quackables).
    ⑬ Now we need to alter the simulator.
    ⑭ First we need an Observable interface.
    ⑮ Now, we need to make sure all the concrete classes that implement Quackable can handle being a QuackObservable.
    ⑯ Integrate the helper Observable with the Quackable classes.
    ⑰ We’re almost there! We just need to work on the Observer side of the pattern.
    ⑱ We’re ready to observe. Let’s update the simulator and give it a try:
    
    
## Model-View-Controller(MVC)
    ① You’re the user—you interact with the view.
    ② The controller asks the model to change its state.
    ③ The controller may also ask the view to change.
    ④ The model notifies the view when its state has changed.
    ⑤ The view asks the model for state.
    



## Code Snippet
```java
public interface Quackable {
    public void quack();
}
```

```java
public class MallardDuck implements Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}

public class RedheadDuck implements Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}

public class RubberDuck implements Quackable {
    public void quack() {
        System.out.println("Squeak");
    }
}
```