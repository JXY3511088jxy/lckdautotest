package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.Delayed;

public class PageLogin {
    private static WebElement element = null;

    public static WebElement Username(WebDriver driver){
        element=driver.findElement(By.id("ddlUsername-inputEl"));
        return element;
    }
    public static WebElement PassWORD(WebDriver driver){
        element = driver.findElement(By.id("tb-inputEl"));
        return element;
    }
    public static WebElement Login_button(WebDriver driver){
        element = driver.findElement(By.className("f-btn-text"));
        return element;
    }

    public static WebElement Loginout(WebDriver driver){
        element = driver.findElement(By.id("fineui_2"));
        return element;
    }

    public static WebElement Loginout_sure(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"fineui_42\"]/span/span"));
        return element;
    }
}
