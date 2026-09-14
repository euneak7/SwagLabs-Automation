package Test;



import Base.BaseClass;
import Page.LoginPage;

import org.testng.annotations.Test;


public class LoginTest extends BaseClass {
    @Test
    public void Verifylogin() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.Login();

    }
}



