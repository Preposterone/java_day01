package ex00;
/*
Transaction class describes a money transfer between two users.
Here, a unique identifier should also be defined.
Since the number of such transactions can be very large, let us define the identifier as an UUID string.
Thus, the following set of states (fields) is typical for Transaction class:

Identifier
Recipient (User type)
Sender (User type)
Transfer category (debits, credits)
Transfer amount
*/


import java.util.UUID;

public class Transaction {
	UUID Identifier;
	User Recipient;
	User Sender;
	//enum here
	Integer amount;
}
