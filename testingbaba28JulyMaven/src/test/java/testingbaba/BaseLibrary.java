package testingbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class BaseLibrary {

	@Test
	public void launchUrl()
	{
		WebDriver driver = new EdgeDriver();
	}
	
}
