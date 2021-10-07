package d13_09_2021;

public class Osoba {
	protected String imeIPrezime;
	protected String JMBG;
	protected int godinaRodjenja;

	public Osoba() {
		super();
	}

	public Osoba(String imeIPrezime, String JMBG, int godinaRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.JMBG = JMBG;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void stampaj() {
		System.out.println(this.getImeIPrezime() + ", " + this.getJMBG() + ", "
				+ this.getGodinaRodjenja());
	}

}
