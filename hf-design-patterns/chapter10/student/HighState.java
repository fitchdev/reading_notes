package student;

public class HighState extends AbstractState {

    public HighState(AbstractState state) {
        scoreContext = state.scoreContext;
        stateName = "Perfect";
        score = state.score;
    }

    @Override
    public void checkState() {
        if(score < 60) {
            scoreContext.setState(new LowState(this));
        }else if(score < 90) {
            scoreContext.setState(new MediumState(this));
        }
    }
}
