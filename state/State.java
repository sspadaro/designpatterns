package state;

public interface State {
    public int getNum();
    public Operation getOperation();
    public void increaseDifficulty();
    public void decreaseDifficulty();
}