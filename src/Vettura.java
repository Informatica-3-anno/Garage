import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Vettura {
	String modello;
	String targa;
	LocalDateTime oraArrivo;
	
	Vettura(String m, String t) {
		modello=m;
		targa=t;
		oraArrivo=LocalDateTime.now();
	}
	
	Vettura(String m, String t, int ore, int min) {
		modello=m;
		targa=t;
		oraArrivo=LocalDateTime.of(LocalDate.now(),LocalTime.of(ore, min));
	}
	
}
