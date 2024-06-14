package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.UtitlitiesPage;

public class SliderPage {

    protected UtitlitiesPage util;
    private WebDriver driver;
    private Actions actions;

    @FindBy(css = "#slideMe")
    WebElement sliderBtn;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
        util = new UtitlitiesPage(driver);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void handleSlider() {
        util.waitForElement(sliderBtn);
        actions.dragAndDropBy(sliderBtn, 15, 0).perform();
    }
}
