package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;

public class AT01_Navigatetohomepage {
    @Given("Navigate to Homepage")
    public void navigate_to_homepage() {
        System.out.println("This is homepage");
    }

    @Then("enter URl")
    public void enter_u_rl() {
        System.out.println("Entered URL");
    }


}
