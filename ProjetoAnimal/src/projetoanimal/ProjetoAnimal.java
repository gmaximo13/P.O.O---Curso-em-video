package projetoanimal;


public class ProjetoAnimal {

    public static void main(String[] args) {
    Cachorro c = new Cachorro();
    c.emitirSom();
    c.reagir(true);
    
    Canguru can = new Canguru();
    can.locomover();
    
    Mamifero m = new Mamifero();
    m.locomover();
    }
    
}
