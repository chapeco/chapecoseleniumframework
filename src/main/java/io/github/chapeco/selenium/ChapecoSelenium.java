package io.github.chapeco.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChapecoSelenium
{
    private static WebDriver driver;

    public static WebDriver createDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static void closeDriver()
    {
        driver.close();
    }
}
