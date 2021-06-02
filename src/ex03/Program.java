package ex03;

public class Program {

	public static void main(String[] args) {
		int max_usrs = (int)(Math.random() * 10 + 15);
		System.out.println("Generating " + max_usrs + " users.");
		TransactionsLinkedList transactions = new TransactionsLinkedList();
		User sender = new User("Pupa", 123);
		User reciever = new User("Lupa", 0);

		for (int i = 0; i < max_usrs; i++) {
			Transaction tmp;
			if (i % 2 == 0) {
				tmp = new Transaction(sender, reciever, 123);
			}	else {
				tmp = new Transaction(reciever, sender, 123);
			}
			transactions.addTransaction(tmp);
		}

		for (Transaction t : transactions.toArray())	{
			System.out.println(t.toString());
		}
	}
}
