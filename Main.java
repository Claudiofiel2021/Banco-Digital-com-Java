
public class Main {

	public static void main(String[] args) {
		Cliente clientex = new cliente();    

		Agencia agencia = new Agencia();
		agencia.setNome("Centro");
		agencia.setNumero(777);
		
		Conta cc = new ContaCorrente(clientex, agencia);
		Conta poupanca = new ContaPoupanca(clientex, agencia);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
