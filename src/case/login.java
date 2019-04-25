import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import operation.Operatelogin;
import org.testng.annotations.Test;  //注意：这个位置一定要是testng的路径，不是junit的
import org.openqa.selenium.By;

public class login extends base.BasePrepare {
    @Test
    public void case_login(){
        //System.out.println(driver.getTitle());

        if(driver.getTitle().equals("登录")){
            System.out.println("系统页面打开成功");
        }else {
            System.out.println("系统页面打开失败");
        }

//        driver.findElement(By.id("ddlUsername-inputEl")).sendKeys("admin");
//        driver.findElement(By.id("tb-inputEl")).sendKeys("2");
//        driver.findElement(By.className("f-btn-text")).click();
//        //System.out.println(driver.getTitle());

        try {
            Operatelogin.Login(driver,"admin","2");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        if(driver.getTitle().equals("四川省高级人民法院财务管理系统")){
            System.out.println("系统登录成功");
        }else {
            System.out.println("系统登录失败");
        }


    }

    @Test
    public void case_loginout(){

        try {
            Operatelogin.loginout(driver);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        if(driver.getTitle().equals("登录")){
            System.out.println("退出登录，成功返回到登录页面");
        }else {
            System.out.println("退出失败");
        }

    }
}
