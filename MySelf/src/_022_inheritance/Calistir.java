package _022_inheritance;

public class Calistir {

	public static void main(String[] args) {

		// Arada bulunan B class�ndaki method a eri�imi yok
		// Tipdeki (A) methodlara eri�im sa�layabiliyor
		A ust = new E();
		ust.naber();

		/*
		 * E di�er olusan t�m objelerdeki metodlara eri�im sa�layabiliyor (A-B-E)
		 * 
		 */
		E yeni = new E();
		yeni.naber();
		yeni.eNaber();
		yeni.bNaber();

	}

}
