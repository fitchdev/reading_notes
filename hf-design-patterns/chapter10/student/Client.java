package student;

public class Client {
    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        context.add(30);
        context.add(40);
        context.add(25);
        context.add(-15);
        context.add(-25);
    }
}
