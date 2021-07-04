import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest1 {



        WebDriver wd;

        @BeforeMethod
        public void precondition(){
            wd =new ChromeDriver();
            //login before
        }

        @Test
        public void startGoogle(){
            wd.navigate().to("https://www.google.com/");
        }

        @AfterMethod
    public void postCondition(){
            wd.close();
        }

    }

