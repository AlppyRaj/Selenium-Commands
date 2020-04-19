package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXB']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();;
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
        Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("4");
        
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
        driver.close();
		
		
		
	}

}
