package GUI;

//Imports
import BLL.SerialNumber;
import DAL.SerialNumberDAL;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelAdmin extends javax.swing.JFrame {
    
    //Inicializa jFileChooser
    private JFileChooser filechooser = new JFileChooser();
    public String nombreJuegoSeleccionado = "";

    //Entrega estados iniciales a los componentes de PanelAdmin
    public PanelAdmin() {
        initComponents();
        this.jInternalFrameregistroDeJuegos.setVisible(true);
        this.jInternalFrameTopFive.setVisible(false);
        this.jInternalFrameUsuarioConMayorCompras.setVisible(false);
        this.jInternalFrameGananciaTotalxJuego.setVisible(false);
        this.jInternalFrameVideoJuegosSinStock.setVisible(false);
        this.jInternalFrameVideoJuegosVendidos.setVisible(false);
        this.jInternalFrameListadoVideoJuegos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRestricionDeEdad = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameregistroDeJuegos = new javax.swing.JInternalFrame();
        jlblIdJuego = new javax.swing.JLabel();
        jlblDescripcion = new javax.swing.JLabel();
        jlblNombreJuego = new javax.swing.JLabel();
        jbtnRegistrarJuego = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtPanelDescripcion = new javax.swing.JTextPane();
        jtxtNombreJuego = new javax.swing.JTextField();
        jtxtIdJuego = new javax.swing.JTextField();
        jlblEdadMinima = new javax.swing.JLabel();
        jlblValorUnitario = new javax.swing.JLabel();
        jtxtValorUnitario = new javax.swing.JTextField();
        jlblCantidad = new javax.swing.JLabel();
        jtxtCantidad = new javax.swing.JTextField();
        jbtnCancelar = new javax.swing.JButton();
        jbtnReestablecer1 = new javax.swing.JButton();
        jtxtCaratulas = new javax.swing.JTextField();
        jbtnCargarCaratula = new javax.swing.JButton();
        jrbtn3 = new javax.swing.JRadioButton();
        jrbtn7 = new javax.swing.JRadioButton();
        jrbtn12 = new javax.swing.JRadioButton();
        jrbtn18 = new javax.swing.JRadioButton();
        jrbtn16 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jInternalFrameListadoVideoJuegos = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableListadoJuegos = new javax.swing.JTable();
        jbtnListadoVideoJuegosPDF = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSerialesDelJuego = new javax.swing.JTable();
        jbtnSerialesJuegoSeleccionadoPDF = new javax.swing.JButton();
        jlblNombreJuegoSeriales = new javax.swing.JLabel();
        jInternalFrameGananciaTotalxJuego = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGananciaTotalxJuego = new javax.swing.JTable();
        jbtnGananciaPorJuegoPDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtGananciaTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrameUsuarioConMayorCompras = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsuarioConMayorCompras = new javax.swing.JTable();
        jbtnUsuarioConMayoComprasPDF = new javax.swing.JButton();
        jInternalFrameVideoJuegosVendidos = new javax.swing.JInternalFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableListadoJuegosVendidos = new javax.swing.JTable();
        jbtnVideosJuegosVendidosPDF = new javax.swing.JButton();
        jInternalFrameTopFive = new javax.swing.JInternalFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableTopfive = new javax.swing.JTable();
        jbtnTopFivePDF = new javax.swing.JButton();
        jInternalFrameVideoJuegosSinStock = new javax.swing.JInternalFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableVideojuegosSinStock = new javax.swing.JTable();
        jbtnVideosJuegosSinStockPDF = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemRegistrosDeJuegos = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMenuItemListadoVideoJuegos = new javax.swing.JMenuItem();
        jMenuItemVideojuegosVendidos = new javax.swing.JMenuItem();
        jMenuItemVideojuegosSinStock = new javax.swing.JMenuItem();
        jMenuItemGananciaTotalPorJuego = new javax.swing.JMenuItem();
        jMenuItemUsuarioConMayorCompras = new javax.swing.JMenuItem();
        jMenuItemTopFiveVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel Admin NotNull");
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jInternalFrameregistroDeJuegos.setBackground(new java.awt.Color(0, 102, 102));
        jInternalFrameregistroDeJuegos.setClosable(true);
        jInternalFrameregistroDeJuegos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameregistroDeJuegos.setTitle("REGISTRO DE JUEGOS");
        jInternalFrameregistroDeJuegos.setToolTipText("");
        jInternalFrameregistroDeJuegos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addGame.png"))); // NOI18N
        jInternalFrameregistroDeJuegos.setVisible(true);
        jInternalFrameregistroDeJuegos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jInternalFrameregistroDeJuegosComponentShown(evt);
            }
        });

        jlblIdJuego.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblIdJuego.setText("IDJUEGO");

        jlblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblDescripcion.setText("DESCRIPCION");

        jlblNombreJuego.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblNombreJuego.setText("NOMBRE JUEGO");

        jbtnRegistrarJuego.setBackground(new java.awt.Color(0, 102, 102));
        jbtnRegistrarJuego.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarJuego.setText("REGISTRAR JUEGO");
        jbtnRegistrarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarJuegoActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtxtPanelDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPanelDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtxtPanelDescripcion);

        jtxtNombreJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreJuegoKeyTyped(evt);
            }
        });

        jtxtIdJuego.setEditable(false);
        jtxtIdJuego.setFocusable(false);

        jlblEdadMinima.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblEdadMinima.setText("EDAD MINIMA");

        jlblValorUnitario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblValorUnitario.setText("VALOR UNITARIO");

        jtxtValorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtValorUnitarioFocusLost(evt);
            }
        });
        jtxtValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtValorUnitarioKeyTyped(evt);
            }
        });

        jlblCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblCantidad.setText("CANTIDAD DE JUEGOS");

        jtxtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCantidadKeyTyped(evt);
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

        jbtnReestablecer1.setBackground(new java.awt.Color(0, 102, 102));
        jbtnReestablecer1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReestablecer1.setText("REESTABLECER");
        jbtnReestablecer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReestablecer1ActionPerformed(evt);
            }
        });

        jtxtCaratulas.setEditable(false);
        jtxtCaratulas.setFocusable(false);
        jtxtCaratulas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCaratulasKeyTyped(evt);
            }
        });

        jbtnCargarCaratula.setText("Cargar Caratula");
        jbtnCargarCaratula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCargarCaratulaActionPerformed(evt);
            }
        });

        buttonGroupRestricionDeEdad.add(jrbtn3);
        jrbtn3.setSelected(true);
        jrbtn3.setText("3");

        buttonGroupRestricionDeEdad.add(jrbtn7);
        jrbtn7.setText("7");

        buttonGroupRestricionDeEdad.add(jrbtn12);
        jrbtn12.setText("12");

        buttonGroupRestricionDeEdad.add(jrbtn18);
        jrbtn18.setText("18");

        buttonGroupRestricionDeEdad.add(jrbtn16);
        jrbtn16.setText("16");

        javax.swing.GroupLayout jInternalFrameregistroDeJuegosLayout = new javax.swing.GroupLayout(jInternalFrameregistroDeJuegos.getContentPane());
        jInternalFrameregistroDeJuegos.getContentPane().setLayout(jInternalFrameregistroDeJuegosLayout);
        jInternalFrameregistroDeJuegosLayout.setHorizontalGroup(
            jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameregistroDeJuegosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblCantidad)
                    .addComponent(jlblIdJuego)
                    .addComponent(jlblNombreJuego)
                    .addComponent(jlblDescripcion)
                    .addComponent(jlblEdadMinima)
                    .addComponent(jlblValorUnitario)
                    .addComponent(jbtnCargarCaratula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtNombreJuego)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameregistroDeJuegosLayout.createSequentialGroup()
                            .addComponent(jbtnReestablecer1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtxtCaratulas)
                        .addComponent(jtxtIdJuego)
                        .addComponent(jbtnRegistrarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrameregistroDeJuegosLayout.createSequentialGroup()
                        .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtValorUnitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameregistroDeJuegosLayout.createSequentialGroup()
                                .addComponent(jrbtn3)
                                .addGap(18, 18, 18)
                                .addComponent(jrbtn7)
                                .addGap(18, 18, 18)
                                .addComponent(jrbtn12)))
                        .addGap(18, 18, 18)
                        .addComponent(jrbtn16)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtn18)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jInternalFrameregistroDeJuegosLayout.setVerticalGroup(
            jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameregistroDeJuegosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIdJuego)
                    .addComponent(jtxtIdJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNombreJuego)
                    .addComponent(jtxtNombreJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbtn16)
                        .addComponent(jrbtn18))
                    .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblEdadMinima)
                        .addComponent(jrbtn3)
                        .addComponent(jrbtn7)
                        .addComponent(jrbtn12)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblValorUnitario)
                    .addComponent(jtxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCantidad)
                    .addComponent(jtxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCaratulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCargarCaratula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jbtnRegistrarJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameregistroDeJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnReestablecer1))
                .addGap(64, 64, 64))
        );

        jDesktopPane1.add(jInternalFrameregistroDeJuegos);
        jInternalFrameregistroDeJuegos.setBounds(10, 10, 470, 550);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("©2003-2014 NotNull, Inc. Las marcas y logotipos de NotNull, son marcas comerciales y/o marcas registradas de Not-Null Software en Chile y/o en otros países. Todos los derechos reservados.®");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(10, 650, 980, 20);

        jInternalFrameListadoVideoJuegos.setClosable(true);
        jInternalFrameListadoVideoJuegos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameListadoVideoJuegos.setTitle("Listado Video Juegos");
        jInternalFrameListadoVideoJuegos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblem-games2424.png"))); // NOI18N
        jInternalFrameListadoVideoJuegos.setVisible(true);

        jTableListadoJuegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListadoJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListadoJuegosMousePressed(evt);
            }
        });
        jTableListadoJuegos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableListadoJuegosKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTableListadoJuegos);

        jbtnListadoVideoJuegosPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnListadoVideoJuegosPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListadoVideoJuegosPDFActionPerformed(evt);
            }
        });

        jTableSerialesDelJuego.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableSerialesDelJuego);

        jbtnSerialesJuegoSeleccionadoPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnSerialesJuegoSeleccionadoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSerialesJuegoSeleccionadoPDFActionPerformed(evt);
            }
        });

        jlblNombreJuegoSeriales.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jlblNombreJuegoSeriales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jInternalFrameListadoVideoJuegosLayout = new javax.swing.GroupLayout(jInternalFrameListadoVideoJuegos.getContentPane());
        jInternalFrameListadoVideoJuegos.getContentPane().setLayout(jInternalFrameListadoVideoJuegosLayout);
        jInternalFrameListadoVideoJuegosLayout.setHorizontalGroup(
            jInternalFrameListadoVideoJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnListadoVideoJuegosPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameListadoVideoJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNombreJuegoSeriales, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSerialesJuegoSeleccionadoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jInternalFrameListadoVideoJuegosLayout.setVerticalGroup(
            jInternalFrameListadoVideoJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                .addGroup(jInternalFrameListadoVideoJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                        .addGroup(jInternalFrameListadoVideoJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbtnListadoVideoJuegosPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jbtnSerialesJuegoSeleccionadoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameListadoVideoJuegosLayout.createSequentialGroup()
                                .addComponent(jlblNombreJuegoSeriales, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jDesktopPane1.add(jInternalFrameListadoVideoJuegos);
        jInternalFrameListadoVideoJuegos.setBounds(490, 10, 760, 200);

        jInternalFrameGananciaTotalxJuego.setClosable(true);
        jInternalFrameGananciaTotalxJuego.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameGananciaTotalxJuego.setTitle("Ganancia Total por Juego");
        jInternalFrameGananciaTotalxJuego.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency_dollar green2424.png"))); // NOI18N
        jInternalFrameGananciaTotalxJuego.setVisible(true);

        jTableGananciaTotalxJuego.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableGananciaTotalxJuego);

        jbtnGananciaPorJuegoPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnGananciaPorJuegoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGananciaPorJuegoPDFActionPerformed(evt);
            }
        });

        jLabel1.setText("Ganancia");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jTxtGananciaTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtGananciaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtGananciaTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("Total:");

        javax.swing.GroupLayout jInternalFrameGananciaTotalxJuegoLayout = new javax.swing.GroupLayout(jInternalFrameGananciaTotalxJuego.getContentPane());
        jInternalFrameGananciaTotalxJuego.getContentPane().setLayout(jInternalFrameGananciaTotalxJuegoLayout);
        jInternalFrameGananciaTotalxJuegoLayout.setHorizontalGroup(
            jInternalFrameGananciaTotalxJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameGananciaTotalxJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameGananciaTotalxJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnGananciaPorJuegoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtGananciaTotal)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameGananciaTotalxJuegoLayout.setVerticalGroup(
            jInternalFrameGananciaTotalxJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameGananciaTotalxJuegoLayout.createSequentialGroup()
                .addGroup(jInternalFrameGananciaTotalxJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(jInternalFrameGananciaTotalxJuegoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnGananciaPorJuegoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtGananciaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jDesktopPane1.add(jInternalFrameGananciaTotalxJuego);
        jInternalFrameGananciaTotalxJuego.setBounds(900, 220, 390, 200);

        jInternalFrameUsuarioConMayorCompras.setClosable(true);
        jInternalFrameUsuarioConMayorCompras.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameUsuarioConMayorCompras.setTitle("Usuario Con Mayor Compras");
        jInternalFrameUsuarioConMayorCompras.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Superman2424.png"))); // NOI18N
        jInternalFrameUsuarioConMayorCompras.setVisible(true);

        jTableUsuarioConMayorCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableUsuarioConMayorCompras);

        jbtnUsuarioConMayoComprasPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnUsuarioConMayoComprasPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuarioConMayoComprasPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameUsuarioConMayorComprasLayout = new javax.swing.GroupLayout(jInternalFrameUsuarioConMayorCompras.getContentPane());
        jInternalFrameUsuarioConMayorCompras.getContentPane().setLayout(jInternalFrameUsuarioConMayorComprasLayout);
        jInternalFrameUsuarioConMayorComprasLayout.setHorizontalGroup(
            jInternalFrameUsuarioConMayorComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameUsuarioConMayorComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnUsuarioConMayoComprasPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameUsuarioConMayorComprasLayout.setVerticalGroup(
            jInternalFrameUsuarioConMayorComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameUsuarioConMayorComprasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrameUsuarioConMayorComprasLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jbtnUsuarioConMayoComprasPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameUsuarioConMayorCompras);
        jInternalFrameUsuarioConMayorCompras.setBounds(800, 430, 240, 200);

        jInternalFrameVideoJuegosVendidos.setClosable(true);
        jInternalFrameVideoJuegosVendidos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameVideoJuegosVendidos.setTitle("Videojuegos Vendidos");
        jInternalFrameVideoJuegosVendidos.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tag_Sold-24.png"))); // NOI18N
        jInternalFrameVideoJuegosVendidos.setVisible(true);

        jTableListadoJuegosVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableListadoJuegosVendidos);

        jbtnVideosJuegosVendidosPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnVideosJuegosVendidosPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVideosJuegosVendidosPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameVideoJuegosVendidosLayout = new javax.swing.GroupLayout(jInternalFrameVideoJuegosVendidos.getContentPane());
        jInternalFrameVideoJuegosVendidos.getContentPane().setLayout(jInternalFrameVideoJuegosVendidosLayout);
        jInternalFrameVideoJuegosVendidosLayout.setHorizontalGroup(
            jInternalFrameVideoJuegosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameVideoJuegosVendidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnVideosJuegosVendidosPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameVideoJuegosVendidosLayout.setVerticalGroup(
            jInternalFrameVideoJuegosVendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameVideoJuegosVendidosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jbtnVideosJuegosVendidosPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameVideoJuegosVendidosLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.add(jInternalFrameVideoJuegosVendidos);
        jInternalFrameVideoJuegosVendidos.setBounds(490, 220, 400, 200);

        jInternalFrameTopFive.setClosable(true);
        jInternalFrameTopFive.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameTopFive.setTitle("Top 5 Ventas");
        jInternalFrameTopFive.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flat_seo-40-24.png"))); // NOI18N
        jInternalFrameTopFive.setVisible(true);

        jTableTopfive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTableTopfive);

        jbtnTopFivePDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnTopFivePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTopFivePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameTopFiveLayout = new javax.swing.GroupLayout(jInternalFrameTopFive.getContentPane());
        jInternalFrameTopFive.getContentPane().setLayout(jInternalFrameTopFiveLayout);
        jInternalFrameTopFiveLayout.setHorizontalGroup(
            jInternalFrameTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameTopFiveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnTopFivePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameTopFiveLayout.setVerticalGroup(
            jInternalFrameTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameTopFiveLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrameTopFiveLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jbtnTopFivePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameTopFive);
        jInternalFrameTopFive.setBounds(1050, 430, 300, 200);

        jInternalFrameVideoJuegosSinStock.setClosable(true);
        jInternalFrameVideoJuegosSinStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameVideoJuegosSinStock.setTitle("Videojuegos sin Stock");
        jInternalFrameVideoJuegosSinStock.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/614343-0-24.png"))); // NOI18N
        jInternalFrameVideoJuegosSinStock.setVisible(true);

        jTableVideojuegosSinStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableVideojuegosSinStock);

        jbtnVideosJuegosSinStockPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_pdf4848.png"))); // NOI18N
        jbtnVideosJuegosSinStockPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVideosJuegosSinStockPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameVideoJuegosSinStockLayout = new javax.swing.GroupLayout(jInternalFrameVideoJuegosSinStock.getContentPane());
        jInternalFrameVideoJuegosSinStock.getContentPane().setLayout(jInternalFrameVideoJuegosSinStockLayout);
        jInternalFrameVideoJuegosSinStockLayout.setHorizontalGroup(
            jInternalFrameVideoJuegosSinStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameVideoJuegosSinStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnVideosJuegosSinStockPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameVideoJuegosSinStockLayout.setVerticalGroup(
            jInternalFrameVideoJuegosSinStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameVideoJuegosSinStockLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrameVideoJuegosSinStockLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jbtnVideosJuegosSinStockPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrameVideoJuegosSinStock);
        jInternalFrameVideoJuegosSinStock.setBounds(490, 430, 300, 200);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMenuBar1ComponentShown(evt);
            }
        });

        jMenuArchivo.setMnemonic('a');
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_login_man-24.png"))); // NOI18N
        jMenuItem1.setText("Acceso Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItem1);

        jMenuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2424.png"))); // NOI18N
        jMenuItemCerrarSesion.setText("Cerrar Sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel-24.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuOpciones.setMnemonic('o');
        jMenuOpciones.setText("Opciones");
        jMenuOpciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItemRegistrosDeJuegos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRegistrosDeJuegos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemRegistrosDeJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addGame.png"))); // NOI18N
        jMenuItemRegistrosDeJuegos.setText("Registro de Juegos");
        jMenuItemRegistrosDeJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrosDeJuegosActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemRegistrosDeJuegos);

        jMenuBar1.add(jMenuOpciones);

        jMenuReportes.setMnemonic('r');
        jMenuReportes.setText("Reportes");
        jMenuReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuItemListadoVideoJuegos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemListadoVideoJuegos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemListadoVideoJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblem-games2424.png"))); // NOI18N
        jMenuItemListadoVideoJuegos.setText("Listado Video Juegos");
        jMenuItemListadoVideoJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListadoVideoJuegosActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemListadoVideoJuegos);

        jMenuItemVideojuegosVendidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemVideojuegosVendidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemVideojuegosVendidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tag_Sold-24.png"))); // NOI18N
        jMenuItemVideojuegosVendidos.setText("Videojuegos Vendidos");
        jMenuItemVideojuegosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVideojuegosVendidosActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVideojuegosVendidos);

        jMenuItemVideojuegosSinStock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemVideojuegosSinStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemVideojuegosSinStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/614343-0-24.png"))); // NOI18N
        jMenuItemVideojuegosSinStock.setText("Videojuegos sin Stock");
        jMenuItemVideojuegosSinStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVideojuegosSinStockActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemVideojuegosSinStock);

        jMenuItemGananciaTotalPorJuego.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemGananciaTotalPorJuego.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemGananciaTotalPorJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency_dollar green2424.png"))); // NOI18N
        jMenuItemGananciaTotalPorJuego.setText("Ganancia Total por Juego");
        jMenuItemGananciaTotalPorJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGananciaTotalPorJuegoActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemGananciaTotalPorJuego);

        jMenuItemUsuarioConMayorCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemUsuarioConMayorCompras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemUsuarioConMayorCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Superman2424.png"))); // NOI18N
        jMenuItemUsuarioConMayorCompras.setText("Usuario Con Mayor Compras");
        jMenuItemUsuarioConMayorCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioConMayorComprasActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemUsuarioConMayorCompras);

        jMenuItemTopFiveVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTopFiveVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItemTopFiveVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flat_seo-40-24.png"))); // NOI18N
        jMenuItemTopFiveVentas.setText("Top Five Games");
        jMenuItemTopFiveVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTopFiveVentasActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMenuItemTopFiveVentas);

        jMenuBar1.add(jMenuReportes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
    }//GEN-LAST:event_formWindowDeactivated

    //Hace visible el registro de juegos mediante un menú ítem.
    private void jMenuItemRegistrosDeJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrosDeJuegosActionPerformed
        this.jInternalFrameregistroDeJuegos.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistrosDeJuegosActionPerformed

    //Cierra el panel de administrador y abre el diálogo de inicio de sesión.
    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        this.dispose();
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    //Cierra el programa.
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    //Registra un nuevo juego.
    private void jbtnRegistrarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarJuegoActionPerformed
        registrarJuego();
        cargarIDJuegos();     
    }//GEN-LAST:event_jbtnRegistrarJuegoActionPerformed

    //Cancela el registro de un juego.
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.jInternalFrameregistroDeJuegos.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed
    
    //Limpia el formulario de registro de juego.
    private void jbtnReestablecer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReestablecer1ActionPerformed
        ReestablerFormularioRegistroDeJuegos();
    }//GEN-LAST:event_jbtnReestablecer1ActionPerformed

    //Obtiene la carátula de un juego desde un archivo externo.
    private void jbtnCargarCaratulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCargarCaratulaActionPerformed
        cargarCaratula();
    }//GEN-LAST:event_jbtnCargarCaratulaActionPerformed
    
    private void jMenuBar1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentShown
       
    }//GEN-LAST:event_jMenuBar1ComponentShown

    //Carga las IDs de juegos al mosotrar el jInternalFrame de registro de juegos.
    private void jInternalFrameregistroDeJuegosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jInternalFrameregistroDeJuegosComponentShown
        cargarIDJuegos();
    }//GEN-LAST:event_jInternalFrameregistroDeJuegosComponentShown

    //Carga las IDs de juegos al mosotrar el formulario.
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarIDJuegos();
    }//GEN-LAST:event_formComponentShown

    //Permite nombres de juegos de máximo 100 caracteres.
    private void jtxtNombreJuegoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreJuegoKeyTyped
        if(this.jtxtNombreJuego.getText().length() >= 100){
          evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreJuegoKeyTyped

    //Permite descripciones de juegos de máximo 255 caracteres.
    private void jtxtPanelDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPanelDescripcionKeyTyped
        if(this.jtxtPanelDescripcion.getText().length() >= 255){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtPanelDescripcionKeyTyped

    //Permite valores de juegos de máximo 11 caracteres && sólo números.
    private void jtxtValorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtValorUnitarioKeyTyped
        if(this.jtxtValorUnitario.getText().length() >= 11){
            evt.consume();
        }
        char numero = evt.getKeyChar();
        if(!(Character.isDigit(numero))){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtValorUnitarioKeyTyped

    //Permite cantidades de juego de máximo 5 caracteres && sólo números.
    private void jtxtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantidadKeyTyped
        if(this.jtxtCantidad.getText().length() >= 5){
            evt.consume();
        }
        char numero = evt.getKeyChar();
        if(!(Character.isDigit(numero))){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCantidadKeyTyped

    //Permite rutas para archivos de imágenes de máximo 100 caracteres.
    private void jtxtCaratulasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCaratulasKeyTyped
        if(this.jtxtCaratulas.getText().length() >= 100){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCaratulasKeyTyped

    //Valida precios de juego múltiplos de 100.
    private void jtxtValorUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtValorUnitarioFocusLost
        validarPrecios();
    }//GEN-LAST:event_jtxtValorUnitarioFocusLost

    //Muestra el Frame de listado videojuegos.
    private void jMenuItemListadoVideoJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListadoVideoJuegosActionPerformed
        this.jInternalFrameListadoVideoJuegos.setVisible(true);
        mostrarJtableListadoJuegos();
    }//GEN-LAST:event_jMenuItemListadoVideoJuegosActionPerformed

    //Muestra el Frame de listado videojuegos vendidos.
    private void jMenuItemVideojuegosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVideojuegosVendidosActionPerformed
        this.jInternalFrameVideoJuegosVendidos.setVisible(true);
        mostrarJtableJuegosVendidos();
    }//GEN-LAST:event_jMenuItemVideojuegosVendidosActionPerformed
    
    //Muestra el Frame de listado juegos sin stock.
    private void jMenuItemVideojuegosSinStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVideojuegosSinStockActionPerformed
        this.jInternalFrameVideoJuegosSinStock.setVisible(true);
        mostrarJtableJuegosSinStock();
    }//GEN-LAST:event_jMenuItemVideojuegosSinStockActionPerformed

    //???
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AccesoNotNull().configFrameAcceso();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //Muestra el Frame de listado de un juego seleccionado
    private void jTableListadoJuegosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoJuegosMousePressed
        mostrarJtableSerialesJuegoSeleccionado();
    }//GEN-LAST:event_jTableListadoJuegosMousePressed

    //Muestra el Frame de listado de un juego seleccionado
    private void jTableListadoJuegosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoJuegosKeyReleased
        mostrarJtableSerialesJuegoSeleccionado();
    }//GEN-LAST:event_jTableListadoJuegosKeyReleased

    //Muestra el Frame de ganancia por juego.
    private void jMenuItemGananciaTotalPorJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGananciaTotalPorJuegoActionPerformed
        this.jInternalFrameGananciaTotalxJuego.setVisible(true);
        mostrarJtableGananciaPorJuego();
    }//GEN-LAST:event_jMenuItemGananciaTotalPorJuegoActionPerformed

    //Muestra el Frame de usuario con mayor número de compras.
    private void jMenuItemUsuarioConMayorComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioConMayorComprasActionPerformed
        this.jInternalFrameUsuarioConMayorCompras.setVisible(true);
        mostrarJtableUsuarioMayorNumeroCompras();
    }//GEN-LAST:event_jMenuItemUsuarioConMayorComprasActionPerformed

    //Muestra el Frame de juegos top five de ventas.
    private void jMenuItemTopFiveVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTopFiveVentasActionPerformed
        this.jInternalFrameTopFive.setVisible(true);
        mostarJtableTopFiveVentas();
    }//GEN-LAST:event_jMenuItemTopFiveVentasActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    //Genera y abre el reporte Listado de Video Juegos en PDF
    private void jbtnListadoVideoJuegosPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListadoVideoJuegosPDFActionPerformed
        new Itext.Itext().generarReporteListadoVideoJuegos();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\ListadoVideoJuegos.pdf");
    }//GEN-LAST:event_jbtnListadoVideoJuegosPDFActionPerformed

    //Genera y abre el reporte Listado de Video Juegos Vendidos en PDF
    private void jbtnVideosJuegosVendidosPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVideosJuegosVendidosPDFActionPerformed
        new Itext.Itext().generarReporteListadoJuegosVendidos();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\ListadoDeJuegosVendidos.pdf");
    }//GEN-LAST:event_jbtnVideosJuegosVendidosPDFActionPerformed

    //Genera y abre el reporte Listado de Serial Keys por juego en PDF
    private void jbtnSerialesJuegoSeleccionadoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSerialesJuegoSeleccionadoPDFActionPerformed
        generarReporteKeysJuego();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\ListadoSerialesDelJuego_"+nombreJuegoSeleccionado+".pdf");
    }//GEN-LAST:event_jbtnSerialesJuegoSeleccionadoPDFActionPerformed

    //Genera y abre el reporte Ganancia por juegos en PDF
    private void jbtnGananciaPorJuegoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGananciaPorJuegoPDFActionPerformed
        new Itext.Itext().generarReporteGananciaTotal();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\GananciaTotal.pdf");
    }//GEN-LAST:event_jbtnGananciaPorJuegoPDFActionPerformed

    //Genera y abre el reporte Juegos sin Stock en PDF
    private void jbtnVideosJuegosSinStockPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVideosJuegosSinStockPDFActionPerformed
        new Itext.Itext().generarReporteJuegosSinStock();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\JuegosSinStock.pdf");
    }//GEN-LAST:event_jbtnVideosJuegosSinStockPDFActionPerformed

    //Genera y abre el reporte Usuario con Mayor Cantidad de Compras en PDF
    private void jbtnUsuarioConMayoComprasPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuarioConMayoComprasPDFActionPerformed
        new Itext.Itext().generarReporteUsuarioMasJuegos();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\UsuarioConMayorJuegos.pdf");
    }//GEN-LAST:event_jbtnUsuarioConMayoComprasPDFActionPerformed

    //Genera y abre el reporte Top Five de Ventas en PDF
    private void jbtnTopFivePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTopFivePDFActionPerformed
        new Itext.Itext().generarReporteTopFiveVentas();
        abrirArchivo(System.getProperty("user.dir")+"\\src\\Reportes\\TopFive.pdf");
    }//GEN-LAST:event_jbtnTopFivePDFActionPerformed

    private void jTxtGananciaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtGananciaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtGananciaTotalActionPerformed

    
    /************************************************************************************/
    /*             METODOS QUE REGISTRAN UN JUEGO NUEVO EN LA BASE DE DATOS             */    
    /************************************************************************************/    
    
    //Valida y registra un juego nuevo en la base de datos.
    public void registrarJuego()                        {
        try
        {  
            //Obtiene el ID de juego.
            int idJuego = Integer.parseInt(this.jtxtIdJuego.getText());
            //Obtiene el nombre del juego.
            String titulo = this.jtxtNombreJuego.getText().trim();
            if(titulo.length()==0){
                titulo=null;
            }
            //Obtiene la descripción del juego
            String descripcion = this.jtxtPanelDescripcion.getText().trim();
            if(descripcion.length() == 0){
                descripcion=null;
            }
            //Obtiene la restricción etaria del juego.
            int restriccion = obtenerRestriccionEtaria();
            //Obtiene la carátula del juego.  
            String caratula = this.jtxtCaratulas.getText().trim();
            if(caratula.length()==0){
                caratula = null;
            }
            //Obtiene el valor unitario del juego.
            int valor = Integer.parseInt(this.jtxtValorUnitario.getText().trim());
            //Obtiene la cantidad de unidades del juego.
            int cantidad = Integer.parseInt(this.jtxtCantidad.getText());
            //Crea un nuevo videojuego utilizando el contructor con parámetros
            int resultado = new BLL.VideoGame().registrarJuego( idJuego, titulo, descripcion, 
                                                                restriccion, caratula, valor);
            //Genera seriales para el juego
            BLL.SerialNumber sn = new SerialNumber();
            sn.generarSeriales(cantidad, idJuego);
            
            //Muestra el resultado de la creación del juego.
            switch(resultado)
            {
                case 1: JOptionPane.showMessageDialog(null, "Juego registrado exitosamente", 
                        "Registro Video Game", JOptionPane.INFORMATION_MESSAGE);
                        cargarIDJuegos();
                        this.mostrarJtableListadoJuegos();
                        ReestablerFormularioRegistroDeJuegos();
                        break;
                case 1048: JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos", 
                        "Registro Video Game", JOptionPane.ERROR_MESSAGE); 
                        break;
                case 1062: JOptionPane.showMessageDialog(null, "Juego ya registrada", 
                        "Registro Video Game", JOptionPane.ERROR_MESSAGE); 
                        break;
                case 1406: JOptionPane.showMessageDialog(null, "Datos exceden la longitud máxima "
                        + "permitida", "Registro Video Game", JOptionPane.ERROR_MESSAGE); 
                        this.jtxtPanelDescripcion.requestFocus();
                        break;  
                default: JOptionPane.showMessageDialog(null, "Error desconocido. Contacte a soporte@notnull.cl" 
                        + resultado, "Registro Video Game", JOptionPane.ERROR_MESSAGE); 
                        break;
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Debe llenar correctamente: \nEdad Minima\n"
                  + "Valor Unitario\nCantidad", null, WIDTH);
        }
    }

    //Obtiene la ID correlativa correspondiente al juego por registrar.
    public void cargarIDJuegos()                        {
        int max = new BLL.VideoGame().maxIdjuego();
        if(max > -1)
        {
            this.jtxtIdJuego.setText(String.valueOf(max + 1));
        }
        else
        {
            JOptionPane.showMessageDialog(this.jInternalFrameregistroDeJuegos, 
                    "Se ha producido un error!!!", "Registros", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Obtiene la restricción etaria basado en el botón seleccionado en Radio Button.
    public int obtenerRestriccionEtaria()               {
    int restriccion; 
    if (jrbtn3.isSelected()) 
        {
            restriccion = 3;
        }
            else
        {
            if (jrbtn7.isSelected()) 
            {
                restriccion = 7;
            } 
              else 
              {
                  if (jrbtn12.isSelected()) 
                  {
                      restriccion = 12;
                  } 
                  else 
                  {
                      if (jrbtn16.isSelected()) 
                      {
                          restriccion = 16;
                      } 
                      else 
                      {
                          restriccion = 18;
                      }
                  }
              }
          }
        return restriccion;
    }
    
    //Valida que el precio registrado cumpla con las restricciones. 
    public void validarPrecios()                        {
        try 
        {
            int valor = Integer.parseInt(this.jtxtValorUnitario.getText().trim());
            if (!(valor % 100 == 0 && valor > 0)) 
            {
                JOptionPane.showMessageDialog(null, 
                        "Debe Ingresar Valor Valido:\nMultiplos de 100\nValores positivos.", 
                        "Registro Video Game", 
                        JOptionPane.INFORMATION_MESSAGE);
                this.jtxtValorUnitario.requestFocus();
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,
                    "Contacte a administrador@notnull.cl",
                    "Error Desconocido",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Copia la carátula desde un archivo seleccionado por el usuario a la carpeta del programa.
    //Escribe una ruta para guardar en la base de datos.
    public void cargarCaratula()                        {
    //abre una ventana de selección de archivos filechooser
        int returnVal = filechooser.showOpenDialog(PanelAdmin.this);
        //si el usuario acepta el archivo seleccionado.
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            //asigna el nombre del archivo seleccionado a jtxtCaratulas
            File file = filechooser.getSelectedFile();
            try 
            {
                //copia el archivo al directorio de Imagenes
                Files.copy(Paths.get(file.getParentFile().toString()+"\\"+file.getName()), 
                        Paths.get(System.getProperty("user.dir")+"\\src\\Caratulas\\"+file.getName()));
                //asigna la imagen a la carátula
                this.jtxtCaratulas.setText(String.valueOf(Paths.get(System.getProperty("user.dir")+
                        "\\src\\Caratulas\\"+file.getName())));
            }
            catch(FileAlreadyExistsException fae)
            {
                //Muestra un mensaje de error si ya existe una caratula con el mismo nombre.
                JOptionPane.showMessageDialog(jMenuOpciones, "Ya existe una imagen con ese nombre", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException ex) {
                Logger.getLogger(PanelAdmin.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al guardar la imagen");
            }
        } 
        else 
        {
            //asigna null 
            this.jtxtCaratulas.setText(null);
        }
    }
    
    //Limpia el formulario de registro de juegos.
    private void ReestablerFormularioRegistroDeJuegos() {
        cargarIDJuegos();
        this.jtxtNombreJuego.setText(null);
        this.jtxtPanelDescripcion.setText(null);
        this.jrbtn3.setSelected(true);
        this.jtxtValorUnitario.setText(null);
        this.jtxtCantidad.setText(null);
        this.jtxtCaratulas.setText(null);
    }
    
    
    
    /************************************************************************************/
    /*  METODOS QUE OBTIENEN INFORMACIÓN DESDE LA BASE DE DATOS PARA jTABLES E INFORMES */    
    /************************************************************************************/
    
    //Obtiene el listado total de juegos.
    private void mostrarJtableListadoJuegos()               {
        ArrayList<BLL.VideoGame> listado = new BLL.VideoGame().listadoVideoGames();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Título");
//        modelo.addColumn("Descripción");
        modelo.addColumn("Restricción");
//        modelo.addColumn("Carátula");
        modelo.addColumn("Valor");
        for(BLL.VideoGame v: listado)   
        {
            Object fila[] = new Object[6];
            fila[0] = v.getIdjuego();
            fila[1] = v.getTitulo();
//            fila[2] = v.getDescripcion();
            fila[2] = v.getRestriccion();
//            fila[4] = v.getCaratula();
            fila[3] = v.getValor();
            modelo.addRow(fila);
        }
        this.jTableListadoJuegos.setModel(modelo);
        this.jTableListadoJuegos.changeSelection(0, 0, false, false);
    }
    
    //Obtiene el listado de SerialKeys por juego indicando su estado.
    public void mostrarJtableSerialesJuegoSeleccionado()    {
        try
        {    
            int filajt = this.jTableListadoJuegos.getSelectedRow();
            String idjuego = this.jTableListadoJuegos.getValueAt(filajt, 0).toString();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Serial");
            modelo.addColumn("Estado");
            for (BLL.SerialNumber s: new BLL.SerialNumber().SerialesDelJuego(Integer.parseInt(idjuego)))
            {
                Object fila[] = new Object[2];
                fila[0] = s.getSerie();
                if (s.getEstado() == 0) 
                {
                    fila[1] = "Disponible";
                }
                else
                {
                    fila[1] = "Adjudicado";
                }    
                modelo.addRow(fila);
            }
            this.jTableSerialesDelJuego.setModel(modelo);
            this.jlblNombreJuegoSeriales.setText(this.jTableListadoJuegos.getValueAt(filajt, 1).toString());
            nombreJuegoSeleccionado = this.jTableListadoJuegos.getValueAt(filajt, 1).toString().
                    replace("<", "_").replace(">", "_").replace(":","_").replace("/", "_")
                    .replace("\\", "_").replace("|", "_").replace("?", "_").replace("*", "_");

        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }        
    
    //Obtiene el listado de juegos vendidos.
    private void mostrarJtableJuegosVendidos()              {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo");
        modelo.addColumn("Usuario");
        modelo.addColumn("Serial");
        for (BLL.Biblioteca bb: new BLL.Biblioteca().ConsultarBiblioteca())
        {
            Object fila[] = new Object[3];
            fila[0] = new BLL.VideoGame().tituloJuego(bb.getIdJuego());
            fila[1] = bb.getUsername();
            fila[2] = bb.getSerie();
            modelo.addRow(fila);
        }
        this.jTableListadoJuegosVendidos.setModel(modelo);
    }
    
    //Obtiene el listado de juegos sin Stock.
    private void mostrarJtableJuegosSinStock()              {
        ArrayList<BLL.SerialNumber> stock = new BLL.SerialNumber().contarSeriales();
        ArrayList<BLL.SerialNumber> compras = new BLL.SerialNumber().SerialesCompradas();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo");    
        if (!(stock.isEmpty() || compras.isEmpty()))
        {
            for (int i = 0; i < compras.size(); i++) 
            {
                for (int j = 0; j < stock.size(); j++) 
                {
                    if(stock.get(j).getIdjuego() == compras.get(i).getIdjuego())
                    {
                        if (stock.get(j).getEstado() == compras.get(i).getEstado())
                        {
                            Object fila[] = new Object[1];
                            fila[0] = new BLL.VideoGame().tituloJuego(compras.get(i).getIdjuego());
                            modelo.addRow(fila);
                        }
                    }
                }
            }
        }
        this.jTableVideojuegosSinStock.setModel(modelo);
    } 
    
    //Obtiene el top 5 de ventas
    private void mostarJtableTopFiveVentas()                {
        ArrayList<SerialNumber> s = new BLL.SerialNumber().topFive();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo");
        if((!(s.isEmpty())) && s.size()>=5)
        {    
            for (int i = 0; i < 5; i++)
            {
                Object fila[] = new Object[1];
                fila[0] = new BLL.VideoGame().tituloJuego(s.get(i).getIdjuego());
                modelo.addRow(fila);
            }
        }
        else
        {
            for (int i = 0; i < s.size(); i++)
            {
                Object fila[] = new Object[1];
                fila[0] = new BLL.VideoGame().tituloJuego(s.get(i).getIdjuego());
                modelo.addRow(fila);
            }
        }
        this.jTableTopfive.setModel(modelo);
    }
    
    //Obtiene el usuario con mayor número de compras.
    private void mostrarJtableUsuarioMayorNumeroCompras()   {
        int mayor = 0;
        ArrayList<SerialNumberDAL.ArryL> s = new BLL.SerialNumber().usuarioMax();
        if(!(s.isEmpty()))
        {
            mayor = s.get(0).getCantidad();
        }
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Usuario");
        modelo.addColumn("Cantidad Compras");
        for (int i = 0; i < s.size(); i++) 
        {
            if (mayor != 0 && (mayor == s.get(i).getCantidad())) 
            {
                Object fila[] = new Object[3];
                fila[0] = s.get(i).getUsername();
                fila[1] = s.get(i).getCantidad();
                modelo.addRow(fila);
            }
        }
        this.jTableUsuarioConMayorCompras.setModel(modelo);
    }
    
    //Obtiene el total de ganancias por juego

    private void mostrarJtableGananciaPorJuego()            {
        //intento total
        int gananciaTotal = 0;
        //intento total
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo");
        modelo.addColumn("Valor Unitario");
        modelo.addColumn("Total Ganancia");
        for (BLL.SerialNumber s: new BLL.SerialNumber().GananciaTotalxJuego())
        {
            Object fila[] = new Object[3];
            fila[0] = s.getSerie();
            fila[1] = s.getEstado();
            fila[2] = s.getIdjuego();
            modelo.addRow(fila);
            //intento total
            gananciaTotal = gananciaTotal + Integer.parseInt(fila[2].toString());
            //intento total
        }
        this.jTableGananciaTotalxJuego.setModel(modelo);
        //intento total
        System.out.println(gananciaTotal);
        this.jTxtGananciaTotal.setText(String.valueOf(gananciaTotal));
        
//intento total

    }

    public JTable getjTableGananciaTotalxJuego() {
        return jTableGananciaTotalxJuego;
    }
    

    //Método para abrir archivos guardados en el disco duro (.PDFs).
    public void abrirArchivo(String archivo)                {
        try 
        {
        Desktop dk=Desktop.getDesktop();
        dk.open(new File(archivo));      
        } 
        catch (Exception e) 
        {
            System.out.println("Error al abrir archivo .PDF");
        }
    }
    
    //Genera reporte con listado de todas las keys de un juego seleccionado.
    private void generarReporteKeysJuego()                  {
              try {
         Document document = new Document();
         PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                 "user.dir")+"\\src\\Reportes\\ListadoSerialesDelJuego_" +nombreJuegoSeleccionado+".pdf"));
         document.open();
         Image imagen = Image.getInstance("banner_Notnull.png");
         document.add(imagen);
         document.add(new Paragraph("               "
                 + "Listado seriales del juego "+nombreJuegoSeleccionado+".",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
         document.add(new Paragraph(" "));
         document.add(new Paragraph(" "));
         PdfPTable table = new PdfPTable(2);
         PdfPCell cell1 = new PdfPCell(new Paragraph("Serial"));
         PdfPCell cell2 = new PdfPCell(new Paragraph("Estado"));
         cell1.setColspan(1);
         cell2.setColspan(1);
         cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
         cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
         table.addCell(cell1);
         table.addCell(cell2);
            int filajt = this.jTableListadoJuegos.getSelectedRow();
            String idjuego = this.jTableListadoJuegos.getValueAt(filajt, 0).toString();
            for (BLL.SerialNumber s: new BLL.SerialNumber().SerialesDelJuego(Integer.parseInt(idjuego)))
            {
                String serial = s.getSerie();
                table.addCell(serial);
                if (s.getEstado() == 0) 
                {
                   String serialD = "Disponible";
                   table.addCell(serialD);
                }
                else
                {
                    String serialA = "Adjudicado";
                    table.addCell(serialA);
                }    
               
            }
               document.add(table);
        JOptionPane.showMessageDialog(null,"Reporte Guardado");
        document.close();
      }
      catch(Exception e)
      {
          
      }
}    

    //Configura panel.
    public void configFramePanelAdmin()                     {
        PanelAdmin r = new PanelAdmin();
        r.setTitle("Panel Admin NotNull");
        r.setResizable(true);
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        r.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRestricionDeEdad;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameGananciaTotalxJuego;
    private javax.swing.JInternalFrame jInternalFrameListadoVideoJuegos;
    private javax.swing.JInternalFrame jInternalFrameTopFive;
    private javax.swing.JInternalFrame jInternalFrameUsuarioConMayorCompras;
    private javax.swing.JInternalFrame jInternalFrameVideoJuegosSinStock;
    private javax.swing.JInternalFrame jInternalFrameVideoJuegosVendidos;
    private javax.swing.JInternalFrame jInternalFrameregistroDeJuegos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemGananciaTotalPorJuego;
    private javax.swing.JMenuItem jMenuItemListadoVideoJuegos;
    private javax.swing.JMenuItem jMenuItemRegistrosDeJuegos;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemTopFiveVentas;
    private javax.swing.JMenuItem jMenuItemUsuarioConMayorCompras;
    private javax.swing.JMenuItem jMenuItemVideojuegosSinStock;
    private javax.swing.JMenuItem jMenuItemVideojuegosVendidos;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTableGananciaTotalxJuego;
    private javax.swing.JTable jTableListadoJuegos;
    private javax.swing.JTable jTableListadoJuegosVendidos;
    private javax.swing.JTable jTableSerialesDelJuego;
    private javax.swing.JTable jTableTopfive;
    private javax.swing.JTable jTableUsuarioConMayorCompras;
    private javax.swing.JTable jTableVideojuegosSinStock;
    private javax.swing.JTextField jTxtGananciaTotal;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnCargarCaratula;
    private javax.swing.JButton jbtnGananciaPorJuegoPDF;
    private javax.swing.JButton jbtnListadoVideoJuegosPDF;
    private javax.swing.JButton jbtnReestablecer1;
    private javax.swing.JButton jbtnRegistrarJuego;
    private javax.swing.JButton jbtnSerialesJuegoSeleccionadoPDF;
    private javax.swing.JButton jbtnTopFivePDF;
    private javax.swing.JButton jbtnUsuarioConMayoComprasPDF;
    private javax.swing.JButton jbtnVideosJuegosSinStockPDF;
    private javax.swing.JButton jbtnVideosJuegosVendidosPDF;
    private javax.swing.JLabel jlblCantidad;
    private javax.swing.JLabel jlblDescripcion;
    private javax.swing.JLabel jlblEdadMinima;
    private javax.swing.JLabel jlblIdJuego;
    private javax.swing.JLabel jlblNombreJuego;
    private javax.swing.JLabel jlblNombreJuegoSeriales;
    private javax.swing.JLabel jlblValorUnitario;
    private javax.swing.JRadioButton jrbtn12;
    private javax.swing.JRadioButton jrbtn16;
    private javax.swing.JRadioButton jrbtn18;
    private javax.swing.JRadioButton jrbtn3;
    private javax.swing.JRadioButton jrbtn7;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtCaratulas;
    private javax.swing.JTextField jtxtIdJuego;
    private javax.swing.JTextField jtxtNombreJuego;
    private javax.swing.JTextPane jtxtPanelDescripcion;
    private javax.swing.JTextField jtxtValorUnitario;
    // End of variables declaration//GEN-END:variables
}