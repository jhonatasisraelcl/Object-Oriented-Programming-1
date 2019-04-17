import java.util.*;
public class Medico
{
    private ArrayList<Atendimento> atedimentos;
    private String nome;
    private void acrescentar(Atendimento a){atedimentos.add(a);}

    public void registrarEntrada(String id){
        Atendimento a =achar(id);
        if (a != null) a.registrarEntrada();
    }

    public Atendimento achar(String id){
        for (Atendimento a:atedimentos)
            if(a.getIdentificaPaciente().equals(id)) return a;
        return null; 
    }
    public double mediaReal(){
        double resultado = 0;
        int quantidade =0;
        for (Atendimento a : atendimentos){
            if(A
    
}
