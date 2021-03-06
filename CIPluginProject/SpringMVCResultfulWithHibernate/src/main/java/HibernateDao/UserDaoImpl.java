package HibernateDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.User;
import dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public int save(User u) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(u);
		return 0;
	}

	@Override
	public List<User> findAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
	}

}
