package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduactExample {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91842\\OneDrive\\Desktop\\javaprogram\\selinium\\chromedriver_win32.zip\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https//www.flipkart.com");
		
		
		driver.findElement(By.xpath())
		
		Thread.sleep(1000);
	}

}
