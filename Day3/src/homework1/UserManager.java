package homework1;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " id'ye sahip kullan�c� g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� silindi!");
	}
}
