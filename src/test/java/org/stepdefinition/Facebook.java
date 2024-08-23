package org.stepdefinition;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {
	WebDriver driver;
	@Given("To launch the browser and maximize it")
	public void to_launch_the_browser_and_maximize_it() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva\\eclipse-workspace\\Promise\\Driver\\chromedriver.exe");
	
	}

	@When("To launch the url of the facebook")
	public void to_launch_the_url_of_the_facebook() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

	@When("Click the create new account")
	public void click_the_create_new_account() {
		
	   WebElement acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	   acc.click();
	}

	@When("To enter the firstname in the firstname text box")
	public void to_enter_the_firstname_in_the_firstname_text_box(DataTable d) throws InterruptedException {
		 Thread.sleep(3000);
	
		WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[2]"));d.asList();
	}

	@When("To enter the surname in the surname text field")
	public void to_enter_the_surname_in_the_surname_text_field() throws InterruptedException {
		 Thread.sleep(3000);
	 WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 surname.sendKeys("Dharsini");
	}

	@When("To pass the mail id in the mail id text box")
	public void to_pass_the_mail_id_in_the_mail_id_text_box() throws InterruptedException {
		Thread.sleep(3000); 
	    WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    mail.sendKeys("dharshdharsu");
	}

	@When("To enter the valid password in the password field")
	public void to_enter_the_valid_password_in_the_password_field(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
	    List<List<String>> asLists = d.asLists();
	    WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    asLists.get(0).get(1);
	}

	@Then("Close the entire browser")
	public void close_the_entire_browser() throws InterruptedException {
		Thread.sleep(3000);
	    driver.close();
	}


}
