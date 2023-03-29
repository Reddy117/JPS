import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver","C:\\JPS\\Selenium1\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://jobserve.com/in/en/Job-Search/");
		driver.findElement(By.id("txtKey")).sendKeys("Selenium");
		driver.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys("Hyderabad");
	}
}
