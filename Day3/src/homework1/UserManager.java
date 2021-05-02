package homework1;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " id'ye sahip kullanýcý güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý silindi!");
	}
}
