package _013_modifiersClass2;

public class Calistir {

	public static void main(String[] args) {

		Canli canli = new Hayvan(); // Hayvan instance ama referansı Canli tipinde
		System.out.println(canli.getYas());
		Hayvan hayvan = new Hayvan();
		// Her zaman objenin referansı çalısıır
		System.out.println(hayvan.getYas());

	}

}
