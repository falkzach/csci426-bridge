public class SimpleSAMLAuthenticator extends Authenticator
{
    private SimpleSAML SimpleSAML;
    private String sp;

    public SimpleSAMLAuthenticator()
    {
        this.SimpleSAML = new SimpleSAML();
        this.sp = "saml.example.com";
    }

    public Boolean logIn(String username, String password)
    {
        return this.SimpleSAML.logIn(username, password, this.sp);
    }

    public Boolean logOut()
    {
        return this.SimpleSAML.logOut();
    }
}