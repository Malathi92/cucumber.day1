package StepsEditLead;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class StepsEdit {
		
		public ChromeDriver driver;
		@Given("Open the Chrome browser")
		public void openBrowser()
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		
			driver.manage().window().maximize();
//			driver.manage.timeouts().implicitlywait()
		}
		@Given("Load the Url {string}")
		public void loadUrl(String url)
		{
			driver.get(url);
		}
		@Given("Enter the valid username {string}")
		public void enterUserName(String uName)
		{
			driver.findElement(By.id("username")).sendKeys(uName);
		}
		@Given("Enter the valid password {string}")
		public void enterPassword(String pwd)
		{
			driver.findElement(By.id("password")).sendKeys(pwd);
		}
		@When("Click on login button")
		public void clickLoginButton()
		{
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		}
		@Then("Home page should be displayed")
		public void verifyHomePage()
		{
			Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			if(displayed)
			{
				System.out.println("home page is displayed");
			}
			else
			{
				System.out.println("home page is not displayed");
			}
			
		}
		@When("Click on CRMSFA")
		public void clickCRMSFA()
		{
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		@When("Click on Leads")
		public void clickLeads()
		{
			driver.findElement(By.linkText("Leads")).click();
		}
		@When("Click on Create lead")
		public void clickCreateLeads()
		{
			driver.findElement(By.linkText("Create Lead")).click();
		}
		@Then("Create lead page should be displayed")
		public void createLeadPage()
		{
			String  title=driver.getTitle();
			System.out.println("the title is:"+title);
		}
		@Given("Enter the companyName {string}")
		public void companyName(String cName)
		{
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);	
		}
		@Given("Enter the firstName {string}")
		public void firstName(String fname)
		{
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);	
		}
		@Given("Enter the lastName {string}")
		public void lastName(String lName)
		{
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);	
		}
		@Given("Enter the firstlocalName {string}")
		public void firstNameLocal(String fNameLocal)
		{
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNameLocal);	
		}
		@Given("Enter the Department {string}")
		public void Dept(String dept)
		{
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
		}
		@Given("Enter the Description {string}")
		public void description(String desc)
		{
			driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);	
		}
		@Given("Enter the emailId {string}")
		public void email(String email)
		{
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);	
		}
		@Then("Click on Dropdown select value")
		public void dropDown() throws InterruptedException
		{
			WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select obj=new Select(ele);
			Thread.sleep(2000);
			obj.selectByVisibleText("New York");
		}
		@When("Click on submit button")
		public void clickSubmit()
		{
			driver.findElement(By.name("submitButton")).click();
			System.out.println("the title is "+driver.getTitle());
		}
		@When("Click on Edit button")
		public void clickEdit() 
		{
			driver.findElement(By.linkText("Edit")).click();
			
		}
		@Then("Edit screen should be displayed")
		public void EditPage() throws InterruptedException
		{
			Thread.sleep(1000);
			System.out.println("title is:"+driver.getTitle());
			
		}
		@When("Click on Clear button")
		public void clickClear()
		{
			driver.findElement(By.id("updateLeadForm_description")).clear();
		}
		
		@Given("Enter the importance note {string}")
		public void importanceNote(String note)
		{
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(note);
		}
		@When("Click on Submit Button")
		public void clicksubmitlast()
		{
			driver.findElement(By.name("submitButton")).click();
			System.out.println("the title is "+driver.getTitle());
		}


	}



