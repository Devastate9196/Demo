import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
		ChromeDriver flipkart=new ChromeDriver();
		ChromeDriver automationpractice=new ChromeDriver();
		ChromeDriver sastasundar=new ChromeDriver();
		ChromeDriver mmt=new ChromeDriver();
		ChromeDriver naukri=new ChromeDriver();
		flipkart.get("https://www.flipkart.com/");
		automationpractice.get("http://automationpractice.com/index.php");
		sastasundar.get("https://www.sastasundar.com/");
		mmt.get("https://www.makemytrip.com/");
		naukri.get("https://www.naukri.com/");
	}
}
