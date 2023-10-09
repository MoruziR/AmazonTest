package Pages;
import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage {

    public static String hamburger_menu_xpath = "//*[@id=\"nav-hamburger-menu\"]/i";
    public static String amazonMusic_xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a";

    public static String amazonMusicUnlimited_xpath = "//*[@id=\"hmenu-content\"]/ul[30]/li[3]/a";

    public static String tryItFree1_xpath = "//*[@id=\"15\"]/span/span";

    public static String seeMore1_xpath = "//*[@id=\"a-page\"]/div[2]/div/div/div[1]/div[3]/div/div[1]/div[2]";
    public static String seeMore2_xpath = "//*[@id=\"a-page\"]/div[2]/div/div/div[1]/div[3]/div/div[3]/div[2]";

    public static String tryItFree2_xpath = "//*[@id=\"16\"]/span/span";

    public static String backToTop_xpath = "//*[@id=\"navBackToTop\"]";







    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void amazonMusic() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonMusic_xpath)).click();
    }
    public static void amazonMusicUnlimited()throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonMusicUnlimited_xpath)).click();
    }




}