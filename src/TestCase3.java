import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        /*
        Test Case 3: Validate Automation Exercise site SUBSCRIPTION form
Given user navigates to “https://automationexercise.com/”
Then user should see heading2 as “SUBSCRIPTION”
And user should see and email input box with “Your email address” placeholder
And user should see arrow submit button
And user should see “Get the most recent updates from our site and be updated your self...” text under the email input box
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        WebElement headings2 = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));  //driver.findElement(By.xpath("//div[@class='single-widget']/h2"));
        WebElement emailInputBox = driver.findElement(By.id("susbscribe_email"));
        WebElement arrowSubmitButton = driver.findElement(By.cssSelector("form[class='searchform'] i"));//xpath("//form[@class='searchform']//i");
        WebElement textUnderEmail = driver.findElement(By.cssSelector("form[class='searchform'] p")); //xpath("//form[@class='searchform']//p");

        System.out.println(headings2.getText());
        System.out.println(headings2.isDisplayed());

        System.out.println(emailInputBox.getAttribute("placeholder"));
        System.out.println(emailInputBox.isDisplayed());


        System.out.println(arrowSubmitButton.isDisplayed());
        System.out.println(arrowSubmitButton.isEnabled());

        System.out.println(textUnderEmail.getText());
        System.out.println(textUnderEmail.isDisplayed());

        Driver.quitDriver();
    }
}
