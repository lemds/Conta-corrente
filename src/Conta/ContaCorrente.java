package Conta;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public double deposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public boolean saque(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		
		return false;
	}
}
