package Page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
    public static DashBoardPage Dropdown;
    WebDriver driver;
    WebDriverWait wait;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By Selectdropdown = By.xpath("//select[@data-test='product-sort-container']");

    private Select Dropdown() {
        return new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(Selectdropdown)));
    }

    public void NameAtoZ() {
        Dropdown().selectByVisibleText("Name (A to Z)");
    }

    public void NameZtoA() {
        Dropdown().selectByVisibleText("Name (Z to A)");
    }

    public void PriceLowToHigh() {
        Dropdown().selectByVisibleText("Price (low to high)");
    }

    public void PriceHighToLow() {
        Dropdown().selectByVisibleText("Price (high to low)");
    }
}


