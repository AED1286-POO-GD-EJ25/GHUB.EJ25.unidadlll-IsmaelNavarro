package miPrincipal;
import java.util.Date;
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
    }
}