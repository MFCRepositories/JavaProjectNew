package _005_operators1;

public class Calistir {

	public static void main(String[] args) {

		int a = 1;
		a += 5; // a=a+5;
		a /= 2;// a=a/2;
		a = 10;
		a += a + 1; // a=a+a+1
		System.out.println("a nýn degeri: " + a);

		int k = 30, c;
		int b;
		c = k++;
		System.out.println("c : " + c);
		k = 30;
		b = ++k;
		System.out.println("b : " + k);
		System.out.println("k nýn degeri :" + k);
	}

}
