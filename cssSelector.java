package org.examples.texts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("shahidshaikh16in@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("12532546");
        driver.findElement(By.cssSelector("input[value='Login")).click();
    }
}
