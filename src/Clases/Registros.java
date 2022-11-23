
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Registros {
   
    private String registro;
    private String fecha;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String pedido;
    private int empresa;
    private int sucursal;
    private int Vendedor;
    private String telefonoVendedor;

    public Registros(String registro, String fecha, String nombre, String apellido, String telefono, String direccion, String pedido, int empresa, int sucursal, int Vendedor, String telefonoVendedor) {
        this.registro = registro;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pedido = pedido;
        this.empresa = empresa;
        this.sucursal = sucursal;
        this.Vendedor = Vendedor;
        this.telefonoVendedor = telefonoVendedor;
    }

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getVendedor() {
        return Vendedor;
    }

    public void setVendedor(int Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getTelefonoVendedor() {
        return telefonoVendedor;
    }

    public void setTelefonoVendedor(String telefonoVendedor) {
        this.telefonoVendedor = telefonoVendedor;
    }
    
    
}
