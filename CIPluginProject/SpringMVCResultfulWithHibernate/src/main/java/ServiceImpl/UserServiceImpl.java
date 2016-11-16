package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.User;
import Service.UserService;
import dao.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
	
	@Override
	public void saveUsers(List<User> us) {
		for (User u : us) {
            userDao.save(u);
        }

	}

	@Override
	public List<User> getAllUsers() {
		 return userDao.findAll();
	}

}
