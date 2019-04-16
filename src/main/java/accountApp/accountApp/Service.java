package accountApp.accountApp;

import java.util.HashMap;
import com.google.gson.Gson;
import java.util.Map;


public class Service {
	
	public static Map<Integer, Account> accountMap = new HashMap<Integer, Account>(); 
	private static Gson gson;
	
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

	public static String getJSONFromObject(Object obj) {
		gson = new Gson();
		return gson.toJson(obj);
	}

	public static <T> T getObjectFromJSON(String jsonString, Class<T> clazz) {
		gson = new Gson();
		return gson.fromJson(jsonString, clazz);
	}
	

}
