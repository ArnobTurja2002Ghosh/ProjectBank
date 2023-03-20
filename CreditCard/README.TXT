

PROJECT TITLE: Credit Card
AUTHORS: Arnob

Assume that a bank maintains a credit card account for each customer. The credit card account offers convenience to users by allowing them to make purchases without having to carry cash, and by allowing them to pay the balance within a certain duration without incurring any fines.

The CreditCard class should store the following information for each customer:

Customer name (a String)
Account number (a String)
Balance (a float)
Credit limit (a float)
Credit available (a float)
Transaction history (a List of Transaction objects)

The CreditCard class should have the following member functions:

public void purchase(float amount, String source): Make a purchase transaction for the specified amount and with the transaction vendor indicated by the source parameter. The function should update the balance and credit available accordingly, and should add a new Transaction object to the transaction history.
public void payback(float amount): Pay back an amount to the account. The transaction vendor should be indicated as "Payback". The function should update the balance and credit available accordingly, and should add a new Transaction object to the transaction history with the vendor set to "Payback".
public void printHistory(): Print a string representation of the transaction history.

The Transaction class should have the following fields:

Source (the vendor for the transaction, a String)
Transaction date (a Date object)
Amount (a float)
Purchase type (either "Purchase" or "Payback", a String)
