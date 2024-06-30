package org.examples.texts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHamdles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://naukri.com");

        String mainWindow =driver.getWindowHandle();
        System.out.println(mainWindow);

        Set<String> hamdles = driver.getWindowHandles();
        for (String handle : hamdles) {
            if (!mainWindow.equals(handle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle));
                driver.close();
            }

        }

            driver.switchTo().window(mainWindow);
            driver.findElement(By.className("suggestor-input")).sendKeys("Automation Testing");
            driver.findElement(By.className("qsbSubmit")).click();

    }

}

