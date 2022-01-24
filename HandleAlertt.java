package week4.day1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Alert alert = driver.switchTo().alert();
	String text=alert.getText();
	System.out.println("Simple Text:" +text);
	alert.accept();
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();   
       driver.switchTo().alert();
       System.out.println(alert.getText());
       alert.accept();
       driver.findElement(By.xpath("//button[text()='Prompt Box']")).click(); 
	driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Sugathi");
	alert.accept();
	driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click(); 
	driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
	System.out.println(alert.getText());
	driver.findElement(By.xpath("//button[text()='OK']")).click(); 
	
	driver.close();
	
	}

	

}
