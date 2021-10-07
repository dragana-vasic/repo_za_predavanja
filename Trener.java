package d13_09_2021;

public class Trener extends Osoba {
	private double godIskustva;
	private String tipTrenera;

	public Trener(String imeIPrezime, String JMBG, int godinaRodjenja,
			double godIskustva, String tipTrenera) {
		super(imeIPrezime, JMBG, godinaRodjenja);
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
	}

	public double getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(double godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(this.getGodIskustva() + ", " + this.getTipTrenera());
	}

}
