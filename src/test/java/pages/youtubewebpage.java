package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class youtubewebpage extends CommonMethods {
    public youtubewebpage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//input[@id='search']")
    private WebElement searchbox;
    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    private WebElement clickbutton;

    public void setSearchbox(){

        searchbox.sendKeys("durmaz akar");

    }
    public void clickSearch(){
        clickbutton.click();
    }

}
