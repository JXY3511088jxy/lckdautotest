package base;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import sun.net.idn.Punycode;

import java.security.PublicKey;

public class BasePrepare {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\IdeaProjects\\lckdautotest\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");  //用这个就会打开浏览器
//        options.addArguments("headless"); //无界面参数
//        options.addArguments("no-sandbox"); //禁用沙盒 就是被这个参数搞了一天
        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://222.222.222.8:8085/isp-court/login.jsp");

    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
