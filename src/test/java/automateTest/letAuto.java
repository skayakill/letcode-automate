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

public class letAuto extends envTarget {
    @Test
    public void testsBase() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(),'Page Object Model')]"))
        );
        driver.findElement(By.xpath("//*[@class='title has-text-centered'][contains(text(), 'Ready to be a Pro Engineer')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Page Object Model')]")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'card-footer-item')]"))
        );
        driver.findElement(By.className("title"));
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'card-footer-item')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);
        driver.quit();
    }
}
