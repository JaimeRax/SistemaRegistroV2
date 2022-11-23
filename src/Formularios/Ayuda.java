

package Formularios;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JAIME_06
 */
public class Ayuda extends javax.swing.JFrame {

    ImagenFondo fondo = new ImagenFondo();
    
    public Ayuda() {
        this.setContentPane(fondo);
        initComponents();
    }

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setText("Programa desarrollado para estandarizar y optimizar el proceso de atención al cliente de ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 109, 109));
        jLabel2.setText("las empresas COMAR S.A. ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 109, 109));
        jLabel5.setText("Para mayor información comunicate a las oficinas de Sistemas y Diseño en Comarsa Central");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setText("o llama al 32328727. ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setText("Desarrollado por:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setText("Jaime Rax - Programador.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setText("jaimecaal60@gmail.com");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setText("Back-End");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(109, 109, 109));
        jLabel10.setText("Dojo Studio - Diseño.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 680, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(109, 109, 109));
        jLabel11.setText("proyectos.dojoestudio@gmail.com");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(109, 109, 109));
        jLabel12.setText("Front-End");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 720, -1, -1));

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

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        Usuario f1 = new Usuario();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuCambiarUsuario;
    private javax.swing.JMenuItem mnuCrearUsuario;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
