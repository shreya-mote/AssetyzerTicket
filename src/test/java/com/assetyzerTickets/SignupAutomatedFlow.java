package com.assetyzerTickets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assetyzer.base.Keyword;
import com.assetyzer.base.TestBase;

public class SignupAutomatedFlow  {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.assetyzer.io/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// click on signupbutton
		driver.findElement(By.xpath("https://www.assetyzer.io/")).click();
		System.out.println("clicked on signup button");
		driver.findElement(By.xpath("(//input[@name=\"assetClass\"])[1]")).click();
		System.out.println("clicked on ticket asset type");
		driver.findElement(By.xpath("//a[text()=\"Get Started\"]")).click();
		System.out.println("clicked get started");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your first name\"]")).sendKeys("Shreya");
        System.out.println("Entered first name");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your last name\"]")).sendKeys("Mote");
		System.out.println("entered last name");
		
		
		// Use JavaScriptExecutor to click on "Done" button
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class=\"sc-12foipm-63 byVDBE\"]")));

		// Proceed to search for flights
		//driver.findElement(By.xpath("//a[@class=\"sc-12foipm-64 jkgFUQ\"]")).click();
	}
}
