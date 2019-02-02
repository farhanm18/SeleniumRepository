package SAdpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import SAdpkg1.LoginClass;
import SAdpkg1.LogoutClass;
import SAdpkg1.Register2;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mx4j.tools.config.DefaultConfigurationBuilder.Register;

public class MainClass {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		
		//for (int x=0; x<2; x++)
		//{
			
		//open the xls file
		FileInputStream fs = new FileInputStream("D:\\Farhan Mumtaz\\Third Session\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");
		
		System.out.println("Hello World!");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); 
		
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.opencart.com/index.php?route=account/login");// Access Login URL
        driver.get("https://demo.opencart.com/index.php?route=account/register");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		
		Register2 registerobjects2 = new Register2 (driver);
		registerobjects2.Log("abc", "def", "abcdef1@gmail.com", TN, PWD, CNM);
		
		
		/*LoginClass loginobjects = new LoginClass (driver);
	//	loginobjects.Log("mytc5@gmail.com", "123456789");
		loginobjects.Log(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
		*/
		
		LogoutClass logoutobjects = new LogoutClass (driver);
		logoutobjects.logout();
		
		LoginClass loginobjects1 = new LoginClass (driver);
		loginobjects1.Log("asd11@gmail.com", "asdasd1");
		
		/*driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		LoginClass loginobjects1 = new LoginClass (driver);
		loginobjects1.Log("asd11@gmail.com", "asdasd1");
		
		LogoutClass logoutobjects1 = new LogoutClass (driver);
		logoutobjects1.logout();*/
		
		
		
		
		driver.close();
		driver.quit();
	}

}
//}
