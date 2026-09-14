package Test;



import Base.BaseClass;
import Page.LoginPage;
import Page.ProductPage;
import org.testng.annotations.Test;

public class ProductTest extends BaseClass {

    @Test
    public void VerifyProductCheckout() throws InterruptedException {

        // Login
        LoginPage login = new LoginPage(driver);
        login.Login();

        // Product Page
        ProductPage product = new ProductPage(driver);

        // Add product to cart
        product.ClickCart();

        // Click cart
        product.ClickCart();

        // Click checkout
        product.ClickCheckout();

        // Enter checkout information
        product.EnterCheckoutInformation();

        // Click continue
        product.ClickContinue();
    }
}

