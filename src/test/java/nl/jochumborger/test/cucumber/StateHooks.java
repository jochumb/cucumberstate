package nl.jochumborger.test.cucumber;

import cucumber.api.java.After;

public class StateHooks {

    @After
    public void destroyState() {
        State.destroyInstance();
    }
}
