import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	System.out.println(driver.getCurrentUrl());//URL
	System.out.println(driver.getPageSource());//pagesource
	System.out.println(driver.getTitle());//TITLE
	
}
}
