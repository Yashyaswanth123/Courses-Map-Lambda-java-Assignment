package Student;

public class Main {
	public static void main(String[] args) {
		CourseDetails course = new CourseDetails();
		try {
		course.showCourses("java");
		}
		catch(Exception e){
			System.out.println(" Details not found");
			e.printStackTrace();
		}
	}
 
}
