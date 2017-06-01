package nl.jochumborger.test.cucumber;

import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class ThenStepDefs {

    @Then("^the state is changed$")
    public void theStateIsChanged() throws Throwable {
        assertThat(State.getInstance().getState(), not(equalTo(State.initialState())));
    }

    @Then("^the state is the same$")
    public void theStateIsTheSame() throws Throwable {
        assertThat(State.getInstance().getState(), is(equalTo(State.initialState())));
    }


}
