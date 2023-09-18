package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_pages.Base_Page;

public class LandingPage extends Base_Page{
	WebElement Flights = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Flights']"));
//	WebElement Hotels = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Hotels']"));

	WebElement BusTickets = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Bus Tickets']"));
//	WebElement TourPackages = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Tour Packagess']"));
//	WebElement  VisitIndia = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Visit India']"));
	WebElement  Cruise = driver.findElement(By.xpath("//ul[@class='nav-icons-wrap CenterIconBox']/li/a[@title='Cruise']"));
//	
	public void flights() throws InterruptedException
	{
		Flights.click();
		Thread.sleep(4000);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String>iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow =iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='top-search-option']/div/label[@for='Round-Trip']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='form-in-custom stationFrom']/input")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='ui-id-1']/li/div[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='form-in-custom stationTo']/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ui-id-1']/li/div[contains(text(),'Hyderabad (HYD)')]")).click();//*[@id='ui-id-28']    //*[@id='ui-id-1']/li/div[contains(text(),'Hyderabad (HYD)')]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input-group ']/input[@id='originDate']")).click();
		driver.findElement(By.xpath("//div[@class='card rounded-0']//div/input[@id='noOfpaxEtc']")).click();
		driver.findElement(By.xpath("//*[@id='TravellerEconomydropdown']/div[1]/div[1]/div/a[2]/i")).click();
		driver.findElement(By.xpath("//*[@id='TravellerEconomydropdown']/div[1]/div[2]/div/a[2]/i")).click();
		driver.findElement(By.xpath("//div[@class='form-in-custom3']/button")).click();
	}
//	public static void selectDate(String month, String date) {
//		String date_xpath = "//div[@class='css-1dbjc4n r-1euycsn']//div[@data-testid='undefined-month-" + month
//				+ "-2023']//div[@data-testid='undefined-calendar-day-" + date + "']";
//		
//				driver.findElement(By.xpath(date_xpath)).click();
//	}
//	public void hotels() 
//	{
//		
//	}
	public void busTickets() throws InterruptedException
	{
		BusTickets.click();
	Thread.sleep(4000);
	Set<String> windowhandles=driver.getWindowHandles();
	System.out.println(windowhandles);
	Iterator<String>iterator =windowhandles.iterator();
	String parentwindow = iterator.next();
	System.out.println(parentwindow);
	String childwindow =iterator.next();
	System.out.println(childwindow);
	driver.switchTo().window(childwindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='form-in-custom']/input[@placeholder='Depart From']")).sendKeys("Hyderabad Airport RGIA");
	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id='ui-id-19']")).click();
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='goingTo']")).sendKeys("Kadapa (By Pass)");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id='ui-id-35']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@class='form-in-custom3']/button")).click();
//	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div/div/div[3]/div[2]/div[1]/div[7]/button")).click();
	}
////	public void tourPackages()
////	{
////		TourPackages.click();
////		
////	}
//	public void visitIndia()
//	{
//		VisitIndia.click();
//	
//	}
	public void cruise() throws InterruptedException
	{
		Cruise.click();
		Thread.sleep(4000);
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String>iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		String childwindow =iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Home-Form-Section cruise-Section-srch']//div/a[@class='DomesticRiverCruise']")).click();
		
	}
	
}
