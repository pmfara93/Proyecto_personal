
//OBJETIVO DE LA CLASE:
//EN ESTA CLASE SE ESTABLECE LA RELACION ENTRE EL USURIO Y LOS DATOS DE LA BASE DE DATOS
//COMO ASI TAMBIEN , SE SETEAN LOS DATOS RELEVANTES QUE DEBE INGRESAR EL USURIO 
//PARA COMPARAR EN LA CLASE DE VISTA , LA DISTANCIAS CON LAS RESPECTIVAS FARMACIAS.
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;







public class DatosUsuario {
  
   private int longitud ;
   private Connection con;
   private Mysql conectar;
   private MvC mc;

    public DatosUsuario(int longitud, Mysql conectar) {
        this.longitud = longitud;
        conectar = new Mysql();
        mc = new MvC();
    }
   

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}


