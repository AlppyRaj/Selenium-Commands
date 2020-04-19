package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ofassignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Signin")).click();
		
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("test");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("test");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Registration")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Alppy");
		driver.findElement(By.xpath("//input[@name='m_status']")).click();
		driver.findElement(By.xpath("//label[@class='relative']//input[@name='hobby']")).click();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@xyz.com");
		driver.findElement(By.xpath("//form[@id='register_form']//fieldset//textarea")).sendKeys("Demo Registration");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("abc123");
		//driver.findElement(By.xpath("//input[@value='submit']")).click();
		
		
	}

}
