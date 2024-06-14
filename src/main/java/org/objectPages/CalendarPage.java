package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    private WebDriver driver;

    @FindBy(css = "#g1065-selectorenteradate")
    WebElement calendarField;
    @FindBy(css = "a[title='Next']")
    WebElement nextBtn;
    @FindBy(xpath = "//a[normalize-space()='12']")
    WebElement day;
    public CalendarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickNext(){
        calendarField.click();
        nextBtn.click();
    }
    public void selectDay(){
        day.click();
    }
}
