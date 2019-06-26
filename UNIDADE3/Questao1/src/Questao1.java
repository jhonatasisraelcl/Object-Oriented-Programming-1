import java.util.ArrayList;

public class Ordenador
{
   
    
    public void ordenar(ArrayList objetos){
        int trocas;
        do{
            trocas=0;
            for (int i=0; i<objetos.size()-1; i++){
                Caixa atual = (Caixa)objetos.get(i);
                Caixa proximo = (Caixa)objetos.get(i+1);
                if (atual.meCompareCom(proximo) > 0){
                    Caixa aux = (Caixa)objetos.get(i);
                    objetos.set(i,objetos.get(i+1));
                    objetos.set(i+1,aux);
                    trocas++;
                }
            }
        }while(trocas>0);
    }
}




public interface Caixa
{
    public int meCompareCom(Caixa outro);
}





public class Contato implements Caixa
{
    private String nome;
    
    private String fone;
    
    private int idade;
    
    public Contato(){        
    }
    
    public Contato(String n){
        nome = n;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setFone(String f){
        fone = f;
    }
    
    public String getFone(){
        return fone;
    }
    
    public void setIdade(int i){
        idade = i;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int meCompareCom(Caixa outro){
        Contato c = (Contato)outro;
        return nome.compareTo(c.getNome());
        //if (nome.equals(c.getNome()) ) return 0;        
        //if (nome.compareTo(c.getNome()) > 0) return 1;
        //return -1
        
    }
}
