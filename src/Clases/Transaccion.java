
package Clases;

/**
 *
 * @author JAIME_06
 */
public class Transaccion {
    private String codigo;
    private int asesor;
    private int sucursal;
    private int empresa;

    public Transaccion(String codigo, int asesor, int sucursal, int empresa) {
        this.codigo = codigo;
        this.asesor = asesor;
        this.sucursal = sucursal;
        this.empresa = empresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAsesor() {
        return asesor;
    }

    public void setAsesor(int asesor) {
        this.asesor = asesor;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }
    
}
