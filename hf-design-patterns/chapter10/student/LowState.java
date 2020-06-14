package student;

public class LowState extends AbstractState {

    public LowState(ScoreContext scoreContext) {
        this.scoreContext = scoreContext;
        stateName = "Fail";
        score = 0;
    }

    public LowState(AbstractState state) {
        scoreContext = state.scoreContext;
        stateName = "Fail";
        score = state.score;
    }

    @Override
    public void checkState() {
        if(score >= 90) {
            scoreContext.setState(new HighState(this));
        }else if(score >= 60) {
            scoreContext.setState(new MediumState(this));
        }
    }
}
