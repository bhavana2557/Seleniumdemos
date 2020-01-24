package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramedemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		 driver.findElement(By.xpath("//div[@class='row']"));
		 driver.switchTo().frame(1);
		driver.findElement(By.xpath("//div[@class='row']"));
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("bhavana chowdary");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
        driver.close();
	
	}

}
