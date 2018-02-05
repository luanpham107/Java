
import java.io.IOException;

public class ExceptionMe {

	private int divide(int a, int b) throws Exception {
		System.out.println("Excute");
		int c = a / b;
		System.out.println(c + "Done");
		return c;
	}

	private void Exception1() throws Exception {
		throw new Exception("Day la Exception 1");
	}

	private void Exception2() throws Exception {
		this.Exception1();
	}

	public static void main(String[] args) {
		ExceptionMe ExceptionMe = new ExceptionMe();
		ExceptionMe.divide(1, 0);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}