package validations;

import junit.framework.TestCase;

public class EmailvalidationTest extends TestCase {
	public void test()
	{
		ValidationMethods vm1=new ValidationMethods();
		boolean result=vm1.isValidMail("abc@yahoo.com");
		assertEquals(true, result);
	}
}
