package Commandsdemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlesdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Windows.html");			
	        driver.manage().window().maximize();		
	                		
	        System.out.println("The title of main window is:"+driver.getTitle());
	        
	        WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
	        tabwindow.click();
	        Set<String> windowwids=driver.getWindowHandles();
	        Iterator<String> iter=windowwids.iterator();
	        String mainwindow=iter.next();
	        String childwindow=iter.next();
	        driver.switchTo().window(childwindow);
	        System.out.println("The title of child window is:"+driver.getTitle());
	        driver.close();
	        driver.switchTo().window(mainwindow);
	        System.out.println("The title of main window2 is:"+driver.getTitle());
	        driver.close();
	}
}
	        

