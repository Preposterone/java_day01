package ex02;

public class UsersArrayList implements UsersList	{

	private Integer capacity = DEFAULT_SIZE;
	private Integer size = 0;

	private User [] users = new User[DEFAULT_SIZE];

	@Override
	public void addUser(User user) throws NullPointerException {
		if (size == capacity - 1)	{
			users = reallocUsers(users);
		}
		if (user != null)	{
			users[size] = user;
			size++;
		} else {
			throw new NullPointerException();
		}
	}

	private User [] reallocUsers(User [] users)	{
		this.capacity *= DEFAULT_SCALE;
		User [] ret = new User[this.capacity];

		for (int i = 0; i <= size; i++) {
			ret[i] = users[i];
		}
		return (ret);
	}

	@Override
	public User getUserById(Integer id) throws UserNotFoundException {
		for (int i = 0; i < size; i++) {
			if (users[i].getIdentifier().equals(id))
				return (users[i]);
		}
		throw new UserNotFoundException();
	}

	@Override
	public User getUserByIndex(Integer index) throws UserNotFoundException, ArrayIndexOutOfBoundsException {
		if (index < 0)	{
			throw new ArrayIndexOutOfBoundsException();
		}
		else if (users[index] == null)	{
			throw new UserNotFoundException();
		}
		return (users[index]);
	}

	@Override
	public Integer getUserNum() {
		return (size);
	}
}
