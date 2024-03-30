package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CommonMethods;

import java.io.IOException;
import java.sql.SQLException;

public class hooks extends CommonMethods {

    @Before
    public void initialize() throws IOException, SQLException {
        openAndLaunchApplication();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        byte[] pic;
        if (scenario.isFailed()){
            pic = takeScreenShot("failed/" + scenario.getName());
        }else {
            pic = takeScreenShot("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }
}
