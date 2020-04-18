package page;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	OrangeHRMHomePage homepage;
	
	
	@Step
	public void openApplication() {
		 homepage.open();
	}
	
	@Step
	public void enterText() {
		homepage.enterText();
	}
	
	@Step
	public void clickOnLoginButton() {
		homepage.clickLogin();
	
	}

}
