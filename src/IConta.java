public class IConta  interface Conta{

    public default void depositar(double valor){

    }

    public void sacar(double valor){

    }

    public void transferir(double valor, Conta contaDestino){

    }

}
