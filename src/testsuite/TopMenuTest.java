package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
        System.out.println("Opening the Browser");
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
// Click on Computer tab
        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        computerTab.click();
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.linkText("Electronics"));
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.linkText("Apparel"));
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.linkText("Digital downloads") );
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement bookPageTab = driver.findElement(By.linkText("Books"));
        bookPageTab.click();
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.linkText("Books"));
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.linkText("Jewelry"));
        String actualText = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement giftCardTab = driver.findElement(By.linkText("Gift Cards"));
        giftCardTab.click();
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.linkText("Gift Cards"));
        String actualText  = actualTextElement.getText();
        // Verifying expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
        System.out.println("Closing browser");
    }
}
