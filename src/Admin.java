public class Admin extends User
{
    private String domain, username, password;

    public Admin(Authenticator authenticator, String username, String password)
    {
        super(authenticator);
        this.username = username;
        this.password = password;
    }

    public boolean logIn()
    {
        return this.authenticator.logIn(username, password);
    }

    public boolean logOut()
    {
        return this.authenticator.logOut();
    }

    public boolean doStuff()
    {
        System.out.println("Doing Admin Stuff!!!!");
        return true;
    }
}