package com.appsenseca.util;

import com.appsenseca.pageobject.NavigateToWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebUtil {
    final static int WAIT_TIME_OUT =60000;
    public static NavigateToWebsite navigateToWebsite(WebDriver driver) {
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        return PageFactory.initElements(driver,NavigateToWebsite.class);

    }

    public static void click(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement element =  driver.findElement(by);
        element.click();
    }

    public static void sendKeys(WebDriver driver, By by, String s) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement element =  driver.findElement(by);
        element.sendKeys(s);
    }


    public static String getElementText(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement userFirstName = driver.findElement(by);
        return userFirstName.getText();


    }
}
