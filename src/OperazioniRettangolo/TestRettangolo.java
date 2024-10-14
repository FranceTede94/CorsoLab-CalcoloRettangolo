package OperazioniRettangolo;

public class TestRettangolo {
    public static void main(String[] args) {
    	
        // Creazione di un rettangolo in posizione (0, 0) con lunghezza 50 e altezza 30
        Rettangolo rettangolo = new Rettangolo(50,30);
        System.out.println(rettangolo);

        // Traslazione del rettangolo di 30 verso destra e 40 in basso
        rettangolo.MisureRettangolo(50, 80);
        System.out.println(rettangolo);
       
        
    }
}