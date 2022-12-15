package OrcasTask;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Driver;
import java.time.Duration;

import static java.awt.SystemColor.window;
public class CreateAccount {
    public static WebDriver createAccount() {
        //Visit Website
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gcreddy.com/project/create_account.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Create Account
        //Your Personal Details
        //select Gender
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
        gender.click();

        //Add First Name
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement First_name = driver.findElement(By.name("firstname"));
        First_name.sendKeys("Mohamed");

        //Add Last Name
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement Last_name = driver.findElement(By.name("lastname"));
        Last_name.sendKeys("Ibrahim");

        //Add Date of Birth
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement date_of_birth = driver.findElement(By.name("dob"));
        date_of_birth.sendKeys("03/23/1991");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //Add Email Address
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement email_address = driver.findElement(By.name("email_address"));
        email_address.sendKeys("devmhmd0@gmail.com");

        /*Company Details
         */
        //Add Company Name
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement company_name = driver.findElement(By.name("company"));
        company_name.sendKeys("AHBS");


        //Address Details
        //Add Street Address
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement street_address = driver.findElement(By.name("street_address"));
        street_address.sendKeys("Kafr Abdo ,Alexandria ,Egypt");

        //Add Suburb
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement suburb = driver.findElement(By.name("suburb"));
        suburb.sendKeys("suburb bla bla");

        //Add PostalCode
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement postalCode = driver.findElement(By.name("postcode"));
        postalCode.sendKeys("05698");

        //Add City
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("05698");

        //Add State
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("157");

        //Select County
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        Select selectCountry = new Select(driver.findElement(By.name("country")));
        selectCountry.selectByVisibleText("Egypt");
        selectCountry.selectByIndex(63);

        //Contact Info
        //Add Telephone No

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement telephone = driver.findElement(By.name("telephone"));
        telephone.sendKeys("201015287494");

        //Add Fax Number
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement fax_no = driver.findElement(By.name("fax"));
        fax_no.sendKeys("1325456");

        //Select Newsletter
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement new_sletter = driver.findElement(By.name("newsletter"));
        new_sletter.click();


        //Add Password
        //Password
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345678");
        //Add Password Confirmation
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement pass_conf = driver.findElement(By.name("confirmation"));
        pass_conf.sendKeys("12345678");

        //Submit Form
        actions.sendKeys(Keys.ENTER).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        WebElement con = driver.findElement(By.id("tdb4"));
        con.submit();
        return  driver ;
    }
}
