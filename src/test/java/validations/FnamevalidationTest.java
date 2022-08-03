package validations;



import junit.framework.TestCase;

public class FnamevalidationTest extends TestCase {
	public void test()
	{
		ValidationMethods vm1=new ValidationMethods();
		boolean result=vm1.isValidFirstName("Rutuja");
		assertEquals(true, result);
	}
	
	
}
