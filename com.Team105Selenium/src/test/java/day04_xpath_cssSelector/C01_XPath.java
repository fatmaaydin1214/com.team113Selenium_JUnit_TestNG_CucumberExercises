package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        //3- Delete butonunun gorunur old test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//*[text()='Delete']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else {
            System.out.println("delete butonu testi FAILED");
        }
        Thread.sleep(2000);

        //4- Delete butonuna basin
        deleteButonu.click();

        //5- "Add/Remove Elements" yazisinin gorunur old test edin
        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add remove yazi testi PASSED");
        }else {
            System.out.println("Add remove yazi testi FAILED");
        }
        Thread.sleep(3000);
        driver.close();

    }
}
