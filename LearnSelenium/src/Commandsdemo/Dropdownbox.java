package Commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.id("Skills")));
		List<WebElement> list1 = dropdown.getOptions();
		System.out.println("number of Skills: " + list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(" Skills are: " + list1.get(i).getText());
		}
		Select country = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		List<WebElement> list2 = country.getOptions();
		System.out.println("number of countries: " + list2.size());
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(" Country are: " + list2.get(i).getText());
		}
		Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		List<WebElement> list3 = year.getOptions();
		System.out.println("number of years: " + list3.size());
		for (int i = 1; i < list3.size(); i++) {
			System.out.println(" Country are: " + list3.get(i).getText());
		}
		driver.close();
	}

}
