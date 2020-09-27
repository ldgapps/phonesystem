// 
// Decompiled by Procyon v0.5.36
// 

package Tecnico;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;
import java.io.FileNotFoundException;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.net.URI;
import java.awt.Desktop;
import phonesystem.Inicio;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import java.awt.Color;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.awt.Component;
import javax.swing.ComboBoxModel;
import java.sql.Blob;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import DB.Conectar2;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import DB.Metodos;
import javax.swing.JFrame;

public class Tecnicoview extends JFrame
{
    String usuario;
    boolean vista;
    private Metodos metodos;
    DefaultTableModel mo;
    DefaultTableModel motec;
    DefaultTableModel mofallas;
    DefaultComboBoxModel combo;
    DefaultComboBoxModel combo2;
    DefaultComboBoxModel combosol;
    DefaultComboBoxModel combotec;
    int j2;
    static boolean pausa2;
    Thread h;
    int j;
    static boolean pausa;
    private JTextField addbateria;
    private JTextField addfallas;
    private JTextArea addfallas1;
    private JComboBox<String> addgama;
    private JTextField addmarca;
    private JTextField addmemoria;
    private JTextField addmodelo;
    private JTextField addnombre;
    private JTextField addtapa;
    private JLabel bienvenida;
    private JLabel bienvenida1;
    private JComboBox<String> chatenvio;
    private JTextArea chattec;
    private JTextArea chattecnico;
    private JTextArea correcioneslabe;
    private JTextArea correcioneslabe1;
    private JLabel enviado;
    private JLabel enviado1;
    private JFrame fallas;
    private JFrame fallasadd;
    private JFrame informa;
    private JFrame inventariotecnico;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JFrame jFrame1;
    private JFrame jFrame2;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTable jTable1;
    private JTable jTable2;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTable tabla_inventario;
    
