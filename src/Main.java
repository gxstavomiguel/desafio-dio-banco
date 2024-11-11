public class Main {
    public static void main(String[] args) {

        Cliente gustavo = new Cliente();
        Cliente mateus = new Cliente();

        mateus.setNome("Mateus");
        gustavo.setNome("Gustavo");


        Conta cc = new ContaCorrente(gustavo);
        Conta poupanca = new ContaPoupanca(mateus);
        //Banco banco = new Banco();

        cc.imprimirExtrato();
        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.imprimirExtrato();

        //banco.listaCli();
        cc.listarClientes();
        poupanca.listarClientes();

        cc.listarClientes();


    }
}
