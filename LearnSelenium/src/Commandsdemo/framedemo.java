package Commandsdemo;


	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class framedemo {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		 driver.manage().window().maximize();
		 List<WebElement> framecount=driver.findElements(By.tagName("iframe"));
		 System.out.println("No of frames is:"+framecount.size());
		 
		 for(int i=0;i<framecount.size();i++)
		 {
			 System.out.println(framecount.get(i).getAttribute("name"));
		 }
		 
		 //SWITCH TO FRAME
		 
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		
		//Enter the value into text box
		
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("Selenium");
		}

	}



