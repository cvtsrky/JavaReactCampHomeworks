package homework1;

public class Student extends User {

	private int learnedCourseId;
	private String learnedCourseName;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String emailAdress, 
			String password, int learnedCourseId, String learnedCourseName) {
		
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAdress(emailAdress);
		this.setPassword(password);
		this.learnedCourseId = learnedCourseId;
		this.learnedCourseName = learnedCourseName;
	}

	public int getLearnedCourseId() {
		return learnedCourseId;
	}

	public void setLearnedCourseId(int learnedCourseId) {
		this.learnedCourseId = learnedCourseId;
	}

	public String getLearnedCourseName() {
		return learnedCourseName;
	}

	public void setLearnedCourseName(String learnedCourseName) {
		this.learnedCourseName = learnedCourseName;
	}

}
