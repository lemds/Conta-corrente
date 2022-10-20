package Conta;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double limite;
	
	public ContaCorrenteEspecial() {
		
	}
	
	public ContaCorrenteEspecial(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	
	public boolean saque(double valor) {
		if(valor <= (saldo + limite)) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
}
