import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\coold\\Videos\\Automation tyss\\software\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlywait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"form-text typeahead xdsoft_input\"]")).sendKeys("rings", Keys.ENTER);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(("")")).click();"

}
}
