
package aula02;

public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não é possivel rasbicar, a caneta esta tampada");
        }else {
            System.out.println("Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
}
