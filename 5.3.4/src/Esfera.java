public class Esfera extends Forma {
    private double radio;
    private String nombre;
    public Esfera(double radio,String nombre){
        super(nombre);
        this.radio=radio;
        this.nombre=nombre;
    }
    @Override
    public double getArea(){
        return 4*Math.PI*(radio*radio);
    }
}
