package student;

public class MediumState extends AbstractState {

    public MediumState(AbstractState state) {
        scoreContext = state.scoreContext;
        stateName = "Good";
        score = state.score;
    }

    @Override
    public void checkState() {
        if(score >= 90) {
            scoreContext.setState(new HighState(this));
        }else if(score < 60) {
            scoreContext.setState(new LowState(this));
        }
    }
}
