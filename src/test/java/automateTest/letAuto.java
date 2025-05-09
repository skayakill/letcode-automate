package automateTest;

import org.junit.jupiter.api.Test;
import config.envTarget;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import pagesObject.pagesOpen;


public class letAuto extends envTarget {
    @Test
    public void testsBase() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        // click Page object Model

        pagesOpen pageOpen = new pagesOpen(driver);
        pageOpen.clickPOM();

        // click product Backpack
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'card-footer-item')]"))
        );
        driver.findElement(By.className("title"));
        WebElement button = driver.findElement(By.xpath("//button[contains(@class,'card-footer-item')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);

        // Order backpack via button Add to Cart
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Add to Cart']]"))
        );
        driver.findElement(By.xpath("//h2[@class='title mt-2']"));
        driver.findElement(By.xpath("//button[.//span[text()='Add to Cart']]")).click();
        // Then return to Products
        driver.findElement(By.xpath("//button[.//span[text()='Products']]")).click();
        driver.findElement(By.className("title"));

        // Click item t-shirt
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[contains(@class, 'card-footer')]//button[contains(text(), '₹ 22.3')]"))
        );
        driver.findElement(By.className("title"));
        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(), '₹ 22.3')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button1);

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Add to Cart']]"))
        );
        driver.findElement(By.xpath("//h2[@class='title mt-2']"));
        driver.findElement(By.xpath("//button[.//span[text()='Add to Cart']]")).click();
        driver.findElement(By.xpath("//button[.//span[text()='Products']]")).click();
        driver.findElement(By.className("title"));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), '₹ 55.99')]"))
        );
        driver.findElement(By.className("title"));
        WebElement button2 = driver.findElement(By.xpath("//button[contains(text(), '₹ 55.99')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button2);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Add to Cart']]"))
        );
        driver.findElement(By.xpath("//h2[@class='title mt-2']"));
        driver.findElement(By.xpath("//button[.//span[text()='Add to Cart']]")).click();
        driver.findElement(By.xpath("//button[.//span[text()='Products']]")).click();
        driver.findElement(By.className("title"));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), '₹ 55.99')]"))
        );
        driver.findElement(By.className("title"));
        WebElement button3 = driver.findElement(By.xpath("//button[contains(text(), '₹ 15.99')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button3);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//span[text()='Add to Cart']]"))
        );
        driver.findElement(By.xpath("//h2[@class='title mt-2']"));
        driver.findElement(By.xpath("//button[.//span[text()='Add to Cart']]")).click();
        driver.findElement(By.xpath("//button[.//span[text()='Products']]")).click();
        driver.findElement(By.className("title"));



        driver.quit();
    }
}
