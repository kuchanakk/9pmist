package pack1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.ScreenShot;
import commonmethods.TestBase;
import exceldata.Excel;
import objrep.HomePage;

public class ProdDetaislUItest extends TestBase {
	
	static HomePage hp;
	static Excel ex;
	static ScreenShot sc ;
	
	@BeforeMethod
	public static void browser() {
		
		TestBase.openbrowser();
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	@Test
	public static void tablettest() throws InterruptedException, IOException {
		
		 hp = new HomePage(driver);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.tablink().click();
		Thread.sleep(5000);
		String actualtabtext=hp.detailstext().getText();
		 ex= new Excel();
		String expctetabtext=ex.readdata(1, 0);
		if(actualtabtext.contains(expctetabtext)) {
			
			System.out.println("Test is pass");
			
			ex.writedata(1, 1, "valid data");
			Assert.assertTrue(true);
			
		}else {
			
System.out.println("Test is fail");
			
			ex.writedata(1, 1, "invalid data");
			 sc = new ScreenShot();
			sc.scshot();
			
			Assert.assertTrue(false);
		
			
		}
		
		
		
	}
	
	
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		 hp = new HomePage(driver);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.laplink().click();
		Thread.sleep(5000);

		String actuallaptext=hp.detailstext().getText();
		String expctedlaptext=ex.readdata(2, 0);
		if(actuallaptext.contains(expctedlaptext)) {
			System.out.println("Test is pass");
			
			ex.writedata(2, 1, "valid data");
			Assert.assertTrue(true);
			
		}else {
			
			System.out.println("Test is fail");
			
			ex.writedata(2, 1, "invalid data");
			 sc = new ScreenShot();
			sc.scshot();
			
			Assert.assertTrue(false);
			
		}
		
		
		
	}
	
	@Test
	public static void spktest() throws InterruptedException, IOException {
		 hp = new HomePage(driver);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.spklink().click();
		Thread.sleep(5000);

		String spkactualtext=hp.detailstext().getText();
		String expctedspktext=ex.readdata(3, 0);
		if(spkactualtext.contains(expctedspktext)) {
			
System.out.println("Test is pass");
			
			ex.writedata(3, 1, "valid data");
			Assert.assertTrue(true);
			
			
		}else {
			

			System.out.println("Test is fail");
			
			ex.writedata(3, 1, "invalid data");
			 sc = new ScreenShot();
			sc.scshot();
			
			Assert.assertTrue(false);
			
		}
		
	}
}
