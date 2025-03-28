package ventana;
 public class Ventana {
 
    public void copiar(Ventana w){
        System.out.println("Estoy en el metodo copiar de la clase base de Ventana");

    }
    public void copiar(String p, int x, int y){
        System.err.println("Estoy en el metodo copiar de Ventana con String, int, int");
    }
 }