package _013_modifiersClass2;

public class Calistir {

	public static void main(String[] args) {

		Canli canli = new Hayvan(); // Hayvan instance ama referans� Canli tipinde
		System.out.println(canli.getYas());
		Hayvan hayvan = new Hayvan();
		// Her zaman objenin referans� �al�s��r
		System.out.println(hayvan.getYas());

	}

}
