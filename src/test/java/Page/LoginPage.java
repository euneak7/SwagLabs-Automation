package Page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@id='login-button']");

    public void Login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}