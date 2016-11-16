package dao;

import java.util.List;

import Model.User;

public interface UserDao {

	public int save(User u);
    public List<User> findAll();
}
