package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import utilities.CommonMethods;

import static stepDefinitions.PageInitialzier.prapage;
import static utilities.CommonMethods.driver;

public class practiceSteps {

    @Given("User navigate to site")
    public void user_navigate_to_site() {
        System.out.println("hooks acti");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

    }
    @When("User fill the blanks")
    public void user_fill_the_blanks() {
        prapage.setFirstNameBox("utku");
        prapage.setLastNameBox("cavus");
        prapage.setDropdown();
        prapage.setDateBox();

    }
    @Then("Can choose the radio buttons")
    public void can_choose_the_radio_buttons() {
        prapage.choosemalebutton();
        prapage.chooseexpButton();


    }
    @Then("Can log in")
    public void can_log_in() {
        System.out.println("hele bekle");
        prapage.clickbutton();
        System.out.println("hooks kapadi");

    }
}
