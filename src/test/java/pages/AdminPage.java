package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class AdminPage extends BaseClass {

public void addUser() throws InterruptedException{

driver.findElement(By.xpath("//span[text()='Admin']")).click();
Thread.sleep(4000);
}
}
