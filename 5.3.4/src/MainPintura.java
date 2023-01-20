public class MainPintura {
    public static void main(String[]arg){
        Forma f=new Forma("Esfera");
        Esfera e=new Esfera(15,"calisto");
        Cilindro c=new Cilindro(30,10,"ramirez");
        Rectangulo r=new Rectangulo(20,35,"luis");
        double cobertura=250;
        Pintura p=new Pintura(cobertura);
        System.out.println(p.pintar(e));
        System.out.println(p.pintar(c));
        System.out.println(p.pintar(r));
    }
}
