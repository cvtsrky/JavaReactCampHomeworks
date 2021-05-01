package homework1;

public class Course {
	
	public Course(int id, String courseName,String instructorName, double price)
	{
		this.id = id;
		this.courseName=courseName;
		this.instructorName=instructorName;
		this.price=price;
	}
	
	int id;
	String courseName;
	String instructorName;
	double price;
}
