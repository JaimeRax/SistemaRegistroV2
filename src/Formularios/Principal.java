
package Formularios;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JAIME_06
 */
public class Principal extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    public Principal() {
        this.setContentPane(fondo); 
        initComponents();
    }
    
    public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal1.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEmpresa = new javax.swing.JButton();
        btnAsesor = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnPos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCrearUsuario = new javax.swing.JMenuItem();
        mnuCambiarUsuario = new javax.swing.JMenuItem();
        mnuCambiarClave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar empresa.png"))); // NOI18N
        btnEmpresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(255, 204, 0)));
        btnEmpresa.setBorderPainted(false);
        btnEmpresa.setContentAreaFilled(false);
        btnEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpresa.setDefaultCapable(false);
        btnEmpresa.setFocusPainted(false);
        btnEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setRequestFocusEnabled(false);
        btnEmpresa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa2.png"))); // NOI18N
        btnEmpresa.setVerifyInputWhenFocusTarget(false);
        btnEmpresa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpresaMouseExited(evt);
            }
        });
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 165, 165));

        btnAsesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asesor de venta.png"))); // NOI18N
        btnAsesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnAsesor.setBorderPainted(false);
        btnAsesor.setContentAreaFilled(false);
        btnAsesor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAsesor.setDefaultCapable(false);
        btnAsesor.setFocusPainted(false);
        btnAsesor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAsesor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsesor.setRequestFocusEnabled(false);
        btnAsesor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Asesor2.png"))); // NOI18N
        btnAsesor.setVerifyInputWhenFocusTarget(false);
        btnAsesor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAsesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAsesorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsesorMouseExited(evt);
            }
        });
        btnAsesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsesorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 165, 165));

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido1.png"))); // NOI18N
        btnPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnPedido.setBorderPainted(false);
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPedido.setDefaultCapable(false);
        btnPedido.setFocusPainted(false);
        btnPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedido.setRequestFocusEnabled(false);
        btnPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido2.png"))); // NOI18N
        btnPedido.setVerifyInputWhenFocusTarget(false);
        btnPedido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPedidoMouseExited(evt);
            }
        });
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 157, 163));

        btnPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/post venta.png"))); // NOI18N
        btnPos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        btnPos.setBorderPainted(false);
        btnPos.setContentAreaFilled(false);
        btnPos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPos.setDefaultCapable(false);
        btnPos.setFocusPainted(false);
        btnPos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPos.setRequestFocusEnabled(false);
        btnPos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Post2.png"))); // NOI18N
        btnPos.setVerifyInputWhenFocusTarget(false);
        btnPos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnPos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPosMouseExited(evt);
            }
        });
        btnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 165, 165));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/30 años.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CAMION.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("BigNoodleTitling", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" ATENCIÓN AL CLIENTE ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jSeparator3.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 70, 5));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jSeparator2.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 70, 5));

        jMenuBar1.setBackground(new java.awt.Color(54, 54, 54));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));
        jMenuBar1.setForeground(new java.awt.Color(54, 54, 54));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresaMouseEntered
        btnEmpresa.setBorderPainted(true);
    }//GEN-LAST:event_btnEmpresaMouseEntered

    private void btnEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresaMouseExited
        btnEmpresa.setBorderPainted(false);
    }//GEN-LAST:event_btnEmpresaMouseExited

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        Empresa_Sucursal emp = new Empresa_Sucursal();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnAsesorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsesorMouseEntered
        btnAsesor.setBorderPainted(true);
    }//GEN-LAST:event_btnAsesorMouseEntered

    private void btnAsesorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsesorMouseExited
        btnAsesor.setBorderPainted(false);
    }//GEN-LAST:event_btnAsesorMouseExited

    private void btnAsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsesorActionPerformed
        Asesor emp = new Asesor();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAsesorActionPerformed

    private void btnPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidoMouseEntered
        btnPedido.setBorderPainted(true);
    }//GEN-LAST:event_btnPedidoMouseEntered

    private void btnPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidoMouseExited
        btnPedido.setBorderPainted(false);
    }//GEN-LAST:event_btnPedidoMouseExited

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        RegistroPedido_Cliente emp = new RegistroPedido_Cliente();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnPosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPosMouseEntered
        btnPos.setBorderPainted(true);
    }//GEN-LAST:event_btnPosMouseEntered

    private void btnPosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPosMouseExited
        btnPos.setBorderPainted(false);
    }//GEN-LAST:event_btnPosMouseExited

    private void btnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosActionPerformed
        Consulta f1 = new Consulta();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPosActionPerformed

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

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsesor;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnPos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
