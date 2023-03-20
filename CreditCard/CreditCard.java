import java.util.*;
/**
 * Write a description of class CreditCard here.
 *
 * @author Arnob
 * @version 22/01/23
 */
public class CreditCard
{
    // instance variables - replace the example below with your own
    // The price of a ticket from this machine.
    private float cl;
    // The amount of money entered by a customer so far.
    private float balance;
    // The total amount of money collected by this machine.
    private float ca;
    private String cn; // Customer Name
    private String an; // Account Number
    private List<Transaction> transactions;

    /**
     * Constructor for objects of class CreditCard
     */
    public CreditCard(float cl, String cn, String an)
    {
        // initialise instance variables
        balance = 0;
        this.cl = cl;
        this.cn = cn;
        this.an = an;
        transactions = new ArrayList<>();
    }
    
    public void purchase(float amount, String source)
    {
        if(amount > cl) {
            System.out.println("Transaction failed. Please contact the bank to increase your credit limit.");

        }
        else if(balance + amount > cl){
            System.out.println("Transaction failed. Please pay back $" + balance  + " to continue the transaction.");
        }
        else if(balance+amount <= cl) {
            balance = balance + amount;
            ca = cl-balance;
            transactions.add(new Transaction(source, amount, "Purchase"));
        }
    }
    public void changecl(float cl)
    {
        this.cl = cl;
    }
    public void changecn(String cl)
    {
        this.cn = cl;
    }
    public void changean(String cl)
    {
        this.an = cl;
    }
    public void payback(float amount)
    {
        if(amount < balance){
            System.out.println("You owe $" + balance + ". Please enter correct amount.");
        }
        else{
            balance = balance - amount;
            ca = cl - balance;
            transactions.add(new Transaction(cn, amount, "Payback"));
        }
    }
    
    public void printHistory()
    {
        System.out.println(transactions);
        System.out.println("Source \t Amount \t Purchase Type \t Date");
        for(Transaction animal: transactions)
        {
            
            System.out.println(animal.getSource() +"\t"+ animal.getAmount() +"\t"+ animal.getPT() +"\t"+ animal.getDate());
        }
    }
    public void printHistory(String source_or_amount)
    {
            if(source_or_amount == "source")
            {
                List <String> source_or_amount_list = new ArrayList<>();
                for(Transaction animal : transactions) 
                {
                source_or_amount_list.add(animal.getSource());
                }
                System.out.println(source_or_amount_list);
            }
            else if(source_or_amount == "amount")
            {
                List <Float> source_or_amount_list = new ArrayList<>();
                for(Transaction animal : transactions) 
                    {
                    source_or_amount_list.add(animal.getAmount());
                    }
                System.out.println(source_or_amount_list);
            }
    }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */


