package _022_inheritance;

public class Calistir {

	public static void main(String[] args) {

		// Arada bulunan B classýndaki method a eriþimi yok
		// Tipdeki (A) methodlara eriþim saðlayabiliyor
		A ust = new E();
		ust.naber();

		/*
		 * E diðer olusan tüm objelerdeki metodlara eriþim saðlayabiliyor (A-B-E)
		 * 
		 */
		E yeni = new E();
		yeni.naber();
		yeni.eNaber();
		yeni.bNaber();

	}

}
