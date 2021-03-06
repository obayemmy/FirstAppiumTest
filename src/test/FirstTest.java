package test;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class FirstTest {
	public AndroidDriver<WebElement> driver;
	@BeforeTest
	public void launchBrowser() throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Agromall-PC\\Downloads\\AgroCola_V1.0.8.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(8000);
		System.out.println("Agrocola app launched successfully");
		
	}
	
	public void closeApp() {
		driver.quit();
	}

}
