package eCommerce.core;

import eCommerce.loginGoogleAccount.LoginGoogleManager;

public class LoginGoogleManagerAdapter implements LoginService{

	@Override
	public void loginToSystem(String message) {
		LoginGoogleManager manager = new LoginGoogleManager();
		manager.login(message);
		
	}
	
	@Override
	public void registerToSystem(String message) {
		LoginGoogleManager manager = new LoginGoogleManager();
		manager.register(message);
		
	}

}
