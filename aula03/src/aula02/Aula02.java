package aula02;

public class Aula02 {


    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //estancia um novo objeto(caneta)
       
        c1.cor = "Preta";
       // c1.tampada = true; não é possivel pois tampada é um atribudo privado
       
        c1.destampar(); //Utilizar método publico da classe caneta  
        
        c1.status();
    }
    
}
