import java.time.LocalDateTime;
import java.time.Period;

public class Garage {
	
	Vettura[] posteggi;
	
	public Garage(int nposti) {
		posteggi = new Vettura[nposti];
		for(int i=0;i<nposti;i++) {
			posteggi[i]=null;
		}
	}
	
	public int parcheggia(Vettura v) {
		int posto=-1;
		for (int i=0; i<posteggi.length; i++) {
			if (posteggi[i]==null) {
				posteggi[i]=v;
				posto=i;
				break;
			}
		}
		return posto;
	}
		
	// 
	// Restutuisce la posizione nel parcheggio della vettura targata "targa"
	// se non la trova restituisce -1
	//
	public int cercaVettura(String targa) {
		for (int i=0; i<posteggi.length; i++) {
			if (posteggi[i]!=null && posteggi[i].targa.equalsIgnoreCase(targa)) {
				return i;
			}
		}
		return -1;
	}
	
	public int contaVetture() {
		int conteggio=0;
		for (int i=0; i<posteggi.length; i++) {
			if (posteggi[i]!=null) conteggio++;
		}
		return conteggio;
	}

	public Vettura getAuto(int i) {
		return posteggi[i];
	}

	public Vettura esci(int i) {
		Vettura v=posteggi[i];
		posteggi[i]=null;
		return v;
	}
	
	
}
