package Page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Add to Cart
    By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    // Cart Icon
    By cartIcon = By.xpath("//a[@data-test='shopping-cart-link']");
    // Checkout
    By checkout = By.xpath("//button[@id='checkout']");

    // Checkout Information
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");

    // Continue
    By continueButton = By.xpath("//input[@id='continue']");

    public void AddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }

    public void ClickCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }

    public void ClickCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
    }

    public void EnterCheckoutInformation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Euneak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys("Alo");
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCode)).sendKeys("629203");
    }

    public void ClickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
}