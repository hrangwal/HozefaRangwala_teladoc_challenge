package com.appsenseca.pageobject;

import com.appsenseca.util.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//This Object model will navigate to the website and create the user
public class NavigateToWebsite {
    public void clickAddUser(WebDriver driver){
        WebUtil.click(driver,By.xpath("//*[@class='btn btn-link pull-right']"));
       }

    public void enterFirstName(WebDriver driver, String john) {
          WebUtil.sendKeys(driver,By.xpath("//*[@name='FirstName']"),"John");
    }

    public void enterLastName(WebDriver driver, String miley) {
        WebUtil.sendKeys(driver,By.xpath("//*[@name='LastName']"),"Miley");
    }

    public void enterUserName(WebDriver driver, String jMiley991) {
          WebUtil.sendKeys(driver,By.xpath("//*[@name='UserName']"),"JMiley991");
    }

    public void enterPassword(WebDriver driver, String johnMiley123) {
          WebUtil.sendKeys(driver,By.xpath("//*[@name='Password']"),"JohnMiley123");
    }

    public void selectCompany(WebDriver driver) {
          WebUtil.click(driver,By.xpath("(//*[@class='radio ng-scope ng-binding']//*[@class='ng-pristine ng-valid'])[1]"));
    }

    public void selectRole(WebDriver driver) {
          WebUtil.click(driver,By.xpath("//select[@name='RoleId']"));
          WebUtil.click(driver,By.xpath("//select[@name='RoleId']//child::option[@value='1']"));
    }

    public void enterEmail(WebDriver driver, String s) {
          WebUtil.sendKeys(driver,By.xpath("//*[@name='Email']"),"johnMiley@yopmail.com");
    }

    public void enterPhoneNumber(WebDriver driver, String s) {
        WebUtil.sendKeys(driver,By.xpath("//*[@name='Mobilephone']"),"9876543210");
    }

    public void clickSaveUser(WebDriver driver) {
          WebUtil.click(driver,By.xpath("//button[@class='btn btn-success']"));
    }

    public void validateUser(WebDriver driver) {
        String expecTedUser = "John";
        String addedUser = WebUtil.getElementText(driver,By.xpath("//*[@class='smart-table-data-cell'][1]"));
        if(addedUser.equalsIgnoreCase(expecTedUser))
            System.out.println("The User---" + addedUser + "---Was added to the table");
        else
             System.out.println("The expected user" + addedUser + "Was not added to the table" );

        driver.close();

    }


    public void delteUser(WebDriver driver) {
        WebUtil.click(driver,By.xpath("(//*[@class='icon icon-remove'])[3]"));
    }

    public void validateUserDeleted(WebDriver driver) {
        WebUtil.click(driver,By.xpath("//*[@class='btn ng-scope ng-binding btn-primary']"));
        String userName = "novak";
        String userDeleted = WebUtil.getElementText(driver,By.xpath("//*[@class='smart-table-data-row ng-scope'][3]//child::*[@class='smart-table-data-cell'][3]"));
        if(!userName.equalsIgnoreCase(userDeleted)){
            System.out.println("The User---" +userName + "---Was deleted from the table");

        }else {
            System.out.println("The User---" +userName + "---Was still present in the table");
        }
        driver.close();
    }

}
