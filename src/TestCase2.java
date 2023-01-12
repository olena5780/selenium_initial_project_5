import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        /*
        Test Case 2: Validate Automation Exercise site header items
Given user navigates to “https://automationexercise.com/”
Then validate all below header items are displayed and enabled and their text is as below
Home
Products
Cart
Signup / Login
Test Cases
API Testing
Video Tutorials
Contact us

         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        //driver.findElements(By.xpath("//div[@class='shop-menu pull-right']//li")); //xpath locator
        List<WebElement> headers = driver.findElements(By.cssSelector("div[class='shop-menu pull-right'] li"));

        for (WebElement header : headers) {
            System.out.println(header.getText());
            System.out.println(header.isDisplayed());
            System.out.println(header.isEnabled());

        }

        Driver.quitDriver();
    }
}
