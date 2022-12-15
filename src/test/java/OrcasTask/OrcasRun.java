package OrcasTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrcasRun {
    public static void main(String[] args) {
        WebDriver driver = OrcasTask.CreateAccount.createAccount();
        WebDriver driver1 = OrcasTask.Login.login();
    }
}
