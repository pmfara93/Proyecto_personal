
//OBJETIVO DE LA CLASE:

////La idea en esta clase es crear las variables y darles la posibilidad de poder asignarle valores
//dependiendo del tipo de datos que reciban sus metodos estas formaran la tabla 
//asignandole nombre a cada uno de los campos  que formaran la base de datos.
//utilizo los set and getters, ya que estan declaradas 
//como privadas 

package mysql;

public class MvC {
private int id;
private String direccion;
private int longitud;
private int latitud;
private String nombre;

    public int getId() {
        return id;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }
  public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }






}
