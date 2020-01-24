package Commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    
    driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    
    Alert alert1=driver.switchTo().alert();
    String alerttitle=driver.switchTo().alert().getText();
    System.out.println("Alert title is: "+alerttitle);
    alert1.accept();
    
    driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    Alert alert2=driver.switchTo().alert();
    String Alerttitle2=driver.switchTo().alert().getText();
    System.out.println("alert tirle is: "+Alerttitle2);
    alert2.dismiss();
    
    driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    
    Alert alert3=driver.switchTo().alert();
    String Alerttitle3=driver.switchTo().alert().getText();
    System.out.println("alert title is: "+Alerttitle3);
    alert3.sendKeys("this is automated");
    alert3.accept();
    
	}

}
