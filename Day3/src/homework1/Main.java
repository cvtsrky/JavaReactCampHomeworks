package homework1;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Cevat","Sarıkaya", "css@gmail.com", "12345",1,"C#");
		Instructor instructor1 = new Instructor(2, "Engin", "Demiroğ", "engin@gmail.com", "123654", 1, "Java");
		
		User[] users = new User[] {student1,instructor1};
		UserManager userManager = new UserManager();
		
		for (User user : users) {
			userManager.add(user);
			userManager.update(user);
			userManager.delete(user);
		}
		
		StudentManager studentManager = new StudentManager();
		studentManager.getCourseList(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getCourseCount(instructor1);
	}

}
