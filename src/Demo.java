import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
//		driver.close();
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
	}
}
