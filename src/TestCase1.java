import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        /*
        Test Case 1: Validate Automation Exercise site logo
Given user navigates to “https://automationexercise.com/”
Then user should see logo on top-left
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        WebElement logo = driver.findElement(By.cssSelector("div[class='logo pull-left'] img")); // cssSelector
        //driver.findElement(By.xpath("//div[@class='logo pull-left']//img")); //Xpath locator

        System.out.println(logo.isDisplayed());
        System.out.println(logo.isEnabled());

        Driver.quitDriver();
    }
}
