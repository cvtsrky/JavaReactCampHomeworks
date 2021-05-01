package homework1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#","Engin Demiroð", 20);
		Course course2 = new Course(2, "Java","Engin Demiroð", 15);
		Course course3 = new Course(3, "Programlamaya Giriþ","Engin Demiroð", 10);
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Course Name : " + course.courseName);
		}
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Algoritma");
		
		Category[] categories = {category1,category2};
		for (Category category : categories) {
			System.out.println("Category Name : " + category.categoryName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.RegisterCourse(course1);
		courseManager.RegisterCourse(course2);
		courseManager.RegisterCourse(course3);
		
		courseManager.CourseDetail(course1);
		courseManager.CourseDetail(course2);
		courseManager.CourseDetail(course3);

	}

}
