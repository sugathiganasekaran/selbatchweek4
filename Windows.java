package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.leafground.com/pages/Window.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//button[@id='home']")).click();
			Set<String> WindowHandles = driver.getWindowHandles();
			System.out.println(WindowHandles);
			List<String> list=new ArrayList<String>(WindowHandles);
               String childwindow=list.get(1);
            driver.switchTo().window(childwindow);
              System.out.println(driver.getCurrentUrl());
           String parentwindow=list.get(0);
            driver.switchTo().window(parentwindow);
         System.out.println(driver.getCurrentUrl());	
        driver.switchTo().window(childwindow);
	     driver.close();
	
	
	
	
	
	
	}
}
