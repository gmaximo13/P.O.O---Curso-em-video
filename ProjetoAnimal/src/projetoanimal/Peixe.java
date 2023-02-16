
package projetoanimal;

public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos espeaciais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Métods herdados

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
    //Métodos da clasee
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
   
}
