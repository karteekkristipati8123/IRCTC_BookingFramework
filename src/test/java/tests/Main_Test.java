package tests;

import org.testng.annotations.Test;

import base_pages.Base_Page;
import pages.LandingPage;

public class Main_Test extends Base_Page{
	
	@Test
	public static void test() throws InterruptedException
	{
		setup();
		
		LandingPage lp = new LandingPage();
		lp.flights();
		Thread.sleep(3000);
		lp.busTickets();
		
//		lp.tourPackages();
//		Thread.sleep(3000);
//		lp.visitIndia();
//		Thread.sleep(3000);
		lp.cruise();		
	}
}
