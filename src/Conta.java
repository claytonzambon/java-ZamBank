

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita(double valor) {
		if (valor > 0.0) {
			this.saldo = this.saldo + valor;
		}
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

}
