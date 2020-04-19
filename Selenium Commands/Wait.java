package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.*;
public class AssignmentExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
//		
//		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
//		
//		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
//		
//		WebDriverWait w=new WebDriverWait(driver,5);
//		
//		w.until(ExpectedConditions.elementToBeClickable(By.xpath("div[@id='results']")));
//		
//		System.out.println(driver.findElement(By.xpath("div[@id='results']")).getText());
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

	       System.out.println(driver.getTitle());

	   driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();

	   WebDriverWait d=new WebDriverWait(driver,10);

	// d.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='results']")));

	       d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='results']")));

	   System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
	}

}
