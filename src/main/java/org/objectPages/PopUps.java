package org.objectPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUps {
    private WebDriver driver;

    @FindBy(css = "#alert")
    WebElement alertPopUp;

    @FindBy(css = "button[id='confirm'] b")
    WebElement confirmPopup;

    @FindBy(css = "#prompt")
    WebElement prompt;
    
    public PopUps(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void handleAlertPopup(){
        alertPopUp.click();
        driver.switchTo().alert().accept();
    }

    public void handleConfirmPopup(){
        confirmPopup.click();
        driver.switchTo().alert().dismiss();
    }
    public void handlePromptPopup(){
        prompt.click();
        Alert promptConfirmation = driver.switchTo().alert();
        promptConfirmation.sendKeys("Hi John");
        promptConfirmation.accept();
    }

}
