
package exbanco;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean aberta;

    public Conta() {
        this.aberta = false;
        this.saldo = 0.0f;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getAberta() {
        return this.aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void abrirConta(String tipo){
        this.setTipoConta(tipo);
        this.setAberta(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (this.saldo > 0 || this.saldo < 0){
            System.out.println("Não foi possivel fechar a conta");
        }else {
            this.setAberta(false);
        }
    }
    
    
    public void depositar(float deposito){
        this.saldo = this.saldo + deposito;
    }
    
    public void sacar(float saque){
        if (saldo >= saque){
            this.saldo = this.saldo - saque;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void cobrarMensalidade(){
        this.saldo = this.saldo - 12;
    }
    
    public void estadoConta(){
        System.out.println("Informações da conta:");
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Nome: " + this.getDonoConta());
        System.out.println("Status: " + this.getAberta());
    }
}
