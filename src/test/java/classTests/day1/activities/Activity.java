package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {

    private WebDriver driver;


    @Before
    public void setDriver() {
//        String userdirLib = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", "/Users/Igor/IdeaProjects/selenium_bootcamp/lib/chromedriver");
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void driverTest(){
        driver.get("http:/www.google.com/");
        System.out.println(driver.getCurrentUrl());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
