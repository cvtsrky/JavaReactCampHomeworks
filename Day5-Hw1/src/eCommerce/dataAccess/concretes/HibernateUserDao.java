package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Hibernate ile " + user.getFirtName() + " adli kullanici eklendi.");
		
	}
	
	@Override
	public void login(User user) {
		System.out.println("Hibernate ile " + user.getFirtName() + " adli kullanici giris yapti.");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
