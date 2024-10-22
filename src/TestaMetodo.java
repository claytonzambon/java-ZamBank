
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaExemplo = new Conta();
		contaExemplo.saldo = 100;
		contaExemplo.deposita(50);
		System.out.println("Conta exemplo - Saldo atualizado: " + contaExemplo.saldo);
		
		boolean conseguiuSacar = contaExemplo.saca(20);
		System.out.println("Conta exemplo - Saque realizado? " + conseguiuSacar);
		System.out.println("Conta exemplo - Saldo atualizado: " + contaExemplo.saldo);
	}
}
