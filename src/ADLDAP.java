public class ADLDAP
{
    public ADLDAP()
    {

    }

    public boolean authenticate(String fqdn, String username, String password)
    {
        System.out.println("The user " + username + " has authenticated via ADLDAP");
        return true;
    }

    public boolean logOut()
    {
        System.out.println("The user has logged out via ADLDAP");
        return true;
    }
}