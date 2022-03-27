package _023_interface;

import _022_inheritance.G;

public class Calistir {

	public static void main(String[] args) {

		// Arada bulunan B classýndaki method a eriþimi yok
		// Tipdeki (A) methodlara eriþim saðlayabiliyor
		A ust = new E();
		ust.naber();
		/*
		 * normalde sadece A clasýnda tanýmlý olan methodlara eriþim saðlýyoruz G
		 * sýnýfýnda olmasý gereken y() methodunu da ortak bir noktada toplayabiliyoruz
		 * 
		 * 
		 */
		ust.y();
		G ulas = new G();

		/*
		 * E diðer olusan tüm objelerdeki metodlara eriþim saðlayabiliyor (A-B-E)
		 * 
		 */
		E yeni = new E();
		yeni.naber();
		yeni.eNaber();
		yeni.bNaber();

		// interface : alakasýz 2 sýnýfýn ortam özelliklerinin ayný noktada toplama tipi
		yeni.y();

	}

}
