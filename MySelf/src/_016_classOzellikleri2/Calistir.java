package _016_classOzellikleri2;

public class Calistir {

	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar("Casper", 15);
		Bilgisayar bilgisayar1 = new Bilgisayar("Asus", 25);
		Bilgisayar bilgisayar2 = new Bilgisayar("Toshiba", 35);
		Bilgisayar bilgisayar3 = new Bilgisayar("Monster", 45);

//		Yerine
//		System.out.println("Model : " + bilgisayar.getMarka() + " Ram miktari : " + bilgisayar.getRam());
//		System.out.println("Model : " + bilgisayar1.getMarka() + " Ram miktari : " + bilgisayar1.getRam());
//		System.out.println("Model : " + bilgisayar2.getMarka() + " Ram miktari : " + bilgisayar2.getRam());
//		System.out.println("Model : " + bilgisayar3.getMarka() + " Ram miktari : " + bilgisayar3.getRam());

//		tostring() methodunu override edilmi� halini kulland�k

		System.out.println(bilgisayar);
		System.out.println(bilgisayar1);
		System.out.println(bilgisayar2);
		System.out.println(bilgisayar3);

	}

}
