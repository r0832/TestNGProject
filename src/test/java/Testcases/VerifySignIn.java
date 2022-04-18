package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.signInPageObject;
import resources.BaseClass;
import resources.Constants;

public class VerifySignIn extends BaseClass {

	@Test (dataProvider = "demo")
	public void enterCredentials(String username, String password) {

		signInPageObject spo = new signInPageObject(driver);

		spo.enterUserName().sendKeys(username);
		spo.enterPassword().sendKeys(password);
		spo.clickOnLogin().click();

	}
	
	@DataProvider
	
	public Object[][]demo() {
		
		Object[][]data=new Object[2][2];
		data[0][0]=Constants.firstusername;
		data[0][1]=Constants.firstpassword;
		data[1][0]=Constants.secondusername;
		data[1][1]=Constants.secondpassword;
		
		return data;
		
	}
	
	

}
