
package Formularios;

import Clases.Cliente;
import Clases.Conectar;
import Clases.Transaccion;
import Clases.pedido;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAIME_06
 */
public class RegistroPedido_Cliente extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    
    public RegistroPedido_Cliente() {
        this.setContentPane(fondo);
        initComponents();
        
    }
    private int bandera = 0;
    
    public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/FONDO BLANCO.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    //AGREGAR COLOR AL ENCABEZADO Y A LAS FILAS
    public boolean evaluarPar(int numero){
     return (numero % 2 == 0);//dividimos las filas en pares e impares
    }
    public class MiRender extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row, int column){
                super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
                if ( evaluarPar(row) ){//si la fila es impar la pintamos de un color claro
                    this.setBackground(new Color(239, 239, 239,239));//color de la fila
                    this.setForeground(new Color(109, 109, 109));//color de la letra 
                } else{//de lo contrario la fila la pintamos de un color mas oscuro
                    this.setBackground(new Color(204, 204, 204));
                    this.setForeground(new Color(109, 109, 109));
                }
                    return this;
            }
    }
    public void mostrarColor(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tbl2.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tbl2.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tbl2.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tbl2.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tbl2.getTableHeader().setFont(new Font("Roboto Condensed", Font.BOLD, 14));//Fuente del Encabezado
        tbl2.getTableHeader().setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevo2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        txtidCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbEmpresa = new javax.swing.JComboBox<>();
        cmbVendedor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbSucursal = new javax.swing.JComboBox<>();
        btnGuardar2 = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTelefonoVendedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        txtRegistro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuCrearUsuario = new javax.swing.JMenuItem();
        mnuCambiarUsuario = new javax.swing.JMenuItem();
        mnuCambiarClave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnNuevo2.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnNuevo2.setText("AÑADIR");
        btnNuevo2.setBorderPainted(false);
        btnNuevo2.setContentAreaFilled(false);
        btnNuevo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 190, -1));

        txtPedido.setColumns(20);
        txtPedido.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtPedido.setForeground(new java.awt.Color(129, 129, 129));
        txtPedido.setRows(5);
        txtPedido.setText("PEDIDO:");
        txtPedido.setToolTipText("");
        txtPedido.setName(""); // NOI18N
        jScrollPane1.setViewportView(txtPedido);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 690, 130));

        txtidCliente.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 60, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        txtNombre2.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 180, -1));

        btnCancelar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(109, 109, 109));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 460, 50, 50));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setText("APELLIDO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 100, -1));

        txtApellido2.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 180, -1));

        txtTelefono2.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 180, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(109, 109, 109));
        jLabel10.setText("TELEFONO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        txtLugar.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 180, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("DIRECCIÓN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        txtBuscarR.setFont(new java.awt.Font("Roboto Condensed", 0, 20)); // NOI18N
        txtBuscarR.setForeground(new java.awt.Color(109, 109, 109));
        txtBuscarR.setText("Buscar Registro");
        txtBuscarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarRMouseClicked(evt);
            }
        });
        txtBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarRActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 470, 250, -1));

        jLabel13.setBackground(new java.awt.Color(181, 181, 181));
        jLabel13.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(109, 109, 109));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ASIGNAR ASESOR");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 690, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText("EMPRESA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, -1, -1));

        cmbEmpresa.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        cmbEmpresa.setForeground(new java.awt.Color(129, 129, 129));
        cmbEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmpresaItemStateChanged(evt);
            }
        });
        cmbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 230, -1));

        cmbVendedor.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        cmbVendedor.setForeground(new java.awt.Color(129, 129, 129));
        cmbVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVendedorItemStateChanged(evt);
            }
        });
        cmbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(cmbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 230, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(109, 109, 109));
        jLabel11.setText("ASESOR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("SUCURSAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(109, 109, 109));
        jLabel12.setText("TELEFONO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        cmbSucursal.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        cmbSucursal.setForeground(new java.awt.Color(129, 129, 129));
        cmbSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSucursalItemStateChanged(evt);
            }
        });
        cmbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 230, -1));

        btnGuardar2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar2.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar2.setText("GUARDAR");
        btnGuardar2.setBorderPainted(false);
        btnGuardar2.setContentAreaFilled(false);
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        btnPDF.setBorderPainted(false);
        btnPDF.setContentAreaFilled(false);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 10, 630));

        btnBuscar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(109, 109, 109));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, 50, 50));

        jLabel1.setBackground(new java.awt.Color(181, 181, 181));
        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText(" ultimos registros");
        jLabel1.setMaximumSize(new java.awt.Dimension(255, 54));
        jLabel1.setMinimumSize(new java.awt.Dimension(255, 54));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 650, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(109, 109, 109));
        jLabel18.setText("DIRECCIÓN");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 280, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 109, 109));
        jLabel17.setText("TELEFONO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 280, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(109, 109, 109));
        jLabel16.setText("APELLIDO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, -1, -1));

        jLabel8.setBackground(new java.awt.Color(181, 181, 181));
        jLabel8.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText(" REGISTRAR pedido");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 690, -1));

        txtApellido.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 280, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(109, 109, 109));
        jLabel15.setText("NOMBRE");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 280, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(109, 109, 109));
        jLabel14.setText("CÓDIGO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 280, -1));

        btnNuevo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnNuevo.setText("AÑADIR");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        btnEditar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(109, 109, 109));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(109, 109, 109));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnBorrar.setText("ELIMINAR");
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 170, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 170, -1, -1));

        jLabel19.setBackground(new java.awt.Color(181, 181, 181));
        jLabel19.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(109, 109, 109));
        jLabel19.setText(" registrar cliente");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 650, -1));

        txtFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 150, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(109, 109, 109));
        jLabel20.setText("FECHA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        txtTelefonoVendedor.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefonoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 230, -1));

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "NOMBRE", "APELLIDO", "TELEFONO"
            }
        ));
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, 650, 210));

        txtRegistro.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, -1));

        jLabel21.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(109, 109, 109));
        jLabel21.setText("ID PEDIDO");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(54, 54, 54));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));
        jMenuBar1.setForeground(new java.awt.Color(54, 54, 54));

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        jMenu4.setText("INICIO");
        jMenu4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N

        mnuCrearUsuario.setBackground(new java.awt.Color(239, 239, 239));
        mnuCrearUsuario.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
        mnuCrearUsuario.setText("Crear Usuario");
        mnuCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCrearUsuario);

        mnuCambiarUsuario.setBackground(new java.awt.Color(239, 239, 239));
        mnuCambiarUsuario.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCambiarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CambiarUsuario.png"))); // NOI18N
        mnuCambiarUsuario.setText("Cambiar Usuario");
        mnuCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarUsuario);

        mnuCambiarClave.setBackground(new java.awt.Color(239, 239, 239));
        mnuCambiarClave.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CambiarClave.png"))); // NOI18N
        mnuCambiarClave.setText("Cambiar Clave");
        mnuCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarClaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarClave);
        jMenu1.add(jSeparator1);

        mnuSalir.setBackground(new java.awt.Color(239, 239, 239));
        mnuSalir.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda.png"))); // NOI18N
        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearUsuarioActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCrearUsuarioActionPerformed

    private void mnuCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarUsuarioActionPerformed
        Login f1 = new Login();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarUsuarioActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Ayuda f1 = new Ayuda();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Principal f1 = new Principal();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void cmbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpresaActionPerformed
    }//GEN-LAST:event_cmbEmpresaActionPerformed

    private void cmbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendedorActionPerformed
    }//GEN-LAST:event_cmbVendedorActionPerformed

    private void cmbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSucursalActionPerformed
    }//GEN-LAST:event_cmbSucursalActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bandera = 1;
        limpiar();
        NoCliente();
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre del Cliente");
            txtNombre.grabFocus();
            return;
        }
        if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Apellido del Cliente");
            txtApellido.grabFocus();
            return;
        }
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Telefono del Cliente");
            txtTelefono.grabFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Ingrese la Direccion del Cliente");
            txtDireccion.grabFocus();
            return;
        }
        
        Conectar co = new Conectar();       
        Cliente miCliente = new Cliente(
            txtCodigo.getText(),
            txtNombre.getText(),
            txtApellido.getText(),
            txtTelefono.getText(),        
            txtDireccion.getText());
          
        if(bandera == 1){
        if(!co.insertCliente(miCliente))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro el Cliente :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Cliente Agregado Correctamente :D");
        }
        if(bandera == 2){
        if(!co.updateCliente(miCliente))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Actualizo el Cliente :(");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Cliente Actualizado Correctamente :D");
        }
        llenarTabla();
        co.cerrarConexion();
        limpiar();        
        bloquear();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el ID del Cliente");
            txtCodigo.setEnabled(true);
            txtCodigo.grabFocus();
            return;
        }
        int res = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar al Cliente?");
        if(res != 0)
        {
            return;
        }
       
        Conectar co = new Conectar();
        Cliente cli = co.getCliente(txtCodigo.getText());
        
        if(cli == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Cliente no Existe");
            txtCodigo.setText("");
            txtCodigo.grabFocus();
            co.cerrarConexion();
            return;
        }
        if(co.deleteUpdateCliente(cli))
        {
            JOptionPane.showMessageDialog(rootPane,"Cliente Eliminado Correctectamente");          
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"ERROR Cliente NO eliminado");         
        }
        limpiar();
        llenarTabla();
        co.cerrarConexion(); 
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bloquear();
        NoCliente();
        bandera = 1;
        llenarTabla();
        String timeStamp = new SimpleDateFormat("yyyy-MM-d").format(Calendar.getInstance().getTime());
        txtFecha.setText(timeStamp);
        Conectar co = new Conectar();   
        co.llenarCombobox(cmbEmpresa);
        bloquear2();
        NoPedido();
        mostrarColor();
        co.cerrarConexion();
    }//GEN-LAST:event_formWindowOpened

    private void btnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo2ActionPerformed
        NoPedido();
        desbloquear();
        limpiar2();
    }//GEN-LAST:event_btnNuevo2ActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        if(txtNombre2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane,"Seleccione un Cliente de la Tabla");
                txtBuscarR.grabFocus();
                return;
            }
            if(cmbEmpresa.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(rootPane,"Seleccione una Empresa");
                txtBuscarR.grabFocus();
                return;
            }
             if(cmbSucursal.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(rootPane,"Seleccione una Empresa");
                txtBuscarR.grabFocus();
                return;
            }
              if(cmbVendedor.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(rootPane,"Seleccione una Empresa");
                txtBuscarR.grabFocus();
                return;
            }
            
            String suc = (String) cmbSucursal.getSelectedItem();
            String emp = (String) cmbEmpresa.getSelectedItem();
            String ase = (String) cmbVendedor.getSelectedItem();
              
            pedido pedi = new pedido(
            txtRegistro.getText(),
            txtFecha.getText(),
            txtPedido.getText(),
            txtidCliente.getText(),
            txtRegistro.getText()); 
            
            Conectar co = new Conectar();
            Transaccion tran = new Transaccion(
                    txtRegistro.getText(),
                    Integer.parseInt(co.idAsesor(suc, ase)),
                    Integer.parseInt(co.idsuc(suc, emp)),
                    Integer.parseInt(co.idEmpresa(emp)));
            
            if(!co.insertPedido(pedi))
            {
            JOptionPane.showMessageDialog(rootPane,"No se Registro el Pedido :(");
            return;
            }
            JOptionPane.showMessageDialog(rootPane,"Pedido Agregado Correctamente :D"); 
            if(!co.insertTransaccion(tran))
            {
                JOptionPane.showMessageDialog(rootPane,"No se Registro La Transaccion :(");
                return;
            }
            
            JOptionPane.showMessageDialog(rootPane,"Transaccion Agregada Correctamente :D");
            co.cerrarConexion();
            
            btnGuardar2.setEnabled(false);

            bloquear2();
            btnPDF.setEnabled(true);
            btnNuevo2.setEnabled(false);
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        PDF();
        JOptionPane.showMessageDialog(rootPane,"Archivo PDF guardado con Exito");
        bloquear2();  
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtBuscarR.getText();
       if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre del Cliente");
            txtBuscarR.grabFocus();
            return;
        }
        llenarTablaNombre(nombre);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        llenarTabla();
        limpiar2();
                
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmpresaItemStateChanged
        Conectar co = new Conectar();
        String emp = (String) cmbEmpresa.getSelectedItem();
        co.llenarSucursal(cmbSucursal,emp); 
        co.cerrarConexion(); 
    }//GEN-LAST:event_cmbEmpresaItemStateChanged

    private void cmbSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSucursalItemStateChanged
         Conectar co = new Conectar();
        String suc = (String) cmbSucursal.getSelectedItem();
        String emp = (String) cmbEmpresa.getSelectedItem();
        co.llenarAsesor(cmbVendedor,suc,emp); 
        co.cerrarConexion(); 
    }//GEN-LAST:event_cmbSucursalItemStateChanged

    private void cmbVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVendedorItemStateChanged
        Conectar co = new Conectar();
        String suc = (String) cmbSucursal.getSelectedItem();
        String ase = (String) cmbVendedor.getSelectedItem();
    
        txtTelefonoVendedor.setText(co.telVendedor(ase, suc));
        co.cerrarConexion();
    }//GEN-LAST:event_cmbVendedorItemStateChanged

    private void txtBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarRActionPerformed
    }//GEN-LAST:event_txtBuscarRActionPerformed

    private void txtBuscarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarRMouseClicked
       txtBuscarR.setText("");
    }//GEN-LAST:event_txtBuscarRMouseClicked

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
         int pos=tbl2.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbl2.getValueAt(pos,0)));
        txtNombre.setText(String.valueOf(tbl2.getValueAt(pos,1)));
        txtApellido.setText(String.valueOf(tbl2.getValueAt(pos,2)));
        txtTelefono.setText(String.valueOf(tbl2.getValueAt(pos,3)));
        txtDireccion.setText(String.valueOf(tbl2.getValueAt(pos,4)));
        txtidCliente.setText(String.valueOf(tbl2.getValueAt(pos,0)));
        txtNombre2.setText(String.valueOf(tbl2.getValueAt(pos,1)));
        txtApellido2.setText(String.valueOf(tbl2.getValueAt(pos,2)));
        txtTelefono2.setText(String.valueOf(tbl2.getValueAt(pos,3)));
        txtLugar.setText(String.valueOf(tbl2.getValueAt(pos,4)));
    }//GEN-LAST:event_tbl2MouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnEditar.setEnabled(false);
        bandera = 2;
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void NoCliente(){
        Conectar co = new Conectar();
        String NoEmp = co.NoCliente();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
    }
    
    private void limpiar(){
            
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtNombre.grabFocus();
    }
    
    private void bloquear(){
            txtCodigo.setEnabled(false);
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            txtTelefono.setEnabled(false);
            txtDireccion.setEnabled(false);
            btnNuevo.setEnabled(true);
            btnEditar.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnBorrar.setEnabled(true);  
            btnBuscar.setEnabled(true);
    }

    private void limpiar2(){
        txtPedido.grabFocus();
        txtNombre2.setText("");
        txtApellido2.setText("");
        txtTelefono2.setText("");
        txtPedido.setText("");
        txtLugar.setText("");
        txtidCliente.setText("");
        cmbEmpresa.setSelectedIndex(0);
        cmbSucursal.setSelectedIndex(0);
        cmbVendedor.setSelectedIndex(0);
        txtTelefonoVendedor.setText("");   
    }
    
    private void bloquear2(){
        txtBuscarR.grabFocus();
        txtRegistro.setEnabled(false);
        txtFecha.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido2.setEditable(false);
        txtTelefono2.setEditable(false);
        txtLugar.setEditable(false);
        txtPedido.setEnabled(false);
        cmbEmpresa.setEnabled(false);
        cmbSucursal.setEnabled(false);
        cmbVendedor.setEnabled(false);
        txtTelefonoVendedor.setEditable(false);
        btnGuardar2.setEnabled(false);
        btnPDF.setEnabled(false);
        btnNuevo2.setEnabled(true);
        txtidCliente.setEditable(false);
        txtFecha.setEnabled(false);
    }

    private void desbloquear(){ 
        txtFecha.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido2.setEditable(false);
        txtTelefono2.setEditable(false);
        txtLugar.setEditable(false);
        txtPedido.setEnabled(true);
        cmbEmpresa.setEnabled(true);
        cmbSucursal.setEnabled(true);
        cmbVendedor.setEnabled(true);
        txtTelefonoVendedor.setEditable(false);
        btnGuardar2.setEnabled(true);
        btnPDF.setEnabled(false);
        btnNuevo2.setEnabled(false);
        txtidCliente.setEditable(false);
        txtFecha.setEditable(false);
    }
     
    private void NoPedido(){
        Conectar co = new Conectar();
        String NoEmp = co.NoPedido();
    
        if(NoEmp==null){
            txtRegistro.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtRegistro.setText("000"+increment);
        }
    }
    
    private DefaultTableModel Tabla;
    
    private void llenarTabla(){
        try {
            String titulo[] = {"id","Nombre","Apellido","Telefono","Direccion"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 5){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[5];
            Conectar co = new Conectar();
            ResultSet rs = co.getCliente();
            while(rs.next())
            {
                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                Tabla.addRow(registros);
            }
            tbl2.setModel(Tabla);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPedido_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void llenarTablaNombre(String nombre){
        try {       
            String titulo[] = {"id","Nombre","Apellido","Telefono","Direccion"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                   if(columnas == 5){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[5];
            Conectar co = new Conectar();
            ResultSet rs = co.buscarCliNom(nombre);
            while(rs.next())
            {
                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Direccion");
                Tabla.addRow(registros);
            }
            tbl2.setModel(Tabla);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPedido_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    private void PDF(){
     try{
            Rectangle pageSize = new Rectangle( 600f, 550f); //ancho y alto
            Conectar co = new Conectar();
            String id =  co.NoPedido();
            FileOutputStream archivo;
            File file = new File("C:\\SISTEMA REGISTRO\\PEDIDOS\\Registro "+id+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            //ENCABEZADO
            Image img = Image.getInstance("src/Imagenes/Grupo comasar color.png");
            Paragraph fecha = new Paragraph();
            BaseColor rgb = new BaseColor(191,12,17);
            com.itextpdf.text.Font negrita = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER , 20, com.itextpdf.text.Font.BOLD, BaseColor.WHITE);
            com.itextpdf.text.Font negrita2 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 16, com.itextpdf.text.Font.BOLD, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("REGISTRO No. "+id+"\n"+"Fecha: "+ new SimpleDateFormat("yyyy-MM-dd").format(date)+"\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f,30f,70f,40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);
            
            String nom = "GRUPO COMAR.S.A.";
            String ub = "Oficina Central Coban";
            String tel = "7951-0472";
            String dir = "Diagonal 3 11-02 Zona 02";
            
            Encabezado.addCell("");
            Encabezado.addCell(""+nom+ "\n"+ub+ "\n"+tel+ "\n"+dir);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            //DATOS CLIENTE     
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("\n\n");
            doc.add(cli);
            
            PdfPTable par1 = new PdfPTable(1);
            par1.setWidthPercentage(100);      
            PdfPCell dt1 = new PdfPCell(new Phrase("DATOS CLIENTE\n",negrita));
            dt1.setHorizontalAlignment(Element.ALIGN_CENTER);
            dt1.setBackgroundColor(rgb);
            par1.addCell(dt1);
            doc.add(par1);
            
            PdfPTable tablacli = new PdfPTable(3);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{33.33f, 33.33f, 33.33f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl1 = new PdfPCell(new Phrase("\n\nNombre:",negrita2));
            PdfPCell cl2 = new PdfPCell(new Phrase("\n\nApellido:",negrita2));
            PdfPCell cl3 = new PdfPCell(new Phrase("\n\nTelefono",negrita2));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(txtNombre2.getText());
            tablacli.addCell(txtApellido2.getText());
            tablacli.addCell(txtTelefono2.getText());
            doc.add(tablacli);
            
            PdfPTable tablacli2 = new PdfPTable(2);
            tablacli2.setWidthPercentage(100);
            tablacli2.getDefaultCell().setBorder(0);
            float[] Columnacli2 = new float[]{33.33f, 66.66f};
            tablacli2.setWidths(Columnacli2);
            tablacli2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl11 = new PdfPCell(new Phrase("\n\nDireccion:",negrita2));
            PdfPCell cl22 = new PdfPCell(new Phrase("\n\nPedido:",negrita2));
            cl11.setBorder(0);
            cl22.setBorder(0);
            tablacli2.addCell(cl11);
            tablacli2.addCell(cl22);
            tablacli2.addCell(txtLugar.getText());
            tablacli2.addCell(txtPedido.getText());
            doc.add(tablacli2);
            
            //DATOS ASESOR    
            Paragraph ase = new Paragraph();
            ase.add(Chunk.NEWLINE);
            ase.add("\n\n");
            doc.add(ase);
            
            PdfPTable par2 = new PdfPTable(1);
            par2.setWidthPercentage(100);      
            PdfPCell dt2 = new PdfPCell(new Phrase("DATOS ASESOR\n",negrita));
            dt2.setHorizontalAlignment(Element.ALIGN_CENTER);
            dt2.setBackgroundColor(rgb);
            par2.addCell(dt2);
            doc.add(par2);
            
            PdfPTable tablaAse = new PdfPTable(3);
            tablaAse.setWidthPercentage(100);
            tablaAse.getDefaultCell().setBorder(0);
            float[] ColumnaAse = new float[]{33.33f, 33.33f, 33.33f};
            tablaAse.setWidths(ColumnaAse);
            tablaAse.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cla = new PdfPCell(new Phrase("\n\nAsesor Asignado:",negrita2));
            PdfPCell cla2 = new PdfPCell(new Phrase("\n\nEmpresa:",negrita2));
            PdfPCell cla3 = new PdfPCell(new Phrase("\n\nTelefono",negrita2));
            cla.setBorder(0);
            cla2.setBorder(0);
            cla3.setBorder(0);
            tablaAse.addCell(cla);
            tablaAse.addCell(cla2);
            tablaAse.addCell(cla3);
            tablaAse.addCell(String.valueOf(cmbVendedor.getSelectedItem()));
            tablaAse.addCell(String.valueOf(cmbEmpresa.getSelectedItem()));
            tablaAse.addCell(txtTelefonoVendedor.getText());
            doc.add(tablaAse);
            //CERRAR PDF
            doc.close();
            archivo.close();
        } catch(DocumentException | IOException e){
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo2;
    private javax.swing.JButton btnPDF;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JComboBox<String> cmbSucursal;
    private javax.swing.JComboBox<String> cmbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscarR;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextArea txtPedido;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefonoVendedor;
    private javax.swing.JTextField txtidCliente;
    // End of variables declaration//GEN-END:variables
}
