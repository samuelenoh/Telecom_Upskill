package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalsPage {

    private WebDriver driver;

    @FindBy(css = "#simpleModal")
    WebElement simpleModalBtn;
    @FindBy(css = "#formModal")
    WebElement formModalBtn;
    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    WebElement closeBtn;
    @FindBy(css = "#popmake-1318")
    WebElement simpleModal;
    @FindBy(css = "#g1051-name")
    WebElement nameField;
    @FindBy(css = "#g1051-email")
    WebElement emailField;
    @FindBy(css = "#g1051-email")
    WebElement messageField;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement submitBtn;
    Actions actions;
    public ModalsPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickSimpleModal(){
        simpleModalBtn.click();
    }
    public void checkSimpleModalContent(){
        String modalContent = simpleModal.getText();
        if(modalContent.contains("Simple Modal")){
            System.out.println("Contains the right content");
        }else{
            System.out.println("Contains no content");
        }
    }
    public void closeSimpleModal(){
//        actions.moveToElement(closeBtn).release().perform();
        closeBtn.click();
    }
    public void fillForm(){
        formModalBtn.click();
        nameField.sendKeys("Uriah");
        emailField.sendKeys("uriah@gmail.com");
        messageField.sendKeys("Am urial");
        submitBtn.click();
    }

}
