import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        /*
        Test Case 4: Validate Automation Exercise site footer
Given user navigates to “https://automationexercise.com/”
Then user should see “Copyright © 2021 All rights reserved” text in the footer
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        WebElement copyrightText = driver.findElement(By.cssSelector("div[class='footer-bottom'] p"));

        System.out.println(copyrightText.getText());
        System.out.println(copyrightText.isDisplayed());

        Driver.quitDriver();


    }
}
