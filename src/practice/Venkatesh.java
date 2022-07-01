package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Venkatesh {

public class Akash {
public static void main(String[] args) throws IOException {
	System.setProperty("webdrever.chrome.driver", "path");
	WebDriver driver=new ChromeDriver();
	TakesScreenshot scr=  (TakesScreenshot)driver;
	File sourse = scr.getScreenshotAs(OutputType.FILE);
	// destination=new File(System.getProperty("user.dir"+//screenshot//+filename+));
	
	//org.openqa.selenium.io.FileHandler.copy(sourse, destination);
}
}

}
