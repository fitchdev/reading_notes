public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("State B");
        context.setState(new ConcreteStateA());
    }
}
