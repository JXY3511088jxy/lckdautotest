package operation;

import org.openqa.selenium.WebDriver;
import pages.PageLogin;

public class Operatelogin {

    public static void Login(WebDriver driver,String username,String password) throws InterruptedException {
        PageLogin.Username(driver).sendKeys(username);
        Thread.sleep(1500);
        PageLogin.PassWORD(driver).sendKeys(password);
        Thread.sleep(1500);
        PageLogin.Login_button(driver).click();
        Thread.sleep(1500);
    }

    public static void loginout(WebDriver driver) throws InterruptedException {
        PageLogin.Loginout(driver).click();
        Thread.sleep(1000);
        PageLogin.Loginout_sure(driver).click();
    }
}
