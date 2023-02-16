
package projetoanimal;


public class Ave extends Animal {
    
    //Atributos
    private String corPena;
    
    //Métodos especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //Métodos herdados

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo grãos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");
    }
    
    //Métodos da classe
    public void fazerNinho(){
        System.out.println("Fazendo Ninho");
    }
    
}
