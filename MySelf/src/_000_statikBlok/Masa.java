package _000_statikBlok;

public class Masa {

	static {
		System.out.println("Masa s�n�f� bu blokta y�kleniyor...");
		System.out.println("Ben masa clas�n�n static bloguyum.Benim bir �rne�ime s�ma ihtiyac yoktur");

	}
	static int fiyat;

	static int getFiyat() {
		System.out.println("Fiyat");
		return fiyat;
	}

}
