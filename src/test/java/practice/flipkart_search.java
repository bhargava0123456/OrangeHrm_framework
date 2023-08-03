package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_search {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.name("q")).sendKeys("jeans"+Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='Discount']")).click();
	driver.findElement(By.xpath("//div[text()='30% or more']")).click();
	
}
}
