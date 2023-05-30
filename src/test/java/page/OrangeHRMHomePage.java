package page;



import com.gargoylesoftware.htmlunit.javascript.host.Console;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject{
	
	public void enterText() {
		$(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/input")).type("rosa");
		$(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/input")).click();
	}

	public void clickLogin() {
		$(By.xpath("/html/body/div/div/div[2]")).isDisplayed(); }
		
	}
}
