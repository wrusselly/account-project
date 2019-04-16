package accountApp.accountApp;

import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        
        Account a = new Account("Will", "Russell", 1);
        
        Service.addAccount(a);
        Service.getAccount(1);
        String accountString = Service.getJSONForObject(a);
        System.out.println(accountString);
        Account c = Service.getObjectForJSON(accountString, Account.class);
        System.out.println(c);
        
        String mapString = Service.getJSONForObject(Service.accountMap);
        System.out.println(mapString);
        
        Map<Integer, Account> map = Service.getObjectForJSON(mapString, Map.class);
        System.out.println(map);
        
        
        
    }
}
