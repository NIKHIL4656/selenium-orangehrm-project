package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class DashboardPage extends BaseClass {

public boolean dashboardVisible() throws InterruptedException{

Thread.sleep(5000);
return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
}
}
