package tests;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.*;

public class HRMTest extends BaseClass {

@Test
public void runTest() throws Exception {

System.out.println("=== TEST STARTED ===");

launchBrowser();

LoginPage lp = new LoginPage();
lp.login();

DashboardPage dp = new DashboardPage();
System.out.println("Dashboard visible = " + dp.dashboardVisible());

AdminPage ap = new AdminPage();
ap.addUser();

LogoutPage lo = new LogoutPage();
lo.logout();

closeBrowser();

System.out.println("=== TEST FINISHED ===");
}
}
