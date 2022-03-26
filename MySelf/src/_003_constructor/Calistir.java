package _003_constructor;

public class Calistir {

	public static void main(String[] args) {

		Motosiklet motosiklet = new Motosiklet(50);
		System.out.println(motosiklet.fiyat); // 50

		Motosiklet motosiklet2 = new Motosiklet(150);
		System.out.println(motosiklet2.fiyat); // 150

		Motosiklet motosiklet3 = new Motosiklet(150);
		System.out.println(motosiklet3.fiyat); // 0

	}

}
