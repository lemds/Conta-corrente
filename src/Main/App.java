package Main;

import Conta.ContaCorrente;
import Conta.ContaCorrenteEspecial;
import Transferencia.Pix;

public class App {
	public static void main(String [] args) {
		ContaCorrente c1 = new ContaCorrente(100);
		ContaCorrenteEspecial c2 = new ContaCorrenteEspecial(300,100);
		
		if(c1.saque(210)) {
			System.out.println("Saque Liberado");
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
		Pix pix = new Pix();
		boolean flag = pix.transferencia(c1, c2, 50);
		if(flag == true) {
			System.out.println("Tranferência Realiazada");
			System.out.println("Saldo c1: " + c1.getSaldo());
			System.out.println("Saldo c2:" + c2.getSaldo());
		}else {
			System.out.println("Tranferência Não Realiazada");
		}
	}
	

	
}
