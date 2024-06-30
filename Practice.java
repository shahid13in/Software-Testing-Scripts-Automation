package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        if (driver.findElement(By.name("radiooptions")).isDisplayed()) {

            if (driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).isSelected()) ;
            {
                driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();

            }
        }
    }
}