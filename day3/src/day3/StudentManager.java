package day3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("öğrenci eklendi: " + user.getId());
	}
}
