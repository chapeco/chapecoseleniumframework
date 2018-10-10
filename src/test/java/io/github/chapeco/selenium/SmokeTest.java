package io.github.chapeco.selenium;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;
import io.github.chapeco.selenium.ChapecoSelenium.*;

import static io.github.chapeco.selenium.ChapecoSelenium.closeDriver;
import static io.github.chapeco.selenium.ChapecoSelenium.createDriver;
import static io.github.chapeco.selenium.ChapecoSelenium.getDriver;

public class SmokeTest
{
    @Test
    public void driverTest()
    {
        createDriver();
        getDriver().get("https://www.google.com");
        closeDriver();
    }
}
