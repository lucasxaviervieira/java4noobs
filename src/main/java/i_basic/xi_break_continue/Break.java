package i_basic.xi_break_continue;

public class Break {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {

			System.out.println(i);

			if (i == 5) {
				break;
			}
		}
	}
}