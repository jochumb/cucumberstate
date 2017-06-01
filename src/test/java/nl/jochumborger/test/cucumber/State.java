package nl.jochumborger.test.cucumber;

public class State {

    private static State instance = null;

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    public static void destroyInstance() {
        instance = null;
    }

    private String state;

    public State() {
        this.state = State.initialState();
    }

    public static String initialState() {
        return "INITIAL";
    }

    public String getState() {
        return state;
    }

    public void updateState(String newState) {
        state = newState;
    }
}
