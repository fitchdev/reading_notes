## The Proxy Pattern

### The Proxy Pattern
    Provide a surrogate or placeholder for another object to control access to it
    what proxies do: control and manage access
    A remote proxy acts as a local representative to a remote object


### Mighty Gumball, Inc.
    GumballMachine
    GumballMonitor
    
    
### RMI - Remote Method Invocation
    Client <-> Client Helper <==> Service Helper <-> Service
    
    How the method call happens
    
        ① Client object calls doBigThing() on the client helper object.
        ② Client helper packages up information about the call (arguments, method name, etc.) and ships it over the network to the service helper.
        ③ Service helper unpacks the information from the client helper, finds out which method to call (and on which object) and invokes the real method on the real service object.
        ④ The method is invoked on the service object, which returns some result to the service helper.
        ⑤ Service helper packages up information returned from the call and ships it back over the network to the client helper.
        ⑥ Client helper unpackages the returned values and returns them to the client object. To the client object, this was all transparent.
        
        
        
### BULLET POINTS
    The Proxy Pattern provides a representative for another object in order to control the client’s access to it. There are a number of ways it can manage that access.
    
    A Remote Proxy manages interaction between a client and a remote object.
    
    A Virtual Proxy controls access to an object that is expensive to instantiate.
    
    A Protection Proxy controls access to the methods of an object based on the caller.
    
    Many other variants of the Proxy Pattern exist including caching proxies, synchronization proxies, firewall proxies, copy-on-write proxies, and so on.
    
    Proxy is structurally similar to Decorator, but the two differ in their purpose.
    
    The Decorator Pattern adds behavior to an object, while a Proxy controls access.
    
    Java’s built-in support for Proxy can build a dynamic proxy class on demand and dispatch all calls on it to a handler of your choosing.
    
    Like any wrapper, proxies will increase the number of classes and objects in your designs.