package TechPub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {
public static void main(String[] args) {
	System.setProperty("web.driver.chrome","chromedriver.exe");
	System.out.println("Tech Pub Connect Will be Open");
	WebDriver driver=new ChromeDriver();
	driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
	
}
}
