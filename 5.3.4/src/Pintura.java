public class Pintura{
    private double cobertura;
    public Pintura(double cobertura){
        this.cobertura=cobertura;
    }
    public  double pintar(Forma ob){
        return ob.getArea()/this.cobertura;
    }
}
