package ex02;

import ex01.UserIdsGenerator;

public class User {

	private final Integer identifier;

	private String name;

	private Integer balance;

	public User(String name, Integer balance) {
		this.identifier = UserIdsGenerator.getInstance().generateId();
		setName(name);
		setBalance(balance);
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	@Override
	public String toString() {
		return "User{" +
				"identifier=" + identifier +
				", name='" + name + '\'' +
				", balance=" + balance +
				'}';
	}
}
