
package novoprojetopessoa;

public class Bolsista extends Aluno{
    
    //Atributos
    
    private int bolsa;
    
    //Métodos Especiais

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    // Métodos Publicos
    
    public void renovarBolsa(){
        System.out.println("Bolsa Renovada");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade de bolsista paga");
    }
}
