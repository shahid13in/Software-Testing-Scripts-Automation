package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class FacebookLogPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        if (driver.findElement(By.id("loginbutton")).isDisplayed())
        {
            System.out.println("button is displayed");
        }
        else{
            System.out.println("buttom is not displayed");

        }

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button: buttons)
        {
            System.out.println(button.getText());
        }

    }
}
