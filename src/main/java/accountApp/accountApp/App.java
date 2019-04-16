package accountApp.accountApp;

import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        
        Account a = new Account("Will", "Russell", 1);
        
        Service.addAccount(a);
        Service.getAccount(1);
        String accountString = Service.getJSONFromObject(a);
        System.out.println(accountString);
        Account c = Service.getObjectFromJSON(accountString, Account.class);
        System.out.println(c);
        
        String mapString = Service.getJSONFromObject(Service.accountMap);
        System.out.println(mapString);
        
        Map<Integer, Account> map = Service.getObjectFromJSON(mapString, Map.class);
        System.out.println(map);
        
        
        
    }
}
