package SeleniumSessionU;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com//");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("BOM");
		Thread.sleep(6000);
		driver.findElement(By.linkText("Mumbai, IN - Chatrapati Shivaji Airport (BOM)")).click();

		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Ran");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Ranchi, IN - Birsa Munda (IXR)")).click();

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("5");

		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByVisibleText("3");

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Indigo");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

	}

}
