package ex02;

public class UserNotFoundException extends Exception {

	@Override
	public String toString() {
		return ("User not found!");
	}
}
