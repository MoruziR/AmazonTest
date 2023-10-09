package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static Tests.SeleniumTest.*;
import static Tests.SeleniumTest.test;

public class MusicUnlimitedPageButtons {
    public static String tryItFree1_xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/div/div[7]/div/div/div/div/span/span";
    public static String tryItFree2_xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[4]/div/div/div[1]/div/div/div/div/span/span";
    public static String seeMore1_xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div/div[1]/div[2]/div/a";

    public static String seeMore2_xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div/div[3]/div[2]/div/a";

    public static String backToTop_xpath = "/html/body/div[1]/div[2]/a";


    public static void tryItFree1() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(tryItFree1_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking try it free 1");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }


    public static void seeMore1() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(seeMore1_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking see more 1");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");

    }
    public static void seeMore2() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(seeMore2_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking see more 2");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static void tryItFree2() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(tryItFree2_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking try it free 2");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
    public static void backToTop() throws InterruptedException, IOException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(backToTop_xpath)).click();
        test.log(Status.PASS, "Test Passed for clicking back to top");
        test.log(Status.PASS,test.addScreenCaptureFromPath(capture(driver))+ "Test Passed");
    }
}
