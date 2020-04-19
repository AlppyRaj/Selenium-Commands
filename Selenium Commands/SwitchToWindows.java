package SeleniumSessionU;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ofassignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		//-----Scenario2-----
		WebDriver driver=new ChromeDriver();
	
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		//---Scenario3------
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String firstwindow=it.next();
		String secondwindow=it.next();
		driver.switchTo().window(secondwindow);
		System.out.println(driver.getTitle());
		
	
		
		
		

	}

}
