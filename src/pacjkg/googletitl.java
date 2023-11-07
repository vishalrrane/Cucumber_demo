package pacjkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletitl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\VISHAL\\\\\\\\Desktop\\\\\\\\Selenium64bit\\\\\\\\Web Driver\\\\\\\\chromedriver.exe");
		//System.out.println("Hello");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(2000);
		
		
		String exptitle="Google";
	     String acttitle= ""+d.getTitle();
		
	     if(exptitle.contentEquals(acttitle)) {
	    	 System.out.println("test case is pass");
	    	 }
	     else {
	    	 
	    	 System.out.println("test case is fall actual title was "+acttitle );
	    	 
	     }
		
	}

}
