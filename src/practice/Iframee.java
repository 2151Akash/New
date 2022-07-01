package practice;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframee {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		String parentid = driver.getWindowHandle();
		
		System.out.println("Parent id is :"+parentid);
		
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		
		link.click();
		link.click();
		link.click();
		
	Set<String> aiiwinid = driver.getWindowHandles();
	int winsize = aiiwinid.size();
	int i=0;
	String [] wini=new String[winsize] ;
	
		for(String id:aiiwinid) {
			wini[i]=id;
			i++;
		}
		driver.switchTo().window(wini[2]);
		driver.get("www.google.com/");
}


	}


