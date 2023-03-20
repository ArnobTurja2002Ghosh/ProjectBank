
/**
 * Write a description of class Cheque here.
 *
 * @author Arnob
 * @version (a version number or a date)
 */
public class Cheque extends Account
{
    // instance variables - replace the example below with your own
    private int x;
    //minimBalance and overLimitCharge (set to 1000 and 5, respectively)
    private static final int minimBalance = 1000;
    private static final int overLimitCharge = 5;
    private double overLimitFee = 0;
    /**
     * Constructor for objects of class Cheque
     */
    public Cheque()
    {
        super();
        // initialise instance variables
        x = 0;
    }
    public Cheque(String user)
    {
        super(user);
    }
    
    public void withdraw(float m)
    {
        if(balance-m >= 0){
        balance -= m;
        if((balance) < minimBalance){
        overLimitFee += overLimitCharge;
        System.out.println("The over-limit service fee for " + this.user + " is "+overLimitFee);
        }
        }
        else{
            System.out.println(this.user + " was not allowed to withdraw " + m);
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
