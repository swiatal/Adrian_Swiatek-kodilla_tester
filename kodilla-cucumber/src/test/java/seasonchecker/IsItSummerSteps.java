package seasonchecker;

import io.cucumber.java8.En;

import java.time.MonthDay;

public class IsItSummerSteps implements En {

    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);

        });

        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });
    }
}
