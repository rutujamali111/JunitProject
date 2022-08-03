package validations;

import junit.framework.TestCase;

public class PasswordvalidTest extends TestCase {
	public void test()
	{
		ValidationMethods vm1=new ValidationMethods();
		boolean result=vm1.isValidPwd("Admin@1234");
		assertEquals(true, result);
	}

}
