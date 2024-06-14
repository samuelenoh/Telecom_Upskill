package org.objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IframesPage {
    private WebDriver driver;

    public IframesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void handleIframe(){
        driver.switchTo().frame(0);

    }
}
