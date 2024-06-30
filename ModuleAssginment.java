package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleAssginment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Shahid");
        driver.findElement(By.id("input-lastname")).sendKeys("Shaikh");
        driver.findElement(By.name("email")).sendKeys("shahidshaikh16in@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("70289442425");
        driver.findElement(By.name("password")).sendKeys("12532546");
        driver.findElement(By.name("confirm")).sendKeys("12532546");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("agree")).click();
        String xpath_Text = "//div[@id='content']//p";
         driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String ActualText = driver.findElement(By.xpath(xpath_Text)).getText();
        if (ActualText.equals("Congratulations! Your new account has been successfully created!"))
        {
            System.out.println("Expected output Matches");
        }
        else {
            System.out.println("Account dosen't matches expected output");
        }

    }
}
