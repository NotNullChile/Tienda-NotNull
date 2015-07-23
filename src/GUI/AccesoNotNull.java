package GUI;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class AccesoNotNull extends javax.swing.JFrame {

    public AccesoNotNull() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jlblUser = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jbtnCancelar = new javax.swing.JButton();
        jSeparadorInicioSesion = new javax.swing.JSeparator();
        jlblRegistrate = new javax.swing.JLabel();
        jpwPassword = new javax.swing.JPasswordField();
        jbtnCrearCuenta = new javax.swing.JButton();
        jlblPreguntadeRegistro = new javax.swing.JLabel();
        jbtnIniciarSesion = new javax.swing.JButton();
        jlblEstadoAcceso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jlblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblUser.setText("USER");

        jlblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblPassword.setText("PASSWORD");

        jtxtUser.setBackground(new java.awt.Color(0, 0, 0));
        jtxtUser.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUserFocusGained(evt);
            }
        });
        jtxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUserKeyTyped(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jlblRegistrate.setText("REGISTRATE");

        jpwPassword.setBackground(new java.awt.Color(0, 0, 0));
        jpwPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwPasswordFocusGained(evt);
            }
        });
        jpwPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpwPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwPasswordKeyTyped(evt);
            }
        });

        jbtnCrearCuenta.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCrearCuenta.setText("CREAR NUEVA CUENTA");
        jbtnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearCuentaActionPerformed(evt);
            }
        });

        jlblPreguntadeRegistro.setText("¿No tienes una cuenta en NotNull?");

        jbtnIniciarSesion.setBackground(new java.awt.Color(0, 102, 102));
        jbtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnIniciarSesion.setText("INICIAR SESIÓN");
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jbtnIniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnIniciarSesionKeyPressed(evt);
            }
        });

        jlblEstadoAcceso.setForeground(new java.awt.Color(255, 255, 0));
        jlblEstadoAcceso.setText("  ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banner_Notnull.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jlblPreguntadeRegistro))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblUser, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblEstadoAcceso)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jbtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtxtUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpwPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparadorInicioSesion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblRegistrate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(29, 29, 29))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUser)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPassword)
                    .addComponent(jpwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jlblEstadoAcceso)
                .addGap(4, 4, 4)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIniciarSesion)
                    .addComponent(jbtnCancelar))
                .addGap(18, 18, 18)
                .addComponent(jSeparadorInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jlblPreguntadeRegistro)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRegistrate)
                    .addComponent(jbtnCrearCuenta))
                .addGap(20, 20, 20))
        );
        jDesktopPane1.setLayer(jlblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparadorInicioSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblRegistrate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnCrearCuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblPreguntadeRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnIniciarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoAcceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Abre la ventana de registro de Usuario y cierra la ventana de acceso.
    private void jbtnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearCuentaActionPerformed
        new RegistroUser().configAccesoRegistro();
        this.dispose();
    }//GEN-LAST:event_jbtnCrearCuentaActionPerformed

    //Valida el inicio de sesión.
    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        validarAcceso();
    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            
    }//GEN-LAST:event_formWindowClosed

    //Cancela el registro/inicio de sesión cerrando la ventana.
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    //Permite que el nombre de usuario sólo contenga letras y/o números y no exceda los 20 caracteres.
    private void jtxtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUserKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtUser.getText().length() == 20)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtUserKeyTyped

    //Permte que la contraseña sólo contenga letras y/o números y no supere los 10 caracteres.
    private void jpwPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwPasswordKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwPassword.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwPasswordKeyTyped

    //Selecciona todo el texto en el campo User al recibir el foco.
    private void jtxtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUserFocusGained
        this.jtxtUser.selectAll();
    }//GEN-LAST:event_jtxtUserFocusGained

    //Selecciona todo el texto en el campo Password al recibir el foco.
    private void jpwPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwPasswordFocusGained
        this.jpwPassword.selectAll();
    }//GEN-LAST:event_jpwPasswordFocusGained

    //Valida el acceso de un usuario registrado.
    private void jbtnIniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
    }//GEN-LAST:event_jbtnIniciarSesionKeyPressed

    private void jpwPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            validarAcceso();
        }
    }//GEN-LAST:event_jpwPasswordKeyPressed

    //Entrega el foco al campo User al abrir la ventana.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jtxtUser.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    //Valida el acceso de usuario registrado
    private void validarAcceso()        {
        String username = this.jtxtUser.getText();
        char[] pwEntregada = jpwPassword.getPassword();
        String passEntregada = new String(pwEntregada);
        if (username.equals("admin") && passEntregada.equals("admin"))
        {
            new PanelAdmin().configFramePanelAdmin();
            this.setVisible(false);
        }
        BLL.User p = new BLL.User().buscarUser(username);
        if(p != null)
        {
            String passDataBase = p.getPwNuevoUser();
            if (passEntregada.equals(passDataBase)) 
            {
                Biblioteca b = new Biblioteca();
                b.configFrameBiblioteca(username);
                this.setVisible(false);
            }
            else{this.jlblEstadoAcceso.setText("su Contraseña no es Valida");}    
        }       
        else{this.jlblEstadoAcceso.setText("Usuario no Existe");}
    }
    
    public void configFrameAcceso()     {
        AccesoNotNull g = new AccesoNotNull();
        g.setTitle("Inicio Sesión on NotNull");
        g.setLocationRelativeTo(null);
        g.setVisible(true);
        g.jlblUser.requestFocus();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccesoNotNull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoNotNull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoNotNull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoNotNull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccesoNotNull g = new AccesoNotNull();
                g.setTitle("Inicio Sesión on NotNull");
                g.setLocationRelativeTo(null);
                g.setVisible(true);
                g.jlblUser.requestFocus();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparadorInicioSesion;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnCrearCuenta;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JLabel jlblEstadoAcceso;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblPreguntadeRegistro;
    private javax.swing.JLabel jlblRegistrate;
    private javax.swing.JLabel jlblUser;
    private javax.swing.JPasswordField jpwPassword;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
// ok