package miPrincipal;

import java.util.Date;
    public class Publicacion {
        private String editorial;
        private Date fechaPublicacion;

        public Publicacion(){

        }

        public Publicacion(String editorial, Date fechaPublicacion){
            this.editorial = editorial;
            this.fechaPublicacion = fechaPublicacion;
        }

        public String getEditorial(){
            return editorial;
        }
        public void setEditorial(String editorial){
            this.editorial = editorial;
        }
        public Date getFechaPublicacion(){
            return fechaPublicacion;
        }
        public void setFechaPublicacion(Date fechaPublicacion){
            this.fechaPublicacion = fechaPublicacion;
        }
       
    }