
/**
 * Write a description of class Account here.
 *
 * @author Arnob
 * @version (a version number or a date)
 */
import java.util.Random;
import java.security.SecureRandom;
public class Account
{
    // instance variables - replace the example below with your own
    private int x;
    public String user;
    public float balance;
    private int accountnumber;
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        accountnumber = Math.abs(new SecureRandom().nextInt());
        this.balance = 0;
    }
    public Account(String user)
    {
        // initialise instance variables
        accountnumber = Math.abs(new SecureRandom().nextInt());
        this.user = user;
        this.balance = 0;
    }
    void display()
    {
        System.out.println("user name: " + this.user + "\n account number: " + accountnumber + "\n balance: " + balance);
    }
    void deposit(float m)
    {
        this.balance += m;
    }
    void withdraw(float m)
    {
        this.balance -= m;
    }
    float getBalance()
    {
        return this.balance;
    }
    String getUserName()
    {
        return this.user;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
