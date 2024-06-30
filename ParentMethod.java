package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        String actualText =driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();

         if(actualText.equals("If you already have an account with us, please login at the"))
        {
            System.out.println("actual text is found");
        }

         else {
            System.out.println("actual text is not found");
        }
    }
}
