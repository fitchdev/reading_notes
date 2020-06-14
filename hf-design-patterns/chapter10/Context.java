public class Context {

    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }
}
