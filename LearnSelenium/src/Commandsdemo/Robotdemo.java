package Commandsdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://image.online-convert.com/convert-to-jpg");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.id("fileUploadButton")).click();
		
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\image2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
