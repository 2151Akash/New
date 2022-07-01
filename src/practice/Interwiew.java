package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interwiew {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://nichethyself.com/tourism/home.html");
	driver.findElement(By.xpath("//*[text()='Customized tours']")).click();
	
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Set<String> aiiwinid = driver.getWindowHandles();
	for(String id:aiiwinid) 
	{
		if(!(id.equals(parent)))
		{
			driver.switchTo().window(id);
			WebElement dropdown = driver.findElement(By.xpath("//*[@id='days']"));
			Select sl=new Select(dropdown);
			sl.selectByVisibleText("Home Stay");
		}
	}
	driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
driver.findElement(By.xpath("//*[text()='Contact us!']")).click();
	
}
}
