package _023_interface;

import _022_inheritance.G;

public class Calistir {

	public static void main(String[] args) {

		// Arada bulunan B class�ndaki method a eri�imi yok
		// Tipdeki (A) methodlara eri�im sa�layabiliyor
		A ust = new E();
		ust.naber();
		/*
		 * normalde sadece A clas�nda tan�ml� olan methodlara eri�im sa�l�yoruz G
		 * s�n�f�nda olmas� gereken y() methodunu da ortak bir noktada toplayabiliyoruz
		 * 
		 * 
		 */
		ust.y();
		G ulas = new G();

		/*
		 * E di�er olusan t�m objelerdeki metodlara eri�im sa�layabiliyor (A-B-E)
		 * 
		 */
		E yeni = new E();
		yeni.naber();
		yeni.eNaber();
		yeni.bNaber();

		// interface : alakas�z 2 s�n�f�n ortam �zelliklerinin ayn� noktada toplama tipi
		yeni.y();

	}

}
