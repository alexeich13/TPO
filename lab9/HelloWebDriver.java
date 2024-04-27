import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloWebDriver {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://sneaker-head.by/");
        By openSearchLocator= By.xpath("/html/body/header/div/div/div[5]/ul/li[2]/a/img");
        WebElement openSearchButton = driver.findElement(openSearchLocator);
        openSearchButton.click();
        By insertDataLocator= By.xpath("//*[@id=\"search-input\"]");
        WebElement insertData = driver.findElement(insertDataLocator);
        insertData.sendKeys("Adidas Campus");
        insertData.sendKeys(Keys.ENTER);
        By openProductSelector= By.xpath("/html/body/div[3]/div/div[3]/div[1]");
        WebElement openProductClick = driver.findElement(openProductSelector);
        openProductClick.click();
        By addProductToBasketSelector= By.xpath("/html/body/div[3]/div/div[2]/div[2]/form/div[2]/button");
        WebElement addProductToBasketButton = driver.findElement(addProductToBasketSelector);
        addProductToBasketButton.click();
        //By linkToBasketSelector= By.xpath("//*[@id=\"fancybox-1\"]/div[2]/div/div/div/div/div/a");
        //WebElement wayToBasketButton = driver.findElement(linkToBasketSelector);
        //String href = wayToBasketButton.getAttribute("href");
        //Duration waitTime = Duration.ofSeconds(10);
        //driver.manage().timeouts().implicitlyWait(waitTime);
        Thread.sleep(5000);
        driver.quit();
    }
}
