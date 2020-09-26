package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //Import selenium webDriver
    private WebDriver driver;
    //Import chrome driver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        //Get URL
        driver.get("https://github.com/login");
        //Wait for complete testing
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        //Get username
        driver.findElement(By.name("login")).sendKeys("Ebuwa");
        //Get password
        driver.findElement(By.name("password")).sendKeys("iq697cC8ubGw7Sd");
        //Get sign in button
        driver.findElement(By.name("commit")).click();
        //Wait
        Thread.sleep(10000);
        //Close window
        driver.quit();

    }
    //Initiate test run
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();

    }

}
