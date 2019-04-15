package accountApp.accountApp;


public class App 
{
    public static void main( String[] args )
    {
        
        Account a = new Account("Will", "Russell", 1);
        
        Service.addAccount(a);
        Service.getAccount(1);
        
        
    }
}
