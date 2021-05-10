package day3;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("eğitmen eklendi: " + user.getId());
	}
}
