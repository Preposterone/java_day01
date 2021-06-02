
public class Program {

	public static void main(String[] args) {
		User sender = new User("АНАТОЛИЙ", 9999);
		User recipient = new User("ГЕОРГИЙ", -9999);

		sender.setIdentifier(1);
		recipient.setIdentifier(22);

		System.out.println("================BEFORE TRANSACTION======================");
		System.out.printf("Sender id: '%d' name: '%s', balance: '%d';\n", sender.getIdentifier(), sender.getName(), sender.getBalance());
		System.out.printf("Recipient id: '%d' name: '%s', balance: '%d';\n", recipient.getIdentifier(), recipient.getName(), recipient.getBalance());

		Transaction transaction = new Transaction(sender, recipient, 9999);
		sender.setBalance(0);
		recipient.setBalance(9999);

		System.out.println("=================AFTER TRANSACTION======================");
		System.out.printf("Sender id: '%d' name: '%s', balance: '%d';\n", sender.getIdentifier(), sender.getName(), sender.getBalance());
		System.out.printf("Recipient id: '%d' name: '%s', balance: '%d';\n", recipient.getIdentifier(), recipient.getName(), recipient.getBalance());
	}
}
