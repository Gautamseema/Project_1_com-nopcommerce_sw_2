package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
        System.out.println("Opening the Browser");
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        String expectedText = "Register";
        // Find the actual text element and the text from element
        WebElement actualTextElement = driver.findElement(By.linkText("Register"));
        String actualText = actualTextElement.getText();
        // verifying expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //Select gender radio button
        WebElement radioButton = driver.findElement(By.xpath("//label[@for='gender']"));
        radioButton.click();
        //Select male radio button
        WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
        maleRadioButton.click();
        //Find first name field and type first name
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Alex");
        // Find lastName field and type last name
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Smith");
        // Fill day,moth and year field
        WebElement dayField = driver.findElement(By.name("DateOfBirthDay"));
        dayField.sendKeys("15");
        WebElement monthField = driver.findElement(By.name("DateOfBirthMonth"));
        monthField.sendKeys("July");
        WebElement yearField = driver.findElement(By.name("DateOfBirthYear"));
        yearField.sendKeys("1992");

        //Enter Email address on register link
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Alex123@gmail.com");
        //Enter password on register link
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Alex123");
        //Enter confirm password
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("Alex123");
        // Click on register button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = actualTextElement.getText();
        // VERIFYING EXPECTED AND ACTUAL TEXT
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
        System.out.println("Closing browser");
    }
}