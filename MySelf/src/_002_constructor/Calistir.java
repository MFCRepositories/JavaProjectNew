package _002_constructor;

public class Calistir {

	public static void main(String[] args) {

		Motosiklet motosiklet = new Motosiklet(50);
		System.out.println(motosiklet.fiyat); // 50

		Motosiklet motosiklet2 = new Motosiklet(150);
		System.out.println(motosiklet2.fiyat); // 150

		Motosiklet motosiklet3 = new Motosiklet(200, "mavi"); // parametereli constructor aktif oldu
		System.out.println(motosiklet3.fiyat); // 0
		System.out.println(motosiklet3.renk); // 0
		Motosiklet motosiklet4 = new Motosiklet();

		System.out.println("Motosiklet4 :" + " " + motosiklet4.fiyat + " " + motosiklet4.renk);

	}

}
