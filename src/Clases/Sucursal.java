
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Sucursal {
    private int codigo;
    private String nombre;
    private int codigoemp;

    public Sucursal(int codigo, String nombre, int codigoemp) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoemp = codigoemp;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoemp() {
        return codigoemp;
    }

    public void setCodigoemp(int codigoemp) {
        this.codigoemp = codigoemp;
    }
    
    public String toString(){
        return this.nombre;
    }

    public Sucursal() {
    }
    
}
