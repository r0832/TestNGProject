package Testcases;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.signInPageObject;
import PageObjectModel.signUpPageObject;
import resources.BaseClass;
import resources.Constants;

@Test
public class verifySignUp extends BaseClass{
	
	public void signUp() throws InterruptedException {
		//Sign In Page Objects
		signInPageObject spo = new signInPageObject(driver);
		spo.tryForFree().click();
		
		//Sign Up Page Objects
		signUpPageObject sup = new signUpPageObject(driver);
//		Thread.sleep(5000);
		sup.firstNamef().sendKeys(Constants.firstname);
		sup.lastNamel().sendKeys(Constants.lastname);
		sup.workEmailWE().sendKeys("r@gmail.com");
		
		//Selecting from dropdownList Job Title
		Select s1 = new Select(sup.jobTitleJT());
		s1.selectByIndex(1);
		
		sup.companyC().sendKeys(Constants.companyname);
		
		//Selecting from dropdownList Employees
		Select s2 = new Select(sup.employeesE());
		s2.selectByIndex(2);
		
		sup.phoneP().sendKeys(Constants.phonenumber);
		
		//Selecting from Dropdown list Country/Region		
		Select s3 = new Select(sup.countryRegionCR());
		s3.selectByIndex(23);
		
		sup.mainServiceAgreementMA().click();
						
		
	}

}
