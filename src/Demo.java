import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement r = driver.findElement(By.name("q"));
		r.sendKeys("swaroop waingankar");
		r.sendKeys(Keys.RETURN);
//		driver.quit();
//		driver.close();
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
	}
}
