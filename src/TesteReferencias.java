

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Conta 1 - Saldo inicial: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Conta 2 - Saldo inicial: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Conta 2 - Saldo atualizado: " + segundaConta.saldo);
		System.out.println("Conta 1 - Saldo atualizado: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
