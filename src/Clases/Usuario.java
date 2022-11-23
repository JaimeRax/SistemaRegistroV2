
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Usuario {
    
    private String id;
    private String Nombre;
    private String Clave;

    public Usuario(String id, String Nombre, String Clave) {
        this.id = id;
        this.Nombre = Nombre;
        this.Clave = Clave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    
}
