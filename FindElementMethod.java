package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("btnK"));

        if (element.isEnabled())
        {
            System.out.println("Element is enabled");
        }

        else {
            System.out.println("Element is disabled");
        }
    }

}