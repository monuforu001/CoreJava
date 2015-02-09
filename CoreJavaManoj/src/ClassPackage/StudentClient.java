package ClassPackage;

/**
 * 
 * @author mkarnatak
 *
 */
public class StudentClient {

	public static void main(String[] args) {

		Student mark = new Student(); // instance
		mark.setId(1);
		mark.setAge(20);
		mark.setName("Mark");
		System.out.println(mark.getId() + " " + mark.getAge() + mark.getName());
	}

}