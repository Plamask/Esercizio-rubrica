package it.giuseppe;

import java.util.ArrayList;
import java.util.Scanner;

public class Correntista extends Utente {

	
	private ArrayList<Conto> conti;
	private String nome;
	private String cognome;
	int grandezza;
	Scanner input = new Scanner(System.in);
	


	private String cf;
	
	public Correntista( String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}



	public Correntista() {
		// TODO Auto-generated constructor stub
	}




	
	
	@Override
	public String toString() {
		return "Correntista [ conti=" + conti + ", nome=" + nome + ", cognome="
				+ cognome + ", cf=" + cf + "]";
	}



	public ArrayList<Conto> getConti() {
		return conti;
	}
	public void setConti(ArrayList<Conto> conti) {
		this.conti = conti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
	public Correntista caricamentoCorrentista (ArrayList<Correntista> correntista) {
		
		
		grandezza ++;
		
	
		ArrayList<Conto> cont = new ArrayList<Conto>();
		Correntista corrent = new Correntista();

		
		
		
			
		//int flag = 0;
			
			System.out.println("Inserisci nome, cognome e codice fiscale");
			
			
			Conto conto = new Conto();
			
			corrent.setNome(input.nextLine());
			corrent.setCognome(input.nextLine());
			corrent.setCf(input.nextLine());
			
			/*int j=0;
			while(j<grandezza) {
				
				if(correntista.get(j).cf.equals(correntista.get(j-1).cf)){
					System.out.println("ci sono codici uguali riprova");
					correntista.remove(j);
				
				}
				j++;
			}*/
			
				System.out.println("Associa un conto: Inserisci Codice conto e Saldo ");
				conto.setNumeroConto(input.nextLine());
				conto.setSaldo(Double.parseDouble(input.nextLine()));
				cont.add(conto);
				corrent.setConti(cont);
				correntista.add(corrent);
			    System.out.println(cont);
			    System.out.println(corrent);
	
		
				
				
				
			
				
			
			
			
				
			
			
		
		
		return corrent;
	}
	
	



	



public void Versamento (ArrayList<Correntista> correntista) {
	System.out.println("Vuoi fare un versamento? inserisci codice fiscale");
	
	String cfVers = input.nextLine();
	int trovato = 0;
	int posizione = 0;
	int qualeConto = 0;
	double thisSaldo = 0;
	double importo = 0;
	double nuovoSaldo = 0;
	String nome = null;
	String cognome = null;
	for(int i=0; i<grandezza; i++) {
		Correntista thisCorrentista = correntista.get(i);
		 
			
		 if(thisCorrentista.getCf().equals(cfVers)) {
	
			 
			 System.out.println("quale conto?");
			 qualeConto = Integer.parseInt(input.nextLine());
			 trovato = 1;
			posizione = i;
			
			 Conto thisConto = correntista.get(i).getConti().get(qualeConto);
			 thisSaldo = thisConto.getSaldo();
		
			 nome = thisCorrentista.nome;
			 cognome = thisCorrentista.cognome;
	}
	
	if(trovato==1) {
		
		
		
		
		
		System.out.println("Ciao"+ " " + nome + " " + cognome + " " + "Quanto vuoi versare?");
		
		importo = input.nextDouble(); 
		
		nuovoSaldo = importo + thisSaldo;
		 correntista.get(posizione).getConti().get(qualeConto).setSaldo(nuovoSaldo);
		System.out.println("Versamento effettuato");
	  System.out.println("Nuovo Saldo:"+" " +nuovoSaldo);
	   }
	
	}
	
}


public void Prelievo (ArrayList<Correntista> correntista) {
	System.out.println("Vuoi fare un prelievo? inserisci codice fiscale");
	
	String cfVers = input.nextLine();
	int trovato = 0;
	int posizione = 0;
	int qualeConto = 0;
	double thisSaldo = 0;
	double importo = 0;
	double nuovoSaldo = 0;
	String nome = null;
	String cognome = null;
	for(int i=0; i<grandezza; i++) {
		Correntista thisCorrentista = correntista.get(i);
		 
			
		 if(thisCorrentista.getCf().equals(cfVers)) {
	
			 
			 System.out.println("quale conto?");
			 qualeConto = Integer.parseInt(input.nextLine());
			 trovato = 1;
			posizione = i;
			
			 Conto thisConto = correntista.get(i).getConti().get(qualeConto);
			 thisSaldo = thisConto.getSaldo();
		
			 nome = thisCorrentista.nome;
			 cognome = thisCorrentista.cognome;
	}
	
	if(trovato==1) {
		
		
		
		
		
		System.out.println("Ciao"+ " " + nome + " " + cognome + " " + "Quanto vuoi versare?");
		
		importo = input.nextDouble(); 
		if(importo>thisSaldo) {
			System.out.println("Credito insufficiente");
		}
		else
		{
			nuovoSaldo = thisSaldo - importo;
			 correntista.get(posizione).getConti().get(qualeConto).setSaldo(nuovoSaldo);
			System.out.println("Versamento effettuato");
			 System.out.println("Nuovo Saldo:"+" " +nuovoSaldo);
		}
			
	
	   }
	
	}
	
}



	public void ricerca (ArrayList<Correntista> correntista) {
		
		  String nomeRicercato;   
		  String cognomeRicercato;
		  String cfRicercato;
		  String nuovoNome;
		  String nuovoCognome;
		  int posizione = 0;
		  System.out.println("Inserisci nome da ricercare:");
		  nomeRicercato = input.nextLine();
		 System.out.println("Inserisci cognome da ricercare:");
		  cognomeRicercato = input.nextLine();
		  int cont = 0;
		  int i = 0;
		  for(i=0; i<correntista.size(); i++) {
			  
			 Correntista thisCorrentista = correntista.get(i);
			  
			  if((thisCorrentista.getNome().equals(nomeRicercato)) && (thisCorrentista.getCognome().equals(cognomeRicercato))) {
				  
				  cont ++;
				  
				 posizione = i;
				  
				 }
			  
		  }
		  if(cont == 1) {
			
			  System.out.println("Correntista trovato:");
			  System.out.println(correntista.get(posizione));
			  
			  System.out.println("Inserisci nuovo nome:");
			  nuovoNome = input.nextLine();
			  System.out.println("Inserisci nuovo cognnome:");
			  nuovoCognome = input.nextLine();
			  
			  correntista.get(posizione).nome = nuovoNome;
			  correntista.get(posizione).cognome = nuovoCognome;
			  
			  System.out.println("Modifica effettuata:");
			  System.out.println(correntista.get(posizione));
			  
			  
		  }
		  
		  if(cont > 1)
		  {
			 int cfTrovato = 0;
			  System.out.println("Trovati uno o più omonimi eseguire ricerca per codice fiscale");
			  cfRicercato = input.nextLine();
			  
			  for(i=0; i<correntista.size(); i++) {
				  
				 Correntista thisCorrentista = correntista.get(i);
				 
				 if(thisCorrentista.getCf().equals(cfRicercato)) {
					 cfTrovato = 1;
					 
					 System.out.println("Correntista trovato:");
					  System.out.println(correntista.get(i));
					  
					  System.out.println("Inserisci nuovo nome:");
					  nuovoNome = input.nextLine();
					  System.out.println("Inserisci nuovo cognnome:");
					  nuovoCognome = input.nextLine();
					  
					  correntista.get(i).nome = nuovoNome;
					  correntista.get(i).cognome = nuovoCognome;
					  
					  System.out.println("Modifica effettuata:");
					  System.out.println(correntista.get(i));
					 
				 }
			  }
			  
			  if(cfTrovato == 0) {
				  System.out.println("Nessun correntista trovato");
			  }
			  
			  
		  }
            
		  
		  if(cont == 0) {
			  System.out.println("Nessun correntista trovato");
			  
		  }
		  
	
		  
		 
		
	}
	
	  public void Ordinamento (ArrayList<Correntista> correntista) {
		  
		  correntista.sort((piccolo, grande)-> piccolo.getCognome().compareTo(grande.getCognome()));
		  
		  for(Correntista cognomi : correntista) {
			  System.out.println(cognomi.getCognome());
		  }
		  
		  return;
	  }
	  
	  public void Stampa (ArrayList<Correntista> correntista) {
		  
		 for(int i=0; i<grandezza; i++) {
			 
			 System.out.println(correntista.get(i));
		 }
			
	  }
	  
	  
	
}
