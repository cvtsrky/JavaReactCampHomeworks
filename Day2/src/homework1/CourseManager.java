package homework1;

public class CourseManager {
	public void RegisterCourse(Course course)
	{
		System.out.println("Registered Course : " + course.courseName);
	}
	
	public void CourseDetail(Course course)
	{
		System.out.println(course.courseName + " Course Details : Id - " + course.id +", Instructor - "+ 
								course.instructorName +", Price - "+ course.price);
	}
}
