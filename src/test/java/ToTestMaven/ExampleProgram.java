package ToTestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sunita/Documents/eclipse/BasicWebdriverProgram/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://testingmasters.com/hrm");
	}
}
