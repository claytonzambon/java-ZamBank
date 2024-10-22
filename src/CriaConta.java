
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println("Conta 1 - Saldo inicial: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100.00;
		System.out.println("Conta 1 - Saldo atualizado: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.00;
		System.out.println("Conta 2 - Saldo inicial: " + segundaConta.saldo);
	}

}
