## The Iterator Pattern
    The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.
    Iterator Pattern mostly being used in the Collection(Aggregate) Context.

    What problems can the Iterator design pattern solve?
    
    The elements of an aggregate object should be accessed and traversed without exposing its representation (data structures).
    New traversal operations should be defined for an aggregate object without changing its interface.


```java
public interface Iterator() {
    boolean hasNext();
    Object next();
}

public class DinerMenuIterator implements Iterator {}
public class PancakeMenuIterator implements Iterator {}
```

Java’s Collection Framework provides another type of iterator interface called ListIterator. This iterator adds previous() and a few other methods to the standard Iterator interface. It is supported by any Collection that implements the List interface.

### Design Principle:
    A class should have only one reason to change.
    
### BULLET POINTS
    - An Iterator allows access to an aggregate’s elements without exposing its internal structure.
    
    - An Iterator takes the job of iterating over an aggregate and encapsulates it in another object.
    
    - When using an Iterator, we relieve the aggregate of the responsibility of supporting operations for traversing its data.
    
    - An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.
    
    - We should strive to assign only one responsibility to each class.