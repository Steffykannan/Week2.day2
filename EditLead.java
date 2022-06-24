package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	 public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("Demosalesmanager");
		 
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("crmsfa");
		 
		 WebElement login = driver.findElement(By.className("decorativeSubmit"));
		 login.click();
		 
		 WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		 link.click();
		 
		 WebElement leadslink = driver.findElement(By.linkText("Leads"));
		 leadslink.click();
		 
		 WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		 createlead.click();
		 
		 
		 WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		 companyname.sendKeys("Ascendas");
		 
		 WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		 firstname.sendKeys("John");
		 
		 WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		 lastname.sendKeys("Thomas");
		 
		 
		 WebElement localfname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 localfname.sendKeys("John");
		 
		 WebElement dep_name = driver.findElement(By.id("createLeadForm_departmentName"));
		 dep_name.sendKeys("Testing");
		 
		 WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		 desc.sendKeys("This is a site to learn selenium");
		 
		 WebElement mail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 mail.sendKeys("steffykannanalapatt@gmail.com")	;
		 
		 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select statedd = new Select(state);
		 statedd.selectByVisibleText("New York");
		 
		 WebElement submit = driver.findElement(By.name("submitButton"));
		 submit.click();
		 
		//Get Title
		   String title = driver.getTitle();
		   System.out.println(title);
		             
		 //Edit Lead
		 WebElement edit = driver.findElement(By.linkText("Edit"));
		 edit.click();
		 
		 //clear
		 WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
		 clearDescription.clear();
		 
		 //update
		 WebElement note = driver.findElement(By.id("updateLeadForm_importantNote"));
		 note.sendKeys("Updated as expected");
		 
		 //submit
		 WebElement sub_update = driver.findElement(By.className("smallSubmit"));
		 sub_update.click();
		 
		 String title2 = driver.getTitle();
		 System.out.println(title2);
		 
		 driver.quit();
		   
		   
		    
}
}
