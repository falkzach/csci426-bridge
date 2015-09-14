import java.util.Scanner;

public class Client
{
    Scanner in;
    Authenticator authenticator;
    User user;
    String username;
    String password;

    public Client()
    {
        this.in = new Scanner(System.in);
    }

    public void logInPortal()
    {
        while(true)
        {
            System.out.println("1.)I am a student\n2.) I am Faculty\n3.)Exit");
            String response = this.in.nextLine();

            switch (response)
            {
                case "1":
                    this.getAuthenticator();
                    this.getCredentials();
                    this.user = new Student(this.authenticator, this.username, this.password);

                    break;
                case "2":
                    this.getAuthenticator();
                    this.getCredentials();
                    this.user = new Admin(this.authenticator, this.username, this.password);
                    break;
                case"3":
                    System.exit(0);
                default:
                    System.out.println("invalid option");
                    continue;
            }

            if(this.user.logIn())
            {
                while(this.menu())
                {
                    System.out.println("");
                }
            }
        }
    }

    public void getAuthenticator()
    {
        System.out.println("1.)Use single sign on NetID\n2.)Use Active Directory");
        String response = this.in.nextLine();
        switch (response)
        {
            case "1":
                this.authenticator =  new SimpleSAMLAuthenticator();
                break;
            case "2":
                this.authenticator =  new ADLDAPAuthenticator();
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }

    public void getCredentials()
    {
        System.out.print("username:");
        this.username = this.in.nextLine();
        System.out.print("password:");
        this.password = this.in.nextLine();
    }

    public boolean menu()
    {
        System.out.println("1.)Do Stuff\n2.)Log Out");
        String response = this.in.nextLine();
        switch (response)
        {
            case "1":
                return this.user.doStuff();
            case "2":
                return ! this.user.logOut();
            default:
                System.out.println("invalid option");
                return true;
        }
    }
}