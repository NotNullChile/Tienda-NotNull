package GUI;
//final
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistroUser extends javax.swing.JFrame {
    
    public RegistroUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jlblNewUser = new javax.swing.JLabel();
        jlblNewPassword = new javax.swing.JLabel();
        jtxtNewUser = new javax.swing.JTextField();
        jpwNewPassword = new javax.swing.JPasswordField();
        jlblConfirmNewPassword = new javax.swing.JLabel();
        jpwConfirmNewPassword = new javax.swing.JPasswordField();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxtRut = new javax.swing.JTextField();
        jlblRut = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblApellido = new javax.swing.JLabel();
        jlblFechaNacimiento = new javax.swing.JLabel();
        jlblBilletera = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtBilletera = new javax.swing.JTextField();
        jcboDia = new javax.swing.JComboBox();
        jcboMes = new javax.swing.JComboBox();
        jcboAño = new javax.swing.JComboBox();
        jlblCreditoBienvenida = new javax.swing.JLabel();
        jlblEjemploRutContratarEmpleados = new javax.swing.JLabel();
        jlblEstadoContraseña = new javax.swing.JLabel();
        jlblEstadoContraseñasIguales = new javax.swing.JLabel();
        jlblEstadoRut = new javax.swing.JLabel();
        jbtnReestablecerFormulario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro en NotNull");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jlblNewUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNewUser.setText("NEW USER");

        jlblNewPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNewPassword.setText("NEW PASSWORD");

        jtxtNewUser.setBackground(new java.awt.Color(0, 0, 0));
        jtxtNewUser.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNewUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNewUserFocusGained(evt);
            }
        });
        jtxtNewUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNewUserKeyTyped(evt);
            }
        });

        jpwNewPassword.setBackground(new java.awt.Color(0, 0, 0));
        jpwNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpwNewPasswordFocusLost(evt);
            }
        });
        jpwNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwNewPasswordKeyTyped(evt);
            }
        });

        jlblConfirmNewPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblConfirmNewPassword.setText("CONFIRM PASSWORD");

        jpwConfirmNewPassword.setBackground(new java.awt.Color(0, 0, 0));
        jpwConfirmNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwConfirmNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpwConfirmNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpwConfirmNewPasswordFocusLost(evt);
            }
        });
        jpwConfirmNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpwConfirmNewPasswordKeyTyped(evt);
            }
        });

        jbtnRegistrar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jbtnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnRegistrarKeyPressed(evt);
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

        jtxtRut.setBackground(new java.awt.Color(0, 0, 0));
        jtxtRut.setForeground(new java.awt.Color(255, 255, 255));
        jtxtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtRutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtRutFocusLost(evt);
            }
        });
        jtxtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRutKeyTyped(evt);
            }
        });

        jlblRut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblRut.setText("RUT");

        jlblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNombre.setText("NOMBRE");

        jlblApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblApellido.setText("APELLIDO");

        jlblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblFechaNacimiento.setText("FECHA NACIMIENTO");

        jlblBilletera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblBilletera.setText("BILLETERA");

        jtxtApellido.setBackground(new java.awt.Color(0, 0, 0));
        jtxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusGained(evt);
            }
        });
        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyTyped(evt);
            }
        });

        jtxtNombre.setBackground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });

        jtxtBilletera.setEditable(false);
        jtxtBilletera.setBackground(new java.awt.Color(0, 0, 0));
        jtxtBilletera.setForeground(new java.awt.Color(255, 255, 255));
        jtxtBilletera.setText("1000");
        jtxtBilletera.setFocusable(false);

        jcboDia.setBackground(new java.awt.Color(0, 0, 0));
        jcboDia.setForeground(new java.awt.Color(255, 255, 255));
        jcboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcboDia.setSelectedIndex(-1);
        jcboDia.setToolTipText("");

        jcboMes.setBackground(new java.awt.Color(0, 0, 0));
        jcboMes.setForeground(new java.awt.Color(255, 255, 255));
        jcboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jcboMes.setSelectedIndex(-1);
        jcboMes.setToolTipText("");
        jcboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboMesActionPerformed(evt);
            }
        });

        jcboAño.setBackground(new java.awt.Color(0, 0, 0));
        jcboAño.setForeground(new java.awt.Color(255, 255, 255));
        jcboAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        jcboAño.setSelectedIndex(-1);
        jcboAño.setToolTipText("");
        jcboAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcboAñoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcboAñoFocusLost(evt);
            }
        });
        jcboAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcboAñoMouseClicked(evt);
            }
        });
        jcboAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboAñoActionPerformed(evt);
            }
        });

        jlblCreditoBienvenida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblCreditoBienvenida.setForeground(new java.awt.Color(0, 153, 0));
        jlblCreditoBienvenida.setText("Credito de bienvenida");
        jlblCreditoBienvenida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlblCreditoBienvenidaFocusGained(evt);
            }
        });

        jlblEjemploRutContratarEmpleados.setText("Ej. 12345678-9");

        jlblEstadoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoContraseña.setText(" ");

        jlblEstadoContraseñasIguales.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoContraseñasIguales.setText(" ");

        jlblEstadoRut.setForeground(new java.awt.Color(255, 255, 255));
        jlblEstadoRut.setText(" ");

        jbtnReestablecerFormulario.setBackground(new java.awt.Color(0, 102, 102));
        jbtnReestablecerFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReestablecerFormulario.setText("REESTABLECER");
        jbtnReestablecerFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReestablecerFormularioActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banner_Notnull.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblBilletera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblRut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblConfirmNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblNewUser, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEjemploRutContratarEmpleados)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jtxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlblEstadoRut))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jpwNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpwConfirmNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jcboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jcboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jtxtBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlblCreditoBienvenida)))
                                    .addComponent(jtxtNewUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jlblEstadoContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblEstadoContraseñasIguales, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnReestablecerFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlblNewUser))
                    .addComponent(jtxtNewUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNewPassword)
                    .addComponent(jpwNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblEstadoContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblConfirmNewPassword)
                    .addComponent(jpwConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEstadoContraseñasIguales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRut)
                    .addComponent(jlblEstadoRut)
                    .addComponent(jtxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblEjemploRutContratarEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblApellido)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFechaNacimiento)
                    .addComponent(jcboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblBilletera)
                    .addComponent(jlblCreditoBienvenida)
                    .addComponent(jtxtBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistrar)
                    .addComponent(jbtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnReestablecerFormulario)
                .addGap(22, 22, 22))
        );
        jDesktopPane1.setLayer(jlblNewUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtNewUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblConfirmNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jpwConfirmNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblFechaNacimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblBilletera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtxtBilletera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcboDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcboMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcboAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblCreditoBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEjemploRutContratarEmpleados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoContraseñasIguales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlblEstadoRut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtnReestablecerFormulario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_formWindowClosing

    private void jbtnReestablecerFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReestablecerFormularioActionPerformed
        ReestablecerFormularioRegistroDeUsuarios();
    }//GEN-LAST:event_jbtnReestablecerFormularioActionPerformed

    private void jlblCreditoBienvenidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlblCreditoBienvenidaFocusGained

    }//GEN-LAST:event_jlblCreditoBienvenidaFocusGained

    private void jcboAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboAñoActionPerformed
        if (jcboMes.getSelectedIndex() != -1)
        {
            int mes = this.jcboMes.getSelectedIndex();
            cargarDiasDelMes(mes);
        }
    }//GEN-LAST:event_jcboAñoActionPerformed

    private void jcboAñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcboAñoMouseClicked

    }//GEN-LAST:event_jcboAñoMouseClicked

    private void jcboAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcboAñoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboAñoFocusLost

    private void jcboAñoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcboAñoFocusGained

    }//GEN-LAST:event_jcboAñoFocusGained

    private void jcboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboMesActionPerformed
        int mes = this.jcboMes.getSelectedIndex();
        cargarDiasDelMes(mes);
    }//GEN-LAST:event_jcboMesActionPerformed

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtNewUser.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        this.jtxtNombre.selectAll();
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtNewUser.getText().length() == 30)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtApellidoKeyTyped

    private void jtxtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusGained
        this.jtxtRut.selectAll();
    }//GEN-LAST:event_jtxtApellidoFocusGained

    private void jtxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRutKeyTyped
        char caracter = evt.getKeyChar();
        if(! (Character.isDigit(caracter) || caracter == KeyEvent.VK_MINUS
            || caracter == 'k' || caracter == 'K'))
        {
            evt.consume();
        }
        if (this.jtxtRut.getText().length() == 11)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtRutKeyTyped

    private void jtxtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutFocusLost
        if(validarRut())
        {
            this.jlblEstadoRut.setForeground(Color.white);
            this.jlblEstadoRut.setText("Rut válido");
        }
        else
        {
            this.jlblEstadoRut.setForeground(Color.yellow);
            this.jlblEstadoRut.setText("Rut Inválido");
        }
    }//GEN-LAST:event_jtxtRutFocusLost

    private void jtxtRutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtRutFocusGained
        this.jtxtRut.selectAll();
    }//GEN-LAST:event_jtxtRutFocusGained

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        registrarUsuarios();
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jpwConfirmNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwConfirmNewPassword.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwConfirmNewPasswordKeyTyped

    private void jpwConfirmNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordFocusLost
        validarIgualdadContraseñas();
    }//GEN-LAST:event_jpwConfirmNewPasswordFocusLost

    private void jpwConfirmNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwConfirmNewPasswordFocusGained
        this.jpwConfirmNewPassword.selectAll();
    }//GEN-LAST:event_jpwConfirmNewPasswordFocusGained

    private void jpwNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwNewPasswordKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jpwNewPassword.getPassword().length == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jpwNewPasswordKeyTyped

    private void jpwNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwNewPasswordFocusLost
        validarContraseñaLetrasyNumeros();
    }//GEN-LAST:event_jpwNewPasswordFocusLost

    private void jpwNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpwNewPasswordFocusGained
        this.jpwNewPassword.selectAll();
    }//GEN-LAST:event_jpwNewPasswordFocusGained

    private void jtxtNewUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNewUserKeyTyped
        char caracter = evt.getKeyChar();
        if (! (Character.isDigit(caracter) || Character.isLetter(caracter)))
        {
            evt.consume();
        }
        if (this.jtxtNewUser.getText().length() == 20)
        {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNewUserKeyTyped

    private void jtxtNewUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNewUserFocusGained
        this.jtxtNewUser.selectAll();
    }//GEN-LAST:event_jtxtNewUserFocusGained

    private void jbtnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnRegistrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            registrarUsuarios();
        }
    }//GEN-LAST:event_jbtnRegistrarKeyPressed

    private boolean validarIgualdadContraseñas(){
        char[] pw1 = jpwNewPassword.getPassword();
        char[] pw2 = jpwConfirmNewPassword.getPassword();
        String pass1 = new String(pw1);
        String pass2 = new String(pw2);
        if (pass1.equals("") || pass2.equals("")) 
        {
            jlblEstadoContraseñasIguales.setForeground(Color.yellow);
            jlblEstadoContraseñasIguales.setText("Campo(s) vacio(s)");
            return false;
        }
        else 
        {
            if (pass1.equals(pass2))
            {
                jlblEstadoContraseñasIguales.setForeground(Color.white);
                jlblEstadoContraseñasIguales.setText("Ok");
                return true;
            } 
            else 
            {
                if(pass2.length() < 6)
                {       
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("minimo 6 caracteres");
                return false;
                }
                else
                {
                jlblEstadoContraseñasIguales.setForeground(Color.yellow);
                jlblEstadoContraseñasIguales.setText("Las contraseñas no coinciden");
                return false;
                }    
            }
        }
    }
    
    private void registrarUser(){
        try
        {
            /* captura usuario*/
            String nuevoUser = this.jtxtNewUser.getText();
            if(nuevoUser.length() == 0)
            {
                nuevoUser = null;
            }
            /*captura de contraseña*/
            char[] pw = this.jpwNewPassword.getPassword();
            String pwNuevoUser = new String(pw);
            if (pwNuevoUser.length() == 0)
            {
                pwNuevoUser = null;
            } 
            /* caputa rut*/
            String rutDV = this.jtxtRut.getText();
            int rut = Integer.parseInt(rutDV.substring(0,rutDV.length() - 2));
            /*captura nombre*/
            String nombre = this.jtxtNombre.getText().trim();
            if(nombre.length() == 0)
            {
                nombre = null;
            }
            /*captura apellido*/
            String apellido = this.jtxtApellido.getText().trim();
            if(apellido.length() == 0)
            {
                apellido = null;
            }
            /*captura de fecha*/
            int año = Integer.parseInt(this.jcboAño.getSelectedItem().toString());
            int mes = this.jcboMes.getSelectedIndex() + 1;
            int dia = Integer.parseInt(this.jcboDia.getSelectedItem().toString());
            String fechaNacimiento = año + "-" + mes + "-" + dia;
            /*billetera*/
            int billetera = Integer.parseInt(this.jtxtBilletera.getText());

            int resultado = new BLL.User().registrarUserBLL(nuevoUser,pwNuevoUser,rut,nombre,apellido,fechaNacimiento,billetera);
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente", "Registros", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            new AccesoNotNull().configFrameAcceso();
                            break;
                case 1048: JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1062: JOptionPane.showMessageDialog(null, "Persona ya registrada", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
                case 1406: JOptionPane.showMessageDialog(null, "Datos exceden la longitud máxima permitida", "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;  
                default: JOptionPane.showMessageDialog(null, "Error desconocido. Contacte a soporte@notnull.cl: " + resultado, "Registros", JOptionPane.ERROR_MESSAGE); 
                           break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRut, "Ingrese el rut Correctamente","Registros",JOptionPane.WARNING_MESSAGE);
            this.jtxtRut.requestFocus();
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(this.jtxtRut, "Debe seleccionar una Fecha Valida","Registros",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private boolean validarRut(){
        try
        {
            String rut = this.jtxtRut.getText();
            String[] rut_dv = rut.split("-");
            if (rut_dv.length == 2)
            {
                int rutValor = Integer.parseInt(rut_dv[0]);
                String DV = rut_dv[1].substring(0).toUpperCase();
                char dv = DV.charAt(0);
            
                // Validamos que sea un rut valido según la norma
                int m = 0, s = 1;
                for (; rutValor != 0; rutValor /= 10)
                {
                    s = (s + rutValor % 10 * (9 - m++ % 6)) % 11;
                }
            
                return dv == (char) (s != 0 ? s + 47 : 75);    
            }
            return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
    }
    
    private boolean validarContraseñaLetrasyNumeros(){
        char[] Contraseña = this.jpwNewPassword.getPassword();
        if(Contraseña.length >=6)
        { 
            int numeros = 0; 
            int letras = 0;
            
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >47) && Contraseña[x]<58)
                { 
                    numeros++; 
                } 
            }
            for(char x=0; x<Contraseña.length; x++)
            { 
                if((Contraseña[x] >64) && Contraseña[x]<123)
                { 
                    letras++; 
                } 
            }
            if(numeros>0 && letras>0)
            { 
                jlblEstadoContraseña.setForeground(Color.white);
                jlblEstadoContraseña.setText("Su contraseña es Segura.");
                return true;
            }
            else
            { 
                jlblEstadoContraseña.setForeground(Color.yellow);
                jlblEstadoContraseña.setText("inserte letras y numeros.");
                return false;
            } 
        }
        else
        { 
            jlblEstadoContraseña.setForeground(Color.orange);
            jlblEstadoContraseña.setText("minimo 6 caracteres");
            return false;
        }
    }
    
    private void cargarDiasDelMes(int mes){ 
        switch(mes)
        {
            case 0: mes31Dias();break;
            case 1: mesfebrero();break;
            case 2: mes31Dias();break;
            case 3: mes30Dias();break;
            case 4: mes31Dias();break;
            case 5: mes30Dias();break;
            case 6: mes31Dias();break;   
            case 7: mes31Dias();break;
            case 8: mes31Dias();break;   
            case 9: mes31Dias();break;  
            case 10: mes30Dias();break;
            case 11: mes31Dias();break;   
        }
    }
    
    private void mesfebrero(){
        this.jcboDia.removeAllItems();
        int año = Integer.parseInt(this.jcboAño.getSelectedItem().toString());
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
        {
            for (int i = 1; i <= 29; i++) 
            {
                if (i < 10) 
                {
                    this.jcboDia.addItem("0" + i);
                }
                else
                {
                    this.jcboDia.addItem(i);
                }    
            }
        }
        else
        {
            for (int i = 1; i <= 28; i++) 
            {
                if (i < 10) 
                {
                    this.jcboDia.addItem("0" + i);
                }
                else
                {
                    this.jcboDia.addItem(i);
                }    
            }
        }
    }
    
    private void mes30Dias(){
        this.jcboDia.removeAllItems();
        for (int i = 1; i <= 30; i++) 
        {
            if (i < 10) 
            {
                this.jcboDia.addItem("0" + i);
            }
            else
            {
                this.jcboDia.addItem(i);
            }    
        }
    }
    
    private void mes31Dias(){
        this.jcboDia.removeAllItems();
        for (int i = 1; i <= 31; i++) 
        {
            if (i < 10) 
            {
                this.jcboDia.addItem("0" + i);
            }
            else
            {
                this.jcboDia.addItem(i);
            }    
        }
    }
    
    private void ReestablecerFormularioRegistroDeUsuarios(){
    jpwConfirmNewPassword.setText(null);
    jpwNewPassword.setText(null);
    jtxtApellido.setText(null);
    jtxtNewUser.setText(null);
    jtxtNombre.setText(null);
    jtxtRut.setText(null);
    jcboAño.setSelectedIndex(-1);
    jcboMes.setSelectedIndex(-1);
    jcboDia.setSelectedIndex(-1);
    jlblEstadoContraseña.setText(" ");
    jlblEstadoContraseñasIguales.setText(" ");
    jlblEstadoRut.setText(" ");
    jpwConfirmNewPassword.setBackground(Color.black);
    jpwNewPassword.setBackground(Color.black);
    jtxtApellido.setBackground(Color.black);
    jtxtNewUser.setBackground(Color.black);
    jtxtNombre.setBackground(Color.black);
    jtxtRut.setBackground(Color.black);;
    jcboAño.setBackground(Color.black);
    jcboMes.setBackground(Color.black);
    jcboDia.setBackground(Color.black);
    }
    
    private boolean validarFormalarioContratarEmpleados(){
        int validaciones = 0; 
        if(this.jtxtNewUser.getText().trim().isEmpty())
        {
            this.jtxtNewUser.setBackground(Color.blue);
            validaciones++;
        }
        if (! validarContraseñaLetrasyNumeros()) 
        {
            this.jpwNewPassword.setBackground(Color.blue);
            this.jpwConfirmNewPassword.setBackground(Color.blue);
            validaciones++;
        }
        if(! validarRut())
        {
            this.jtxtRut.setBackground(Color.blue);
            validaciones++;
        }
        if(this.jtxtNombre.getText().trim().isEmpty())
        {
            this.jtxtNombre.setBackground(Color.blue);
            validaciones++;
        }
        if(this.jtxtApellido.getText().trim().isEmpty())
        {
            this.jtxtApellido.setBackground(Color.blue);
            validaciones++;
        }
        if(this.jcboAño.getSelectedIndex() == -1)
        {
            this.jcboAño.setBackground(Color.blue);
            validaciones++;
        }
        if(this.jcboMes.getSelectedIndex() == -1)
        {
            this.jcboMes.setBackground(Color.blue);
            validaciones++;
        }
        if(this.jcboDia.getSelectedIndex() == -1)
        {
            this.jcboDia.setBackground(Color.blue);
            validaciones++;
        }
        try
        {    
            int año = Integer.parseInt(this.jcboAño.getSelectedItem().toString());
            int mes = this.jcboMes.getSelectedIndex() + 1;
            int dia = Integer.parseInt(this.jcboDia.getSelectedItem().toString());
            String fechaNacimiento = año + "-" + mes + "-" + dia;
            if (calcularEdad(fechaNacimiento) < 3) 
            {
                validaciones++;
                JOptionPane.showMessageDialog(null, "El usuario debe tener al menos 3 años cumplidos como minimo.", "Validacion de Edad", JOptionPane.WARNING_MESSAGE);
                this.jcboDia.setBackground(Color.blue);
                this.jcboMes.setBackground(Color.blue);
                this.jcboAño.setBackground(Color.blue);
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("error al capturar fecha " + e.getMessage());
            this.jcboDia.setBackground(Color.blue);
            this.jcboMes.setBackground(Color.blue);
            this.jcboAño.setBackground(Color.blue);
        }    
        return validaciones == 0;
    }
    
    private int calcularEdad(String FechaNacimiento){
        Date fechaNac=null;
        try 
        {
            fechaNac = new SimpleDateFormat("yyyy-MM-dd").parse(FechaNacimiento);
        } 
        catch (Exception ex) 
        {
            System.out.println("Error:"+ex);
        }
        Calendar fechaNacimiento = Calendar.getInstance();
        //Se crea un objeto con la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fechaNac);
        //Se restan la fecha actual y la fecha de nacimiento
        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        //Se ajusta el año dependiendo el mes y el día
        if(mes<0 || (mes==0 && dia<0)){
            año--;
        }
        //Regresa la edad en base a la fecha de nacimiento
        return año;
    }
    
    private void registrarUsuarios(){
        if (validarFormalarioContratarEmpleados())
        {
            registrarUser();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los valores que se indican...", "Registro NotNull", JOptionPane.WARNING_MESSAGE);
            this.jtxtNewUser.requestFocus();
        }
    }
    
    public void configAccesoRegistro(){
        RegistroUser g = new RegistroUser();
        g.setTitle("Registro en NotNull");
        g.setLocationRelativeTo(null);
        g.setVisible(true);
        g.jlblNewUser.requestFocus();
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
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnReestablecerFormulario;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JComboBox jcboAño;
    private javax.swing.JComboBox jcboDia;
    private javax.swing.JComboBox jcboMes;
    private javax.swing.JLabel jlblApellido;
    private javax.swing.JLabel jlblBilletera;
    private javax.swing.JLabel jlblConfirmNewPassword;
    private javax.swing.JLabel jlblCreditoBienvenida;
    private javax.swing.JLabel jlblEjemploRutContratarEmpleados;
    private javax.swing.JLabel jlblEstadoContraseña;
    private javax.swing.JLabel jlblEstadoContraseñasIguales;
    private javax.swing.JLabel jlblEstadoRut;
    private javax.swing.JLabel jlblFechaNacimiento;
    private javax.swing.JLabel jlblNewPassword;
    private javax.swing.JLabel jlblNewUser;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblRut;
    private javax.swing.JPasswordField jpwConfirmNewPassword;
    private javax.swing.JPasswordField jpwNewPassword;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtBilletera;
    private javax.swing.JTextField jtxtNewUser;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtRut;
    // End of variables declaration//GEN-END:variables
}
//ok