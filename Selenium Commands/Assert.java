package SeleniumSessionU;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS) ;
		driver.findElement(By.name("search")).sendKeys("HP LP3065 ");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")).click();
	
		driver.findElement(By.id("button-cart")).click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")));
		String as=driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
		System.out.println(as);
		String ex="Success: You have added HP LP3065 to your shopping cart!";
	   
		Assert.assertEquals(as.substring(0, as.length()-2),ex);
		System.out.println("Pass");
		Thread.sleep(3000);
		driver.findElement(By.id("cart-total")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();
		
		Thread.sleep(3000);
		String msg=driver.findElement(By.xpath("//*[@id=\"content\"]/p")).getText();
		System.out.println(msg);
		String msgx="Your shopping cart is empty!";
		Assert.assertEquals(msg, msgx);
		System.out.println("Pass");

	}

}
