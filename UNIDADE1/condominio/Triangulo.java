
/**
 * Escreva a descrição da classe Triangulo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Triangulo
{
    private double base;
    private double altura;
    public Triangulo(double b, double a){
        base=b;
        altura=a;
    }
    public double area(){
        return (base * altura)/2;
    }
}
