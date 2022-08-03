package validations;

import junit.framework.TestCase;

public class MobileValidationTest extends TestCase {
	public void test()
	{
		ValidationMethods vm1=new ValidationMethods();
		boolean result=vm1.isValidNo("91 9309813565");
		assertEquals(true, result);
	}

}
