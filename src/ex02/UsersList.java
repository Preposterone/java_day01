package ex02;

public interface UsersList  {

	Integer DEFAULT_SIZE = 10;

	Integer DEFAULT_SCALE = 2;

	void addUser(User user);

	User getUserById(Integer id) throws UserNotFoundException;

	User getUserByIndex(Integer index) throws UserNotFoundException;

	Integer getUserNum();
}
