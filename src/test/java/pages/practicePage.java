package pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonMethods;

public class practicePage extends CommonMethods {
    public practicePage(){
        PageFactory.initElements(driver,this);
    }
 @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameBox;
 @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameBox;
 @FindBy(xpath = "//input[@id='sex-0']")
    private WebElement maleRadio;
 @FindBy(xpath = "//input[@id='exp-0']")
    private WebElement expRadio;
 @FindBy(xpath = "//input[@id='datepicker']")
    private WebElement dateBox;
 @FindBy(xpath = "//input[@id='profession-1']")
    private WebElement proBox;
 @FindBy(xpath = "//input[@id='tool-2']")
    private WebElement toolBox;
 @FindBy(xpath = "//select[@id='continents']")
    private WebElement continents;
 @FindBy(xpath = "//select[@id='selenium_commands']")
 private WebElement dropdown;
 @FindBy(xpath = "//button[@id='submit']")
 private WebElement button;

 public void setDropdown(){
     Select selectmenu=new Select(dropdown);
     selectmenu.selectByIndex(2);


 }
 public void setFirstNameBox(String string){ firstNameBox.sendKeys(string);}
    public void setLastNameBox(String string){lastNameBox.sendKeys(string);}
    public void choosemalebutton(){
     maleRadio.click();
     if(maleRadio.isSelected()){
         System.out.println("male is selected");
     }else {
         System.out.println("didnt selected");
     }
 }
public void chooseexpButton(){expRadio.click();
    System.out.println(expRadio.isSelected());
 }
 public void setDateBox(){dateBox.sendKeys("03/06/2008");

 }
public void clickbutton(){button.click();}
}

