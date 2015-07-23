package GUI;

//imports
import BLL.User;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Biblioteca extends javax.swing.JFrame {
    public Biblioteca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMontoCredito = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrameBilletera = new javax.swing.JInternalFrame();
        jPanelUserBilletera = new javax.swing.JPanel();
        jlblBilletera = new javax.swing.JLabel();
        jlblIconoBilletes = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblEdadUsuario = new javax.swing.JLabel();
        jInternalFrameAddCreditos = new javax.swing.JInternalFrame();
        jlblTituloMontosDeCarga = new javax.swing.JLabel();
        jrbtn1000 = new javax.swing.JRadioButton();
        jrbtn3000 = new javax.swing.JRadioButton();
        jrbtn5000 = new javax.swing.JRadioButton();
        jbtnAddCreditos = new javax.swing.JButton();
        jFrameJuegoBiblioteca = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLblIDJuegoBiblioteca = new javax.swing.JLabel();
        jLblNombreJuegoBiblioteca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLblCaratulaJuegoBiblioteca = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListadoJuegos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLblRestriccionJuegoBiblioteca = new javax.swing.JLabel();
        jBtnComprarJuegoBiblioteca = new javax.swing.JButton();
        jLblDescripcionJuegoBiblioteca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLblPrecioJuegoBiblioteca = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtPnDescripcion = new javax.swing.JTextPane();
        jlblIdVenta = new javax.swing.JLabel();
        jlblMarcaregistrada = new javax.swing.JLabel();
        jInternalFrameListadoMisjuegos = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMisjuegos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAccesoAdministrador = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuOpcion = new javax.swing.JMenu();
        jMenuItemBilletera = new javax.swing.JMenuItem();
        jMenuItemAñadirCreditos = new javax.swing.JMenuItem();
        jMenuItemMisJuegos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca NotNull");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bannerBiblioteca.png"))); // NOI18N
        jLabel1.setText("   ");
        jLabel1.setPreferredSize(new java.awt.Dimension(1240, 105));
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1166, 105);

        jInternalFrameBilletera.setClosable(true);
        jInternalFrameBilletera.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameBilletera.setTitle("Billetera");
        jInternalFrameBilletera.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shopping_icons-31-04-24.png"))); // NOI18N
        jInternalFrameBilletera.setVisible(true);

        jlblBilletera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlblIconoBilletes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dollar_coins-4848.png"))); // NOI18N

        jlblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUsuario.setText("Usuario");

        jlblEdadUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblEdadUsuario.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelUserBilleteraLayout = new javax.swing.GroupLayout(jPanelUserBilletera);
        jPanelUserBilletera.setLayout(jPanelUserBilleteraLayout);
        jPanelUserBilleteraLayout.setHorizontalGroup(
            jPanelUserBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                        .addComponent(jlblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                        .addComponent(jlblIconoBilletes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelUserBilleteraLayout.setVerticalGroup(
            jPanelUserBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                .addGroup(jPanelUserBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                        .addComponent(jlblEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jlblBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUserBilleteraLayout.createSequentialGroup()
                        .addComponent(jlblUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jlblIconoBilletes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameBilleteraLayout = new javax.swing.GroupLayout(jInternalFrameBilletera.getContentPane());
        jInternalFrameBilletera.getContentPane().setLayout(jInternalFrameBilleteraLayout);
        jInternalFrameBilleteraLayout.setHorizontalGroup(
            jInternalFrameBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBilleteraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUserBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameBilleteraLayout.setVerticalGroup(
            jInternalFrameBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBilleteraLayout.createSequentialGroup()
                .addComponent(jPanelUserBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameBilletera);
        jInternalFrameBilletera.setBounds(972, 110, 193, 130);

        jInternalFrameAddCreditos.setClosable(true);
        jInternalFrameAddCreditos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameAddCreditos.setTitle("Creditos");
        jInternalFrameAddCreditos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coin-add2424.png"))); // NOI18N
        jInternalFrameAddCreditos.setVisible(true);

        jlblTituloMontosDeCarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTituloMontosDeCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTituloMontosDeCarga.setText("Montos de Carga:");

        buttonGroupMontoCredito.add(jrbtn1000);
        jrbtn1000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtn1000.setSelected(true);
        jrbtn1000.setText("1000 Creditos");

        buttonGroupMontoCredito.add(jrbtn3000);
        jrbtn3000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtn3000.setText("3000 Creditos");

        buttonGroupMontoCredito.add(jrbtn5000);
        jrbtn5000.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbtn5000.setText("5000 Creditos");

        jbtnAddCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addwallet48.png"))); // NOI18N
        jbtnAddCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameAddCreditosLayout = new javax.swing.GroupLayout(jInternalFrameAddCreditos.getContentPane());
        jInternalFrameAddCreditos.getContentPane().setLayout(jInternalFrameAddCreditosLayout);
        jInternalFrameAddCreditosLayout.setHorizontalGroup(
            jInternalFrameAddCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAddCreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameAddCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameAddCreditosLayout.createSequentialGroup()
                        .addComponent(jlblTituloMontosDeCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jInternalFrameAddCreditosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrameAddCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbtn3000)
                            .addComponent(jrbtn1000)
                            .addComponent(jrbtn5000))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jInternalFrameAddCreditosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jbtnAddCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrameAddCreditosLayout.setVerticalGroup(
            jInternalFrameAddCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameAddCreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTituloMontosDeCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbtn1000)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbtn3000)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbtn5000)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnAddCreditos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameAddCreditos);
        jInternalFrameAddCreditos.setBounds(970, 250, 171, 210);

        jFrameJuegoBiblioteca.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/joypad24.png"))); // NOI18N
        jFrameJuegoBiblioteca.setVisible(true);
        jFrameJuegoBiblioteca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jFrameJuegoBibliotecaComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID");

        jLblIDJuegoBiblioteca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLblIDJuegoBiblioteca.setText("ID del Juego");

        jLblNombreJuegoBiblioteca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLblNombreJuegoBiblioteca.setText("Selecciona un juego de tu lista!");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Descripción");

        jLblCaratulaJuegoBiblioteca.setText(".");

        jTableListadoJuegos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jTableListadoJuegos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTableListadoJuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITULO", "DESCRIPCIÓN", "RESTRICCIÓN", "CARÁTULA", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListadoJuegos.setColumnSelectionAllowed(true);
        jTableListadoJuegos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableListadoJuegos.setRowHeight(30);
        jTableListadoJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListadoJuegosMousePressed(evt);
            }
        });
        jTableListadoJuegos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableListadoJuegosComponentShown(evt);
            }
        });
        jTableListadoJuegos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableListadoJuegosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListadoJuegos);
        jTableListadoJuegos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTableListadoJuegos.getColumnModel().getColumnCount() > 0) {
            jTableListadoJuegos.getColumnModel().getColumn(1).setResizable(false);
            jTableListadoJuegos.getColumnModel().getColumn(4).setResizable(false);
            jTableListadoJuegos.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTableListadoJuegos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("JUEGO PARA MAYORES DE");

        jLblRestriccionJuegoBiblioteca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLblRestriccionJuegoBiblioteca.setText("RESTRICCIÓN JUEGO");

        jBtnComprarJuegoBiblioteca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnComprarJuegoBiblioteca.setText("COMPRAR");
        jBtnComprarJuegoBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComprarJuegoBibliotecaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("VALOR EN NotNullCoins");

        jLblPrecioJuegoBiblioteca.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLblPrecioJuegoBiblioteca.setText("$");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NOTNULLCOIN50x50.png"))); // NOI18N

        jTxtPnDescripcion.setEditable(false);
        jTxtPnDescripcion.setBorder(null);
        jTxtPnDescripcion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jTxtPnDescripcion);

        jlblIdVenta.setForeground(new java.awt.Color(217, 216, 216));

        javax.swing.GroupLayout jFrameJuegoBibliotecaLayout = new javax.swing.GroupLayout(jFrameJuegoBiblioteca.getContentPane());
        jFrameJuegoBiblioteca.getContentPane().setLayout(jFrameJuegoBibliotecaLayout);
        jFrameJuegoBibliotecaLayout.setHorizontalGroup(
            jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                        .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                        .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLblRestriccionJuegoBiblioteca)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblCaratulaJuegoBiblioteca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                        .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel5))
                                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jLblPrecioJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jBtnComprarJuegoBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                        .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblIDJuegoBiblioteca))
                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLblDescripcionJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblNombreJuegoBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );
        jFrameJuegoBibliotecaLayout.setVerticalGroup(
            jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNombreJuegoBiblioteca)
                    .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLblIDJuegoBiblioteca))
                    .addComponent(jLblDescripcionJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLblCaratulaJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jFrameJuegoBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblPrecioJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnComprarJuegoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameJuegoBibliotecaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblRestriccionJuegoBiblioteca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        jDesktopPane1.add(jFrameJuegoBiblioteca);
        jFrameJuegoBiblioteca.setBounds(0, 110, 954, 520);

        jlblMarcaregistrada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jlblMarcaregistrada.setText("©2003-2014 NotNull, Inc. Las marcas y logotipos de NotNull, son marcas comerciales y/o marcas registradas de Not-Null Software en Chile y/o en otros países. Todos los derechos reservados.®");
        jDesktopPane1.add(jlblMarcaregistrada);
        jlblMarcaregistrada.setBounds(0, 661, 1020, 20);

        jInternalFrameListadoMisjuegos.setClosable(true);
        jInternalFrameListadoMisjuegos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameListadoMisjuegos.setTitle("Mis Juegos");
        jInternalFrameListadoMisjuegos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/joypad24.png"))); // NOI18N
        jInternalFrameListadoMisjuegos.setVisible(true);

        jTableMisjuegos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableMisjuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableMisjuegos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameListadoMisjuegosLayout = new javax.swing.GroupLayout(jInternalFrameListadoMisjuegos.getContentPane());
        jInternalFrameListadoMisjuegos.getContentPane().setLayout(jInternalFrameListadoMisjuegosLayout);
        jInternalFrameListadoMisjuegosLayout.setHorizontalGroup(
            jInternalFrameListadoMisjuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoMisjuegosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrameListadoMisjuegosLayout.setVerticalGroup(
            jInternalFrameListadoMisjuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoMisjuegosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrameListadoMisjuegosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameListadoMisjuegos);
        jInternalFrameListadoMisjuegos.setBounds(970, 470, 335, 180);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItemAccesoAdministrador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAccesoAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemAccesoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/padlock-24.png"))); // NOI18N
        jMenuItemAccesoAdministrador.setText("Acceso Administrador");
        jMenuItemAccesoAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccesoAdministradorActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAccesoAdministrador);

        jMenuItemCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2424.png"))); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar Sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel-24.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuOpcion.setText("Opcion");
        jMenuOpcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpcionActionPerformed(evt);
            }
        });

        jMenuItemBilletera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemBilletera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shopping_icons-31-04-24.png"))); // NOI18N
        jMenuItemBilletera.setText("Billetera");
        jMenuItemBilletera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBilleteraActionPerformed(evt);
            }
        });
        jMenuOpcion.add(jMenuItemBilletera);

        jMenuItemAñadirCreditos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemAñadirCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coin-add2424.png"))); // NOI18N
        jMenuItemAñadirCreditos.setText("Añadir Creditos");
        jMenuItemAñadirCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAñadirCreditosActionPerformed(evt);
            }
        });
        jMenuOpcion.add(jMenuItemAñadirCreditos);

        jMenuItemMisJuegos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItemMisJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/joypad24.png"))); // NOI18N
        jMenuItemMisJuegos.setText("Mis Juegos");
        jMenuItemMisJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMisJuegosActionPerformed(evt);
            }
        });
        jMenuOpcion.add(jMenuItemMisJuegos);

        jMenuBar1.add(jMenuOpcion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    //Cierra el panel de biblioteca usuario.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated

    private void jMenuOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpcionActionPerformed
        
    }//GEN-LAST:event_jMenuOpcionActionPerformed

    //Cierra sesión de usuario y abre el diálogo de inicio de sesión.
    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        this.dispose();
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    //Cierra el programa.
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    //Hace visible la billetera del usuario.
    private void jMenuItemBilleteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBilleteraActionPerformed
        this.jInternalFrameBilletera.setVisible(true);
    }//GEN-LAST:event_jMenuItemBilleteraActionPerformed

    //Hace visible el diálogo de carga de créditos.
    private void jMenuItemAñadirCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAñadirCreditosActionPerformed
        this.jInternalFrameAddCreditos.setVisible(true);
    }//GEN-LAST:event_jMenuItemAñadirCreditosActionPerformed

    //Agrega créditos a la billetera.
    private void jbtnAddCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCreditosActionPerformed
        agregarCreditosBilletera();
    }//GEN-LAST:event_jbtnAddCreditosActionPerformed

    //Compra el juego seleccionado.
    private void jBtnComprarJuegoBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComprarJuegoBibliotecaActionPerformed
      comprarJuego();
    }//GEN-LAST:event_jBtnComprarJuegoBibliotecaActionPerformed

    //Cambia la información basada en el juego seleccionado.
    private void jTableListadoJuegosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoJuegosMousePressed
        mostrarInfoJuegos();
        serialesDisponibles();
    }//GEN-LAST:event_jTableListadoJuegosMousePressed

    //Carga el listado de juegos al mostrar el frame biblioteca.
    private void jFrameJuegoBibliotecaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrameJuegoBibliotecaComponentShown
        cargarListadoJuegos();
    }//GEN-LAST:event_jFrameJuegoBibliotecaComponentShown

    //Carga el listado de juegos al mostrar el listado de juegos.
    private void jTableListadoJuegosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableListadoJuegosComponentShown
        cargarListadoJuegos();
    }//GEN-LAST:event_jTableListadoJuegosComponentShown

    //Carga el listado de juegos y sus IDs (?)
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarListadoJuegos();
        cargarIdJuegos();
    }//GEN-LAST:event_formComponentShown

    private void jTableListadoJuegosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoJuegosKeyReleased
        mostrarInfoJuegos();
        serialesDisponibles();
    }//GEN-LAST:event_jTableListadoJuegosKeyReleased

    private void jMenuItemMisJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMisJuegosActionPerformed
        jInternalFrameListadoMisjuegos.setVisible(true);
        String usuario = jlblUsuario.getText();
        listadoMisjuegos(usuario);
    }//GEN-LAST:event_jMenuItemMisJuegosActionPerformed

    private void jMenuItemAccesoAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccesoAdministradorActionPerformed
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_jMenuItemAccesoAdministradorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        crearReporte();
        abrirReporte();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /************************************************************************************/
    /*                METODOS QUE CARGAN JUEGOS EN EL JTABLE BIBLIOTECA                 */    
    /************************************************************************************/ 
    
    //Inicializa el Frame Biblioteca.
    public void configFrameBiblioteca(String usuario)   {
        Biblioteca b = new Biblioteca();
        b.setResizable(true);
        b.setLocationRelativeTo(null);
        b.setVisible(true);
        b.jlblUsuario.setText(usuario);
        b.setExtendedState(JFrame.MAXIMIZED_BOTH);
        b.jInternalFrameListadoMisjuegos.setVisible(false);
        b.jInternalFrameBilletera.setVisible(true);
        b.jInternalFrameAddCreditos.setVisible(false);
        BLL.User u = new BLL.User().buscarUser(usuario);
        b.jlblBilletera.setText(String.valueOf(u.getBilletera()));
        b.jlblEdadUsuario.setText(String.valueOf(calcularEdad(u.getFechaNacimiento())));
    }
    
    //Calcula la edad del usuario.
    private int calcularEdad(String FechaNacimiento)    {
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
        //Crea un objeto con la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        //Asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fechaNac);
        //Resta la fecha actual y la fecha de nacimiento
        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        //Ajusta el año dependiendo el mes y el día
        if(mes<0 || (mes==0 && dia<0)){
            año--;
        }
        //Retorna la edad en base a la fecha de nacimiento
        return año;
    }
        
    //Carga listado de juegos en jTable.
    private void cargarListadoJuegos()                  {
        int edadUser = Integer.parseInt(jlblEdadUsuario.getText());
        ArrayList<BLL.VideoGame> listado = new BLL.VideoGame().listadoVideoGames();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Descripción");
        modelo.addColumn("Restricción");
        modelo.addColumn("Carátula");
        modelo.addColumn("Valor");
        for(BLL.VideoGame v: listado)   
        {
            if(edadUser >= v.getRestriccion())
            {
            Object fila[] = new Object[6];
            fila[0] = v.getIdjuego();
            fila[1] = v.getTitulo();
            fila[2] = v.getDescripcion();
            fila[3] = v.getRestriccion();
            fila[4] = v.getCaratula();
            fila[5] = v.getValor();
            modelo.addRow(fila);
            }
        }
        this.jTableListadoJuegos.setModel(modelo);
        this.jTableListadoJuegos.changeSelection(0, 0, false, false);
        ocultarInfoInnecesaria();
    } 
    
    //Oculta información que no se necesita mostrar en el jTable, pero se debe utilizar como
    //referencia para mostrar información del juego seleccionado en mostrarInfoJuegos().
    private void ocultarInfoInnecesaria()               {
        
        //Esconde de la tabla la ID del juego
        this.jTableListadoJuegos.getColumnModel().getColumn(0).setMinWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(0).setMaxWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(0).setWidth(0);        
        //Esconde de la tabla la descripción del juego
        this.jTableListadoJuegos.getColumnModel().getColumn(2).setMinWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(2).setMaxWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(2).setWidth(0);
        //Esconde de la tabla la restricción del juego
        this.jTableListadoJuegos.getColumnModel().getColumn(3).setMinWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(3).setMaxWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(3).setWidth(0);        
        //Esconde de la tabla el nombre de archivo de la carátula del juego
        this.jTableListadoJuegos.getColumnModel().getColumn(4).setMinWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(4).setMaxWidth(0);
        this.jTableListadoJuegos.getColumnModel().getColumn(4).setWidth(0);
        
        
        //Fija el ancho de la columna precio en la tabla.
        this.jTableListadoJuegos.getColumnModel().getColumn(5).setMinWidth(100);
        this.jTableListadoJuegos.getColumnModel().getColumn(5).setMaxWidth(100);
        this.jTableListadoJuegos.getColumnModel().getColumn(5).setWidth(100);
    }
    
    //Muestra la información del juego seleccionado.
    public void mostrarInfoJuegos()                     {
        //Obtiene información del juego seleccionado en el jTable
        int fila = this.jTableListadoJuegos.getSelectedRow(); 
        //Asigna el ID de juego.                           
        this.jLblIDJuegoBiblioteca.setText(jTableListadoJuegos.getValueAt(fila, 0).toString());
        //Asigna el nombre del Juego.
        this.jLblNombreJuegoBiblioteca.setText(jTableListadoJuegos.getValueAt(fila, 1).toString());
        //Asigna la descripción del Juego
        this.jTxtPnDescripcion.setText(jTableListadoJuegos.getValueAt(fila, 2).toString());
        //Asigna restricción de edad del juego.
        this.jLblRestriccionJuegoBiblioteca.setText(jTableListadoJuegos.getValueAt(fila, 3).toString());
        asignarIconosPegi();
        //Asigna carátula del juego.
        this.jLblCaratulaJuegoBiblioteca.setIcon(new ImageIcon(
                jTableListadoJuegos.getValueAt(fila, 4).toString()));
        //Asigna precio del juego.
        this.jLblPrecioJuegoBiblioteca.setText(jTableListadoJuegos.getValueAt(fila, 5).toString());
    }
    
    //Asigna íconos PEGI basados en la restricción de edad del juego.
    private void asignarIconosPegi()                    {
        if (((Integer.parseInt(this.jLblRestriccionJuegoBiblioteca.getText())>=18) ))
        {
            jLblRestriccionJuegoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/pegi18.gif")));
            this.jLblRestriccionJuegoBiblioteca.setText(null);
        } 
        else if (Integer.parseInt(this.jLblRestriccionJuegoBiblioteca.getText())>=16) 
        {
            jLblRestriccionJuegoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/pegi16.gif")));
            this.jLblRestriccionJuegoBiblioteca.setText(null);
        } 
        else if (Integer.parseInt(this.jLblRestriccionJuegoBiblioteca.getText())>=12) 
        {
            jLblRestriccionJuegoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/pegi12.gif")));
            this.jLblRestriccionJuegoBiblioteca.setText(null);
        } 
        else if (Integer.parseInt(this.jLblRestriccionJuegoBiblioteca.getText())>=7) 
        {
            jLblRestriccionJuegoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/pegi7.gif")));
            this.jLblRestriccionJuegoBiblioteca.setText(null);
        } 
        else if (Integer.parseInt(this.jLblRestriccionJuegoBiblioteca.getText())>=3) 
        {
            jLblRestriccionJuegoBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/Imagenes/pegi3.gif")));
            this.jLblRestriccionJuegoBiblioteca.setText(null);
        } 
        else
        {
            jLblRestriccionJuegoBiblioteca.setIcon(null);
        }
    }
    
    //Carga ID de juegos.   
    public void cargarIdJuegos()                        {
        int max = new BLL.Biblioteca().maxIdventa();
        if(max > -1)
        {
           this.jlblIdVenta.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha producido un error!!!", 
                    "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Habilita/deshabilita el botón de compra de juegos dependiendo de la disponibilidad
    //de seriales.
    public void serialesDisponibles()                   {
        for(BLL.VideoGame v:new BLL.VideoGame().listadoVideoGames())
        {
            for(BLL.SerialNumber s: new BLL.SerialNumber().listadoSerialNumbers())
            {
                if((v.getIdjuego()==s.getIdjuego()) && (s.getIdjuego() == Integer.parseInt(
                        this.jLblIDJuegoBiblioteca.getText()) && (v.getIdjuego() == Integer.parseInt(
                                this.jLblIDJuegoBiblioteca.getText()))))
                {
                    if(s.getEstado()==0)
                    {
                        this.jBtnComprarJuegoBiblioteca.setEnabled(true);    
                        this.jBtnComprarJuegoBiblioteca.setForeground(Color.black);
                        this.jBtnComprarJuegoBiblioteca.setText("Comprar");
                    }
                    else
                    {
                        this.jBtnComprarJuegoBiblioteca.setEnabled(false);
                        this.jBtnComprarJuegoBiblioteca.setForeground(Color.red);
                        this.jBtnComprarJuegoBiblioteca.setText("Juego Agotado");
                    }
                }
            }
        } 
    } 
    
    /************************************************************************************/
    /*              METODOS QUE VALIDAN Y REALIZAN COMPRA DE VIDEOJUEGO                 */    
    /************************************************************************************/ 
    
    //Prepara, valida y efectúa la compra/ofrece cargar más créditos si estos son insuficientes.
    private void comprarJuego()                                         {
        //Captura datos relevantes a la compra.
        String username = this.jlblUsuario.getText();
        int idJuego = Integer.parseInt(this.jLblIDJuegoBiblioteca.getText());
        int precio = Integer.parseInt(this.jLblPrecioJuegoBiblioteca.getText());
        
        //Consulta si el cliente ya ha comprado el juego.
        if(buscarJuegoRepetido(username,idJuego))
        {
            JOptionPane.showMessageDialog(null, jLblNombreJuegoBiblioteca.getText() + 
                    "\n\nYa es parte de su biblioteca.", "Biblioteca", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //Consulta si el cliente tiene saldo y ejecuta la compra.
            if (revisarSaldoSuficiente(username)) 
            {
                guardarKeyCompradaEnBiblioteca();
                cargarIdJuegos();
                actualizarCreditosPostVenta(precio,username);
                listadoMisjuegos(username);
            }
            //Informa al usuario de su falta de créditos y ofrece la posibilidad de comprar más.
            else
            {
                int respuesta =JOptionPane.showConfirmDialog(null, "No tienes saldo suficiente para "
                          + "comprar este juego \n¿Deseas cargar más NotNullCoins a tu "
                          + "biblioteca?", "Saldo Insuficiente", JOptionPane.INFORMATION_MESSAGE);
                
                //Si el usuario desea comprar más créditos, se carga el panel correspondiente.
                if(respuesta == JOptionPane.YES_OPTION)
                {
                    jInternalFrameAddCreditos.setVisible(true);
                }
            }
        }
    }
    
    //Verifica si el usuario tiene saldo suficiente para comprar el juego.
    private boolean revisarSaldoSuficiente(String username)             {
        BLL.User u = new User();
        if (u.buscarUser(username).getBilletera() >= 
                Integer.parseInt(this.jLblPrecioJuegoBiblioteca.getText())) {
            return true;
        }
        else    
        {
            return false;
        }    
    }
    
    //verifica si el usuario ya tiene el juego en su biblioteca.
    private boolean buscarJuegoRepetido(String username, int idJuego)   {
    for (BLL.Biblioteca bb: new BLL.Biblioteca().ConsultarBibliotecaUsuario(username)) 
    {
        if (bb.getIdJuego() == idJuego) 
        {
            return true;
        }
    }
    return false;
 }

    //Muestra el serialNumber del juego comprado.
    public String mostrarKey()                                          {
       for(BLL.VideoGame v:new BLL.VideoGame().listadoVideoGames())
       {
           for(BLL.SerialNumber s: new BLL.SerialNumber().listadoSerialNumbers())
           {
               if((v.getIdjuego()==s.getIdjuego()) && (s.getIdjuego() == Integer.parseInt(
                       this.jLblIDJuegoBiblioteca.getText()) && (v.getIdjuego() == Integer.parseInt(
                               this.jLblIDJuegoBiblioteca.getText()))))
               {
                   if(s.getEstado()==0)
                   {
                   JOptionPane.showMessageDialog(null,v.getTitulo()+"\n\n"+s.getSerie(), "Venta de juego", 
                           JOptionPane.INFORMATION_MESSAGE);
                   s.actualizarSerial(s.getSerie(), s.getEstado(), s.getIdjuego());
                   return s.getSerie();
                   }
                }
            }
       } 
       return null; 
     }

    //Guarda las keys compradas en la biblioteca.
    public void guardarKeyCompradaEnBiblioteca()                        {
        int idVenta=Integer.parseInt(this.jlblIdVenta.getText());
        String username = this.jlblUsuario.getText();
        int idJuego = Integer.parseInt(this.jLblIDJuegoBiblioteca.getText());
        String key = mostrarKey();
        int resultado = new BLL.Biblioteca().insertBiblioteca(idVenta,username,idJuego,key); 
        switch(resultado)
        {
        case 1: JOptionPane.showMessageDialog(null, jLblNombreJuegoBiblioteca.getText() + 
                "\n\nFue Guardado en su biblioteca", "Biblioteca", JOptionPane.INFORMATION_MESSAGE);
        //          mostrarKey();
                cargarIdJuegos();
                break;
        case 1062: JOptionPane.showMessageDialog(null, jLblNombreJuegoBiblioteca.getText() + 
                "\n\nYa es parte de su biblioteca.", "Biblioteca1", JOptionPane.ERROR_MESSAGE); 
                break;
        case 1048: JOptionPane.showMessageDialog(null, jLblNombreJuegoBiblioteca.getText() + 
                "\n\nEste juego Esta Agotado.", "Biblioteca", JOptionPane.ERROR_MESSAGE); 
                break;    
        default: JOptionPane.showMessageDialog(null, 
                "Error desconocido. Contacte a soporte@notnull.cl: \n" + resultado, 
                "Biblioteca", JOptionPane.ERROR_MESSAGE); 
                break;
        } 
         
    }
    
    /************************************************************************************/
    /*            METODOS QUE INICIALIZAN Y ACTUALIZAN CRÉDITOS EN BILLETERA            */    
    /************************************************************************************/ 
    
    //Determina los créditos a cargar en la billetera del usuario.
    private void agregarCreditosBilletera()                                 {
        if (jrbtn1000.isSelected()) 
        {
            int carga = 1000;
            cargaCreditos(carga);
        }
        else
        {
            if (jrbtn3000.isSelected()) 
            {
                int carga = 3000;
                cargaCreditos(carga);
            } 
            else 
            {
                int carga = 5000;
                cargaCreditos(carga);
            }       
        }
    }
    
    //Agrega los créditos a la billetera del usuario. 
    private void cargaCreditos(int carga)                                   {
        try
        {
            String user = jlblUsuario.getText();
            int resultado = new BLL.User().actualizarBilletera(carga, user);
            int billeteraActual = Integer.parseInt(this.jlblBilletera.getText());
            switch(resultado)
            {
                case 0: JOptionPane.showMessageDialog(null, "El usuario No existe", 
                    "Carga Billetera", JOptionPane.WARNING_MESSAGE);
                    break;
                case 1: JOptionPane.showMessageDialog(null, "Creditos Cargados Exitosamente", 
                    "Carga Billetera", JOptionPane.INFORMATION_MESSAGE);
                    this.jrbtn1000.setSelected(true);
                    this.jlblBilletera.setText(String.valueOf(billeteraActual + carga));
                    break;    
                default: JOptionPane.showMessageDialog(null, "Error desconocido. "
                    + "Contacte el administrador: " + resultado, "Carga Billetera", 
                    JOptionPane.ERROR_MESSAGE); 
                    break;
            }
        }
        catch(NumberFormatException e)
        {
            e.getMessage();
        }   
    }
    
    //Descuenta los créditos utilizados después de una venta.
    private void actualizarCreditosPostVenta(int preciojuego, String user)  {
        BLL.User u = new User();
        int valorADescontar = preciojuego*-1;
        u.actualizarBilletera(valorADescontar, user);
        int billeteraActual = Integer.parseInt(this.jlblBilletera.getText());
        this.jlblBilletera.setText(String.valueOf(billeteraActual - preciojuego));
    }

    /************************************************************************************/
    /*            METODOS QUE GENERAN Y ABREN REPORTE DE JUEGOS DEL USUARIO             */    
    /************************************************************************************/     

    //Muestra el listado de juegos que el usuario ha comprado.
    private void listadoMisjuegos(String usuario)                       {
       DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo");
        modelo.addColumn("Serial");
        for (BLL.Biblioteca bb: new BLL.Biblioteca().ConsultarBibliotecaUsuario(usuario))
        {
            Object fila[] = new Object[2];
            fila[0] = new BLL.VideoGame().tituloJuego(bb.getIdJuego());
            fila[1] = bb.getSerie();
            modelo.addRow(fila);
        }
        this.jTableMisjuegos.setModel(modelo); 
    } 

    //Crea el reporte de juegos que el usuario ha comprado.
    public void crearReporte()                                          {
        try 
        {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                     "user.dir")+"\\src\\Reportes\\Juegos_"+this.jlblUsuario.getText()+".pdf"));
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             "
                    + "Mis Juegos",FontFactory.getFont(FontFactory.TIMES_BOLD,18,
                            Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Titulo"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Serial"));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            String usuario = this.jlblUsuario.getText();
            for (BLL.Biblioteca bb: new BLL.Biblioteca().ConsultarBibliotecaUsuario(usuario))
            {
                String titulo = new BLL.VideoGame().tituloJuego(bb.getIdJuego());
                String serial = bb.getSerie();
                table.addCell(titulo);
                table.addCell(serial);
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close(); 
        }
        catch (Exception e)
        {
            System.out.println("Error al generar el reporte.");
        }
    } 

    //Abre el archivo .PDF una vez creado.
    private void abrirReporte()                                         {
        try 
        {
            Desktop dk=Desktop.getDesktop();
            dk.open(new File(System.getProperty("user.dir")+
                    "\\src\\Reportes\\Juegos_"+this.jlblUsuario.getText()+".pdf"));      
        } 
        catch (Exception e) 
        {
            System.out.println("Error al abrir archivo .PDF");
        }
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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMontoCredito;
    private javax.swing.JButton jBtnComprarJuegoBiblioteca;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jFrameJuegoBiblioteca;
    private javax.swing.JInternalFrame jInternalFrameAddCreditos;
    private javax.swing.JInternalFrame jInternalFrameBilletera;
    private javax.swing.JInternalFrame jInternalFrameListadoMisjuegos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblCaratulaJuegoBiblioteca;
    private javax.swing.JLabel jLblDescripcionJuegoBiblioteca;
    private javax.swing.JLabel jLblIDJuegoBiblioteca;
    private javax.swing.JLabel jLblNombreJuegoBiblioteca;
    private javax.swing.JLabel jLblPrecioJuegoBiblioteca;
    private javax.swing.JLabel jLblRestriccionJuegoBiblioteca;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAccesoAdministrador;
    private javax.swing.JMenuItem jMenuItemAñadirCreditos;
    private javax.swing.JMenuItem jMenuItemBilletera;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemMisJuegos;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuOpcion;
    private javax.swing.JPanel jPanelUserBilletera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableListadoJuegos;
    private javax.swing.JTable jTableMisjuegos;
    private javax.swing.JTextPane jTxtPnDescripcion;
    private javax.swing.JButton jbtnAddCreditos;
    private javax.swing.JLabel jlblBilletera;
    private javax.swing.JLabel jlblEdadUsuario;
    private javax.swing.JLabel jlblIconoBilletes;
    private javax.swing.JLabel jlblIdVenta;
    private javax.swing.JLabel jlblMarcaregistrada;
    private javax.swing.JLabel jlblTituloMontosDeCarga;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JRadioButton jrbtn1000;
    private javax.swing.JRadioButton jrbtn3000;
    private javax.swing.JRadioButton jrbtn5000;
    // End of variables declaration//GEN-END:variables
}