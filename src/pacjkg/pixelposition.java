package pacjkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;
import com.graphbuilder.geom.Point3d;



public class pixelposition {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\VISHAL\\\\Desktop\\\\Selenium64bit\\\\Web Driver\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		
		
		org.openqa.selenium.Point p;
		
		WebElement signin = d.findElement(By.xpath("//a[contains(.,'Sign in')]"));
		
	p=signin.getLocation();
	
	int xcord=p.getX();
	int ycord=p.getY();
	
	
	System.out.println("X cordinate of the pixel is " +xcord);
	System.out.println("y cordinate of the pixel is " +ycord);
	
	int width=signin.getSize().getWidth();
	int  height=signin.getSize().getHeight();
	

	System.out.println("  pixel width is " +width);
	System.out.println(" pixel height is " +height);
	
	
	
	
	
			
		
	}

}
