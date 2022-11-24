package Formularios;

import Clases.Conectar;
import Clases.consulta;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAIME_06
 */
public class Consulta extends javax.swing.JFrame {

    
    ImagenFondo fondo = new ImagenFondo();
    public Consulta() {
       this.setContentPane(fondo);
       UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
            new Login.CustomeBorder(), 
            new EmptyBorder(new Insets(8,10,4,4))));
        initComponents();
        txtNombre.setOpaque(false);
        txtAsesor.setOpaque(false);
        txtTelefono.setOpaque(false);
        txtAsesorTel.setOpaque(false);
        
    }
    
    private int bandera = 0;
    
    //AGREGAR IMAGEN DE FONDO 
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
                    this.setBackground(new Color(181, 181, 181, 181));
                    this.setForeground(new Color(109, 109, 109));
                }
                    return this;
            }
    }
    public void mostrarColor(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tblFecha.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tblFecha.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tblFecha.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tblFecha.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        //tblFecha.getTableHeader().setFont(new Font("Roboto Condensed", Font.BOLD, 14));//Fuente del Encabezado
        tblFecha.getTableHeader().setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFecha = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAsesor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAsesorTel = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        LblTablaPedidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        rdbSi1 = new javax.swing.JRadioButton();
        rdbNo1 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnConsultasRealizadas = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        cmbFecha = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 109, 109));
        jLabel1.setText("consultar registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        tblFecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tblFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID PEDIDO", "FECHA", "NOMBRE", "APELLIDO", "TELEFONO", "DESCRIPCION", "ASESOR", "APELLIDO", "TELEFONO"
            }
        ));
        tblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFechaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblFecha);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 1430, 200));

        jLabel22.setBackground(new java.awt.Color(181, 181, 181));
        jLabel22.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(109, 109, 109));
        jLabel22.setText(" cliente");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 460, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 280, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(109, 109, 109));
        jLabel10.setText("TELEFONO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 280, -1));

        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(null);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 378, 100, -1));

        jSeparator4.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 10, 150));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 40));

        jLabel21.setBackground(new java.awt.Color(181, 181, 181));
        jLabel21.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(109, 109, 109));
        jLabel21.setText("asesor");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 460, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText("NOMBRE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        txtAsesor.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 280, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText("TELEFONO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        txtAsesorTel.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtAsesorTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 280, -1));

        jSeparator5.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, 10, 150));

        jLabel19.setBackground(new java.awt.Color(181, 181, 181));
        jLabel19.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(109, 109, 109));
        jLabel19.setText("PEDIDO");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 400, -1));

        txtPedido.setColumns(20);
        txtPedido.setRows(5);
        txtPedido.setOpaque(false);
        jScrollPane2.setViewportView(txtPedido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 430, 400, 90));

        jLabel20.setBackground(new java.awt.Color(181, 181, 181));
        jLabel20.setFont(new java.awt.Font("BigNoodleTitling", 0, 40)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(109, 109, 109));
        jLabel20.setText("RESPUESTA DEL CLIENTE");
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 460, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(109, 109, 109));
        jLabel16.setText("No.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        txtNumero.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setBorder(null);
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 80, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(109, 109, 109));
        jLabel23.setText("Fecha");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, -1, -1));

        txtFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(null);
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 120, -1));

        LblTablaPedidos.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        LblTablaPedidos.setForeground(new java.awt.Color(109, 109, 109));
        LblTablaPedidos.setText("TABLA DE PEDIDOS");
        jPanel1.add(LblTablaPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane1.setViewportView(txtComentario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 900, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 109, 109));
        jLabel17.setText("Atendido");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));

        rdbSi.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbSi.setForeground(new java.awt.Color(109, 109, 109));
        rdbSi.setText("SI");
        rdbSi.setBorder(null);
        rdbSi.setContentAreaFilled(false);
        rdbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSiActionPerformed(evt);
            }
        });
        jPanel1.add(rdbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 40, 30));

        rdbNo.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbNo.setForeground(new java.awt.Color(109, 109, 109));
        rdbNo.setText("NO");
        rdbNo.setContentAreaFilled(false);
        rdbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoActionPerformed(evt);
            }
        });
        jPanel1.add(rdbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 50, 30));

        jLabel24.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(109, 109, 109));
        jLabel24.setText("Adquirio");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, -1, -1));

        rdbSi1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbSi1.setForeground(new java.awt.Color(109, 109, 109));
        rdbSi1.setText("SI");
        rdbSi1.setContentAreaFilled(false);
        rdbSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSi1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdbSi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 620, 40, 30));

        rdbNo1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        rdbNo1.setForeground(new java.awt.Color(109, 109, 109));
        rdbNo1.setText("NO");
        rdbNo1.setContentAreaFilled(false);
        rdbNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdbNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 620, 50, 30));

        jSeparator3.setForeground(new java.awt.Color(109, 109, 109));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 10, 180));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 610, -1, -1));

        btnConsultasRealizadas.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnConsultasRealizadas.setForeground(new java.awt.Color(109, 109, 109));
        btnConsultasRealizadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VER.png"))); // NOI18N
        btnConsultasRealizadas.setText("Consultas Finalizadas");
        btnConsultasRealizadas.setBorderPainted(false);
        btnConsultasRealizadas.setContentAreaFilled(false);
        btnConsultasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasRealizadasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultasRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 660, -1, -1));

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 10.png"))); // NOI18N
        btnPDF.setBorderPainted(false);
        btnPDF.setContentAreaFilled(false);
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 710, -1, -1));

        cmbFecha.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(cmbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));

        jLabel25.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(109, 109, 109));
        jLabel25.setText("COMENTARIO");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, 50));

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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 610, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(109, 109, 109));
        jLabel18.setText("Buscar Registros");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Selecione un registro de la tabla");
            txtID.grabFocus();
            return;
        }
        if(rdbSi.isSelected() == false && rdbNo.isSelected() == false) 
        {
            JOptionPane.showMessageDialog(rootPane,"Debe selecionar Si o No");
            return;
        }
          if(rdbSi1.isSelected() == false && rdbNo1.isSelected() == false) 
        {
            JOptionPane.showMessageDialog(rootPane,"Debe selecionar Si o No");
            return;
        }
        if(txtComentario.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Comentario");
            txtComentario.grabFocus();
            return;
        }
        
        Conectar co = new Conectar();
        
        consulta cons = new consulta(txtNumero.getText(), respuestaAtencion(),
                                    txtID.getText(), txtFecha.getText(),
                                    respuestaAdquirido(), txtComentario.getText());
        
        if(!co.insertConsulta(cons))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Registro la Consulta :(");
            co.cerrarConexion();
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Consulta Registrada con Exito :D"); 
        co.cerrarConexion();
        
        rdbSi.setEnabled(false);
        rdbNo.setEnabled(false);
        rdbSi1.setEnabled(false);
        rdbNo1.setEnabled(false);
        txtComentario.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasRealizadasActionPerformed
        if(cmbFecha.getDate() == null)
        {   
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una fecha ");
            return;
        }
        bandera=2;
        LblTablaPedidos.setText("TABLA CONSULTAS REALIZADAS");
        Date fecha = cmbFecha.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha);
        LLENARPDF(fecha2);
    }//GEN-LAST:event_btnConsultasRealizadasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(cmbFecha.getDate() == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una Fecha");
            cmbFecha.grabFocus();
            return;
        }
        bandera = 1;
        Date  fecha=cmbFecha.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-d");
        String fecha2=f.format(fecha); 
        llenarTablaFecha(fecha2);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String timeStamp = new SimpleDateFormat("yyyy-MM-d").format(Calendar.getInstance().getTime());
        txtFecha.setText(timeStamp);
        bandera = 1;
        llenarTabla();
        bloquear();
        mostrarColor();
        NoPedido();
    }//GEN-LAST:event_formWindowOpened

    private void tblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFechaMouseClicked
        if(bandera == 1){
            int pos=tblFecha.rowAtPoint(evt.getPoint());
            txtID.setText(String.valueOf(tblFecha.getValueAt(pos, 0)));
            txtNombre.setText(String.valueOf(tblFecha.getValueAt(pos,2))+  tblFecha.getValueAt(pos,3));
            txtTelefono.setText(String.valueOf(tblFecha.getValueAt(pos,4)));
            txtPedido.setText(String.valueOf(tblFecha.getValueAt(pos,5)));
            txtAsesor.setText(String.valueOf(tblFecha.getValueAt(pos,6))+  tblFecha.getValueAt(pos,7));
            txtAsesorTel.setText(String.valueOf(tblFecha.getValueAt(pos,8)));
        }
        if(bandera == 2){
            int pos=tblFecha.rowAtPoint(evt.getPoint());
            txtID.setText(String.valueOf(tblFecha.getValueAt(pos,0)));
            txtNombre.setText(String.valueOf(tblFecha.getValueAt(pos,2)));
            txtAsesor.setText(String.valueOf(tblFecha.getValueAt(pos,3)));
            txtPedido.setText("");
            txtComentario.setText(String.valueOf(tblFecha.getValueAt(pos,6)));
        }
        
    }//GEN-LAST:event_tblFechaMouseClicked

    private void rdbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSiActionPerformed
        if(rdbSi.isSelected())
        {
           rdbNo.setSelected(false);
        }
    }//GEN-LAST:event_rdbSiActionPerformed

    private void rdbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoActionPerformed
        if(rdbNo.isSelected())
        {
           rdbSi.setSelected(false);
        }
    }//GEN-LAST:event_rdbNoActionPerformed

    private void rdbSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSi1ActionPerformed
        if(rdbNo1.isSelected())
        {
           rdbSi1.setSelected(false);
        }
    }//GEN-LAST:event_rdbSi1ActionPerformed

    private void rdbNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNo1ActionPerformed
        if(rdbSi1.isSelected())
        {
           rdbNo1.setSelected(false);
        }
    }//GEN-LAST:event_rdbNo1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        NoPedido();
        rdbSi.setEnabled(true);
        rdbNo.setEnabled(true);
        rdbSi1.setEnabled(true);
        rdbNo1.setEnabled(true);
        txtComentario.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        limpiar(); 
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        if(cmbFecha.getDate() == null)
        {
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar una Fecha");
            cmbFecha.grabFocus();
            return;
        }
        PDF();
        JOptionPane.showMessageDialog(rootPane,"Archivo PDF guardado con Exito");
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        llenarTabla();
        LblTablaPedidos.setText("TABLA DE PEDIDOS");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void limpiar(){
        txtComentario.setText("");
        rdbSi.setSelected(false);
        rdbNo.setSelected(false);
        rdbSi1.setSelected(false);
        rdbNo1.setSelected(false);  
    }
      
    private void bloquear(){
        txtID.setEditable(false);
        txtNombre.setEditable(false);
        txtNombre.setEditable(false);
        txtTelefono.setEditable(false);
        txtPedido.setEditable(false);
        txtAsesor.setEditable(false);
        txtAsesorTel.setEditable(false);
        txtNumero.setEditable(false);
        txtFecha.setEditable(false);
        rdbSi.setEnabled(false);
        rdbNo.setEnabled(false);
        rdbSi1.setEnabled(false);
        rdbNo1.setEnabled(false);
        txtComentario.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
       
    private DefaultTableModel Tabla;
    
    private void llenarTabla(){
        try {
            String titulo[] = {"id Pedido","Fecha","Nombre","Apellido","Telefono","Descripcion","Asesor","Apellido","Telefono"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 9){
                       return true;
                    }else{
                       return false;
                    }
                }                
            };
            String registros[] = new String[9];
            Conectar co = new Conectar();
            ResultSet rs = co.mostrarRegistros();
            while(rs.next())
            {
                registros[0] = rs.getString("idPedido");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Descripcion");
                registros[6] = rs.getString("Asesor");
                registros[7] = rs.getString("Asesor_Apellido");
                registros[8] = rs.getString("Asesor_Tel");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/d");
    
    public String getFecha(JDateChooser jd){
        if(jd.getDate()!=null)
        {
            return formato.format(jd.getDate());
        }
        return null;
    }
   
    private void llenarTablaFecha(String fecha){
        try {
            String titulo[] = {"id Pedido","Fecha","Nombre","Apellido","Telefono","Descripcion","Asesor","Apellido","Telefono"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                   if(columnas == 9){
                       return true;
                   }else{
                       return false;
                   }
                }                
            };
            String registros[] = new String[9];
            Conectar co = new Conectar();
            ResultSet rs = co.buscarRegistro(fecha);
            System.out.println(fecha);
            while(rs.next())
            {
                registros[0] = rs.getString("idPedido");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Apellido");
                registros[4] = rs.getString("Telefono");
                registros[5] = rs.getString("Descripcion");
                registros[6] = rs.getString("Asesor");
                registros[7] = rs.getString("Asesor_Apellido");
                registros[8] = rs.getString("Asesor_Tel");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
           
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void LLENARPDF(String fecha){
        try {
            String titulo[] = {"Pedido","Fecha","Cliente","Asesor","Atencion","Adquiro","Comentario"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 7){
                        return true;
                    }else{
                        return false;
                    }
                }                
            };
            String registros[] = new String[7];
            Conectar co = new Conectar();
            ResultSet rs = co.generarPDF(fecha);
            System.out.println(fecha);
            while(rs.next())
            {
                registros[0] = rs.getString("idPedido");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Cliente");
                registros[3] = rs.getString("Asesor");
                registros[4] = rs.getString("Fue_Atendido");
                registros[5] = rs.getString("Adquirio");
                registros[6] = rs.getString("Comentario");
                Tabla.addRow(registros);
            }
            tblFecha.setModel(Tabla);
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String respuestaAtencion(){

           if(rdbSi.isSelected()==true){
               String SiActivo = rdbSi.getText();
               return SiActivo;
           }
           if(rdbNo.isSelected()==true){
               String NoActivo = rdbNo.getText();
               return NoActivo;
           }
           return "";
       }

    private String respuestaAdquirido(){

            if(rdbSi1.isSelected()==true){
                String SiActivo = rdbSi1.getText();
                return SiActivo;
            }
            if(rdbNo1.isSelected()==true){
                String NoActivo = rdbNo1.getText();
                return NoActivo;
            }
            return "";
       }
    
    private void NoPedido(){
            Conectar co = new Conectar();
            String NoEmp = co.NoConsulta();

            if(NoEmp==null){
                txtNumero.setText("001");
            }
            else{
                int increment = Integer.parseInt(NoEmp);
                increment = increment + 1;
                txtNumero.setText("00"+increment);
            }
            co.cerrarConexion();
       }
    
    private void PDF() {
     try{   
            Date fecha1 = cmbFecha.getDate();
            DateFormat f = new SimpleDateFormat("yyyy-MM-d");
            String fecha2 =  f.format(fecha1);
           
            FileOutputStream archivo;
            File file = new File("C:\\SISTEMA REGISTRO\\REPORTE DIARIO\\Consulta dia "+fecha2+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            //ENCABEZADO
            Image img = Image.getInstance("src/Imagenes/Grupo comasar color.png");
            Paragraph fecha = new Paragraph();
            BaseColor rgb = new BaseColor(191,12,17);
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.WHITE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("CONSULTA No. 1 "+"Fecha: "+ new SimpleDateFormat("yyyy-MM-dd").format(date)+"\n\n");
            
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
            Encabezado.addCell("Nombre: "+nom+ "\nUbicacion: "+ub+ "\nTelefono: "+tel+ "\nDireccion: "+dir);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
      
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("\n");
            doc.add(cli);  
            PdfPTable tablacli = new PdfPTable(7);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{8f,8f, 15f, 15f, 8f, 8f, 30f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl1 = new PdfPCell(new Phrase("\nConsulta",negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("\nPedido",negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("\nCliente",negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("\nAsesor",negrita));
            PdfPCell cl5 = new PdfPCell(new Phrase("\nFue Atendido",negrita));
            PdfPCell cl6 = new PdfPCell(new Phrase("\nAdquirio",negrita));
            PdfPCell cl7 = new PdfPCell(new Phrase("\nComentario",negrita));          
            cl7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cl1.setBackgroundColor(rgb);
            cl2.setBackgroundColor(rgb);
            cl3.setBackgroundColor(rgb);
            cl4.setBackgroundColor(rgb);
            cl5.setBackgroundColor(rgb);
            cl5.setBackgroundColor(rgb);
            cl6.setBackgroundColor(rgb);
            cl7.setBackgroundColor(rgb);
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl4);
            tablacli.addCell(cl5);
            tablacli.addCell(cl6);
            tablacli.addCell(cl7);  
            Conectar co = new Conectar();
            ResultSet rs = co.generarPDF(fecha2);
            try { 
                while(rs.next())
                {               
                    PdfPCell celda1 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda2 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda3 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda4 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda5 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda6 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    PdfPCell celda7 = new PdfPCell(new Paragraph("",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED)));
                    tablacli.addCell(celda1);
                    tablacli.addCell(celda2);
                    tablacli.addCell(celda3);
                    tablacli.addCell(celda4);
                    tablacli.addCell(celda5);
                    tablacli.addCell(celda6);
                    tablacli.addCell(celda7);                                               
                    tablacli.addCell(rs.getString("idConsulta"));
                    tablacli.addCell(rs.getString("idPedido"));
                    tablacli.addCell(rs.getString("Cliente"));
                    tablacli.addCell(rs.getString("Asesor"));
                    tablacli.addCell(rs.getString("Fue_Atendido"));
                    tablacli.addCell(rs.getString("Adquirio"));
                    tablacli.addCell(rs.getString("Comentario"));       
                 }           
                           
            } catch (SQLException ex) {
             Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            co.cerrarConexion();
            doc.add(tablacli);      
            Document documento = new Document(PageSize.A4,10,10,10,10);        
            documento.open();
            img = Image.getInstance("src/Imagenes/Mangueras Hidraulicas color.png");
            img.scalePercent(75f);
            img.setAlignment(Element.ALIGN_LEFT);
            documento.add(img);
            //CERRAR PDF
            doc.close();
            archivo.close();
        } catch(DocumentException | IOException e){
        }      
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTablaPedidos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultasRealizadas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPDF;
    private com.toedter.calendar.JDateChooser cmbFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbNo1;
    private javax.swing.JRadioButton rdbSi;
    private javax.swing.JRadioButton rdbSi1;
    private javax.swing.JTable tblFecha;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtAsesorTel;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtPedido;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
