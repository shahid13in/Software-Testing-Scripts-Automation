package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password"));
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String str = driver.findElement(By.xpath("//span[@class='title']")).getText();
        if (str.equals("PRODUCTS")){
            System.out.println("Text Is Present");
        }
        else {
            System.out.println("Text Is Not Present");
        }
        String tag = driver.findElement(By.id("item_4_title_link")).getTagName();
        if (tag.equals("a")) {

            System.out.print("Tag is present");
        }
        else {
            System.out.print("Tag is Nt present");
        }
    }
}
