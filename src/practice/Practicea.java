package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicea {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	WebElement serch = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	Actions act=new Actions(driver);
	act.sendKeys(serch, "selenium").build().perform();
	List<WebElement> serchresult = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//span[text()='selenium']"));
	for(WebElement result:serchresult) {
		String value = result.getText();
		System.out.println(value);
	}
}
}
