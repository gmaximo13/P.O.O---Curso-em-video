
package projetoanimal;


public class Canguru extends Mamifero{
    //Métodos herdados
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
    //Métodos da classe
    public void  usarBolsa(){
        System.out.println("Usando bolsa");
    }
}
