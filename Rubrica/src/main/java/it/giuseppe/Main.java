package it.giuseppe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int prova = 0;
		int scelta = 0;
	int grandezza = 0;
		
		Scanner input1 = new Scanner(System.in);
		Correntista corr = new Correntista(null, null, null);
		
		ArrayList<Correntista> correntista = new ArrayList<Correntista>();
		
		while(prova == 0) {
			
			System.out.println("Premi 1 per inserire i correntisti");
			System.out.println("Premi 2 per modificare un correntista");
			System.out.println("Premi 3 per ordinare in base al cognome");
			System.out.println("Premi 4 per effettuare un pelievo");
			System.out.println("Premi 5 per effettuare un versamento");
			System.out.println("Premi 6 per stampa");
			System.out.println("Premi 0 per uscire");
			scelta = Integer.parseInt(input1.nextLine());
		
		switch(scelta) {
		
		case  1:
	
			corr.caricamentoCorrentista(correntista);
			break;
		
		
		
		case 2:
		  corr.ricerca(correntista);
			break;
		
		case 3:
			corr.Ordinamento(correntista);
			break;
			
		case 4:
			corr.Prelievo(correntista);
			break;
			
		case 5:
			corr.Versamento(correntista);
		    break;
		
		case 6:
			corr.Stampa(correntista);
		    break;
			
		case   0:
			prova = 1;
		    break;
		
		
		}
		
 for(int i=0; i<grandezza; i++) {
			 
			 System.out.println(correntista.get(i));
		 }
		
	
		
		  //if( == 2) {
			
			  /*String nomeRicercato;   indicare variabile grandezza riportlatla nel metodo con this grandezza
			  String cognomeRicercato;
			  System.out.println("Inserisci nome da ricercare:");
			  nomeRicercato = input.nextLine();
			  cognomeRicercato = input.nextLine();
			  
			  for(i=0; i<correntista.size(); i++) {
				  
				  if()
			  }*/
			  
			  
		  
		}
		
		
		
		//input1.close();
	}

}
