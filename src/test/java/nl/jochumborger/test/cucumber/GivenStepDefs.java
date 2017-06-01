package nl.jochumborger.test.cucumber;

import cucumber.api.java.en.Given;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GivenStepDefs {

    @Given("^the state is not changed$")
    public void theStateIsNotChanged() throws Throwable {
        assertThat(State.getInstance().getState(), equalTo(State.initialState()));
    }

}
