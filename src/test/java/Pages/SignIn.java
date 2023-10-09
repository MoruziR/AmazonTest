package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import java.net.URL;

import java.io.IOException;

import static Tests.SeleniumTest.*;

public class SignIn {

    public static String login_username_xpath = "//*[@id=\"ap_email\"]";

    public static String login_button_xpath ="//*[@id=\"continue\"]";

    public static String login_password_xpath = "//*[@id=\"ap_password\"]";

    public static String login_singin_button_xpath = "//*[@id=\"signInSubmit\"]";

    public static String wrongUrl = "https://www.amazon.com/ap/signin";

    public static String rightUrl = "https://www.amazon.com/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref_=nav_AccountFlyout_signout";



    public static void login_username() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_username_xpath)).sendKeys("rarescristianmoruz@gmail.com");
        test.log(Status.PASS, "Test Passed for entering the keys");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static void login_button() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking login button");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static void  login_password() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_password_xpath)).sendKeys("Blabla);
        test.log(Status.PASS, "Test Passed for entering the keys");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static void  login_singin_button() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_singin_button_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking singin button");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static boolean ifLoggedIn() {
        try {
            // Create URL objects from the provided URL strings
            URL url1 = new URL(wrongUrl);
            URL url2 = new URL(rightUrl);

            // Use the equals method to compare the URLs
            return url1.equals(url2);
        } catch (Exception e) {
            // Handle any exceptions that may occur (e.g., invalid URLs)
            e.printStackTrace();
            return false; // URLs are not equal due to an exception
        }
}}
