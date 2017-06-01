package nl.jochumborger.test.cucumber;

import cucumber.api.java.en.When;

public class WhenStepDefs {

    @When("^i change the state$")
    public void iChangeTheState() throws Throwable {
        State.getInstance().updateState("NEW");
    }

    @When("^i dont change the state$")
    public void iDontChangeTheState() throws Throwable {
        // Do nothing
    }

}
