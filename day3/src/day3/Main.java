package day3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setCourses("Java");

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Ruveyda");
		student.setLastName("Yilmaz");
		student.setTakenCourses("Java");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

	}

}
