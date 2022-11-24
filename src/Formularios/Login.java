
package Formularios;

import Clases.Conectar;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JAIME_06
 */
public class Login extends javax.swing.JFrame {

    ImagenFondo img = new ImagenFondo();
    public Login() {
        this.setContentPane(img);
        UIManager.put("TextField.border", BorderFactory.createCompoundBorder(
            new CustomeBorder(), 
            new EmptyBorder(new Insets(4,8,4,4))));
        UIManager.put("PasswordField.border", BorderFactory.createCompoundBorder(
            new CustomeBorder(), 
            new EmptyBorder(new Insets(4,8,4,4))));
        initComponents();
        txtNombre.setOpaque(false);
        txtClave.setOpaque(false);
        
    }
    
    
    
    
    public static String NombreLogin;
    public static String ClaveLogin;

    public String getNombreLogin() {
        return NombreLogin;
    }

    public void setNombreLogin(String NombreLogin) {
        this.NombreLogin = NombreLogin;
    }

    public String getClaveLogin() {
        return ClaveLogin;
    }

    public void setClaveLogin(String ClaveLogin) {
        this.ClaveLogin = ClaveLogin;
    }

    public Login(String NombreLogin, String ClaveLogin) {
        this.NombreLogin = NombreLogin;
        this.ClaveLogin = ClaveLogin;
    }
    
    public class ImagenFondo extends JPanel{
        @Override
        public void paint(Graphics g){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoLogin1.png"));
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIO DE SESION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 239, 239));
        jLabel5.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        txtNombre.setBackground(new java.awt.Color(242, 242, 242));
        txtNombre.setFont(new java.awt.Font("Roboto Condensed", 0, 28)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText(" ");
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 490, 60));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 239, 239));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, -1));

        txtClave.setFont(new java.awt.Font("Roboto Condensed", 0, 28)); // NOI18N
        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        txtClave.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 490, 60));

        btnIngresar.setBackground(new java.awt.Color(255, 220, 26));
        btnIngresar.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        btnIngresar.setText("INICIAR SESION");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = txtNombre.getText();
        String clave = String.valueOf(txtClave.getPassword());
       
        
        if(usuario.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un usuario");
            txtNombre.grabFocus();
            return;
        }
        
        if(clave.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una clave");
            txtClave.grabFocus();
            return;
        }
        Conectar conn = new Conectar();
        if(!conn.validarUsuario(usuario, clave))
        {
            JOptionPane.showMessageDialog(rootPane, "Usuario o clave incorrectos");
            txtNombre.setText("");
            txtClave.setText("");
            txtNombre.grabFocus();
            return;
        }
        NombreLogin = usuario;
        ClaveLogin = clave;
        Principal f1 = new Principal();
        f1.setVisible(true);
        this.setVisible(false);
        conn.cerrarConexion();
    }//GEN-LAST:event_btnIngresarActionPerformed
   
    
    @SuppressWarnings("serial")
    public static class CustomeBorder extends AbstractBorder{
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        super.paintBorder(c, g, x, y, width, height);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(null);//buscar informacion sobre setPaint()
        Shape shape = new RoundRectangle2D.Float(0, 0, c.getWidth()-1, c.getHeight()-1,20, 20);
        g2d.draw(shape);  
    }
}
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
