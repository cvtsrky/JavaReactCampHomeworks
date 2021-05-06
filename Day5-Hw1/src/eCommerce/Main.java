package eCommerce;


import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.LoginGoogleManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao());
		
		System.out.println("Basarili kayit");
		User user1 = new User(1,"Engin","Demiroð","cvts@gmail.com","123456");
		userService.register(user1);
		System.out.println("Basarisiz kayit");
		User user2 = new User(2,"Cevat","Sarýkaya","cvtgmail.com","123456");
		userService.register(user2);
		
		userService.registerWithService(new LoginGoogleManagerAdapter());
		
	}

}
