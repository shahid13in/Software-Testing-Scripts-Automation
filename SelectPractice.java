package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        //select.selectByVisibleText("checkbox1");
        select.selectByValue("USA");
        select.selectByValue("Russia");
        select.selectByValue("Japan");

        //select.deselectByValue("USA");
        //select.deselectByValue("Russia");
        //select.deselectByValue("Japan");
        select.deselectAll();;
    }
}
