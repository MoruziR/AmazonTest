package Tests;


import Pages.HomePage;
import Pages.MusicUnlimitedPageButtons;
import Pages.SignIn;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {

    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

    }
    public static String capture(WebDriver driver) throws IOException, IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ExecImages/" + System.currentTimeMillis()
                + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }
   @Test

   void gotoamazonMusicUnlimited() throws InterruptedException, IOException {
        test = extent.createTest("Validate if Amazon Music Unlimited button works","This test validates that Amazon Music Unlimited button works is working properly when clicked");
        HomePage.click_hamburger_menu();
        HomePage.amazonMusic();
        HomePage.amazonMusicUnlimited();
       extent.flush();
}
    @Test
 void verifyButtons1() throws InterruptedException, IOException {
        test = extent.createTest("Validate if Try it free 1 button works","This test validates that the buttons are working properly when clicked");
        driver.get("https://www.amazon.com/");
        HomePage.click_hamburger_menu();
     HomePage.amazonMusic();
     HomePage.amazonMusicUnlimited();
     MusicUnlimitedPageButtons.tryItFree1();
        extent.flush();

}
@Test
void verifyButtons2() throws InterruptedException, IOException {
    test = extent.createTest("Validate if Try it free 2 button work", "This test validates that the buttons are working properly when clicked");
    driver.get("https://www.amazon.com/");
    HomePage.click_hamburger_menu();
    HomePage.amazonMusic();
    HomePage.amazonMusicUnlimited();
    MusicUnlimitedPageButtons.tryItFree2();
    extent.flush();
}
    @Test
    void verifyButtons3() throws InterruptedException, IOException {
        test = extent.createTest("Validate if See more 1 button work", "This test validates that the buttons are working properly when clicked");
        driver.get("https://www.amazon.com/");
        HomePage.click_hamburger_menu();
        HomePage.amazonMusic();
        HomePage.amazonMusicUnlimited();
        MusicUnlimitedPageButtons.seeMore1();
        extent.flush();
    }
    @Test
    void verifyButtons4() throws InterruptedException, IOException {
        test = extent.createTest("Validate if See more 2 button work", "This test validates that the buttons are working properly when clicked");
        driver.get("https://www.amazon.com/");
        HomePage.click_hamburger_menu();
        HomePage.amazonMusic();
        HomePage.amazonMusicUnlimited();
        MusicUnlimitedPageButtons.seeMore2();
        extent.flush();
    }
    @Test
    void verifyButtons5() throws InterruptedException, IOException {
        test = extent.createTest("Validate if Back to top button work", "This test validates that the buttons are working properly when clicked");
        driver.get("https://www.amazon.com/");
        HomePage.click_hamburger_menu();
        HomePage.amazonMusic();
        HomePage.amazonMusicUnlimited();
        MusicUnlimitedPageButtons.backToTop();
        extent.flush();
    }

    @Test
    void verifyLogin() throws InterruptedException, IOException {
        test = extent.createTest("Validate if Login button work", "This test validates that the Login is working");
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        SignIn.login_username();
        SignIn.login_button();
        SignIn.login_password();
        SignIn.login_singin_button();
        SignIn.ifLoggedIn();
    }
    @AfterSuite
    public static void cleanup()
    {

        extent.flush();
    }




}