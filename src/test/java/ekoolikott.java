import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ekoolikott {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://e-koolikott.ee/et");

        WebElement input = driver.findElement(By.xpath("//*[@placeholder='Otsi õppematerjalide seast']"));
        input.click();

        final String typeText = "Proovitöö";
        input.sendKeys(typeText);

        WebElement searchButton = driver.findElement(By.xpath("//*[@type='submit']"));
        searchButton.click();

        WebElement clickOnRightArrow = driver.findElement(By.xpath("//div[contains(@class,'action--right')]"));
        int i;
        for (i=0;i<=5;i++) {
            clickOnRightArrow.click();
        }

        WebElement clickOnPohiharidus = driver.findElement(By.xpath("//span[contains(text(),'Põhiharidus')]"));
        clickOnPohiharidus.click();

        WebElement clickOnKunstiained = driver.findElement(By.xpath("//span[contains(text(),'Kunstiained')]"));
        clickOnKunstiained.click();

        WebElement clickOnMuusika = driver.findElement(By.xpath("//span[contains(text(),'Muusika')]"));
        clickOnMuusika.click();

        WebElement sliderElement = driver.findElement(By.xpath("//html/body/kott-root/div/kott-search/div/div[2]/div[1]/div/kott-search-filter/div[2]/div[2]/kott-add-grade/div/div/ngx-slider/span[5]"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(sliderElement, 300, 0);

        WebElement clickOnKultuuriJaPadevused = driver.findElement(By.xpath("//span[contains(text(),'Kultuuri- ja väärtuspädevus')]"));
        clickOnKultuuriJaPadevused.click();

        WebElement clickOnHeli = driver.findElement(By.xpath("//span[contains(text(),'Heli')]"));
        clickOnHeli.click();

    }
}
