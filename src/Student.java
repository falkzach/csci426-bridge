public class Student extends User
{
    private String username, password;

    public Student(Authenticator authenticator, String username, String password)
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
        System.out.println("Doing student stuff!!!!");
        return true;
    }
}