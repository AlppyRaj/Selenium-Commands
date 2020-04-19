package SeleniumSessionU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("checkBoxOption2")).click();
	    //System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText());
	    String box= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	    WebElement drop=driver.findElement(By.id("dropdown-class-example"));
	    
	    Select select = new Select(drop);
	    select.selectByVisibleText(box);
	    
	    driver.findElement(By.id("name")).sendKeys(box);
	    driver.findElement(By.id("alertbtn")).click();
	    
	    String text=driver.switchTo().alert().getText();
	    
	    if(text.contains(box))
	    {
	    	System.out.println("Verified");
	    }
	    
	    else
	    	System.out.println("Mismatched");
	    
	    
		
	}

}
