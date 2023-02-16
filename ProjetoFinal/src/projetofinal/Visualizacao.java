
package projetofinal;


public class Visualizacao {
    private Telespectador internauta;
    private Video filme;

    public Visualizacao(Telespectador internauta, Video filme) {
        this.internauta = internauta;
        this.filme = filme;
    }

    Visualizacao(Telespectador t, Visualizacao v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Telespectador getInternauta() {
        return internauta;
    }

    public void setInternauta(Telespectador internauta) {
        this.internauta = internauta;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "internauta=" + internauta + ", filme=" + filme + '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcentagem){
        int total = 0;
        if (porcentagem <= 20){
            total = 3;
        }else if(porcentagem <= 50){
            total = 5;
        }else if(porcentagem <= 80){
            total = 8;
        }else{
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

}
