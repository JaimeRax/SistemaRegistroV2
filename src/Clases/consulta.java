
package Clases;

/**
 *
 * @author JAIME_06
 */
public class consulta {
 
    
    
    private String Codigo;
    private String Atencion;
    private String idPedido;
    private String Fecha;
    private String Adquirido;
    private String Comentario;

    public consulta(String Codigo, String Atencion, String idPedido, String Fecha, String Adquirido, String Comentario) {
        this.Codigo = Codigo;
        this.Atencion = Atencion;
        this.idPedido = idPedido;
        this.Fecha = Fecha;
        this.Adquirido = Adquirido;
        this.Comentario = Comentario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getAtencion() {
        return Atencion;
    }

    public void setAtencion(String Atencion) {
        this.Atencion = Atencion;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getAdquirido() {
        return Adquirido;
    }

    public void setAdquirido(String Adquirido) {
        this.Adquirido = Adquirido;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

   
   
}
