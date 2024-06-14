package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.UtitlitiesPage;

public class HomePage {

    private WebDriver driver;
    private UtitlitiesPage util;
    Actions actions ;

    @FindBy(xpath = "//a[normalize-space()='Form Fields']")
    WebElement formfields;

    @FindBy(xpath = "//a[normalize-space()='Popups']")
    WebElement popUps;

    @FindBy(xpath = "//*[text()='Sliders']")
    WebElement slider;

    @FindBy(xpath = "//a[normalize-space()='Calendars']")
    WebElement calenders;

    @FindBy(xpath = "//a[normalize-space()='Modals']")
    WebElement modals;
    @FindBy(xpath = "//a[normalize-space()='Iframes']")
    WebElement iframeBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        util = new UtitlitiesPage(driver);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public FormFields visitFormFieldsPage() {
        formfields.click();
        return new FormFields(driver);
    }

    public PopUps visitPopUpsPage() {
        popUps.click();
        return new PopUps(driver);
    }

    public SliderPage visitSliderPage() {

        actions.moveToElement(slider).release().perform();
        slider.click();
        return new SliderPage(driver);
    }
    public CalendarPage visitCalenderPage(){
        actions.moveToElement(calenders).release().perform();
        calenders.click();
        return  new CalendarPage(driver);
    }
    public ModalsPage visitModalsPage(){
        actions.moveToElement(modals).release().perform();
        modals.click();
        return  new ModalsPage(driver);
    }
    public IframesPage visitIframesPage(){
        iframeBtn.click();
        return new IframesPage(driver);
    }
}
