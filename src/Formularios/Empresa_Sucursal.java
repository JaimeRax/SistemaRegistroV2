
package Formularios;

import Clases.Conectar;
import Clases.Empresa;
import Clases.Sucursal;
import Clases.Usuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Empresa_Sucursal extends javax.swing.JFrame {

  
    ImagenFondo fondo = new ImagenFondo();
    public Empresa_Sucursal() {
        this.setContentPane(fondo);
        initComponents();   
    }
    
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
                    this.setBackground(new Color(204, 204, 204, 204));
                    this.setForeground(new Color(109, 109, 109));
                }
                    return this;
            }
    }
    public void mostrarColor(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tbl1.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tbl1.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tbl1.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tbl1.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tbl1.getTableHeader().setFont(new Font("Roboto Condensed", Font.BOLD, 14));//Fuente del Encabezado
        tbl1.getTableHeader().setOpaque(false);
    }
    public void mostrarColor2(){
        MiRender col = new MiRender();//instanciamos la clase MiRender
        for(int i =0;i<tbl2.getColumnCount();i++){//ciclo para recorer todas las filas de la tabla
            tbl2.getColumnModel().getColumn(i).setCellRenderer(col);//asignamos el color con la clase MiRender
        }
        tbl2.getTableHeader().setBackground(new Color(109, 109, 109));//Agregamos color al fondo del Encabezado
        tbl2.getTableHeader().setForeground(new Color(255, 255, 255 ));//Color a la letra del Encabezado
        tbl2.getTableHeader().setFont(new Font("Roboto Condensed", Font.BOLD, 14));//Fuente del Encabezado
        tbl2.getTableHeader().setOpaque(false);
    }
 
    public int bandera  = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoSucursal = new javax.swing.JTextField();
        txtNombreSucursal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        txtSucursalEmpresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
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
        jLabel1.setText("REGISTRAR EMPRESA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

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
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 109, 109));
        jLabel2.setText("CÓDIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 260, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        txtNombreEmpresa.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 260, -1));

        tbl1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID EMPRESA", "NOMBRE EMPRESA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 1080, 100));

        jLabel4.setFont(new java.awt.Font("BigNoodleTitling", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("REGISTRAR SUCURSAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        btnNuevo1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(109, 109, 109));
        btnNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnNuevo1.setText("AÑADIR");
        btnNuevo1.setBorderPainted(false);
        btnNuevo1.setContentAreaFilled(false);
        btnNuevo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        btnGuardar1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(109, 109, 109));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.setBorderPainted(false);
        btnGuardar1.setContentAreaFilled(false);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        btnEditar2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnEditar2.setForeground(new java.awt.Color(109, 109, 109));
        btnEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditar2.setText("EDITAR");
        btnEditar2.setBorderPainted(false);
        btnEditar2.setContentAreaFilled(false);
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        btnBorrar1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(109, 109, 109));
        btnBorrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnBorrar1.setText("ELIMINAR");
        btnBorrar1.setBorderPainted(false);
        btnBorrar1.setContentAreaFilled(false);
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setText("CÓDIGO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        txtCodigoSucursal.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtCodigoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 260, -1));

        txtNombreSucursal.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombreSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 260, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        tbl2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID SUCURSAL", "NOMBRE SUCURSAL"
            }
        ));
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 1080, 170));

        txtSucursalEmpresa.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtSucursalEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, 190, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("EMPRESA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(109, 109, 109));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 134, 140, 40));

        btnCancelar1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(109, 109, 109));
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.setToolTipText("Cancelar");
        btnCancelar1.setBorderPainted(false);
        btnCancelar1.setContentAreaFilled(false);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 474, 140, 40));

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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bandera = 1;
        txtNombreEmpresa.setEnabled(true);
        txtNombreEmpresa.setText("");
        btnGuardar.setEnabled(true);
        btnBorrar.setEnabled(false);
        btnNuevo.setEnabled(false);
        txtNombreEmpresa.grabFocus();
        NoEmpresa();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el ID de la Empresa");
            txtCodigo.grabFocus();
            return;
        }
        if(txtNombreEmpresa.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el nombre de la Empresa");
            txtNombreEmpresa.grabFocus();
            return;
        }
        
        Empresa emp = new Empresa(Integer.parseInt(txtCodigo.getText()), txtNombreEmpresa.getText());
        Conectar co = new Conectar();
        if(bandera == 1){
        if(!co.insertEmpresa(emp))
        {
            JOptionPane.showMessageDialog(rootPane,"No se registro la Empresa");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Empresa Registrada Exitosamente");
        }
        if(bandera == 2){
        if(!co.updateEmpresa(emp))
        {
            JOptionPane.showMessageDialog(rootPane,"No se Actualizo la Empresa");
            return;
        }
        JOptionPane.showMessageDialog(rootPane,"Empresa Actualizada Exitosamente");
        }
        co.cerrarConexion();
        llenarTabla1();
        btnNuevo.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnGuardar.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtNombreEmpresa.setEnabled(false);
        btnEditar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Seleccione una Empresa de la Tabla");
            txtCodigo.grabFocus();
            return;
        }   
        int res = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar la Empresa?");
        if(res != 0)
        {
            return;
        }
        Conectar co = new Conectar();
        Sucursal suc = co.getSucursal2(txtCodigo.getText());
        if(suc == null)
        {
            Empresa emp = co.getEmpresa(txtCodigo.getText());

            if(emp == null){
               JOptionPane.showMessageDialog(rootPane, "Empresa no Existe");
               txtCodigo.setText("");
               txtCodigo.grabFocus();
               co.cerrarConexion();
               return;
            }
            if(co.deleteUpdate(emp)){
               JOptionPane.showMessageDialog(rootPane,"Empresa Eliminada Correctectamente");
               co.cerrarConexion();
               llenarTabla1();
               return;
            }
            else{
               JOptionPane.showMessageDialog(rootPane,"Empresa NO eliminada");           
            }
        }
        JOptionPane.showMessageDialog(rootPane,"No puedes Eliminar esta Empresa porque tiene Informacion en otra Tabla");
        co.cerrarConexion();
        llenarTabla1();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        bandera = 1;
        txtNombreSucursal.setEnabled(true);
        txtNombreSucursal.setText("");
        txtSucursalEmpresa.setText("");
        btnGuardar1.setEnabled(true);
        btnBorrar1.setEnabled(false);
        btnNuevo1.setEnabled(false);
        txtNombreSucursal.grabFocus();
        NoSucursal();
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if(txtCodigoSucursal.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(rootPane,"Ingrese el ID de la Sucursal");
            txtCodigoSucursal.grabFocus();
            return;
        }
        if(txtNombreSucursal.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(rootPane,"Ingrese el nombre de la Sucursal");
            txtNombreSucursal.grabFocus();
            return;
        }
        if(txtSucursalEmpresa.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Seleccione una Empresa");
            return;
        }
      
        Sucursal suc = new Sucursal(Integer.parseInt(txtCodigoSucursal.getText()),
                txtNombreSucursal.getText(),
                Integer.parseInt(txtSucursalEmpresa.getText()));
        Conectar co = new Conectar();
        
        if(bandera == 1){
        if(!co.insertSucursal(suc))
        { 
            JOptionPane.showMessageDialog(rootPane,"idSucursal ya existe");
            return;
        }       
        JOptionPane.showMessageDialog(rootPane,"Sucursal Registrada Exitosamente");
        }
        if(bandera == 2){
        if(!co.updateSucursal(suc))
        { 
            JOptionPane.showMessageDialog(rootPane,"No se Actualizo la Sucursal");
            return;
        }       
        JOptionPane.showMessageDialog(rootPane,"Sucursal Actualizada Exitosamente");
        }
        co.cerrarConexion();
        llenarTabla2();
       
        btnNuevo1.setEnabled(true);
        btnBorrar1.setEnabled(true);
        btnGuardar1.setEnabled(false);
        txtCodigoSucursal.setEnabled(false);
        txtNombreSucursal.setEnabled(false);
        btnEditar2.setEnabled(true);
        btnCancelar1.setEnabled(true);
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        if(txtCodigoSucursal.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Seleccione una Sucursal de la Tabla");
            txtCodigoSucursal.grabFocus();
            return;
        }
        int res = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar la Sucursal?");
        if(res != 0)
        {
            return;
        }
       
        Conectar co = new Conectar();
        Sucursal suc = co.getSucursal(txtCodigoSucursal.getText());
        Usuarios usu = co.getUsuarios2(txtCodigoSucursal.getText());
        if(usu==null){
            if(suc == null)
            {
                JOptionPane.showMessageDialog(rootPane, "Sucursal no Existe");
                txtCodigoSucursal.setText("");
                txtCodigoSucursal.grabFocus();
                co.cerrarConexion();
                return;
            }
            if(co.deleteUpdateSucursal(suc))
            {
                JOptionPane.showMessageDialog(rootPane,"Sucursal Eliminada Correctectamente"); 
                co.cerrarConexion();
                llenarTabla2();
                return;
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Sucursal NO eliminada");         
            }
        }
        JOptionPane.showMessageDialog(rootPane,"No puede Eliminar esta Sucursal porque tiene Asesores Asignados..."); 
        co.cerrarConexion();
        llenarTabla2();
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                NoEmpresa();
                NoSucursal();
                llenarTabla1(); 
                llenarTabla2();
                bloquear(); 
                mostrarColor();
                mostrarColor2();
                bandera = 1;
    }//GEN-LAST:event_formWindowOpened

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        int pos=tbl1.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbl1.getValueAt(pos,0)));
        txtNombreEmpresa.setText(String.valueOf(tbl1.getValueAt(pos,1)));
        txtSucursalEmpresa.setText(String.valueOf(tbl1.getValueAt(pos,0)));
    }//GEN-LAST:event_tbl1MouseClicked

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
        int pos=tbl2.rowAtPoint(evt.getPoint());
        txtCodigoSucursal.setText(String.valueOf(tbl2.getValueAt(pos,0)));
        txtNombreSucursal.setText(String.valueOf(tbl2.getValueAt(pos,1)));
        txtSucursalEmpresa.setText(String.valueOf(tbl2.getValueAt(pos,2)));
        
    }//GEN-LAST:event_tbl2MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNombreEmpresa.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnBorrar.setEnabled(false);
        txtNombreEmpresa.grabFocus();
        bandera = 2;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        txtNombreSucursal.setEnabled(true);
        btnNuevo1.setEnabled(false);
        btnGuardar1.setEnabled(true);
        btnEditar2.setEnabled(false);
        btnBorrar1.setEnabled(false);
        txtSucursalEmpresa.setText("");
        txtNombreSucursal.grabFocus();
        bandera = 2;
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNombreEmpresa.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnCancelar.setEnabled(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        txtNombreSucursal.setEnabled(false);
        btnNuevo1.setEnabled(true);
        btnGuardar1.setEnabled(false);
        btnEditar2.setEnabled(true);
        btnBorrar1.setEnabled(true);
        btnCancelar1.setEnabled(true);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

    private void bloquear(){
        txtNombreEmpresa.setEnabled(false);
        txtCodigo.setEnabled(false);
        btnGuardar.setEnabled(false);
        txtNombreSucursal.setEnabled(false);
        txtCodigoSucursal.setEnabled(false);
        txtSucursalEmpresa.setEnabled(false);
        btnGuardar1.setEnabled(false);
    }
    
    private DefaultTableModel Tabla;
    private void llenarTabla1(){
        try {
            String titulo[] = {"idEmpresa","Nombre"};
            Tabla = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 2){
                        return true;
                    }else{
                        return false;
                    }
                }                
            };
            String registros[] = new String[2];
            Conectar co = new Conectar();
            ResultSet rs = co.getEmpresa();
            while(rs.next())
            {
                registros[0] = rs.getString("idEmpresa");
                registros[1] = rs.getString("Nombre");
                Tabla.addRow(registros);
            }
            tbl1.setModel(Tabla);
            mostrarColor();
            mostrarColor2();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empresa_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private DefaultTableModel Tabla2;
    private void llenarTabla2(){
        try {
            String titulo[] = {"idSucursal","Nombre","Empresa"};
            Tabla2 = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 3){
                        return true;
                    }else{
                        return false;
                    }
                }                
            };
            String registros[] = new String[3];
            Conectar co = new Conectar();
            ResultSet rs = co.mostrarSucursal();
            while(rs.next())
            {
                registros[0] = rs.getString("idSucursal");
                registros[1] = rs.getString("Sucursal");
                registros[2] = rs.getString("Empresa");
                Tabla2.addRow(registros);
            }
            tbl2.setModel(Tabla2);
            mostrarColor();
            mostrarColor2();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empresa_Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void NoEmpresa(){
        Conectar co = new Conectar();
        String NoEmp = co.NoEmpresa();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
    }
    
    private void NoSucursal(){
        Conectar co = new Conectar();
        String NoEmp = co.NoSucursal();
        if(NoEmp==null){
            txtCodigoSucursal.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigoSucursal.setText("000"+increment);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoSucursal;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreSucursal;
    private javax.swing.JTextField txtSucursalEmpresa;
    // End of variables declaration//GEN-END:variables
}
