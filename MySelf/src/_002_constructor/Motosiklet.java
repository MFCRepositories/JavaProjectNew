package _002_constructor;

public class Motosiklet {

	int fiyat; // Alt+Shift+S Generate Constructor with using fields
	String renk;

	public Motosiklet(int fiyat, String renk) {

		this.fiyat = fiyat;
		this.renk = renk;
	}

	Motosiklet(String renk) {
		this(100); // ilk kodda diðer int parametreli constructor caðrýlabiliyor
		this.renk = renk;
//		this.fiyat = 100;//Yanlýþ kullaným
	}

	// Paratmetre Constructor
	Motosiklet(int fiyat) {
		this.fiyat = fiyat;
	}

	// Default Constructor
	Motosiklet() {
		this("Mavi");
	}

}
