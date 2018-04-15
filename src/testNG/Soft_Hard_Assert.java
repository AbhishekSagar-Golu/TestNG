package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assert {
@Test
public void softAssert()
{
SoftAssert soft = new SoftAssert();
System.out.println("SoftAssert Test started");
soft.assertEquals(12, 121,"Count does not match");
System.out.println("SoftAssert method got completed");
soft.assertAll(); //if we forgot to call assertAll() at the end of the test
//then the test ll pass even if assert objects threw exceptions
}

@Test
public void hardAssert()
{
	System.out.println("HardAssert Method has started");
	Assert.assertTrue(false);
	System.out.println("Harassert method has ended");}
}
