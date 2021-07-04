import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
    }
    @Test
    public void startGoogle(){
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
    }
    @AfterMethod
    public void PostCondition(){
       // wd.quit();
    }
}
