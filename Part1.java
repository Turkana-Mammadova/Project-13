package Proje13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( " http://demoqa.com/text-box" );

        driver.manage().window().maximize();
        WebElement inputName = driver.findElement(By.id("userName"));
        inputName.sendKeys("Automation");

        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        inputEmail.sendKeys("Testing@gmail.com");

        WebElement inputCurrent = driver.findElement(By.id("currentAddress"));
        inputCurrent.sendKeys("Testing Current Address");

        WebElement inputPermanent = driver.findElement(By.id("permanentAddress"));
        inputPermanent.sendKeys("Testing Permanent Address");

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#submit")).click();

        String display = driver.findElement(By.id("output")).getText();
        System.out.println(display);
    }
}
