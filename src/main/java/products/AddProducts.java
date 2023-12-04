package products;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProducts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.phonelcdparts.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title' and text()='Samsung']")).click();
		driver.findElement(By.xpath("//span[@class='title' and text()='Galaxy S23 Ultra']")).click();
		
		for(int i=1;i<10;i++) {
			driver.findElement(By.xpath("//body/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/button[2]")).click();
		}
		
		

	}

}
