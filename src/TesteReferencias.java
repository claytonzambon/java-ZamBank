

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Conta 1 - Saldo inicial: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Conta 2 - Saldo inicial: " + segundaConta.saldo);
	}

}
