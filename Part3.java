package Proje13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();

        WebElement inputName = driver.findElement(By.id("inputValEnter"));
        inputName.sendKeys("teddy bear");

        driver.findElement(By.cssSelector("span.searchTextSpan")).click();

        WebElement element=driver.findElement(By.cssSelector( "#searchMessageContainer > div > span"));
        System.out.println(element.getText());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.cssSelector("img[title=\"Snapdeal\"]")).click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();


        WebElement elem=driver.findElement(By.id("inputValEnter"));
        String atributename=elem.getAttribute("value");
        if(atributename.equals("teddy bear")){
            System.out.println("true");
        }else System.out.println("false");

    }

}
