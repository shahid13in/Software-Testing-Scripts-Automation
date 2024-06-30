package org.examples.texts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        String source = driver.getPageSource();

        System.out.println(title + " " + url +" " + source);

        /*if (source.contains("en-IN"))
        {
            System.out.println("Source is correct");

        }
        else
        {
            System.out.println("Source is incoorect");

        }*/

    }
}
