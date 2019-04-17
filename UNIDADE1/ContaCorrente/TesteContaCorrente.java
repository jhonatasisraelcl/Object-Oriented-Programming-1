
public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setNomeTitular("jhonatas israel");
        c1.setNumeroAgencia("0001-a");
        c1.setNumeroConta("00000-1");
        
        System.out.println("bem vindo ao banco do IFRN");
        System.out.println("Nome:"+c1.getNometitular());
        System.out.println("Agencia:"+c1.getNumeroAgencia());
        System.out.println("Conta:"+c1.getNumeroConta());
    
            }
    
    }
