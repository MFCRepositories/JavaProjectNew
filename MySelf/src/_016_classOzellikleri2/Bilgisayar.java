package _016_classOzellikleri2;

public class Bilgisayar {

	private String marka;
	private int ram;

	public Bilgisayar(String marka, int ram) {
		this.marka = marka;
		this.ram = ram;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getRam() {
		return this.ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Bilgisayar [marka=" + this.marka + ", ram=" + this.ram + "]";
	}

}
