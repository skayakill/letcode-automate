package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagesOpen {
    WebDriver driver;
    public pagesOpen(WebDriver driver) { this.driver= driver; }

    By headerPages = By.xpath("By.xpath(\"//*[@class='title has-text-centered'][contains(text(), 'Ready to be a Pro Engineer')]\")");
    By openPages = By.xpath("//a[contains(text(),'Page Object Model')]");

    public void clickPOM () { driver.findElement(openPages).click();}
}
