package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utils.ConfigReader;

public class MyHooks {

    WebDriver driver;
	
	@Before
	public void setup() throws Exception {
		Properties prop=Utils.ConfigReader.initiazeproperties();
		driver = driverfactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
	}
	@After
	public void teardown(Scenario scenario) {
		
		String scenarioName=scenario.getName().replaceAll(" ","_");
		
		if(scenario.isFailed()) {
			
		byte[] srcScreenshot =	((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcScreenshot,"image/png", scenarioName);
		
		}
		driver.close();
	}
	
	
}