    public Tecnicoview() {
        this.vista = true;
        this.mo = new DefaultTableModel();
        this.motec = new DefaultTableModel();
        this.mofallas = new DefaultTableModel();
        this.combo = new DefaultComboBoxModel();
        this.combo2 = new DefaultComboBoxModel();
        this.combosol = new DefaultComboBoxModel();
        this.combotec = new DefaultComboBoxModel();
        this.j2 = 0;
        this.h = new Thread() {
            @Override
            public void run() {
                final Timer t = new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {
                        Tecnicoview.this.setchat(Tecnicoview.this.bienvenida.getText());
                        Tecnicoview.this.setdispo();
                    }
                });
                t.start();
            }
        };
        this.j = 0;
        this.initComponents();
        this.setfallas();
        this.h.start();
        this.setdispo();
        this.chattec.setWrapStyleWord(true);
        this.chattec.setLineWrap(true);
        this.chattecnico.setLineWrap(true);
        this.chattecnico.setWrapStyleWord(true);
        this.jTextArea1.setWrapStyleWord(true);
        this.jTextArea1.setWrapStyleWord(true);
        this.setSize(958, 811);
    }
    
    private static BufferedImage resize(final BufferedImage img, final int height, final int width) {
        final Image tmp = img.getScaledInstance(width, height, 4);
        final BufferedImage resized = new BufferedImage(width, height, 2);
        final Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
    
    public void setinventario() {
        final DefaultTableModel mo = new DefaultTableModel();
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `producto` LIKE '%" + this.addnombre.getText() + "%' OR `marca` LIKE '%" + this.addnombre.getText() + "%' OR `modelo` LIKE '%" + this.addnombre.getText() + "%'");
            mo.addColumn("Codigo");
            mo.addColumn("Producto");
            mo.addColumn("Marca");
            mo.addColumn("Modelo");
            mo.addColumn("Estado");
            while (usuario.next()) {
                final Object[] fila = new Object[5];
                for (int i = 0; i < 5; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                mo.addRow(fila);
            }
        }
        catch (SQLException ex) {}
        this.tabla_inventario.setModel(mo);
    }
    
    public void getImagenes(final String marca, final String modelo) {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet rs = statement.executeQuery("SELECT * FROM `phonesystem`.`dispositivos` WHERE `nombre` LIKE '" + marca + " " + modelo + "'");
            while (rs.next()) {
                final Blob blob = rs.getBlob("imagen");
                this.jButton10.setEnabled(false);
                final byte[] data = blob.getBytes(1L, (int)blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                }
                catch (IOException ex) {
                    Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    final BufferedImage resized = resize(img, 300, 250);
                    this.jLabel29.setIcon(new ImageIcon(resized));
                    rs.close();
                }
                catch (Exception e) {
                    this.jLabel29.setText("Sin imagen");
                    this.jLabel29.setIcon(null);
                }
            }
        }
        catch (SQLException ex2) {}
    }
    
    public void setcombo() {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios` WHERE `nombre` NOT LIKE '" + this.bienvenida.getText() + "'");
            while (usuario.next()) {
                this.combo.addElement(usuario.getObject("nombre"));
            }
        }
        catch (SQLException ex) {}
    }
    
    public void settecnicos() {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.combotec = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios` WHERE `nombre` NOT LIKE '" + this.bienvenida.getText() + "' AND `tipo` LIKE 'tecnico'");
            while (usuario.next()) {
                this.combotec.addElement(usuario.getObject("nombre"));
            }
            this.jComboBox1.setModel(this.combotec);
        }
        catch (SQLException ex) {
            Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setdispo() {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.motec = new DefaultTableModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `tecnico` LIKE '" + this.bienvenida.getText() + "' AND `correciones` LIKE 'por corregir'");
            this.motec.addColumn("N° Equipo");
            this.motec.addColumn("Marca");
            this.motec.addColumn("Modelo");
            this.motec.addColumn("Gama");
            this.motec.addColumn("Bateria");
            this.motec.addColumn("Memoria");
            this.motec.addColumn("Sim");
            this.motec.addColumn("Tapa");
            this.motec.addColumn("Diagnostico");
            this.motec.addColumn("Fallas");
            this.motec.addColumn("Tipo");
            int p = 0;
            while (usuario.next()) {
                ++p;
                final Object[] fila = new Object[11];
                for (int i = 0; i < 11; ++i) {
                    if (i < 10) {
                        fila[i] = usuario.getObject(i + 8);
                    }
                    else {
                        fila[i] = usuario.getObject(i + 14);
                    }
                }
                this.motec.addRow(fila);
            }
            if (p != 0) {
                if (p != 1) {
                    if (p == this.j2) {
                        this.jFrame2.setVisible(true);
                        this.jFrame2.setSize(541, 222);
                        this.jFrame2.setLocationRelativeTo(this);
                        final Timer t = new Timer(8000, new ActionListener() {
                            @Override
                            public void actionPerformed(final ActionEvent e) {
                                Tecnicoview.this.jFrame2.setVisible(false);
                            }
                        });
                        t.start();
                    }
                }
            }
            this.j2 = p + 1;
            this.jTable1.setModel(this.motec);
            this.jTable1.setEnabled(true);
        }
        catch (Exception s) {
            System.out.println(s);
        }
    }
    
    public void setfallas() {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.mofallas = new DefaultTableModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`fallas` ");
            this.mofallas.addColumn("Marca y modelo");
            this.mofallas.addColumn("Gama");
            this.mofallas.addColumn("Bateria");
            this.mofallas.addColumn("Memoria");
            this.mofallas.addColumn("Tapa");
            this.mofallas.addColumn("Fallas");
            final Object[] fila = new Object[7];
            this.mofallas.addColumn("Soluciones");
            while (usuario.next()) {
                for (int i = 0; i < 7; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mofallas.addRow(fila);
            }
            this.jTable2.setModel(this.mofallas);
        }
        catch (SQLException s) {
            System.out.println("error");
        }
    }
    
    public void setfallasbuscar() {
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            this.mofallas = new DefaultTableModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`fallas` WHERE `nombre` LIKE '%" + this.jTextField1.getText() + "%'");
            this.mofallas.addColumn("Marca y modelo");
            this.mofallas.addColumn("Gama");
            this.mofallas.addColumn("Bateria");
            this.mofallas.addColumn("Memoria");
            this.mofallas.addColumn("Tapa");
            this.mofallas.addColumn("Fallas");
            final Object[] fila = new Object[7];
            this.mofallas.addColumn("Soluciones");
            while (usuario.next()) {
                for (int i = 0; i < 7; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mofallas.addRow(fila);
            }
            this.jTable2.setModel(this.mofallas);
        }
        catch (SQLException s) {
            s.printStackTrace();
        }
        finally {
            conectar2.desconectar();
        }
    }
    
    public void setinfor(final String n) {
        this.metodos = new Metodos();
        final ArrayList a = this.metodos.getdis(n);
        this.jLabel15.setText(a.get(0).toString());
        this.jLabel17.setText(a.get(1).toString());
        this.jLabel30.setText(a.get(2).toString());
        this.jLabel31.setText(a.get(3).toString());
        this.jLabel32.setText(a.get(4).toString());
        this.jLabel34.setText(a.get(5).toString());
        this.jLabel35.setText(a.get(6).toString());
        this.jLabel36.setText(a.get(7).toString());
        this.jTextArea1.setText(a.get(8).toString());
        this.jLabel38.setText(a.get(9).toString());
        this.jLabel41.setText(a.get(10).toString());
    }
    
    public void setchat(final String usuario) {
        try {
            int i = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.chattecnico.setText("");
            final ResultSet mensajes = statement.executeQuery("SELECT * FROM `phonesystem`.`chat` WHERE `emisor` LIKE '" + usuario + "' OR `receptor` LIKE '" + usuario + "'");
            while (mensajes.next()) {
                ++i;
                this.chattecnico.append("\n" + mensajes.getString("emisor") + ":" + mensajes.getString("mensaje") + "\n" + mensajes.getString("hora"));
            }
            if (this.j != 0) {
                if (i == this.j) {
                    System.out.println("a");
                    final Player pl = new Player((InputStream)new FileInputStream("sound/mensaje.mp3"));
                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                while (Tecnicoview.pausa || pl.play(1)) {}
                            }
                            catch (JavaLayerException e) {
                                e.printStackTrace();
                            }
                        }
                    }.start();
                    Thread.sleep(5000L);
                    Tecnicoview.pausa = true;
                    Thread.sleep(2000L);
                    Tecnicoview.pausa = false;
                }
            }
            this.j = i + 1;
        }
        catch (Exception ex) {}
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(final String usuario) {
        this.usuario = usuario;
        this.bienvenida.setText(usuario);
        this.setcombo();
        this.setdispo();
        this.settecnicos();
    }
    
    private void initComponents() {
        this.inventariotecnico = new JFrame();
        this.jPanel2 = new JPanel();
        this.jScrollPane4 = new JScrollPane();
        this.tabla_inventario = new JTable();
        this.jLabel21 = new JLabel();
        this.jButton7 = new JButton();
        this.addnombre = new JTextField();
        this.fallasadd = new JFrame();
        this.jPanel3 = new JPanel();
        this.addgama = new JComboBox<String>();
        this.addmarca = new JTextField();
        this.addmodelo = new JTextField();
        this.addbateria = new JTextField();
        this.addmemoria = new JTextField();
        this.addtapa = new JTextField();
        this.addfallas = new JTextField();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jLabel22 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.addfallas1 = new JTextArea();
        this.informa = new JFrame();
        this.jPanel4 = new JPanel();
        this.jLabel15 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jButton9 = new JButton();
        this.jLabel18 = new JLabel();
        this.jButton10 = new JButton();
        this.jComboBox1 = new JComboBox<String>();
        this.jButton13 = new JButton();
        this.jScrollPane8 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jTextField2 = new JTextField();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jButton14 = new JButton();
        this.jButton15 = new JButton();
        this.jButton16 = new JButton();
        this.jScrollPane9 = new JScrollPane();
        this.correcioneslabe1 = new JTextArea();
        this.jLabel42 = new JLabel();
        this.jButton17 = new JButton();
        this.jLabel43 = new JLabel();
        this.jLabel41 = new JLabel();
        this.fallas = new JFrame();
        this.jPanel5 = new JPanel();
        this.jScrollPane3 = new JScrollPane();
        this.jTable2 = new JTable();
        this.jTextField1 = new JTextField();
        this.jButton12 = new JButton();
        this.jLabel7 = new JLabel();
        this.jFrame1 = new JFrame();
        this.jFrame2 = new JFrame();
        this.jPanel6 = new JPanel();
        this.bienvenida1 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.chattecnico = new JTextArea();
        this.jButton5 = new JButton();
        this.chatenvio = new JComboBox<String>();
        this.jLabel20 = new JLabel();
        this.jButton6 = new JButton();
        this.jButton2 = new JButton();
        this.bienvenida = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jButton8 = new JButton();
        this.jLabel4 = new JLabel();
        this.enviado = new JLabel();
        this.jScrollPane5 = new JScrollPane();
        this.correcioneslabe = new JTextArea();
        this.jButton11 = new JButton();
        this.enviado1 = new JLabel();
        this.jScrollPane6 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel8 = new JLabel();
        this.jScrollPane7 = new JScrollPane();
        this.chattec = new JTextArea();
        this.jPanel2.setBackground(new Color(18, 51, 144));
        this.jPanel2.setBorder(new SoftBevelBorder(0));
        this.tabla_inventario.setModel(this.mo);
        this.jScrollPane4.setViewportView(this.tabla_inventario);
        this.jLabel21.setBackground(new Color(255, 255, 255));
        this.jLabel21.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel21.setForeground(new Color(255, 255, 255));
        this.jLabel21.setHorizontalAlignment(0);
        this.jLabel21.setText("Inventario");
        this.jButton7.setBackground(new Color(255, 255, 255));
        this.jButton7.setFont(new Font("Roboto", 1, 14));
        this.jButton7.setForeground(new Color(14, 82, 151));
        this.jButton7.setText("Aceptar");
        this.jButton7.setBorder(null);
        this.jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton7ActionPerformed(evt);
            }
        });
        this.addnombre.setHorizontalAlignment(0);
        this.addnombre.setBorder(new SoftBevelBorder(0));
        this.addnombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Tecnicoview.this.addnombreKeyPressed(evt);
            }
            
            @Override
            public void keyReleased(final KeyEvent evt) {
                Tecnicoview.this.addnombreKeyReleased(evt);
            }
        });
        final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel21, -1, -1, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton7, -2, 120, -2).addGap(423, 423, 423)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jScrollPane4, -2, 935, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(55, 55, 55).addComponent(this.addnombre, -2, 476, -2))).addContainerGap(28, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel21).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.addnombre, -2, -1, -2).addGap(13, 13, 13).addComponent(this.jScrollPane4, -1, 231, 32767).addGap(18, 18, 18).addComponent(this.jButton7, -2, 40, -2).addGap(20, 20, 20)));
        final GroupLayout inventariotecnicoLayout = new GroupLayout(this.inventariotecnico.getContentPane());
        this.inventariotecnico.getContentPane().setLayout(inventariotecnicoLayout);
        inventariotecnicoLayout.setHorizontalGroup(inventariotecnicoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        inventariotecnicoLayout.setVerticalGroup(inventariotecnicoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
        this.fallasadd.setUndecorated(true);
        this.jPanel3.setBackground(new Color(18, 51, 144));
        this.jPanel3.setBorder(new SoftBevelBorder(0));
        this.addgama.setFont(new Font("Roboto", 1, 12));
        this.addgama.setModel(new DefaultComboBoxModel<String>(new String[] { "Baja", "Media", "Alta" }));
        this.addbateria.setForeground(new Color(51, 51, 51));
        this.addmemoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.addmemoriaActionPerformed(evt);
            }
        });
        this.jButton3.setBackground(new Color(255, 255, 255));
        this.jButton3.setFont(new Font("Roboto", 1, 14));
        this.jButton3.setForeground(new Color(14, 82, 151));
        this.jButton3.setText("Agregar");
        this.jButton3.setBorder(null);
        this.jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setBackground(new Color(255, 255, 255));
        this.jButton4.setFont(new Font("Roboto", 1, 14));
        this.jButton4.setForeground(new Color(14, 82, 151));
        this.jButton4.setText("Salir");
        this.jButton4.setBorder(null);
        this.jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton4ActionPerformed(evt);
            }
        });
        this.jLabel22.setBackground(new Color(255, 255, 255));
        this.jLabel22.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel22.setForeground(new Color(255, 255, 255));
        this.jLabel22.setHorizontalAlignment(0);
        this.jLabel22.setText("Agregar Fallas");
        this.jLabel2.setFont(new Font("Roboto", 1, 14));
        this.jLabel5.setFont(new Font("Roboto", 1, 14));
        this.jLabel5.setForeground(new Color(255, 255, 255));
        this.jLabel5.setHorizontalAlignment(0);
        this.jLabel5.setText("Marca");
        this.jLabel11.setFont(new Font("Roboto", 1, 14));
        this.jLabel11.setFont(new Font("Roboto", 1, 14));
        this.jLabel11.setForeground(new Color(255, 255, 255));
        this.jLabel11.setHorizontalAlignment(0);
        this.jLabel11.setText("Modelo");
        this.jLabel12.setFont(new Font("Roboto", 1, 14));
        this.jLabel12.setFont(new Font("Roboto", 1, 14));
        this.jLabel12.setForeground(new Color(255, 255, 255));
        this.jLabel12.setHorizontalAlignment(0);
        this.jLabel12.setText("Gama");
        this.jLabel13.setFont(new Font("Roboto", 1, 14));
        this.jLabel13.setFont(new Font("Roboto", 1, 14));
        this.jLabel13.setForeground(new Color(255, 255, 255));
        this.jLabel13.setHorizontalAlignment(0);
        this.jLabel13.setText("Bateria");
        this.jLabel14.setFont(new Font("Roboto", 1, 14));
        this.jLabel14.setFont(new Font("Roboto", 1, 14));
        this.jLabel14.setForeground(new Color(255, 255, 255));
        this.jLabel14.setHorizontalAlignment(0);
        this.jLabel14.setText("Memoria");
        this.jLabel16.setFont(new Font("Roboto", 1, 14));
        this.jLabel16.setFont(new Font("Roboto", 1, 14));
        this.jLabel16.setForeground(new Color(255, 255, 255));
        this.jLabel16.setHorizontalAlignment(0);
        this.jLabel16.setText("Tapa");
        this.jLabel23.setFont(new Font("Roboto", 1, 14));
        this.jLabel23.setFont(new Font("Roboto", 1, 14));
        this.jLabel23.setForeground(new Color(255, 255, 255));
        this.jLabel23.setHorizontalAlignment(0);
        this.jLabel23.setText("Fallas");
        this.jLabel24.setFont(new Font("Roboto", 1, 14));
        this.jLabel24.setFont(new Font("Roboto", 1, 14));
        this.jLabel24.setForeground(new Color(255, 255, 255));
        this.jLabel24.setHorizontalAlignment(0);
        this.jLabel24.setText("Soluciones");
        this.addfallas1.setColumns(20);
        this.addfallas1.setFont(new Font("Roboto", 0, 12));
        this.addfallas1.setRows(5);
        this.jScrollPane2.setViewportView(this.addfallas1);
        final GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel3Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.addmemoria, -2, 130, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 128, 32767).addComponent(this.addbateria, -2, 130, -2)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel14, GroupLayout.Alignment.LEADING, -1, 130, 32767).addComponent(this.jLabel5, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.addmarca, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.addmodelo, GroupLayout.Alignment.TRAILING, -2, 130, -2).addComponent(this.jLabel11, GroupLayout.Alignment.TRAILING, -2, 130, -2).addComponent(this.jLabel13, GroupLayout.Alignment.TRAILING, -2, 130, -2)))).addGap(94, 94, 94).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.addgama, 0, -1, 32767).addComponent(this.jLabel12, -1, 130, 32767).addComponent(this.jLabel16, -1, -1, 32767)).addComponent(this.addtapa, GroupLayout.Alignment.TRAILING, -2, 130, -2))).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel23, -1, 150, 32767).addComponent(this.addfallas)).addComponent(this.jButton4, -2, 120, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel24, -1, -1, 32767).addComponent(this.jScrollPane2)).addGap(79, 79, 79).addComponent(this.jButton3, -2, 120, -2).addGap(21, 21, 21)))).addComponent(this.jLabel22, -2, 681, -2)).addContainerGap(-1, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel22).addGap(43, 43, 43).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.jLabel11).addComponent(this.jLabel12)).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addgama, -2, -1, -2).addComponent(this.addmarca, -2, -1, -2).addComponent(this.addmodelo, -2, -1, -2)).addGap(38, 38, 38).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel14).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel13).addComponent(this.jLabel16))).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addmemoria, -2, -1, -2).addComponent(this.addtapa, -2, -1, -2).addComponent(this.addbateria, -2, -1, -2)).addGap(29, 29, 29).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel24).addComponent(this.jLabel23, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.addfallas, -2, 26, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton4, -2, 40, -2).addComponent(this.jButton3, -2, 40, -2)).addGap(17, 17, 17)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jScrollPane2, -2, -1, -2).addContainerGap(50, 32767)))));
        final GroupLayout fallasaddLayout = new GroupLayout(this.fallasadd.getContentPane());
        this.fallasadd.getContentPane().setLayout(fallasaddLayout);
        fallasaddLayout.setHorizontalGroup(fallasaddLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -2, -1, -2));
        fallasaddLayout.setVerticalGroup(fallasaddLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -2, -1, -2));
        this.jPanel4.setBackground(new Color(18, 51, 144));
        this.jLabel15.setFont(new Font("Roboto", 1, 18));
        this.jLabel15.setForeground(new Color(255, 255, 255));
        this.jLabel15.setText("jLabel15");
        this.jLabel17.setFont(new Font("Roboto", 1, 14));
        this.jLabel17.setForeground(new Color(255, 255, 255));
        this.jLabel17.setText("jLabel17");
        this.jLabel29.setFont(new Font("Roboto", 1, 18));
        this.jLabel29.setForeground(new Color(255, 255, 255));
        this.jLabel29.setHorizontalAlignment(0);
        this.jLabel29.setText("Imagen");
        this.jLabel29.setVerticalAlignment(1);
        this.jLabel29.setHorizontalTextPosition(0);
        this.jLabel29.setVerticalTextPosition(1);
        this.jLabel30.setFont(new Font("Roboto", 1, 14));
        this.jLabel30.setForeground(new Color(255, 255, 255));
        this.jLabel30.setText("jLabel17");
        this.jLabel31.setFont(new Font("Roboto", 1, 14));
        this.jLabel31.setForeground(new Color(255, 255, 255));
        this.jLabel31.setText("jLabel17");
        this.jLabel32.setFont(new Font("Roboto", 1, 14));
        this.jLabel32.setForeground(new Color(255, 255, 255));
        this.jLabel32.setText("jLabel17");
        this.jLabel34.setFont(new Font("Roboto", 1, 14));
        this.jLabel34.setForeground(new Color(255, 255, 255));
        this.jLabel34.setText("jLabel17");
        this.jLabel35.setFont(new Font("Roboto", 1, 14));
        this.jLabel35.setForeground(new Color(255, 255, 255));
        this.jLabel35.setText("jLabel17");
        this.jLabel36.setFont(new Font("Roboto", 1, 14));
        this.jLabel36.setForeground(new Color(255, 255, 255));
        this.jLabel36.setText("jLabel17");
        this.jLabel38.setFont(new Font("Roboto", 1, 14));
        this.jLabel38.setForeground(new Color(255, 255, 255));
        this.jLabel38.setText("jLabel17");
        this.jButton9.setBackground(new Color(255, 255, 255));
        this.jButton9.setFont(new Font("Roboto", 1, 14));
        this.jButton9.setForeground(new Color(18, 51, 144));
        this.jButton9.setText("Google");
        this.jButton9.setBorder(null);
        this.jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton9ActionPerformed(evt);
            }
        });
        this.jLabel18.setFont(new Font("Roboto", 1, 24));
        this.jLabel18.setForeground(new Color(255, 255, 255));
        this.jLabel18.setHorizontalAlignment(0);
        this.jLabel18.setText("Datos del dispositivo");
        this.jButton10.setBackground(new Color(255, 255, 255));
        this.jButton10.setFont(new Font("Roboto", 1, 14));
        this.jButton10.setForeground(new Color(18, 51, 144));
        this.jButton10.setText("Subir foto");
        this.jButton10.setBorder(null);
        this.jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton10ActionPerformed(evt);
            }
        });
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        this.jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jButton13.setBackground(new Color(255, 255, 255));
        this.jButton13.setFont(new Font("Roboto", 1, 14));
        this.jButton13.setForeground(new Color(18, 51, 144));
        this.jButton13.setText("Cambiar tecnico");
        this.jButton13.setBorder(null);
        this.jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton13ActionPerformed(evt);
            }
        });
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setFont(new Font("Roboto", 0, 14));
        this.jTextArea1.setLineWrap(true);
        this.jTextArea1.setRows(5);
        this.jTextArea1.setWrapStyleWord(true);
        this.jScrollPane8.setViewportView(this.jTextArea1);
        this.jTextField2.setFont(new Font("Roboto", 0, 12));
        this.jLabel39.setFont(new Font("Roboto", 1, 14));
        this.jLabel39.setForeground(new Color(255, 255, 255));
        this.jLabel39.setHorizontalAlignment(0);
        this.jLabel39.setText("Causa");
        this.jLabel40.setFont(new Font("Roboto", 1, 14));
        this.jLabel40.setForeground(new Color(255, 255, 255));
        this.jLabel40.setHorizontalAlignment(0);
        this.jLabel40.setText("Tecnico");
        this.jButton14.setBackground(new Color(255, 255, 255));
        this.jButton14.setFont(new Font("Roboto", 1, 14));
        this.jButton14.setForeground(new Color(18, 51, 144));
        this.jButton14.setText("Clangsm");
        this.jButton14.setBorder(null);
        this.jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton14ActionPerformed(evt);
            }
        });
        this.jButton15.setBackground(new Color(255, 255, 255));
        this.jButton15.setFont(new Font("Roboto", 1, 14));
        this.jButton15.setForeground(new Color(18, 51, 144));
        this.jButton15.setText("Imeipro");
        this.jButton15.setBorder(null);
        this.jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton15ActionPerformed(evt);
            }
        });
        this.jButton16.setBackground(new Color(255, 255, 255));
        this.jButton16.setFont(new Font("Roboto", 1, 14));
        this.jButton16.setForeground(new Color(18, 51, 144));
        this.jButton16.setText("Diagramas");
        this.jButton16.setBorder(null);
        this.jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton16ActionPerformed(evt);
            }
        });
        this.correcioneslabe1.setColumns(20);
        this.correcioneslabe1.setLineWrap(true);
        this.correcioneslabe1.setRows(5);
        this.correcioneslabe1.setWrapStyleWord(true);
        this.jScrollPane9.setViewportView(this.correcioneslabe1);
        this.jLabel42.setFont(new Font("Roboto", 1, 14));
        this.jLabel42.setForeground(new Color(255, 255, 255));
        this.jLabel42.setHorizontalAlignment(0);
        this.jLabel42.setText("Correcciones");
        this.jButton17.setBackground(new Color(255, 255, 255));
        this.jButton17.setFont(new Font("Roboto", 1, 14));
        this.jButton17.setForeground(new Color(14, 82, 151));
        this.jButton17.setText("Enviar");
        this.jButton17.setBorder(null);
        this.jButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton17ActionPerformed(evt);
            }
        });
        this.jLabel43.setFont(new Font("Roboto", 1, 14));
        this.jLabel43.setForeground(new Color(255, 255, 255));
        this.jLabel43.setHorizontalAlignment(0);
        this.jLabel43.setText("     ");
        this.jLabel41.setFont(new Font("Roboto", 1, 14));
        this.jLabel41.setForeground(new Color(255, 255, 255));
        this.jLabel41.setText("jLabel17");
        final GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel18, -1, -1, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(28, 32767).addComponent(this.jLabel29, -2, 506, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane9, -1, 252, 32767).addComponent(this.jLabel42, -1, -1, 32767)).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel43, -2, 167, -2)).addGroup(jPanel4Layout.createSequentialGroup().addGap(52, 52, 52).addComponent(this.jButton17, -2, 80, -2))).addGap(103, 103, 103))).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel17, -1, -1, 32767).addComponent(this.jLabel15, -1, -1, 32767).addComponent(this.jLabel30, -1, -1, 32767).addComponent(this.jLabel31, -1, -1, 32767).addComponent(this.jLabel32, -1, -1, 32767).addComponent(this.jLabel34, -1, -1, 32767).addComponent(this.jLabel35, -1, -1, 32767).addComponent(this.jLabel36, -1, -1, 32767).addComponent(this.jLabel38, -1, -1, 32767).addComponent(this.jScrollPane8, -1, 362, 32767).addComponent(this.jLabel41, -1, -1, 32767)).addComponent(this.jTextField2, -2, 167, -2).addGroup(jPanel4Layout.createSequentialGroup().addGap(6, 6, 6).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton14, -2, 130, -2).addComponent(this.jButton9, -2, 130, -2).addComponent(this.jButton16, -2, 130, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton15, -2, 130, -2).addComponent(this.jButton10, -2, 130, -2))).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel39, GroupLayout.Alignment.TRAILING, -2, 167, -2).addComponent(this.jComboBox1, GroupLayout.Alignment.TRAILING, -2, 167, -2).addComponent(this.jLabel40, GroupLayout.Alignment.TRAILING, -2, 167, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton13, -2, 130, -2)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel18, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel29).addGap(113, 113, 113)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel15, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel17).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel30).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel31).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel32).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel34).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel35).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel36).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel38).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel41).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jScrollPane8, -2, 89, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton9, -2, 35, -2).addComponent(this.jButton10, -2, 35, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton14, -2, 35, -2).addComponent(this.jButton15, -2, 35, -2)).addComponent(this.jLabel42)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton16, -2, 35, -2).addComponent(this.jLabel43)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel40).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jComboBox1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel39)).addComponent(this.jButton13, -2, 35, -2))).addComponent(this.jButton17, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField2, -2, -1, -2)).addComponent(this.jScrollPane9, -2, 119, -2)).addContainerGap(-1, 32767)));
        final GroupLayout informaLayout = new GroupLayout(this.informa.getContentPane());
        this.informa.getContentPane().setLayout(informaLayout);
        informaLayout.setHorizontalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        informaLayout.setVerticalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -1, -1, 32767));
        this.jPanel5.setBackground(new Color(18, 51, 144));
        this.jTable2.setFont(new Font("Roboto", 0, 14));
        this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jScrollPane3.setViewportView(this.jTable2);
        this.jTextField1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Tecnicoview.this.jTextField1PropertyChange(evt);
            }
        });
        this.jButton12.setBackground(new Color(9, 46, 162));
        this.jButton12.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton12.setBorder(null);
        this.jButton12.setBorderPainted(false);
        this.jButton12.setFocusPainted(false);
        this.jButton12.setFocusable(false);
        this.jButton12.setOpaque(false);
        this.jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton12ActionPerformed(evt);
            }
        });
        this.jLabel7.setBackground(new Color(8, 38, 131));
        this.jLabel7.setFont(new Font("Roboto", 1, 24));
        this.jLabel7.setForeground(new Color(255, 255, 255));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_receipt_white_24dp.png")));
        this.jLabel7.setText("Fallas comunes");
        this.jLabel7.setOpaque(true);
        final GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jTextField1, -2, 319, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton12).addContainerGap(-1, 32767)).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 569, 32767)).addComponent(this.jLabel7, -1, -1, 32767)).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addComponent(this.jLabel7).addGap(10, 10, 10).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField1, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.jButton12, GroupLayout.Alignment.TRAILING)).addGap(29, 29, 29).addComponent(this.jScrollPane3, -2, 391, -2).addGap(47, 47, 47)));
        final GroupLayout fallasLayout = new GroupLayout(this.fallas.getContentPane());
        this.fallas.getContentPane().setLayout(fallasLayout);
        fallasLayout.setHorizontalGroup(fallasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -1, -1, 32767));
        fallasLayout.setVerticalGroup(fallasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -1, -1, 32767));
        final GroupLayout jFrame1Layout = new GroupLayout(this.jFrame1.getContentPane());
        this.jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 410, 32767));
        jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 274, 32767));
        this.jPanel6.setBackground(new Color(18, 51, 144));
        this.bienvenida1.setFont(new Font("Roboto", 1, 40));
        this.bienvenida1.setForeground(new Color(255, 255, 255));
        this.bienvenida1.setHorizontalAlignment(0);
        this.bienvenida1.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_build_white_36dp.png")));
        this.bienvenida1.setText("Nuevo dispositivo");
        final GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bienvenida1, -1, 541, 32767));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.bienvenida1, -2, 222, -2).addGap(0, 0, 32767)));
        final GroupLayout jFrame2Layout = new GroupLayout(this.jFrame2.getContentPane());
        this.jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(jFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        jFrame2Layout.setVerticalGroup(jFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        this.setDefaultCloseOperation(3);
        this.setTitle("Phonesystem");
        this.setBounds(new Rectangle(0, 0, 0, 0));
        this.setFocusTraversalPolicyProvider(true);
        this.setLocation(new Point(0, 0));
        this.setSize(new Dimension(0, 0));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), 2));
        this.jPanel1.setBackground(new Color(18, 51, 144));
        this.jPanel1.setBorder(new SoftBevelBorder(0));
        this.jButton1.setBackground(new Color(10, 28, 85));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_send_white_18dp.png")));
        this.jButton1.setBorder(null);
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton1ActionPerformed(evt);
            }
        });
        this.chattecnico.setEditable(false);
        this.chattecnico.setColumns(20);
        this.chattecnico.setFont(new Font("Roboto", 0, 14));
        this.chattecnico.setRows(5);
        this.jScrollPane1.setViewportView(this.chattecnico);
        this.jButton5.setBackground(new Color(18, 51, 144));
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_highlight_off_white_18dp.png")));
        this.jButton5.setBorder(null);
        this.jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton5ActionPerformed(evt);
            }
        });
        this.chatenvio.setModel(this.combo);
        this.jLabel20.setHorizontalAlignment(0);
        this.jLabel20.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_forum_white_24dp.png")));
        this.jButton6.setBackground(new Color(255, 255, 255));
        this.jButton6.setFont(new Font("Roboto", 1, 18));
        this.jButton6.setForeground(new Color(27, 48, 107));
        this.jButton6.setText("Inventario");
        this.jButton6.setBorder(null);
        this.jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton6ActionPerformed(evt);
            }
        });
        this.jButton2.setBackground(new Color(255, 255, 255));
        this.jButton2.setFont(new Font("Roboto", 1, 18));
        this.jButton2.setForeground(new Color(27, 48, 107));
        this.jButton2.setText("Fallas comunes");
        this.jButton2.setBorder(null);
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton2ActionPerformed(evt);
            }
        });
        this.bienvenida.setFont(new Font("Roboto", 1, 40));
        this.bienvenida.setForeground(new Color(255, 255, 255));
        this.bienvenida.setHorizontalAlignment(0);
        this.bienvenida.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_build_white_36dp.png")));
        this.bienvenida.setText("Tecnico");
        this.jLabel6.setBackground(new Color(8, 38, 131));
        this.jLabel6.setFont(new Font("Roboto", 1, 24));
        this.jLabel6.setForeground(new Color(255, 255, 255));
        this.jLabel6.setHorizontalAlignment(0);
        this.jLabel6.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_phone_android_white_18dp.png")));
        this.jLabel6.setText("Dispositivos a reparar");
        this.jLabel6.setOpaque(true);
        this.jLabel1.setFont(new Font("Roboto", 1, 14));
        this.jLabel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("N equipo");
        this.jLabel2.setFont(new Font("Roboto", 1, 14));
        this.jLabel2.setForeground(new Color(255, 255, 255));
        this.jLabel2.setHorizontalAlignment(0);
        this.jLabel2.setText("Correciones");
        this.jButton8.setBackground(new Color(255, 255, 255));
        this.jButton8.setFont(new Font("Roboto", 1, 14));
        this.jButton8.setForeground(new Color(14, 82, 151));
        this.jButton8.setText("Enviar");
        this.jButton8.setBorder(null);
        this.jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton8ActionPerformed(evt);
            }
        });
        this.jLabel4.setBackground(new Color(8, 38, 131));
        this.jLabel4.setFont(new Font("Roboto", 1, 24));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setHorizontalAlignment(0);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_error_outline_white_24dp.png")));
        this.jLabel4.setText("Enviar correciones");
        this.jLabel4.setOpaque(true);
        this.enviado.setFont(new Font("Roboto", 1, 14));
        this.enviado.setForeground(new Color(255, 255, 255));
        this.correcioneslabe.setColumns(20);
        this.correcioneslabe.setRows(5);
        this.jScrollPane5.setViewportView(this.correcioneslabe);
        this.jButton11.setBackground(new Color(255, 255, 255));
        this.jButton11.setFont(new Font("Roboto", 1, 18));
        this.jButton11.setForeground(new Color(27, 48, 107));
        this.jButton11.setText("Agregar fallas comunes");
        this.jButton11.setBorder(null);
        this.jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Tecnicoview.this.jButton11ActionPerformed(evt);
            }
        });
        this.enviado1.setFont(new Font("Roboto", 1, 14));
        this.enviado1.setForeground(new Color(255, 255, 255));
        this.jTable1.setFont(new Font("Roboto", 0, 14));
        this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable1.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorMoved(final AncestorEvent evt) {
            }
            
            @Override
            public void ancestorAdded(final AncestorEvent evt) {
                Tecnicoview.this.jTable1AncestorAdded(evt);
            }
            
            @Override
            public void ancestorRemoved(final AncestorEvent evt) {
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Tecnicoview.this.jTable1MouseClicked(evt);
            }
            
            @Override
            public void mousePressed(final MouseEvent evt) {
                Tecnicoview.this.jTable1MousePressed(evt);
            }
        });
        this.jScrollPane6.setViewportView(this.jTable1);
        this.jLabel8.setFont(new Font("Roboto", 1, 14));
        this.jLabel8.setForeground(new Color(255, 255, 255));
        this.jLabel8.setHorizontalAlignment(0);
        this.jLabel8.setText(" ");
        this.chattec.setColumns(18);
        this.chattec.setFont(new Font("Roboto", 0, 14));
        this.chattec.setLineWrap(true);
        this.chattec.setRows(1);
        this.chattec.setTabSize(6);
        this.jScrollPane7.setViewportView(this.chattec);
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.bienvenida, -2, 858, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton5, -2, 30, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jButton2, -2, 244, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton11, -2, 291, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton6, -2, 248, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(33, 33, 33).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -2, 100, -2).addComponent(this.jLabel8, GroupLayout.Alignment.TRAILING, -2, 118, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jLabel2, -2, 259, -2)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane5, -1, 262, 32767))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.enviado, -2, 132, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jButton8, -2, 80, -2))).addGap(84, 84, 84)).addComponent(this.jLabel4, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.chatenvio, -2, 237, -2).addComponent(this.jLabel20, -2, 243, -2))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.enviado1, -2, 132, -2).addGap(18, 18, 18).addComponent(this.jScrollPane7, -2, 209, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 30, -2)).addComponent(this.jScrollPane1, -2, 243, -2))).addComponent(this.jScrollPane6)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bienvenida, -2, 77, -2).addComponent(this.jButton5, -2, 30, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane6, -2, 263, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton2, -2, 40, -2).addComponent(this.jButton6, -2, 40, -2).addComponent(this.jButton11, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4).addComponent(this.jLabel20)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2, -2, 17, -2).addComponent(this.jLabel1)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane5, -2, 119, -2).addComponent(this.jLabel8))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton8, -2, 40, -2).addGap(27, 27, 27).addComponent(this.enviado, -2, 28, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jScrollPane1, -2, 144, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, 32767).addComponent(this.chatenvio, -2, -1, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(39, 39, 39).addComponent(this.enviado1, -2, 28, -2)).addComponent(this.jButton1, -2, 30, -2).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane7, -2, 61, -2))).addGap(30, 30, 30)));
        this.getContentPane().add(this.jPanel1);
        this.pack();
    }
    
    private void addmemoriaActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton3ActionPerformed(final ActionEvent evt) {
        this.metodos.registra_fallas(this.addmarca.getText(), this.addmodelo.getText(), this.addgama.getSelectedItem().toString(), this.addbateria.getText(), this.addmemoria.getText(), this.addtapa.getText(), this.addfallas.getText(), this.addfallas1.getText());
        this.fallasadd.setVisible(false);
    }
    
    private void jButton7ActionPerformed(final ActionEvent evt) {
        this.inventariotecnico.setVisible(false);
    }
    
    private void jButton4ActionPerformed(final ActionEvent evt) {
        this.fallasadd.setVisible(false);
    }
    
    private void jButton11ActionPerformed(final ActionEvent evt) {
        this.fallasadd.setVisible(true);
        this.fallasadd.setSize(685, 444);
        this.fallasadd.setLocationRelativeTo(this);
    }
    
    private void jButton8ActionPerformed(final ActionEvent evt) {
        this.setdispo();
        if (this.jLabel8.getText().equals(" ")) {
            this.enviado.setText("No hay dispositivo");
        }
        else {
            this.metodos.setcorreciones(this.jLabel8.getText(), this.correcioneslabe.getText());
            this.enviado.setText("Enviado");
            this.correcioneslabe.setText("");
            final Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Tecnicoview.this.enviado.setText("");
                }
            });
            t.start();
            this.setdispo();
        }
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        this.fallas.setVisible(true);
        this.fallas.setSize(581, 540);
        this.fallas.setLocationRelativeTo(null);
    }
    
    private void jButton6ActionPerformed(final ActionEvent evt) {
        this.inventariotecnico.setVisible(true);
        this.setinventario();
        this.inventariotecnico.setSize(989, 501);
        this.inventariotecnico.setLocationRelativeTo(null);
    }
    
    private void jButton5ActionPerformed(final ActionEvent evt) {
        this.setVisible(false);
        final Inicio i = new Inicio();
        i.setSize(500, 548);
        i.setLocationRelativeTo(null);
        i.setVisible(true);
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        if (!this.chattec.getText().equals("")) {
            this.metodos.enviar_chat((String)this.chatenvio.getSelectedItem(), this.bienvenida.getText(), this.chattec.getText());
            this.chattec.setText("");
        }
    }
    
    private void jButton9ActionPerformed(final ActionEvent evt) {
        String marca = this.jLabel17.getText().substring(7).trim();
        String modelo = this.jLabel30.getText().substring(8).trim();
        marca = marca.replaceAll(" ", "");
        modelo = modelo.replaceAll(" ", "");
        System.out.println(modelo);
        try {
            if (Desktop.isDesktopSupported()) {
                final Desktop d = Desktop.getDesktop();
                if (d.isSupported(Desktop.Action.BROWSE)) {
                    d.browse(new URI("https://www.google.co.ve/search?q=" + marca + "+" + modelo + "&oq=" + marca + "+" + modelo + "&aqs=chrome..69i57.4168j0j7&sourceid=chrome&ie=UTF-8"));
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void jButton10ActionPerformed(final ActionEvent evt) {
        final JFileChooser chooser = new JFileChooser();
        final FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", new String[] { "jpg", "gif" });
        chooser.setFileFilter(filter);
        final int returnVal = chooser.showOpenDialog(this.informa);
        if (returnVal == 0) {
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getPath());
            final String filePath = chooser.getSelectedFile().getPath();
            try {
                final String marca = this.jLabel17.getText().substring(7);
                final String n = this.jLabel15.getText().substring(15);
                final String modelo = this.jLabel30.getText().substring(8);
                final InputStream inputStream = new FileInputStream(new File(filePath));
                this.metodos.add_dispo(n, marca, modelo, inputStream);
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void jTextField1PropertyChange(final PropertyChangeEvent evt) {
        this.setfallas();
    }
    
    private void jButton12ActionPerformed(final ActionEvent evt) {
        this.setfallasbuscar();
    }
    
    private void jButton13ActionPerformed(final ActionEvent evt) {
        this.metodos.cambiatecnico(Integer.parseInt(this.jLabel15.getText().substring(15)), this.jComboBox1.getSelectedItem().toString(), this.jTextField2.getText());
        this.jLabel15.setText("Tecnico cambiado");
    }
    
    private void jComboBox1ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton14ActionPerformed(final ActionEvent evt) {
        try {
            if (Desktop.isDesktopSupported()) {
                final Desktop d = Desktop.getDesktop();
                if (d.isSupported(Desktop.Action.BROWSE)) {
                    d.browse(new URI("https://clangsm.com/forum/index.php"));
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void jButton15ActionPerformed(final ActionEvent evt) {
        try {
            if (Desktop.isDesktopSupported()) {
                final Desktop d = Desktop.getDesktop();
                if (d.isSupported(Desktop.Action.BROWSE)) {
                    d.browse(new URI("http://www.imeipro.info/"));
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void jTable1MousePressed(final MouseEvent evt) {
        this.correcioneslabe1.setText("");
        final String t = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        this.jLabel8.setText(t);
        this.setinfor(t);
        this.jLabel29.setIcon(null);
        this.getImagenes(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString(), this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 2).toString());
        this.informa.setVisible(true);
        this.informa.setExtendedState(6);
        this.informa.setLocationRelativeTo(this);
    }
    
    private void jTable1MouseClicked(final MouseEvent evt) {
        final String t = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString();
        this.jLabel8.setText(t);
        this.setinfor(t);
        this.jLabel29.setIcon(null);
        this.getImagenes(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString(), this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 2).toString());
        this.informa.setVisible(true);
        this.informa.setExtendedState(6);
        this.informa.setLocationRelativeTo(this);
    }
    
    private void jTable1AncestorAdded(final AncestorEvent evt) {
    }
    
    private void jButton16ActionPerformed(final ActionEvent evt) {
        try {
            if (Desktop.isDesktopSupported()) {
                final Desktop d = Desktop.getDesktop();
                if (d.isSupported(Desktop.Action.BROWSE)) {
                    d.browse(new URI("http://www.clubdediagramas.com/"));
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void jButton17ActionPerformed(final ActionEvent evt) {
        System.out.println(this.jLabel15.getText().substring(15).trim() + "  " + this.correcioneslabe1.getText());
        this.metodos.setcorreciones(this.jLabel15.getText().substring(15).trim(), this.correcioneslabe1.getText());
        this.jLabel43.setText("Enviado");
    }
    
    private void addnombreKeyPressed(final KeyEvent evt) {
        this.setinventario();
    }
    
    private void addnombreKeyReleased(final KeyEvent evt) {
        this.setinventario();
    }
    
    public static void main(final String[] args) {
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Tecnicoview.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tecnicoview().setVisible(true);
            }
        });
    }
    
    static {
        Tecnicoview.pausa2 = false;
        Tecnicoview.pausa = false;
    }
}
