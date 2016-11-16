package Service;

import java.util.List;

import Model.User;

public interface UserService {

	 public void saveUsers(List<User> us);
	 public List<User> getAllUsers();
}
