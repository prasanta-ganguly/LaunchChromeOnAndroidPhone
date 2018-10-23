package chrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class chromeLaunch {

	AndroidDriver<MobileElement> driver;
	
	@Before
	public void setup() throws InterruptedException, MalformedURLException{
		// Created object of DesiredCapabilities class.
        DesiredCapabilities caps = new DesiredCapabilities();
        // Set android deviceName desired capability. Set your device name.
        caps.setCapability("deviceName", "lenovo");
     // Set android deviceName desired capability. Set your device name.
        caps.setCapability("udid", "1be9aade");
     // Set android platformName desired capability. It's Android in our case here.
        caps.setCapability("platformName", "Android");
     // Set android VERSION desired capability. Set your mobile device's OS version.
        caps.setCapability("platformVersion", "5.1.1");
     // Set BROWSER_NAME desired capability. It's Chrome in our case here.
        caps.setCapability("browserName", "Chrome");
     // Set android appPackage desired capability. It is
        
        caps.setCapability("app-package", "com.android.chrome");  
     // Set android appActivity desired capability. It is
        caps.setCapability("app-activity", "com.google.android.apps.chrome.Main");
        //Set the path for chromedriver.exe file
        caps.setCapability("chromedriverExecutable", "E:\\Chrome Driver\\chromedriver.exe");
		caps.setCapability("noReset", true);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://m.youtube.com");
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateYouTube(){
		
		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
