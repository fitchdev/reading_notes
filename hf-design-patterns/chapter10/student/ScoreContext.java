package student;

public class ScoreContext {

    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void add(int increment) {
        this.state.addScore(increment);
    }
}
