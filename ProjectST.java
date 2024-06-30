package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectST {

        public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://tutorialsninja.com/demo");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[@title= 'My Account']")).click();
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            driver.findElement(By.id("input-email")).sendKeys("ddddassdd@gmail.com");
            driver.findElement(By.name("password")).sendKeys("123456");
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            WebElement LaptopNoteBooksMenu = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
            WebElement AllLaptopMenu = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(LaptopNoteBooksMenu).click(AllLaptopMenu).build().perform();
            driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
            driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
            driver.findElement(By.xpath("(//a[text()='fa fa-shopping-cart']")).click();
            String Product1_text=driver.findElement(By.xpath("//a[contains(@href,'product_id=44'])[4]")).getText();
            String Product2_text=driver.findElement(By.xpath("//a[contains(@href,'product_id=45'])[4]")).getText();

            if (Product1_text.equals("MacBook Air"))
            {
                System.out.println("Product_1 correctly selected");

            }
            else {
                System.out.println("Product1_text1 not slected correctly");
            }

            if (Product2_text.equals("MacBook Air"))
            {
                System.out.println("Product_2 correctly selected");

            }
            else {
                System.out.println("Product2 not slected correctly");
            }

        }
    }

