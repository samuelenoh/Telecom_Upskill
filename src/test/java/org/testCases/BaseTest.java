package org.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.objectPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected HomePage home;
    protected FormFields forms;
    protected PopUps popUps;
    protected SliderPage sliderPage;
    protected CalendarPage calendar;
    protected ModalsPage modal;
    private WebDriver driver;



    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com");
        home = new HomePage(driver);
        forms = new FormFields(driver);
        popUps = new PopUps(driver);
        sliderPage = new SliderPage(driver);
        calendar = new CalendarPage(driver);
        modal = new ModalsPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
