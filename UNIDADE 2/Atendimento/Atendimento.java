/*
- apresentar paciente para consulta
- registrar entrada/saida de atendimento
- calcular media de atendimentos realizados
- prever tempo para proximos atendimentos
* salvar media atual em arq
* recuperar media historica de arq
* apagar ja atendidos
*/
import java.util.*;
public class Atendimento
{
    private double tempoEstimado;
    private String identificaPaciente;
    private Date horaEntrada;
    private Date horaSaida;
    
    public void registrarEntrada(){
       horaEntrada = new Date();
    }
    
    public double calcularTempo(){
        return 1;
    }
    public boolean estaEncerrado(){return horaSaida != null;}

    //get e set
    public void setIdentificaPaciente(String identificaPaciente)
    {
        this.identificaPaciente=identificaPaciente;
    }
    public String getIdentificaPaciente(){
        return this.identificaPaciente;
    }
    
     public void setTempoEstimado(double tempoEstimado)
    {
        this.tempoEstimado=tempoEstimado;
    }
    public double getTempoEstimado(){
        return this.tempoEstimado;
    }
    
       public void setHoraEntrada(Date horaEntrada)
    {
        this.horaEntrada=horaEntrada;
    }
    public Date gethoraEntrada(){
        return this.horaEntrada;
    }
    
       public void setHoraSaida(Date horaSaida)
    {
        this.horaSaida=horaSaida;
    }
    public Date gethoraSaida(){
        return this.horaSaida;
    }
}
