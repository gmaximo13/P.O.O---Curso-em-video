
package projetopessoa;

public class Aluno extends Pessoa {
    
    //atributos
    
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
    
    //Métodos publicos
    
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }
}
