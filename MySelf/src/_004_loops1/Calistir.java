package _004_loops1;

public class Calistir {

	public static void main(String[] args) {

		int a = 0;
		String kelime = "Abo";
		while (a < 10) {
			a++;
			kelime += "o";
			System.out.println(a + " " + kelime);

		}
		a = 0;
		System.out.println("--------");
		do {
			a++;
			System.out.println(a);

		} while (a < 10);

		// birden fazla deðiþken tanýmlamasý yapýlabilir
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i:" + i);
			System.out.println("j:" + j);
		}
		System.out.println("---------");

	}

}
