package accountApp.accountApp;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.AfterClass;



public class AppTest 
{
	Service service = new Service();
	
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
	public void countByFirstName() {
		assertEquals("expected value = The total number of Will's is 2", "The total number of Will's is 2", service.countByFirstName("Will"));
	}
	
	@AfterClass
	public static void tearDown() {
		Service.accountMap.clear();
	}
	
}
