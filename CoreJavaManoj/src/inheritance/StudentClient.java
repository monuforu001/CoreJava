package inheritance;

public class StudentClient {

	public static void main(String[] args) {
		ChemistryStudent chs = new ChemistryStudent("Manoj", 10, 70);
		chs.detail();
		System.out.println("result" + chs.result());

		MathStudent mas = new MathStudent("Mark", 20, 30);
		mas.detail();
		System.out.println("result" + mas.result());

		ScienceStudent scs = new ScienceStudent("John", 30, 65);
		scs.detail();
		System.out.println("result" + scs.result());
	}

}
