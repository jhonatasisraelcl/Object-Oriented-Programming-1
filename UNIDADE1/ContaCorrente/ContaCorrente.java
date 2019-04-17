
/**
 * Escreva a descrição da classe ContaCorrente aqui.
 * 
 * LAURENTINO, J.I.C.
 * SEX, 05 DE ABRIL DE 2019
 */
public class ContaCorrente
{
    private String nomeTitular;
    private String numeroAgencia;//0999-x
    private String numeroConta;//99999-9
    private double saldo;//000.000
    private double limite;//200.00
    private double taxaManutencao;

    /**
     * COnstrutor para objetos da classe ContaCorrente
     */
    public ContaCorrente(){}
    /**
    public ContaCorrente(String nome,String agencia,String conta,double saldo,double limite)
    {
        taxaManutencao = 0.33;
        this.nomeTitular= nome;
        this.numeroAgencia= agencia;
        this.numeroConta=conta;
        this.saldo=saldo;
        this.limite=limite;
    }

    public ContaCorrente(String nome,String agencia,double deposito)
    {
        nomeTitular=nome;
        numeroAgencia= agencia;
        saldo=deposito;	
        taxaManutencao = 0.33;
    }**/
    //get e set NomeDoTitular
    public void setNomeTitular(String nomeTitular)
    {
        this.nomeTitular=nomeTitular;
    }

    public String getNometitular(){
        return this.nomeTitular;
    }
    //get e set NumeroDaAgencia
    public void setNumeroAgencia(String numeroAgencia)
    {
        this.numeroAgencia=numeroAgencia;
    }

    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    //get e set NumeroDaConta
    public void setNumeroConta(String numeroConta){
        this.numeroConta=numeroConta;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }
    //getSaldo
    public double saldo(){
        return saldo;
    }
    //getLimite
    public double limite(){
        return limite;
    } 

    boolean deposita(double valor){
        if (valor > 0 ){
            this.saldo = this.saldo + valor;
            return true;
        }else{
            return false;
        }
    }

    boolean saque (double valor){
        if (valor>0){
            if(this.saldo > valor){
                taxaManutencao = 0.33;
                this.saldo = this.saldo - valor - taxaManutencao;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    boolean transfere (double valor, ContaCorrente c1){
        if (valor > 0){
            boolean retirou = this.saque(valor);
            if (retirou == false){
                return false;
            }else{
                c1.deposita(valor);
                return true;
            }
        }else{
            return false;
        }
    }
    
  
    
}