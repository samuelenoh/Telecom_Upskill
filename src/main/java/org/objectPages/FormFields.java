package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.UtitlitiesPage;

import java.time.Duration;

public class FormFields {
    private WebDriver driver;
    protected UtitlitiesPage util;
    private WebDriverWait wait;
    Actions actions ;
    @FindBy(css = "#name")
    WebElement nameField;

    @FindBy(css = "#drink3")
    WebElement favoriteDrinkField;

    @FindBy(css = "input[type='radio']#color2")
    WebElement colorField;

    @FindBy(css = "#siblings")
    WebElement siblingsBtn;

    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(css = "#message")
    WebElement messageField;

    @FindBy(css = "#submit-btn")
    WebElement submitBtn;

    public FormFields(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        util = new UtitlitiesPage(driver);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterName(){
        nameField.sendKeys("Matthew");
    }

    public void selectFavoriteDrink(){
        favoriteDrinkField.click();
    }

    public void selectFavoriteColor(){

        actions.moveToElement(colorField).release().perform();
        colorField.click();
    }

    public void selectSiblings(){
        Select selectSiblings = new Select(siblingsBtn);
        selectSiblings.selectByVisibleText("No");
    }

    public void enterEmail(){
        emailField.sendKeys("Jojo@gmail.com");
    }

    public void enterMessage(){
        messageField.sendKeys("A broken wall cannot lean on a broken wall");
    }

    public HomePage clickSubmit(){
        actions.moveToElement(submitBtn).release().perform();
        submitBtn.click();
        driver.switchTo().alert().dismiss();
        driver.navigate().back();
        return new HomePage(driver);
    }
}
