
package Clases;

import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author JAIME_06
 */
public class Conectar {
    public Statement sentencia;
    public ResultSet rs;
    private Connection conn;


    //METODO PARA CONECTARNOS A LA BASE DE DATO Y CERRAR LA CONEXION
    public Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost:3306/sistemaregistro?serverTimezone=UTC";
            conn = DriverManager.getConnection(db,"root","Jaime.2000");
            System.out.println("Conectados xd");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public void cerrarConexion(){
        try {
            conn.close();
            System.out.println("Cerrado...");
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //METODOS PARA INSERTAR DATOS EN LA BASE DE DATOS
    public boolean insertEmpresa(Empresa datosEmpresa){     
        try {
            String sql = "INSERT INTO empresa (idEmpresa,Nombre) VALUES("
                +datosEmpresa.getCodigo()+",'"
                +datosEmpresa.getNombre()+"')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 
    public boolean insertSucursal(Sucursal datosSucursal){
        try {
            String sql = "INSERT INTO sucursal (idSucursal,Nombre,Empresa_idEmpresa) VALUES("
                +datosSucursal.getCodigo()+",'"
                +datosSucursal.getNombre()+"',"
                +datosSucursal.getCodigoemp()+")";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   
    public boolean insertAsesor(Usuarios datosUsuarios){     
        try {
            String sql = "INSERT INTO asesor (idAsesor,Nombre,Apellido,Telefono,Sucursal_idSucursal) VALUES('"
                +datosUsuarios.getCodigo()+"','"
                +datosUsuarios.getNombre()+"','"
                +datosUsuarios.getApellido()+"','"
                +datosUsuarios.getTelefono()+"',"
                +datosUsuarios.getSucursal()+")";
         
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
           
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   
    public boolean insertCliente(Cliente datosCliente){     
        try {
            String sql = "INSERT INTO cliente (idCliente,Nombre,Apellido,Telefono,Direccion) VALUES('"
                +datosCliente.getCodigo()+"','"
                +datosCliente.getNombre()+"','"
                +datosCliente.getApellido()+"','"
                +datosCliente.getTelefono()+"','"
                +datosCliente.getDireccion()+"')";       
            Statement st = conn.createStatement();
            st.executeUpdate(sql);          
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }  
    public boolean insertTransaccion(Transaccion datos){
        try {
            String sql = "INSERT INTO transaccion (idTransaccion, Asesor_idAsesor, Sucursal_idSucursal, Empresa_idEmpresa) VALUES('"
                +datos.getCodigo()+"',"
                +datos.getAsesor()+","
                +datos.getSucursal()+","
                +datos.getEmpresa()+")";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }  
    public boolean insertPedido(pedido datos){
        try {
            String sql = "INSERT INTO pedido (idPedido, Fecha, Descripcion, Cliente_idCliente, Transaccion_idTransaccion) VALUES('"
                +datos.getCodigo()+"','"
                +datos.getFecha()+"','"
                +datos.getDescripcion()+"','"
                +datos.getCliente()+"','"
                +datos.getTransaccion()+"')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }      
    public boolean insertConsulta(consulta datos){
        try {
            String sql = "INSERT INTO consulta (idConsulta, Resp_Cliente, Pedido_idPedido, Fecha, Adquirio, Comentario) VALUES('"
                +datos.getCodigo()+"','"
                +datos.getAtencion()+"','"
                +datos.getIdPedido()+"','"
                +datos.getFecha()+"','"
                +datos.getAdquirido()+"','"
                +datos.getComentario()+"')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }  
    public boolean insertUsuario(Usuario datos){
        try {
            String sql = "INSERT INTO usuario (IdUsuario, Nombre, Clave) VALUES('"
                +datos.getId()+"','"
                +datos.getNombre()+"','"
                +datos.getClave()+"')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
    
    
    //METODOS PARA MOSTRAR TODOS LOS RESULTADOS DE LAS TABLAS DE LA BASE DE DATOS
    public ResultSet mostrarSucursal(){
        try {
            String sql = "Select * from vista_sucursales";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;  
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }
    public ResultSet mostrarAsesor(){
        try {
            String sql = "Select * from vista_asesor";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }
    public ResultSet mostrarRegistros(){
        try {
            String sql = "Select * from vista_pedidos";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        } 
    }  
    public ResultSet getEmpresa(){
        try {
            String sql = "Select * from empresa";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }  
    public ResultSet getSucursal(){
        try {
            String sql = "Select * from sucursal";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }   
    public ResultSet getCliente(){
        try {
            String sql = "Select * from cliente ORDER BY idCliente DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }    
    public ResultSet getConsulta(){
        try {
            String sql = "Select * from consulta";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
     
    
    //METODOS PARA MOSTRAR TODOS LOS DATOS DE UN REGISTRO SELECCIONADO
    public Empresa getEmpresa(String emp){
        try {
            Empresa empresa = null;
            String sql = "Select * from empresa where idEmpresa = '"+emp+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                empresa = new Empresa(rs.getInt("idEmpresa"),rs.getString("Nombre"));
            }
            return empresa;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    public Sucursal getSucursal(String suc){
        try {
            Sucursal sucursal = null;
            String sql = "Select * from sucursal where idSucursal = '"+suc+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                sucursal = new Sucursal(rs.getInt("idSucursal"),rs.getString("Nombre"),rs.getInt("Empresa_idEmpresa"));
            }
            return sucursal;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
    public Sucursal getSucursal2(String suc){
        try {
            Sucursal sucursal = null;
            String sql = "Select * from sucursal where Empresa_idEmpresa = '"+suc+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                sucursal = new Sucursal(rs.getInt("idSucursal"),rs.getString("Nombre"),rs.getInt("Empresa_idEmpresa"));
            }
            return sucursal;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
    public Usuarios getUsuarios(String usu){
        try {
            Usuarios usuario = null;
            String sql = "Select * from asesor where idAsesor = '"+usu+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuario = new Usuarios(rs.getString("idAsesor"),rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getInt("Sucursal_idSucursal"));
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public Usuarios getUsuarios2(String usu){
        try {
            Usuarios usuario = null;
            String sql = "Select * from asesor where Sucursal_idSucursal = '"+usu+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                usuario = new Usuarios(rs.getString("idAsesor"),rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getInt("Sucursal_idSucursal"));
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }     
    public Cliente getCliente(String cli){
        try {
            Cliente client = null;
            String sql = "Select * from cliente where idCliente = '"+cli+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                client = new Cliente(rs.getString("idCliente"),rs.getString("Nombre"),rs.getString("Apellido"),
                rs.getString("Telefono"),rs.getString("Direccion"));
            }
            return client;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public Usuario getUsu(String cli){
        try {
            Usuario client = null;
            String sql = "Select * from usuario where IdUsuario = '"+cli+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                client = new Usuario(rs.getString("IdUsuario"),rs.getString("Nombre"),rs.getString("Clave"));
            }
            return client;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public Transaccion getTransaccion(String reg){
        try {
            Transaccion tran = null;
            String sql = "Select * from transaccion where idTransaccion = '"+reg+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                tran = new Transaccion(rs.getString("idTransaccion"),rs.getInt("Asesor_idAsesor"),
                        rs.getInt("Sucursal_idSucursal"),rs.getInt("Empresa_idEmpresa"));
            }
            return tran;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }  
    public Transaccion getTransaccion2(String reg){
        try {
            Transaccion tran = null;
            String sql = "Select * from transaccion where Asesor_idAsesor = '"+reg+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                tran = new Transaccion(rs.getString("idTransaccion"),rs.getInt("Asesor_idAsesor"),
                        rs.getInt("Sucursal_idSucursal"),rs.getInt("Empresa_idEmpresa"));
            }
            return tran;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }  
    public pedido getpedido(String ped){
        try {
            pedido pedi = null;
            String sql = "Select * from pedido where idPedido = '"+ped+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                pedi = new pedido(rs.getString("idPedido"),rs.getString("Fecha"),
                        rs.getString("Descripcion"),rs.getString("Cliente_idCliente"),
                        rs.getString("Transaccion_idTransaccion"));
            }
            return pedi;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }     
    public Cliente buscarCli(String cod){
         try {
            Cliente cli = null;
            String sql = "Select * from cliente where idCliente = '"+cod+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                cli = new Cliente(
                        rs.getString("idCliente"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"));
            }
            return cli; 
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }    
    public Usuario buscarUsu(String cod){
         try {
            Usuario cli = null;
            String sql = "Select * from usuario where IdUsuario = '"+cod+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                cli = new Usuario(
                        rs.getString("IdUsuario"),
                        rs.getString("Nombre"),
                        rs.getString("Clave"));
            }
            return cli; 
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    //METODOS PARA ELIMINAR UN REGISTRO SELECCIONADO   
    public boolean deleteUpdate(Empresa emp){
        try {
            String sql = "Delete from empresa where idEmpresa = '"+emp.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    } 
    public boolean deleteUpdateSucursal(Sucursal suc){
        try {
            String sql = "Delete from sucursal where idSucursal = '"+suc.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }   
    public boolean deleteUpdateAsesor(Usuarios usu){
        try {
            String sql = "Delete from asesor where idAsesor = '"+usu.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }   
    public boolean deleteUpdateCliente(Cliente cli){
        try {
            String sql = "Delete from cliente where idCliente = '"+cli.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    public boolean deleteUpdateUsuario(Usuario emp){
        try {
            String sql = "Delete from usuario where IdUsuario = '"+emp.getId()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }    
    public boolean deleteUpdatePedido(pedido pedi){
        try {
            String sql = "Delete from pedido where idPedido = '"+pedi.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }   
    public boolean deleteUpdateTransaccion(Transaccion tran){
        try {
            String sql = "Delete from transaccion where idTransaccion = '"+tran.getCodigo()+"'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
        
    
    //METODO PARA MOSTRAR UN REGISTRO ESPECIFICO
    public ResultSet buscarCliNom(String nombre){
         try {
            String sql = "Select * from cliente where Nombre = '"+nombre+"' or idCliente = '"+nombre+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    } 
    public ResultSet buscarRegistro(String fecha){
         try {
            String sql = "Select * from vista_pedidos where Fecha = '"+fecha+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    
    }   
    public ResultSet buscarConsulta(String ID){
         try {
            String sql = "SELECT * FROM consulta INNER JOIN pedido ON pedido.idPedido = consulta.Pedido_idPedido AND pedido.idPedido = '"+ID+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }    
    public ResultSet generarPDF(String fecha){
         try {
            String sql = "Select * from vista_pdf where Fecha = '"+fecha+"' order by idPedido ASC";
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    //METODOS PARA BUSCAR EL ID DE UN REGISTRO ESPECIFICO
    public String idsuc(String suc,String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT sucursal.idSucursal FROM sucursal INNER JOIN empresa "
                                    + "ON empresa.idEmpresa = sucursal.Empresa_idEmpresa "
                                    + "WHERE sucursal.Nombre = '"+suc+"' AND empresa.Nombre = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }   
    public String idEmpresa(String emp){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT idEmpresa FROM empresa "
                                    + "WHERE Nombre = '"+emp+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }     
    public String idAsesor(String suc,String ase){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT asesor.idAsesor FROM asesor INNER JOIN sucursal "
                                    + "ON sucursal.idSucursal = asesor.Sucursal_idSucursal "
                                    + "WHERE sucursal.Nombre = '"+suc+"' AND concat_ws(' ', asesor.Nombre, asesor.Apellido) = '"+ase+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }            
    public String idUSUARIO(String nom,String clav){
          try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("SELECT idUsuario FROM usuario WHERE Nombre = '"+nom+"' AND Clave = '"+clav+"'");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
    }
    public String telVendedor(String ase, String suc){
          try {
            String empNo;
            Statement stmt = conn.createStatement();
            ResultSet  rs = stmt.executeQuery("Select asesor.Telefono from asesor inner join sucursal "
                                    + "on sucursal.idSucursal = asesor.Sucursal_idSucursal "
                                    + "where concat_ws(' ', asesor.Nombre, asesor.Apellido) = '"+ase+"' and sucursal.Nombre = '"+suc+"'");
               
            while (rs.next()){  
                empNo = rs.getString(1);  
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
         return "...";
    }   
    
    
    //METODOS PARA BUSCAR Y MOSTRAR EL ULTIMO ID DEL REGISTRO EXISTENTE
    public String NoEmpresa(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idEmpresa) from empresa");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";
            
    }
    public String NoSucursal(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idSucursal) from sucursal");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }    
    public String NoAsesor(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idAsesor) from asesor");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }   
    public String NoCliente(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idCliente) from cliente");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }    
    public String NoPedido(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idPedido) from pedido");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }    
    public String NoConsulta(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(idConsulta) from consulta");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }    
    public String NoUsuario(){
       try {
            String empNo;    
            Statement stmt = conn.createStatement();     
            ResultSet rs = stmt.executeQuery("Select max(IdUsuario) from usuario");
            while (rs.next()) {  
                empNo = rs.getString(1);
                return empNo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
    }
          return "";        
    }
    
   
    //METODOS PARA LLENAR LOS CAMPOSCOMBINADOS CON LA INFORMACION DE LA BASE DE DATOS
    public void llenarAsesor(JComboBox combo, String suc, String emp){
         try {
            String sql = "Select asesor.Nombre,asesor.Apellido from asesor "
                    + "inner join sucursal "
                    + "on sucursal.idSucursal = asesor.Sucursal_idSucursal "
                    + "inner join empresa "
                    + "on empresa.idEmpresa = sucursal.Empresa_idEmpresa "
                    + "where sucursal.Nombre ='"+suc+"' and empresa.Nombre ='"+emp+"' order by asesor.idAsesor ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.removeAllItems();
            combo.addItem("Seleccione un Asesor...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre") + " "+ rs.getString("Apellido")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }       
    public void llenarCombobox(JComboBox combo){
        try {
            String sql = "Select Nombre from empresa";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.addItem("Seleccione una Empresa...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }    
    public void llenarSucursal(JComboBox combo, String emp){
         try {
            String sql = "Select sucursal.Nombre from sucursal right join empresa "
                    + "on empresa.idEmpresa = sucursal.Empresa_idEmpresa "
                    + "where empresa.Nombre ='"+emp+"' order by sucursal.idSucursal ASC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo.removeAllItems();
            combo.addItem("Seleccione una Sucursal...");
            while(rs.next())
            {
                combo.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
      
    
    //METODO PARA VALIDAR SI EL USUARIO A INGRESAR EXISTE Y CORRESPONDE CON SU CLAVE
    public boolean validarUsuario(String usuario, String clave){
        
    try {
        String sql = "select (1) from usuario where Nombre = '"+usuario+"' and clave = '"+clave+"'";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if(rs.next())
        {
            return true;
        }
        else
        {
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
    }
    
    
    //METODOS PARA EDITAR O MODIFICAR REGISTROS
    public boolean updateUsuario(Usuarios usu){ 
    try {
        String sql = "update asesor set Nombre = '"+usu.getNombre()+"',Apellido = '"+usu.getApellido()+"',Telefono = '"+usu.getTelefono()+"'"
                + "where idAsesor = '"+usu.getCodigo()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }    
    public boolean updateEmpresa(Empresa usu){ 
    try {
        String sql = "update empresa set Nombre = '"+usu.getNombre()+"' where idEmpresa = '"+usu.getCodigo()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }    
    public boolean updateSucursal(Sucursal usu){ 
    try {
        String sql = "update sucursal set Nombre = '"+usu.getNombre()+"', Empresa_idEmpresa = "+usu.getCodigoemp()+" where idSucursal = '"+usu.getCodigo()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }    
    public boolean updateCliente(Cliente usu){ 
    try {
        String sql = "update cliente set Nombre = '"+usu.getNombre()+"',Apellido = '"+usu.getApellido()+"',Telefono = '"+usu.getTelefono()+"',Direccion = '"+usu.getDireccion()+"'"
                + "where idCliente = '"+usu.getCodigo()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    } 
    public boolean updateUs(Usuario usu){ 
    try {
        String sql = "update usuario set Nombre='"+usu.getNombre()+"',Clave = '"+usu.getClave()+"' where idUsuario = '"+usu.getId()+"'";             
        Statement  st = conn.createStatement();
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        return true;
    }
}
