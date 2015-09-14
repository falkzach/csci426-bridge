abstract public class User
{
    protected Authenticator authenticator;

    protected User(Authenticator authenticator)
    {
        this.authenticator = authenticator;
    }

    public abstract boolean logIn();
    public abstract boolean logOut();
    public abstract boolean doStuff();
}