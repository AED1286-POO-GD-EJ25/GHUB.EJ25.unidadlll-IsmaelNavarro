package ventana;
 public class Ventana {
    private String marco1;
    public String marco2;
    protected String marco3;
    String marco4;
 
    public  void copiar(Ventana w){
        System.out.println("Estoy en el metodo copiar de la clase base de Ventana");

    }
    public void copiar(String p, int x, int y){
        System.out.println("Estoy en el metodo copiar de Ventana con String, int, int");
    }
    public void metodo1(){
        System.out.println(super.marco2);
        System.out.println(super.marco3);
        System.out.println(super.marco4);
    }
 }