
package projetofinal;


public class Telespectador extends Pessoa{
    private String login;
    private int totalAssistido;
    
    //Métodos especiais

    public Telespectador(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Telespectador{" + super.toString() + "login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
    
    // Métodos publicos
    public void viuMaisUm(){
    }
    
}
