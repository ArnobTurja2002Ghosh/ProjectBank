
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Account
{
    // instance variables - replace the example below with your own
    private int x;
    private String user;
    public float balance;
    private int accountnumber;
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        accountnumber = new Random().nextInt();
        this.balance = 0;
    }
    public Account(String user)
    {
        // initialise instance variables
        accountnumber = new Random().nextInt();
        this.user = user;
        this.balance = 0;
    }
    private void display()
    {
        System.out.println("\n user name: " + this.user + "\n account number: " + accountnumber + "\n balance: " + balance);
    }
    private void deposit(float m)
    {
        this.balance += m;
    }
    private void withdraw(float m)
    {
        this.balance -= m;
    }
    private float getBalance()
    {
        return this.balance;
    }
    private String getUserName()
    {
        return this.user;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
