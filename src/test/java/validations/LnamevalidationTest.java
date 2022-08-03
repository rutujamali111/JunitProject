package validations;

import junit.framework.TestCase;

public class LnamevalidationTest extends TestCase {
	public void test()
	{
		ValidationMethods vm1=new ValidationMethods();
		boolean result=vm1.isValidLastName("Mali");
		assertEquals(true, result);
	}
}
