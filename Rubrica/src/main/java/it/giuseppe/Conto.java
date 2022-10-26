package it.giuseppe;



public class Conto {

	
	private String numeroConto;
	private double saldo;
	
	
	
	
	/*public Conto(String nextLine, double nextDouble) {
		// TODO Auto-generated constructor stub
	}*/



	public Conto(String nextLine, double parseDouble) {
		// TODO Auto-generated constructor stub
	}



	public Conto() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Conto [numeroConto=" + numeroConto + ", saldo=" + saldo + "]";
	}
	
	
	
	public String getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
