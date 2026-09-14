package Test;

import Base.BaseClass;
import Page.DashBoardPage;
import Page.LoginPage;
import org.testng.annotations.Test;

@Test
public class DashBoardTest extends BaseClass {
    public void VerifyDropdown() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.Login();

        DashBoardPage Dropdown = new DashBoardPage(driver);


        Dropdown.NameAtoZ();
        Dropdown.NameZtoA();
        Dropdown.PriceHighToLow();
        Dropdown.PriceLowToHigh();
    }
}

