package accountApp.accountApp;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private static Map<Integer, Account> accountMap = new HashMap<Integer, Account>(); 
	
	public static void addAccount (Account a) {
		accountMap.put(a.getAccountNumber(), a);
	}
	
	public static void getAccount(int key) {
		Account a = accountMap.get(key);
		String fn = a.getFirstName();
		String ln = a.getLastName();
		int accNo = a.getAccountNumber();
		System.out.println("First Name: " + fn + ", Last Name: " + ln + ", Account Number: " + accNo);
	}
	
	

}
