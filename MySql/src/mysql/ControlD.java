


//OBJETIVO DE LA CLASE:

//Esta es la clase de " centro de control de los datos a insertar ". Aqui se importan las librerias 
//para lograr la conexon a la base de datos , como asi tambien , realizar multiples modificaciones en la misma 
//utilizando librerias y objetos que permiten acceder a ella con los mismos comandos , pero 
//asignandoles distintos valores.Ademas, se incluye el metodo para acceder y consultar los datos de sql 

package mysql;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControlD {
    
private Mysql conectar;
private Connection con;
private MvC mc;

   

    public ControlD() {
        conectar = new Mysql();
        mc = new MvC();
    }
    
//    // en este metodo recibo por parametros los tipos de datos necesarios con sus respectivas variables 
//    a la vez que , le doy la posibilidad de poder asignarles contenido diferente a cada fila.
   
    public void insertar (String direccion,int id,int latitud,int longitud,String nombre){
         PreparedStatement ps;
         String sql;
         mc.setDireccion(direccion);
         mc.setId(id);
         mc.setLatitud(latitud);
         mc.setLongitud(longitud);
         mc.setNombre(nombre);
    
//    // El objetivo de este try and catch , es que me permite seguir agregandole contenido 
//    a la base de datos sin que se cierre el programa , ademas , me informa sobre posibles errores 
    try{
     con = conectar.getConexion();
            sql = "insert into datos (direccion,id,latitud,longitud,nombre) values(?,?,?,?,?)";
            ps= con.prepareStatement(sql);
            ps.setString(1, mc.getDireccion());
            ps.setInt(2, mc.getId());
            ps.setInt(3, mc.getLatitud());
            ps.setInt(4,mc.getLongitud());
            ps.setString(5,mc.getNombre());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");


} catch(SQLException e){
    
    JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

}
   
    
    
}
//Metodo de acceso y consulta de datos de la tabla en sql.
 public  ResultSet consultarlatabla(String direccion,int id,int longitud,int latitud,String nombre) {
        
     PreparedStatement ps;
     String sql;
     
     try{ 
         
    con = conectar.getConexion();
            sql = "select * from datos  ";
            ps= con.prepareStatement(sql);   
            
            ResultSet obtener=ps.executeQuery();
            
            return obtener;
             
         }catch(Exception e){
             System.out.println(e);
             return null;
         }
    
    }

}



