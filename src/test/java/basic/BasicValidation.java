package basic;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{

	@Test
	public void titleValidation() {
		String expectedResult = "Facebook – log in or sign up";
		String actualResult = driver.getTitle();
		
		Reporter.log("Expected result = " + expectedResult);
		Reporter.log("Actual result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the page title,");
	}

	@Test
	public void welcomeMessageValidation() {//from c1 branch
		String expectedResult = "Facebook helps you connect and share with the people in your life.";
		String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		Reporter.log("Expected result = " + expectedResult);
		Reporter.log("Actual result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the welcome message,");
	}
}
