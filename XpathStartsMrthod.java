package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsMrthod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        if(driver.findElement(By.xpath("//img[starts-with(@title,'Canon EOS 5D')]")).isDisplayed())
        {
            System.out.println("Element is displayed on Page");
            driver.findElement(By.xpath("//img[starts-with(@title,'Canon EOS 5D')]")).click();
        }


    }
}
