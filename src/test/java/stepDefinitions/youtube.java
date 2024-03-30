package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.youtubewebpage;
import utilities.CommonMethods;

public class youtube {
    @Given("User navigate to webpage")
    public void user_navigate_to_webpage() throws InterruptedException {
        CommonMethods.openAndLaunchApplication();
        Thread.sleep(300);
        System.out.println("gitti");
    }
    @Then("User send keys to searchbox")
    public void user_send_keys_to_searchbox() throws InterruptedException {
        youtubewebpage.ywp.setSearchbox();
        Thread.sleep(300);
    }

    @When("User click search")
    public void user_click_search() {
        youtubewebpage.ywp.clickSearch();
    }
    @Then("User should watch the video")
    public void user_should_watch_the_video() {
        System.out.println("pek yakinda");


    }
}
