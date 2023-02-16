
package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        
        Telespectador t = new Telespectador("Gmaximo13", "Gustavo", 25, "Masculino");
        //System.out.println(t.toString());
        
        Video v = new Video("Curso P.O.O");
        
        Visualizacao vis = new Visualizacao(t, v);
        System.out.println(vis.toString());
    
        vis.avaliar();
        
        System.out.println(v.getAvaliacao());
    }
    
}
