public class Rectangulo extends Forma{
    private double ancho;
    private double largo;
    private String nombre;
    public Rectangulo(double ancho,double largo,String nombre){
        super(nombre);
        this.ancho=ancho;
        this.largo=largo;
        this.nombre=nombre;
    }
    @Override
    public double getArea(){
        return ancho*largo;
    }

}
