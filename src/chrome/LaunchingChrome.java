package chrome;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriver driver;
		
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
		
		//Set ChromeDriver location
		//System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		System.out.println("Chrome browser launched");
		driver.get("https://m.youtube.com");
		System.out.println("YouTube opened");
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Test passed");
		
				
        
        
	}

}
