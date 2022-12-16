package OrcasTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Logout {
    public static WebDriver logout(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Login
        driver.get("https://gcreddy.com/project/login.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement email = driver.findElement(By.name("email_address"));
        email.sendKeys("devmhmd0@gmail.com");

      //  Enter Valid Password
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("12345678");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebElement login = driver.findElement(By.id("tdb1"));
        login.click();

        //LogOut
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        WebElement logout = driver.findElement(By.id("tdb4"));
        logout.click();

        //Assertion Logout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        String actualUrl="https://gcreddy.com/project/logoff.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        return driver ;

    }
}
