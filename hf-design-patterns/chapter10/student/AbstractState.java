package student;

public abstract class AbstractState {
    protected ScoreContext scoreContext;
    protected String stateName;
    protected int score;

    public abstract void checkState();

    public void addScore(int increment) {
        this.score += increment;
        System.out.print("Plus: " + increment + " Point, \tCurrent: " + score);
        checkState();
        System.out.println(" Point, \tCurrent State: " + scoreContext.getState().stateName);
    }
}
