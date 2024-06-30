package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RegisterAccountPage {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("Shahid");
        driver.findElement(By.id("input-lastname")).sendKeys("Shaikh");
        driver.findElement(By.id("input-email")).sendKeys("shahidshaikh13in@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("7028944242");
        driver.findElement(By.name("password")).sendKeys("12532546");
        driver.findElement(By.name("confirm")).sendKeys("12532546");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.linkText("login page")).click();
        if (driver.findElement(By.linkText("Login")).isDisplayed())
        {
            System.out.println("Login page is Displayed");

        }
        else {
            System.out.println("Login page is not Displayed");
        }
            driver.navigate().back();
           List<WebElement> buttons = driver.findElements(By.tagName("button"));
           for (WebElement button: buttons)
           {
               System.out.println(button.getText());
           }

    }
    }
