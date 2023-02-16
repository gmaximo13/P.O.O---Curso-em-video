
package projetopessoa;

public class Funcionario extends Pessoa {

    //atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Métodos publicos
    
    public void mudarTrabalho(String novoTrabalho){
        this.trabalhando = !this.trabalhando;
    }
    
}


