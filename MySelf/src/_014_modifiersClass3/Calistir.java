package _014_modifiersClass3;

public class Calistir {

	public static void main(String[] args) {

		Canli canli = new Hayvan(); // Hayvan instance ama referansı Canli tipinde
		System.out.println(canli.getYas());
		Hayvan hayvan = new Hayvan();
		// Her zaman objenin referansı çalısıır
		System.out.println(hayvan.getYas());
		Canli canl2i = new Canli();
		canl2i.setYas(13);
		System.out.println(canl2i.getYas());

	}

}
