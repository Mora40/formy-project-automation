import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\espot\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement CheckboxButton1 = driver.findElement(By.id("checkbox-1"));
        CheckboxButton1.click();

        WebElement CheckboxButton2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        CheckboxButton2.click();

        WebElement CheckboxButton3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        CheckboxButton3.click();

        Thread.sleep(2000);

        CheckboxButton1.click();
        CheckboxButton2.click();
        CheckboxButton3.click();


        driver.quit();
    }
}
