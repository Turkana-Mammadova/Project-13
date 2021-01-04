package Proje13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();


        driver.manage().window().maximize();
        WebElement inputName = driver.findElement(By.id("username"));
        inputName.sendKeys("ttechno@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("techno123.");
        driver.findElement(By.cssSelector("#log-in")).click();

        WebElement loadingElements = driver.findElement(By.id("time"));
        String str=loadingElements.getText();
        System.out.println(str);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }
}
