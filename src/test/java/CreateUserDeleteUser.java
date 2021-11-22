import com.appsenseca.pageobject.NavigateToWebsite;
import com.appsenseca.util.WebUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension;
import org.junit.Before;
import java.awt.*;



public class CreateUserDeleteUser {
    @Test
    @Order(2)
    public void createUserForTable() {

        //Steps to Perform:
        //1.Go to website
        System.setProperty("webdriver.chrome.driver", "C:/Users/hrangwal/OneDrive - Capgemini/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        NavigateToWebsite navigateToWebsite = WebUtil.navigateToWebsite(driver);

        //Dimension d = new Dimension(480,320);
        //Resize the current window to the given dimension

        //2.Click add user
        navigateToWebsite.clickAddUser(driver);

        //3.Enter First Name
        navigateToWebsite.enterFirstName(driver, "John");
        //4.Enter Last Name
        navigateToWebsite.enterLastName(driver, "Miley");
        //5. Enter User Name
        navigateToWebsite.enterUserName(driver, "JMiley991");

        //6.Enter Password
        navigateToWebsite.enterPassword(driver, "JohnMiley123");
        //7.Select company option
        navigateToWebsite.selectCompany(driver);

        //8.Select Role
        navigateToWebsite.selectRole(driver);

        //9.Enter Email
        navigateToWebsite.enterEmail(driver, "johnMiley@yopmail.com");
        //10.EnterPhone Number
        navigateToWebsite.enterPhoneNumber(driver, "9876543210");
        //11. Save The User By clicking On Save
        navigateToWebsite.clickSaveUser(driver);
        //12.Assert User Was Added
        navigateToWebsite.validateUser(driver);

    }
       @Test
       @Order(1)
       public void DeleteUserFromTable() {
           System.setProperty("webdriver.chrome.driver", "C:/Users/hrangwal/OneDrive - Capgemini/Desktop/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           NavigateToWebsite navigateToWebsite = WebUtil.navigateToWebsite(driver);
           //Step1. Delete User
           navigateToWebsite.delteUser(driver);
           //Step2. Validate User
           navigateToWebsite.validateUserDeleted(driver);


       }


}




