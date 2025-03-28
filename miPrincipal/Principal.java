package miPrincipal;
import java.util.Date;
import ventana.*;

public class Principal {
   

    public static void main(String[] args) {
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGraw Hill");
        publicacion.setFecha(new Date(01/01/1983));


         Libro libro = new Libro();
         Libro libro1 = new Libro("978-3-16-148410-0", "Gabriel Garcia Marquez");
         Libro libro2 = new Libro("McGraw Hill", new Date(01/01/1983), "978-3-16-148410-0", "Gabriel Garcia Marquez");


         Revista revista = new Revista();
         revista.setEditorial("National Geographic");
         revista.setFecha(new Date(01/01/1983));
         revista.setPeriodicidad("Anual");
         revista.setEjemplares(1600);

        System.out.println(publicacion);
        System.out.println();

        System.out.println(libro);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println();

        System.out.println(revista);

        System.out.println();

        //crear objeto Ventana
        Ventana ventana = new Ventana();
        //crear un objeto VentanaEspecial
        VentanaEspecial ventanaEspecial = new VentanaEspecial();
        //invoco a los metodos de ventanaEspecial
        ventanaEspecial.copiar(ventanaEspecial);
        ventanaEspecial.copiar("*****",10,5);
        ventanaEspecial.copiar('*',100,7,8);

        ventanaEspecial.copiar('x', 100, 7.5F, 8.5F);
    }

}
