public class ClassEx {
	int i = 10;

	public static void main(String[] args) {

		ClassEx j = new ClassEx();

		System.out.println("Class=" + j.i);
		j.i = 15;
		ClassEx k = new ClassEx();
		System.out.println("Class=" + k.i);

	}

}
