
package projetopessoa;

public class Professor extends Pessoa{
    
    //atributos
    
    private String especialidade;
    private float salario;
    
    //Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Métodos publicos
    
    public void receberAumento(float a){
        this.salario += a;
    }
    
}
