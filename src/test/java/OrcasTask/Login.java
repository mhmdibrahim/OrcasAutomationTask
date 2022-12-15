package OrcasTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    public static WebDriver login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gcreddy.com/project/login.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Login by Valid Email & Password
        //Enter Valid Email
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement email = driver.findElement(By.name("email_address"));
        email.sendKeys("devmhmd0@gmail.com");

        //Enter Valid Password
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("12345678");
        //Login Action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement login = driver.findElement(By.id("tdb1"));
        login.click();
        return  driver ;
    }
}
