package validations;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class DemoTest {
	private final String inputString;
	private final boolean Expected;
	private ValidationMethods vm1;
	
	@Before
	public void initialize()
	{
		vm1=new ValidationMethods();
	}

	public DemoTest(String inputString, boolean expected) {
		super();
		this.inputString = inputString;
		this.Expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection Emailvalidation()
	{
		return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},
			{"abc",false},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"bc123@.com.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc.2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false},
			{"abc+100@gmail.com",true}
			});
	}
	@Test
	public void test()
	{
		
		System.out.println("parameterised input is :"+inputString);
		assertEquals(Expected,vm1.isValidMail(inputString));
	}
	

}
