package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.core.LoginService;
import eCommerce.entities.concretes.User;

public interface UserService {
		void register(User user);		
		List<User> getAll();		
		void login(User user);
		void registerWithService(LoginService loginService);
}
