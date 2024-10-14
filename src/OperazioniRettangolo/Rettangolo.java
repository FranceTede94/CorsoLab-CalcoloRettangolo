package OperazioniRettangolo;

public class Rettangolo {

	private int altezza;
	private int lunghezza;
	

	public Rettangolo(int lunghezza, int altezza) {

		this.lunghezza = lunghezza;
		this.altezza = altezza;
		
	}

	
	public void MisureRettangolo(int lunghezza, int altezza) {
		this.lunghezza += lunghezza;
		this.altezza += altezza;
	}
	
	public String toString() {
        return "Il rettangolo ha una lunghezza di " + lunghezza + " cm" + " e un altezza " + altezza + " cm";
    }

}
