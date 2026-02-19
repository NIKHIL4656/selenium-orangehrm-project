package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class LogoutPage extends BaseClass {

public void logout() throws InterruptedException{

driver.findElement(By.xpath("//p[contains(@class,'userdropdown')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
