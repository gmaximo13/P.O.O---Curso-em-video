

package projetoanimal;

public class Cachorro extends Mamifero{
    
    //Métodos herdados
    
    //Métodos da classe
    public void enterrrarOsso(){
        System.out.println("Enterrando osso");
    }
   public void abanarRabo(){
       System.out.println("Abanando rabo");
   }
   
   public void reagir (String frase){
       if(frase.equals("Toma comida") || frase.equals("Que gracinha")){
           System.out.println("Abanar e latir");
       }else{
           System.out.println("Rosnar");
       }
   }
   
   public void reagir(int hora, int minutos){
       if(hora < 12){
           System.out.println("Abanar");
       }else if(hora >= 18){
           System.out.println("Rosnar");
       }else{
           System.out.println("Abanar e Latir");
       }
   }
   
   public void reagir(boolean dono){
       if(dono){
           System.out.println("Abanar");
       }else{
           System.out.println("Rosnar");
       }
   }
   
}
