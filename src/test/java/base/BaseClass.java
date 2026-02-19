package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseClass {

public static WebDriver driver;

public void launchBrowser(){

driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
}

public void closeBrowser(){
driver.quit();
}
}
