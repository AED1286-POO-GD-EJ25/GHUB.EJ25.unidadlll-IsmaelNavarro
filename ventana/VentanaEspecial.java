package ventana;

public class VentanaEspecial extends Ventana {


    public void copiar(char c, int veces, int x, int y){
        System.err.println("Estoy en el metodo copiar de VentanaEspecial con char, int, int, int");
    }
    
    public void copiar(Ventana w){
        System.out.println("Estoy en el metodo copiar de la clase derivada");

    }
    public void copiar(char c, int veces, float x, float y){
        System.err.println("Estoy en el metodo copiar de VentanaEspecial con char, int, int, int");
    }
    }