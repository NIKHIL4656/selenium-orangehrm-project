package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class LoginPage extends BaseClass {

public void login() throws InterruptedException{

driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();

Thread.sleep(4000);
}
}
