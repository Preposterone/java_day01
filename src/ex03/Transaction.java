package ex03;

import java.util.UUID;

public class Transaction {

	private UUID identifier;

	private User recipient;

	private User sender;

	private Integer amount;

	private enum Category {
		DEBIT,
		CREDIT
	}

	private Category category;

	private enum Status {
		FAIL,
		SUCCESS
	}

	private Status status;

	public Transaction(User sender, User recipient, Integer amount) {
		this.recipient = recipient;
		this.sender = sender;
		this.identifier = new UUID(45678, 123);

		if (amount < 0) {
			setCategory(Category.CREDIT);
		} else {
			setCategory(Category.DEBIT);
		}

		this.amount = amount;
		if (sender.getBalance() < 0 || sender.getBalance() < amount)	{
			setStatus(Status.FAIL);
		}	else	{
			sender.setBalance(sender.getBalance() - amount);
			recipient.setBalance(amount);
			setStatus(Status.SUCCESS);
		}
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public UUID getIdentifier() {
		return identifier;
	}

	public void setIdentifier(UUID identifier) {
		this.identifier = identifier;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"identifier=" + identifier +
				", recipient=" + recipient +
				", sender=" + sender +
				", amount=" + amount +
				", category=" + category +
				", status=" + status +
				'}';
	}
}
