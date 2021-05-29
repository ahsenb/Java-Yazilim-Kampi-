package homeWork2;

public class Main {
	
	public static void main(String[] args) {
			
			Student student = new Student();
			student.setId(1);
			student.setName("Ahsen");
			student.setSurname("B");
			student.setTakenCourse("Java");
			
			Instructor instructor = new Instructor();
			instructor.setId(2);
			instructor.setName("Engin");
			instructor.setSurname("Demirog");
			instructor.setGivenCourse("Java");
			
			UserManager userManager = new UserManager();		
			userManager.addUser(student);
			userManager.addUser(instructor);
			
			StudentManager studentManager = new StudentManager();
			studentManager.getCourse(student);
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.getGivenCourse(instructor);
		}


}
