package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    driver.manage().window().maximize();
	     
	     driver.switchTo().frame("frame1");
	     driver.findElement(By.tagName("input")).sendKeys("Selenium");
	     driver.switchTo().frame("frame3");
	     driver.findElement(By.id("a")).click();
	     driver.switchTo().frame("frame2");
	     Thread.sleep(2000);
	    WebElement web = driver.findElement(By.xpath("//select[@id='animals']"));
	    Select dropdown9=new Select(web);
		dropdown9.selectByVisibleText("Baby Cat"); 
	     
	     driver.close();
	
	
	
	
	
	}

}
