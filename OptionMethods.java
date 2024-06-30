package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OptionMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        List<WebElement> option =select.getOptions();
        for (WebElement e: option){
            System.out.printf(e.getText());

        }
        WebElement firstSelectionOption=select.getFirstSelectedOption();
        System.out.printf(firstSelectionOption.getText());


            List<WebElement> selectedOption = select.getAllSelectedOptions();
            for (WebElement e : selectedOption) {
                System.out.printf(e.getText());
            }
        }
    }