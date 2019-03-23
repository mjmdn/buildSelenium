package homeWorks;

public class Capture_ArithmaticException {

	public static void main(String[] args) {
		try {
		    int i = 50/ 0;
		} catch (ArithmeticException e) {
		    System.err.println("Got Arithmetic Exception");
		}
	}

}
