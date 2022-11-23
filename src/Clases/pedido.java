
package Clases;

/**
 *
 * @author JAIME_06
 */
public class pedido {
    private String codigo;
    private String fecha;
    private String descripcion;
    private String cliente;
    private String transaccion;

    public pedido(String codigo, String fecha, String descripcion, String cliente, String transaccion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.transaccion = transaccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

 
 
}
