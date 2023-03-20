import java.util.*;
/**
 * Write a description of class Transaction here.
 *
 * @author Arnob
 * @version 22/01/23
 */
public class Transaction
{
    // instance variables - replace the example below with your own
    private int x;
    private String source;
    private float amount;
    private String pt;
    private Date date;
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction(String source, float amount, String pt)
    {
        // initialise instance variables
        this.source = source;
        this.amount = amount;
        this.pt = pt;
        this.date = new Date();
    }
    public String getSource()
    {
        return this.source;
    }
    public float getAmount()
    {
        return this.amount;
    }
    public String getPT()
    {
        return this.pt;
    }
    public Date getDate()
    {
        return this.date;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
