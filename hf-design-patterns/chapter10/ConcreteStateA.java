public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("State A");
        context.setState(new ConcreteStateB());
    }
}
