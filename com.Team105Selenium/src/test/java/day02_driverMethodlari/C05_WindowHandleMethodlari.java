package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());

        driver.close();

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());

        Thread.sleep(3000);
        driver.quit();
    }
}
