package Avianca.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebDriver chromeDriver()
    {
        System.setProperty("webdriver.chrome.driver", "./src/test/resourses/driver/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}

