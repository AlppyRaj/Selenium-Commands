package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brinjal");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		driver.findElement(By.xpath("//div[@class='products-wrapper']/div/div/div[3]/button")).click();
		
		
	}

}
