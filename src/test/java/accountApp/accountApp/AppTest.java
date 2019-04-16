package accountApp.accountApp;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;



public class AppTest 
{
    
	@BeforeClass
	public static void setup () {
		Account a = new Account("Will", "Russell", 1);
        Account b = new Account("Will", "Yarde", 2);
        Account c = new Account("James", "Russell", 3);
        Account d = new Account("Bill", "Andrews", 4);
        Service.addAccount(a);
        Service.addAccount(b);
        Service.addAccount(c);
        Service.addAccount(d);  
	}
	
	@Test 
	public static void countByFirstName() {
		Service.countByFirstName();
	}
	
}
