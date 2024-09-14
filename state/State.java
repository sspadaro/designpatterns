package state;

/**
 * Creates a state interface
 * @author Sophia Spadaro
 */
public interface State {
    public int getNum();
    public Operation getOperation();
    public void increaseDifficulty();
    public void decreaseDifficulty();
}