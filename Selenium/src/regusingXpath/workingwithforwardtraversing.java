package regusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithforwardtraversing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Books')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Computers')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Electronics')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Apparel & Shoes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Digital downloads')]")).click();
	driver.close();
	
	
	}

}
