package _010_systemClassNedir;

//import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) {

		/*
		 * java.lang klasoru i�erisinde bulunan (System) gibi classlar harici t�m
		 * Classlar "import" edilmek zorundad�rlar
		 * 
		 * �rnek olarak Scanner class�n�n i�inde bulundugu java.util ya da alternatif
		 * olarak bu �ekilde g�sterilmelidir.(java.util.Scanner)
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
