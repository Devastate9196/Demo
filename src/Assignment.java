import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
		WebDriver flipkart=new ChromeDriver();
		WebDriver automationpractice=new ChromeDriver();
		WebDriver sastasundar=new ChromeDriver();
		WebDriver mmt=new ChromeDriver();
		WebDriver naukri=new ChromeDriver();
		flipkart.get("https://www.flipkart.com/");
		System.out.println(flipkart.getCurrentUrl());//URL
//		System.out.println(flipkart.getPageSource());//pagesource
		System.out.println(flipkart.getTitle());//TITLE
		Thread.sleep(2000);
		automationpractice.get("http://automationpractice.com/index.php");
		System.out.println(automationpractice.getCurrentUrl());//URL
//		System.out.println(automationpractice.getPageSource());//pagesource
		System.out.println(automationpractice.getTitle());//TITLE
		Thread.sleep(2000);
		sastasundar.get("https://www.sastasundar.com/");
		System.out.println(sastasundar.getCurrentUrl());//URL
//		System.out.println(sastasundar.getPageSource());//pagesource
		System.out.println(sastasundar.getTitle());//TITLE
		Thread.sleep(2000);
		mmt.get("https://www.makemytrip.com/");
		System.out.println(mmt.getCurrentUrl());//URL
//		System.out.println(mmt.getPageSource());//pagesource
		System.out.println(mmt.getTitle());//TITLE
		Thread.sleep(2000);
		naukri.get("https://www.naukri.com/");
		System.out.println(naukri.getCurrentUrl());//URL
//		System.out.println(naukri.getPageSource());//pagesource
		System.out.println(naukri.getTitle());//TITLE flipkart.quit();
		sastasundar.quit();
		automationpractice.quit();
		mmt.quit();
		naukri.quit();
	}
}
