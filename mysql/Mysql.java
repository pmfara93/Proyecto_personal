

//OBJETIVO DE CLASE:

//crear las variables que van a permitir enlazar el codigo ( java ), con la base de datos, utilizando
//los datos correspondientes al momento de la configuracion del sql.
//se crea el metodo conexion ,para la comunicacion entre el entorno y la base de datos 
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;


public class Mysql {//dejo las variables publicas por ser una prueba 

    public static final String URL = "jdbc:mysql://localhost:3306/java";
    public static final String Usuario = "root";
    public static final String CLAVE = "root";
      
    public Connection getConexion(){//se obtiene valor de tipo conexion
        Connection con = null; // instancio el objeto de conexion 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Clase con driver de conexion
            con = (Connection) DriverManager.getConnection(URL, Usuario, CLAVE);//conexion
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage()); 
        }
        return con;
    }
    
}

