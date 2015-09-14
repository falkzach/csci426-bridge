public class ADLDAPAuthenticator extends Authenticator
{
    private ADLDAP ADLDAP;
    private String fqdn;

    public ADLDAPAuthenticator()
    {
        this.ADLDAP = new ADLDAP();
        this.fqdn = "domain.example.com";
    }

    public Boolean logIn(String username, String password)
    {
        return this.ADLDAP.authenticate(this.fqdn, username, password);
    }

    public Boolean logOut()
    {
        return this.ADLDAP.logOut();
    }
}