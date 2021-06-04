import java.util.Scanner;

public class Principale {
     
	static Scanner in=new Scanner(System.in);
	static Garage g;
	
	public static void parcheggia() {
		System.out.print("Vettura: ");
		String modello=in.nextLine();
		System.out.print("Targa:   ");
		String targa=in.nextLine();
		System.out.println("Vettura parcheggiata nel posto "+
		       g.parcheggia(new Vettura(modello,targa)));
	}
	
	public static void sparcheggia(){
		
	}
	
	public static void cerca() {
		
	}
	
	public static void main(String[] args)  {
		
		g=new Garage(20);
	    
	    int risp=0;
		// Menu di funzionamento
		do {
			System.out.println("1 - Parcheggia vettura");
			System.out.println("2 - Cerca vettura");
			System.out.println("3 - Fai uscire una vettura");
			System.out.println("4 - Fine");
			risp=in.nextInt();		
			in.nextLine();
			switch(risp) {
			case 1: parcheggia();
					break;
			case 2: cerca();
					break;
			case 3: sparcheggia();
					break;
			case 4: System.out.print("vuoi veramente terminare? (s/N)");
					String r=in.nextLine();
					if (! r.equalsIgnoreCase("s")) {
						risp=0;
					}
					break;
					
			}
		
		} while (risp!=4);
		
			
//		Garage myGarage=new Garage(20);
//		
//		System.out.println("Garage creato N° posti occupati: "+myGarage.contaVetture());
//		myGarage.parcheggia(new Vettura("Smart","AB12345"));
//		System.out.println("              N° posti occupati: "+myGarage.contaVetture());
//		myGarage.parcheggia(new Vettura("Audi","KR789234",9,45));
//		System.out.println("              N° posti occupati: "+myGarage.contaVetture());
//		
//		System.out.println("Cerco la vettura targata: KR789234 " +myGarage.cercaVettura("KR789234"));
//		int pos=myGarage.cercaVettura("KR789234");
//		Vettura v=myGarage.getAuto(pos);
//		System.out.println("Auto in posizione: "+pos);
//		System.out.println(v.modello+" "+v.targa+" Ora Arrivo:"+v.oraArrivo.getDayOfMonth()+"/"+ v.oraArrivo.getMonthValue()+"/"+
//		                                                        v.oraArrivo.getYear()+" "+v.oraArrivo.getHour()+":"+v.oraArrivo.getMinute());
	}

}
