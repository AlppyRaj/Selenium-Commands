package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Ran");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//li[@id='react-autowhatever-1-section-0-item-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Ban");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//li[@id='react-autowhatever-1-section-0-item-3']")).click();
		
		driver.findElement(By.xpath("//input[@id='departure']")).click();
	}

}
