package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private int number;
    private String answer;

    public IsItFizzBuzzSteps(){
        Given("the number is 0", () -> {
            this.number = 0;
        });

        Given("the number is 1", () -> {
            this.number = 1;
        });

        Given("the number is 2", () -> {
            this.number = 2;
        });

        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 9", () -> {
            this.number = 9;
        });

        Given("the number is 10", () -> {
            this.number = 10;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        When("I ask whether it's Fizz or Buzz", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisibleThreeAndFive(this.number);
        });

        Then("I return {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });
    }
}

