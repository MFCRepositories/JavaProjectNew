package _010_systemClassNedir;

//import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) {

		/*
		 * java.lang klasoru içerisinde bulunan (System) gibi classlar harici tüm
		 * Classlar "import" edilmek zorundadýrlar
		 * 
		 * Örnek olarak Scanner classýnýn içinde bulundugu java.util ya da alternatif
		 * olarak bu þekilde gösterilmelidir.(java.util.Scanner)
		 */

		java.util.Scanner scn = new java.util.Scanner(System.in);
		int toplam = 0, adet = 0, sayi;
		do {
			System.out.println("Bir Sayi giriniz: ");
			sayi = scn.nextInt();
			adet++;
			toplam += sayi;

		} while (sayi != 0);
		System.out.println("Ortalama: " + toplam / (double) adet);
		scn.close();
		int k = 3;
		double z = 26; // double / sayi double sonuc verir
		System.out.println("Sonuc : " + z / k);

	}

}
