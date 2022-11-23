
package Formularios;

import Clases.Conectar;
import Clases.Transaccion;
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
public class Asesor extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    
    public Asesor() {
        this.setContentPane(fondo);
        initComponents();  
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
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbEmpresa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbSucursal = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
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
        jLabel1.setText("REGISTRAR ASESOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

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
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(109, 109, 109));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 109, 109));
        jLabel2.setText("CÓDIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 200, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 200, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("APELLIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, -1));

        txtApellido.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 200, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setText("TELEFONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 200, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("EMPRESA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

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
        jPanel1.add(cmbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 200, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("SUCURSAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, -1, -1));

        cmbSucursal.setFont(new java.awt.Font("Roboto Condensed", 1, 20)); // NOI18N
        cmbSucursal.setForeground(new java.awt.Color(129, 129, 129));
        jPanel1.add(cmbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 200, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 320, -1, -1));

        tbl2.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID ASESOR", "NOMBRE ", "APELLIDO", "TELEFONO", "SUCURSAL", "EMPRESA"
            }
        ));
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 1200, 310));

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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bandera = 1;
        limpiar();
        NoAsesor();
        txtNombre.setEnabled(true);        
        txtApellido.setEnabled(true);        
        txtTelefono.setEnabled(true);        
        cmbEmpresa.setEnabled(true);        
        cmbSucursal.setEnabled(true);        
        btnGuardar.setEnabled(true); 
        btnNuevo.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtNombre.grabFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String tel = txtTelefono.getText();
        String emp = (String) cmbEmpresa.getSelectedItem();
        String suc = (String) cmbSucursal.getSelectedItem();
        
        if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Nombre del Vendedor");
            txtNombre.grabFocus();
            return;
        }
        if(apellido.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Apellido del Vendedor");
            txtApellido.grabFocus();
            return;
        }
        if(tel.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese el Numero de Telefono");
            txtTelefono.grabFocus();
            return;
        }
        if(cmbSucursal.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(rootPane,"Ingrese una Sucursal para asignar al vendedor");
            cmbSucursal.grabFocus();
            return;
        }
  
        Conectar co = new Conectar();       
        Usuarios miUsuario = new Usuarios(
            txtCodigo.getText(),
            txtNombre.getText(),
            txtApellido.getText(),
            txtTelefono.getText(),        
            Integer.parseInt(co.idsuc(suc, emp)));
        
        if(bandera == 1){
            if(!co.insertAsesor(miUsuario))
            {
                JOptionPane.showMessageDialog(rootPane,"No se Registro el Usuario :(");
                return;
            }
            JOptionPane.showMessageDialog(rootPane,"Asesor Agregado Correctamente :D");
        }
        if(bandera==2){
            if(!co.updateUsuario(miUsuario))
            {
                JOptionPane.showMessageDialog(rootPane,"No se Actualizo el Usuario :(");
                return;
            }
            JOptionPane.showMessageDialog(rootPane,"Asesor Actualizado Correctamente :D");
        }
        co.cerrarConexion();
        llenarTabla2();
        limpiar();
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnEditar.setEnabled(true);
        bloquear();      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Seleccione un Asesor de la Tabla");
            txtCodigo.grabFocus();
            return;
        }
        int res = JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar al Asesor?");
        if(res != 0)
        {
            return;
        }
       
        Conectar co = new Conectar();
        Usuarios usu = co.getUsuarios(txtCodigo.getText());
        Transaccion tran = co.getTransaccion2(txtCodigo.getText());
        if(tran == null){
            if(usu == null){
                JOptionPane.showMessageDialog(rootPane, "Asesor no Existe");
                txtCodigo.setText("");
                txtCodigo.grabFocus();
                co.cerrarConexion();
                return;
            }
            if(co.deleteUpdateAsesor(usu)){
                JOptionPane.showMessageDialog(rootPane,"Asesor Eliminado Correctectamente"); 
                llenarTabla2();
                co.cerrarConexion();
                return;
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Asesor NO eliminado");         
            }
        }
        JOptionPane.showMessageDialog(rootPane,"No puede Eliminar al Asesor porque tiene Registros en otra Tabla");
        llenarTabla2();
        co.cerrarConexion(); 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
        int pos=tbl2.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbl2.getValueAt(pos,0)));
        txtNombre.setText(String.valueOf(tbl2.getValueAt(pos,1)));
        txtApellido.setText(String.valueOf(tbl2.getValueAt(pos,2)));
        txtTelefono.setText(String.valueOf(tbl2.getValueAt(pos,3)));
        cmbEmpresa.setSelectedItem(String.valueOf(tbl2.getValueAt(pos,5)));
        cmbSucursal.setSelectedItem(String.valueOf(tbl2.getValueAt(pos,4)));
    }//GEN-LAST:event_tbl2MouseClicked

    private void cmbEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmpresaItemStateChanged
        Conectar co = new Conectar();
        String emp = (String) cmbEmpresa.getSelectedItem();
        co.llenarSucursal(cmbSucursal,emp); 
        co.cerrarConexion();
    }//GEN-LAST:event_cmbEmpresaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla2();
        NoAsesor();
        bandera = 1;
        Conectar co = new Conectar();   
        co.llenarCombobox(cmbEmpresa);
        bloquear();
        mostrarColor();
        co.cerrarConexion();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtNombre.grabFocus(); 
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        bandera = 2;     
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed
    
    private DefaultTableModel Tabla2;
    private void llenarTabla2(){
        try {
            String titulo[] = {"idAsesor","Nombre","Apellido","Telefono","Sucursal","Empresa"};
            Tabla2 = new DefaultTableModel(null,titulo){
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if(columnas == 6){
                       return true;
                    }else{
                       return false;
                    }
                }                
            };
            String registros[] = new String[6];
            Conectar co = new Conectar();
            ResultSet rs = co.mostrarAsesor();
            while(rs.next())
            {
                registros[0] = rs.getString("idAsesor");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Sucursal");
                registros[5] = rs.getString("Empresa");
                Tabla2.addRow(registros);
            }
            tbl2.setModel(Tabla2);
             mostrarColor();
            co.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Asesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        cmbSucursal.setSelectedIndex(0);
        cmbEmpresa.setSelectedIndex(0);
    }   
    private void bloquear(){
        txtNombre.setEnabled(false);        
        txtApellido.setEnabled(false);        
        txtTelefono.setEnabled(false);        
        cmbEmpresa.setEnabled(false);        
        cmbSucursal.setEnabled(false);        
        btnGuardar.setEnabled(false);
        txtCodigo.setEnabled(false);     
    }
    private void NoAsesor(){
        Conectar co = new Conectar();
        String NoEmp = co.NoAsesor();
        if(NoEmp==null){
            txtCodigo.setText("0001");
        }
        else{
            int increment = Integer.parseInt(NoEmp);
            increment = increment + 1;
            txtCodigo.setText("000"+increment);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JComboBox<String> cmbSucursal;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
