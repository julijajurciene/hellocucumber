package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

   /* @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
        //throw new io.cucumber.java.PendingException();
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    } */

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        Assertions.assertEquals(string, actualAnswer);
        //throw new io.cucumber.java.PendingException();
    }
}
