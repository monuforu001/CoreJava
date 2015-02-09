package inheritance;

public class Student {
	String name;
	int rollNo;
	int marks;

	public Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public void detail() {
		System.out.println("details:" + name + " " + rollNo + " " + marks);
	}

	public String result() {
		if (marks > 60)
			return "Pass";
		else
			return "fail";

	}
}
