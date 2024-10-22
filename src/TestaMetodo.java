
public class TestaMetodo {
	public static void main(String[] args) {
//		Conta contaExemplo = new Conta();
//		contaExemplo.saldo = 100;
//		contaExemplo.deposita(50);
//		System.out.println("Conta exemplo - Saldo atualizado: " + contaExemplo.saldo);
//		
//		boolean conseguiuSacar = contaExemplo.saca(20);
//		System.out.println("Conta exemplo - Saque realizado? " + conseguiuSacar);
//		System.out.println("Conta exemplo - Saldo atualizado: " + contaExemplo.saldo);
		Conta contaVenus = new Conta();
		contaVenus.saldo = 100;
		System.out.println("Conta Venus - Saldo: R$ " + contaVenus.saldo);
		
		boolean conseguiuDepositar = contaVenus.deposita(50);
		System.out.println("\nConta Venus - Depositou? " + conseguiuDepositar);
		System.out.println("Conta Venus - Saldo: R$ " + contaVenus.saldo);
		
		boolean conseguiuSacar = contaVenus.saca(20);
		System.out.println("\nConta Venus - Sacou? " + conseguiuSacar);
		System.out.println("Conta Venus - Saldo: R$ " + contaVenus.saldo);
		
		Conta contaMarte = new Conta();
		contaMarte.deposita(1000);
		System.out.println("\nConta Marte - Saldo: R$ " + contaMarte.saldo);
		
		boolean conseguiuTransferir = contaMarte.transfere(300, contaVenus);
		System.out.println("\nConta Marte - Transferiu? " + conseguiuTransferir);
		System.out.println("Conta Marte - Saldo: R$ " + contaMarte.saldo);

	}
}
