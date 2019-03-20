
/**
 * Escreva a descrição da classe Retangulo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Retangulo
{
    private double largura;
    private double altura;
    
    public Retangulo (double l, double a){
        largura= l;
        altura= a;
    }
    public Retangulo (double l){
        largura= l;
        altura= l;
    }
    public double area(){
        return largura*altura;
    }
}
