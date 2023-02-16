
package exbanco;

public class ExBanco {
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.setNumConta(1111);
        c1.setDonoConta("Jubileu");
        c1.abrirConta("CC");
        
        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDonoConta("Creuza");
        c2.abrirConta("CP");
        
        c1.depositar(100);
        c2.depositar(500);
        c2.sacar(100);
        c1.sacar(150);
        c1.fecharConta();
       
        c1.estadoConta();
        c2.estadoConta();
    }
}
