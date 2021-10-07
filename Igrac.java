package d13_09_2021;

public class Igrac extends Osoba {

	private int brojDresa;
	private String pozicijaIgraca;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(String imeIPrezime, String JMBG, int godinaRodjenja,
			int brojDresa, String pozicijaIgraca, boolean kapiten) {
		super(imeIPrezime, JMBG, godinaRodjenja);
		this.brojDresa = brojDresa;
		this.pozicijaIgraca = pozicijaIgraca;
		this.kapiten = kapiten;
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}

	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}

	public boolean getKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(this.getBrojDresa() + ", " + this.getPozicijaIgraca()
				+ ", " + this.getKapiten());
	}

}
