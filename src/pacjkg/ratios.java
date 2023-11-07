package pacjkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ratios {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
	
		WebDriver d = new ChromeDriver();
	
		d.get("https://www.samco.in/share-price/");
		
		 d.manage().window().maximize();
	
		 WebElement search=d.findElement(By.xpath("//input[@id='stockSearch']"));
		 search.sendKeys("TATA STEEL LIMITED");
		 
		 Thread.sleep(2000);
		 
			d.findElement(By.linkText("TATA STEEL LIMITED")).click();
			Thread.sleep(2000);
			
		
			System.out.println("consolidated data are");
			
			WebElement table=d.findElement(By.xpath("//table[@style='display:inline-table']"));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			for(int i=0;i<4;i++) {
			
			String rowcount=rows.get(i).getText();
			System.out.println(" values are+"+rowcount);

			}
			Thread.sleep(2000);
			
			d.findElement(By.xpath("(//li[contains(.,'Standalone')])[1]")).click();
			System.out.println("Standalone  Data is ");
			
       
			WebElement table2=d.findElement(By.xpath("//div[@class='fs-data-itmes td-first-fx']"));
			
			List<WebElement> rows2=table2.findElements(By.tagName("tr"));
			for(int j=0;j<4;j++) 
			{
				
				String rowcount2=rows2.get(j).getText();
				System.out.println("values are"+rowcount2);
			
				Thread.sleep(2000);
				
		}
		
		
				
				
			}
			
			
			
			
	}	
		
	


