package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
        System.out.println("Opening the Browser");
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    // Find loginLink and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in") ) ;
        loginLink.click();
        System.out.println("Navigate to login page");
    // Find the actual text element and the text from element
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
    // Verifying actual and expected text
        Assert.assertEquals(expectedText, actualText);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    // Find loginLink and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in") ) ;
        loginLink.click();
    // Find emailField and type valid email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']") );
        emailField.sendKeys("prime123@gmail.com");
    // Find PasswordField and type valid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']") );
        passwordField.sendKeys("Prime123");
    // Click on login button after fill email and password field
       WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']") );
       loginButton.click();
    }@Test
    public void verifyTheErrorMessage() {
        // Find loginLink and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find emailField and type invalid email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("prime133@gmail.com");
        // Find PasswordField and type invalid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys("Prime133");
        // Click on login button after fill email and password field
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        // Find the error message element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
        System.out.println("Closing browser");
    }

}
