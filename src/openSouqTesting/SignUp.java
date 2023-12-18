package openSouqTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		String pw = "201010566E@hab";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ehab Alking\\Desktop\\WebDriver Files\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jo.opensooq.com/en");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// click on Login or signUp
		driver.findElement(By.xpath("//*[@id=\"headerTwoDesktop\"]/section/div[2]/button[4]")).click();
		Thread.sleep(3000);

		// Enter the mobile number
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/input"))
				.sendKeys("776347317");

		// Click on button "next"
		driver.findElement(By.xpath("//*[@id=\"loginScreen\"]/div[2]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"passwordScreen\"]/div[2]/div[1]/div[2]/div/div[1]/button")).click();
		// Enter password
		driver.findElement(
				By.xpath("/html/body/div[4]/div[3]/div/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/input"))
				.sendKeys(pw);
		driver.findElement(By.xpath("//*[@id=\"passwordScreen\"]/div[2]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"successScreen\"]/button[1]")).click();

	}
}
