package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonHome {
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	@FindBy(className="nav-search-submit nav-sprite")
	private WebElement go;
	 
	
	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendText(String text) {
		search.sendKeys(text);
		
	}
	public void goClick() {
		go.click();
	}
    
	public void clearText() {
		search.clear();
	}
}




