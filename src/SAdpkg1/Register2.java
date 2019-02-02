package SAdpkg1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Register2 {
		WebDriver driver;
		public Register2(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
}
		@FindBy(name="firstname")
		public WebElement firstname;
		
		@FindBy(name="laststname")
		public WebElement lastname;
		
		@FindBy(name="email")
		public WebElement emailid;
		
		@FindBy(name="telephone")
		public WebElement telephone;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(name="confirm")
		public WebElement confirm;
		
		@FindBy(name="agree")
		public WebElement agree;
		
		@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
		public WebElement Continue;
		
		public void Log(String FN, String LN, String EM, String TN, String PWD, String CNM ) {
			
			firstname.sendKeys(FN);
			lastname.sendKeys("");
			emailid.sendKeys(EM);
			telephone.sendKeys(TN);
			password.sendKeys(PWD);
			confirm.sendKeys(CNM);
			Continue.click();
		
		
		
		
}
	}