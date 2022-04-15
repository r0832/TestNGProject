package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.signInPageObject;
import resources.BaseClass;

public class VerifySignIn extends BaseClass {

	@Test
	public void enterCredentials() {

		signInPageObject spo = new signInPageObject(driver);

		spo.enterUserName().sendKeys("Rajesh");
		spo.enterPassword().sendKeys("Password");
		spo.clickOnLogin().click();

	}

}
