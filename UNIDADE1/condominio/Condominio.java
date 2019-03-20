
/**
 * Escreva a descrição da classe Condominio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Condominio
{
    private Retangulo areaRetangular;
    private Circulo areaCircular;
    private Triangulo areaTriangular;
    public Condominio(){
        areaCircular = new Circulo(10);
        areaTriangular = new Triangulo(10, 23);
        areaRetangular= new Retangulo(10,10);
    }
    public double area(){
        double a1 = areaRetangular.area();
        double a2 = areaTriangular.area();
        double a3 = areaCircular.area();
        return a1+a2+a3;
    }
    public double custoLimpeza(double precoPorM2){
        return this.area() * precoPorM2;
    }
    
}
