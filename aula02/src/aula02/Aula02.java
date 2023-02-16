package aula02;

public class Aula02 {


    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //estancia um novo objeto(caneta)
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        c1.tampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta(); //estancia um segundo obejto
        
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        
        c2.destampar();
        c2.rabiscar();
    }
    
}
