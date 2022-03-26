package _008_ternaryOperator;

public class Calistir {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c;

		int result = (a > b) ? a + b : a * b;
		System.out.println("Sonuc : " + result);

		if (a < b) {
			c = a + b;
		} else {
			c = a * b;
		}

		c = (b < c) ? b : a < b ? b : a < c ? c : a;
		System.out.println(c);

//		if (b < c) {
//			c = b;
//		} else if (a < b) {
//			c = b;
//		} else if (a < c) {
//			c = c;
//		} else {
//			c = a;
//		}		

		System.out.println("Sonuc: " + c);

	}

}
