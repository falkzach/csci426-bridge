public abstract class Authenticator
{
    public abstract Boolean logIn(String username, String password);
    public abstract Boolean logOut();
}