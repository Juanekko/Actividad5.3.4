public class Cilindro extends Forma{
    private double alto;
    private double radio;
    private String nombre;
    public Cilindro(double alto,double radio,String nombre){
        super(nombre);
        this.alto=alto;
        this.radio=radio;
        this.nombre=nombre;
    }
    @Override
    public double getArea(){
        return Math.PI*(radio*radio)*alto;
    }
}
