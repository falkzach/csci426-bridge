public class SimpleSAML
{

    public SimpleSAML()
    {

    }

    public boolean logIn(String username, String password, String sp)
    {
        System.out.println("The user " + username + " has authenticated via SIMPLESAML");
        return true;
    }

    public boolean logOut()
    {
        System.out.println("The user has logged out via SIMPLESAML");
        return true;
    }
}