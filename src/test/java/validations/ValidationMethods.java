package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationMethods 
{
	public boolean isValidFirstName(String finame) {
		String fname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern fnme = Pattern.compile(fname);
        if (finame == null) { 
            return false; 
        } 
        Matcher m1 = fnme.matcher(finame);
        return m1.matches();
	}
	
	public boolean isValidLastName(String liname) {
		String lname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern lnme = Pattern.compile(lname); 
        if (liname == null) { 
            return false; 
        } 
        Matcher m2 = lnme.matcher(liname);
        return m2.matches(); 
	}
	
	public boolean isValidMail(String mail) {
		String email = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
        Pattern emil = Pattern.compile(email); 
        if (mail == null) { 
            return false; 
        } 
        Matcher m3 = emil.matcher(mail);
        return m3.matches();
	}
	
	public boolean isValidNo(String no) {
		String mobile ="^[0-9]{2}\\s{1}[0-9]{10}$"; 
        Pattern mob = Pattern.compile(mobile); 
        if (no == null) { 
            return false; 
        } 
  
        Matcher m4 = mob.matcher(no);
        return m4.matches(); 
	}
	public boolean isValidPwd(String pass) {
		//rule 1
		//String password = "( *?[0-9a-zA-Z] *?){8,}";
		//rule 2
		//String password = "^(?=.*[A-Z])[0-9a-zA-Z]{8,}$";
		//rule 3
		//String password = "^(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z]{8,}$";
		//rule 4
		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[#?!@$%^&*-])[0-9a-zA-Z#?!@$%^&*-]{8,}$";
        Pattern pwd = Pattern.compile(password); 
        if (pass ==null) { 
            return false; 
        } 
        Matcher m5 = pwd.matcher(pass);
        return m5.matches();
	}

}
