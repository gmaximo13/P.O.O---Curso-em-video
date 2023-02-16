
package novoprojetopessoa;


public class Aluno extends Pessoa {
    
    //Atributos
    
    private int matricula;
    private String curso;

    //Métodos especiais 

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos publicos
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }
}
