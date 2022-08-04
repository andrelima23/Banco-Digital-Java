
public class Main {

	public static void main(String[] args) {
		Cliente andre = new Cliente("André", 29, "PA");
		Cliente joao = new Cliente("João", 55, "PA");
		Cliente maria = new Cliente("Maria", 25, "MT");
        
        Conta andreCC = new ContaCorrente(andre);
        Conta andrePP = new ContaPoupanca(andre);
        Conta joaoCC = new ContaCorrente(joao);
        Conta joaoPP = new ContaPoupanca(joao);
        Conta mariaCC = new ContaCorrente(maria);
        Conta mariaPP = new ContaPoupanca(maria);

        andreCC.depositar(1870);
        joaoCC.depositar(156);
        mariaCC.depositar(560);


        andreCC.imprimirExtrato();
        mariaCC.imprimirExtrato();

        andreCC.transferir(465, mariaCC);
        
        System.out.println("#####################################################");

        andreCC.imprimirExtrato();
        mariaCC.imprimirExtrato();
	}

}
