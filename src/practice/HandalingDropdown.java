package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandalingDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	String parent = driver.getWindowHandle();
	System.out.println("parent id:"+parent);
	WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	link.click();
	link.click();
	link.click();
	Set<String> allwinid = driver.getWindowHandles();
	int numberofid = allwinid.size();
	int i=0;
	String [] aa=new String[numberofid];
	
for(String id:allwinid) {
	aa[i]=id;
	i++;
}
driver.switchTo().window(aa[2]);
driver.get("https://www.google.com");






}
}
