package _000_statikBlok;

public class Masa {

	static {
		System.out.println("Masa sýnýfý bu blokta yükleniyor...");
		System.out.println("Ben masa clasýnýn static bloguyum.Benim bir örneðime sýma ihtiyac yoktur");

	}
	static int fiyat;

	static int getFiyat() {
		System.out.println("Fiyat");
		return fiyat;
	}

}
