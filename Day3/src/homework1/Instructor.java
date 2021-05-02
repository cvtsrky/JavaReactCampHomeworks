package homework1;

public class Instructor extends User{
		
		private int teachedCourseId;
		private String teachedCourseName;
		
		public Instructor(){
			
		}
		
		public Instructor(int id, String firstName, String lastName, 
				String emailAdress, String password, int teachedCourseId, String teachedCourseName) {
			super(id, firstName, lastName, emailAdress, password);
			this.teachedCourseId = teachedCourseId;
			this.teachedCourseName = teachedCourseName;
		}

		public int getTeachedCourseId() {
			return teachedCourseId;
		}

		public void setTeachedCourseId(int teachedCourseId) {
			this.teachedCourseId = teachedCourseId;
		}

		public String getTeachedCourseName() {
			return teachedCourseName;
		}

		public void setTeachedCourseName(String teachedCourseName) {
			this.teachedCourseName = teachedCourseName;
		}
}
