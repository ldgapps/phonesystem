// 
// Decompiled by Procyon v0.5.36
// 

package Administrador;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.util.Calendar;
import com.itextpdf.text.DocumentException;
import java.io.File;
import DB.ToPDF;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import phonesystem.Email;
import phonesystem.Inicio;
import java.awt.GridLayout;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import java.awt.Cursor;
import javax.swing.AbstractListModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import javax.swing.BorderFactory;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.LayoutStyle;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.border.SoftBevelBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.table.TableCellRenderer;
import javax.swing.ListModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import DB.Conectar2;
import javax.swing.table.TableModel;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import java.io.InputStream;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JList;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import DB.Metodos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Admin extends JFrame
{
    private DefaultListModel listcompra;
    private DefaultTableModel mo;
    private DefaultTableModel mocompras;
    private String usuario;
    private static DefaultTableCellRenderer tcr;
    private DefaultListModel molistacompra;
    private DefaultListModel molistasolici;
    private DefaultListModel molistaservi;
    private DefaultListModel facturaslist;
    private DefaultComboBoxModel combo;
    private DefaultComboBoxModel combocam;
    private DefaultComboBoxModel combo2;
    private DefaultComboBoxModel combo2s;
    private DefaultTableModel moventas;
    private DefaultTableModel mosolicitudes;
    private DefaultTableModel moproveedores;
    private DefaultTableModel moproductos;
    private DefaultTableModel molistasoli;
    private DefaultTableModel moregistro;
    private DefaultComboBoxModel combosol;
    private DefaultComboBoxModel combopro;
    private DefaultComboBoxModel combopendiente;
    private DefaultComboBoxModel comboproducto;
    private DefaultComboBoxModel combosoli;
    private DefaultComboBoxModel combosmmpro;
    private DefaultComboBoxModel combocambio;
    private DefaultComboBoxModel combolistapro;
    private float preciore;
    private Metodos metodos;
    Thread h;
    int j;
    static boolean pausa;
    Thread sonido;
    private int salidas;
    private JLabel Comprar;
    private JFrame Emailconfig;
    private JFrame Pendientes;
    private JTextField Usua;
    private JSpinner addcantidad2;
    private JSpinner addcantidada;
    private JTextField addcodigopro;
    private JPasswordField addcontra;
    private JSpinner addcostob;
    private JComboBox<String> addestadopro;
    private JTextField addfacturacom;
    private JTextField addmarca;
    private JTextField addmodelo;
    private JTextField addnombre;
    private JTextField addnombre1;
    private JTextField addnombre2;
    private JTextField addnombre3;
    private JSpinner addprecioa;
    private JComboBox<String> addproductoa;
    private JTextField addpropro;
    private JFrame addproveedor;
    private JComboBox<String> addsolici;
    private JComboBox<String> addtipo;
    private JFrame agregaempleado;
    private JFrame agregaproducto;
    private JTextField bancopro;
    private JLabel bienvenida;
    private JLabel bienvenida1;
    private JLabel bienvenida2;
    private JLabel bienvenida3;
    private JLabel bienvenida4;
    private JFrame cambiarclave;
    private JFrame cambioprecio;
    private JTextArea chatadmin;
    private JComboBox<String> chatereceptor;
    private JTextField ciudadpro;
    private JPasswordField clavecam;
    private JButton clientesbtn1;
    private JButton clientesbtn2;
    private JButton clientesbtn3;
    private JFrame comprar;
    private JFrame comprasrea;
    private JTable comprast;
    private JTextField cuentapro;
    private JDateChooser date1;
    private JDateChooser date2;
    private JDateChooser date3;
    private JDateChooser date4;
    private JFrame eliminar;
    private JTextField emailpro;
    private JLabel error;
    private JLabel erroragregar;
    private JTextField facturacompr;
    private JTextField facturaventa5;
    private JTextField facturaventa6;
    private JTextField facturaventa8;
    private JComboBox<String> getusueli;
    private JFrame informa;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton28;
    private JButton jButton29;
    private JButton jButton3;
    private JButton jButton30;
    private JButton jButton31;
    private JButton jButton32;
    private JButton jButton34;
    private JButton jButton35;
    private JButton jButton36;
    private JButton jButton37;
    private JButton jButton38;
    private JButton jButton39;
    private JButton jButton4;
    private JButton jButton40;
    private JButton jButton41;
    private JButton jButton42;
    private JButton jButton43;
    private JButton jButton44;
    private JButton jButton45;
    private JButton jButton46;
    private JButton jButton47;
    private JButton jButton48;
    private JButton jButton49;
    private JButton jButton5;
    private JButton jButton50;
    private JButton jButton51;
    private JButton jButton52;
    private JButton jButton53;
    private JButton jButton54;
    private JButton jButton55;
    private JButton jButton56;
    private JButton jButton58;
    private JButton jButton59;
    private JButton jButton6;
    private JButton jButton60;
    private JButton jButton61;
    private JButton jButton62;
    private JButton jButton63;
    private JButton jButton64;
    private JButton jButton65;
    private JButton jButton66;
    private JButton jButton67;
    private JButton jButton68;
    private JButton jButton69;
    private JButton jButton7;
    private JButton jButton70;
    private JButton jButton71;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JComboBox<String> jComboBox3;
    private JComboBox<String> jComboBox5;
    private JComboBox<String> jComboBox6;
    private JComboBox<String> jComboBox7;
    private JComboBox<String> jComboBox8;
    private JComboBox<String> jComboBox9;
    private JFrame jFrame1;
    private JFrame jFrame2;
    private JFrame jFrame3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel100;
    private JLabel jLabel101;
    private JLabel jLabel102;
    private JLabel jLabel103;
    private JLabel jLabel104;
    private JLabel jLabel105;
    private JLabel jLabel106;
    private JLabel jLabel107;
    private JLabel jLabel108;
    private JLabel jLabel109;
    private JLabel jLabel11;
    private JLabel jLabel110;
    private JLabel jLabel111;
    private JLabel jLabel112;
    private JLabel jLabel113;
    private JLabel jLabel114;
    private JLabel jLabel115;
    private JLabel jLabel116;
    private JLabel jLabel117;
    private JLabel jLabel118;
    private JLabel jLabel119;
    private JLabel jLabel12;
    private JLabel jLabel120;
    private JLabel jLabel121;
    private JLabel jLabel122;
    private JLabel jLabel123;
    private JLabel jLabel124;
    private JLabel jLabel125;
    private JLabel jLabel126;
    private JLabel jLabel127;
    private JLabel jLabel128;
    private JLabel jLabel129;
    private JLabel jLabel13;
    private JLabel jLabel130;
    private JLabel jLabel131;
    private JLabel jLabel132;
    private JLabel jLabel133;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel152;
    private JLabel jLabel153;
    private JLabel jLabel154;
    private JLabel jLabel155;
    private JLabel jLabel156;
    private JLabel jLabel157;
    private JLabel jLabel158;
    private JLabel jLabel159;
    private JLabel jLabel16;
    private JTextArea jLabel160;
    private JLabel jLabel161;
    private JLabel jLabel162;
    private JLabel jLabel163;
    private JTextArea jLabel164;
    private JLabel jLabel165;
    private JLabel jLabel166;
    private JLabel jLabel167;
    private JLabel jLabel168;
    private JLabel jLabel169;
    private JLabel jLabel17;
    private JLabel jLabel170;
    private JLabel jLabel171;
    private JTextArea jLabel172;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel49;
    private JLabel jLabel5;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel58;
    private JLabel jLabel59;
    private JLabel jLabel6;
    private JLabel jLabel64;
    private JLabel jLabel65;
    private JLabel jLabel67;
    private JLabel jLabel68;
    private JLabel jLabel69;
    private JLabel jLabel7;
    private JLabel jLabel70;
    private JLabel jLabel71;
    private JLabel jLabel72;
    private JLabel jLabel73;
    private JLabel jLabel74;
    private JLabel jLabel75;
    private JLabel jLabel76;
    private JLabel jLabel78;
    private JLabel jLabel79;
    private JLabel jLabel8;
    private JLabel jLabel80;
    private JLabel jLabel81;
    private JLabel jLabel82;
    private JLabel jLabel83;
    private JLabel jLabel84;
    private JLabel jLabel85;
    private JLabel jLabel86;
    private JLabel jLabel87;
    private JLabel jLabel88;
    private JLabel jLabel89;
    private JLabel jLabel9;
    private JLabel jLabel90;
    private JLabel jLabel91;
    private JLabel jLabel92;
    private JLabel jLabel93;
    private JLabel jLabel94;
    private JLabel jLabel95;
    private JLabel jLabel96;
    private JLabel jLabel97;
    private JLabel jLabel98;
    private JLabel jLabel99;
    private JList<String> jList1;
    private JList<String> jList2;
    private JList<String> jList3;
    private JList<String> jList4;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel19;
    private JPanel jPanel2;
    private JPanel jPanel20;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel23;
    private JPanel jPanel24;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JPasswordField jPasswordField1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane12;
    private JScrollPane jScrollPane13;
    private JScrollPane jScrollPane14;
    private JScrollPane jScrollPane15;
    private JScrollPane jScrollPane16;
    private JScrollPane jScrollPane17;
    private JScrollPane jScrollPane18;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JSpinner jSpinner1;
    private JSpinner jSpinner2;
    private JSpinner jSpinner3;
    private JSpinner jSpinner4;
    private JSpinner jSpinner5;
    private JTable jTable1;
    private JTable jTable2;
    private JTable jTable3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JFrame listfacturas;
    private JLabel nombre;
    private JLabel nombre1;
    private JLabel nombre2;
    private JTextField nombrepro;
    private JSpinner precio;
    private JSpinner precio1;
    private JTextField productopro;
    private JFrame productos;
    private JTable productost;
    private JFrame proveedores;
    private JTable proveedorest;
    private JFrame registros;
    private JFrame registros1;
    private JTextField rifpro;
    private JFrame salida;
    private JFrame solicitar;
    private JFrame solicitudes;
    private JTable solicitudest;
    private JTable tabla_inventario;
    private JTextField telpro;
    private JTextArea textchat;
    private JComboBox<String> tipopro;
    private JLabel totalcompras;
    private JComboBox<String> usuariocam;
    private JFrame ventasrea;
    private JTable ventast;
    
    public Admin() {
        this.listcompra = new DefaultListModel();
        this.mocompras = new DefaultTableModel();
        this.molistacompra = new DefaultListModel();
        this.molistasolici = new DefaultListModel();
        this.molistaservi = new DefaultListModel();
        this.facturaslist = new DefaultListModel();
        this.combo = new DefaultComboBoxModel();
        this.combocam = new DefaultComboBoxModel();
        this.combo2 = new DefaultComboBoxModel();
        this.combo2s = new DefaultComboBoxModel();
        this.moventas = new DefaultTableModel();
        this.mosolicitudes = new DefaultTableModel();
        this.moproveedores = new DefaultTableModel();
        this.moproductos = new DefaultTableModel();
        this.molistasoli = new DefaultTableModel();
        this.moregistro = new DefaultTableModel();
        this.combosol = new DefaultComboBoxModel();
        this.combopro = new DefaultComboBoxModel();
        this.combopendiente = new DefaultComboBoxModel();
        this.comboproducto = new DefaultComboBoxModel();
        this.combosoli = new DefaultComboBoxModel();
        this.combolistapro = new DefaultComboBoxModel();
        this.preciore = 0.0f;
        this.metodos = new Metodos();
        this.h = new Thread() {
            @Override
            public void run() {
                final Timer t = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {
                        Admin.this.setchat(Admin.this.bienvenida.getText());
                    }
                });
                t.start();
            }
        };
        this.j = 0;
        this.sonido = new Thread() {
            @Override
            public void run() {
                try {
                    final Player pl = new Player((InputStream)new FileInputStream("sound/mensaje.mp3"));
                    while (Admin.pausa || pl.play(1)) {}
                }
                catch (JavaLayerException e) {
                    e.printStackTrace();
                }
                catch (FileNotFoundException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        this.initComponents();
        this.setcolum();
        this.setSize(868, 669);
        this.setcolum();
        this.setinventario();
        this.setsolicitabla();
    }
    
    public void setsolicitabla() {
        (this.molistasoli = new DefaultTableModel()).addColumn("Codigo");
        this.molistasoli.addColumn("Producto");
        this.molistasoli.addColumn("Marca");
        this.molistasoli.addColumn("Modelo");
        this.molistasoli.addColumn("Proveedor");
        this.molistasoli.addColumn("Costo");
        this.molistasoli.addColumn("Cantidad");
        this.jTable3.setModel(this.molistasoli);
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setcombopendiente() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.combopendiente = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`pendientes`");
            while (usuario.next()) {
                this.combopendiente.addElement(usuario.getObject("id") + ":" + usuario.getObject("email"));
            }
            this.jComboBox6.setModel(this.combopendiente);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setcomboproducto() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.comboproducto = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`productos`");
            while (usuario.next()) {
                this.comboproducto.addElement(usuario.getObject("codigo") + ":" + usuario.getObject("producto") + ", " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + ", " + usuario.getObject("estado"));
            }
            this.addproductoa.setModel(this.comboproducto);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setcombolistapro() {
        this.combolistapro = new DefaultComboBoxModel();
        for (int i = 0; i < this.molistacompra.getSize(); ++i) {
            this.combolistapro.addElement(this.molistacompra.get(i));
        }
    }
    
    public void setcombopro() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.combopro = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`proveedores`");
            while (usuario.next()) {
                this.combopro.addElement(usuario.getObject("nombre"));
            }
            this.jComboBox3.setModel(this.combopro);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setcombosolicitar() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.combosoli = new DefaultComboBoxModel();
            this.molistasolici = new DefaultListModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra` WHERE `entregado` LIKE 'no' ");
            while (usuario.next()) {
                this.molistasolici.addElement("ITM: " + usuario.getObject("id") + " CO: " + usuario.getObject("codigo") + " Prd: " + usuario.getObject("producto") + " , " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " Prove: " + usuario.getObject("proveedor") + " $: " + usuario.getObject("precio") + " Cant: " + usuario.getObject("cantidad"));
                this.combosoli.addElement("ITM: " + usuario.getObject("id") + " CO: " + usuario.getObject("codigo") + " Prd: " + usuario.getObject("producto") + " , " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " Prove: " + usuario.getObject("proveedor") + " $: " + usuario.getObject("precio") + " Cant: " + usuario.getObject("cantidad"));
            }
            this.addsolici.setModel(this.combosoli);
            this.jList2.setModel(this.molistasolici);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setcolum() {
        (this.mo = new DefaultTableModel()).addColumn("Codigo");
        this.mo.addColumn("Producto");
        this.mo.addColumn("Marca");
        this.mo.addColumn("Modelo");
        this.mo.addColumn("Estado");
        this.mo.addColumn("Cantidad");
        this.mo.addColumn("Min");
        this.mo.addColumn("Max");
        this.mo.addColumn("Costo");
        this.mo.addColumn("Costo total");
        this.mo.addColumn("Precio");
        this.mo.addColumn("Precio total");
    }
    
    public void setUsuario(final String usuario) {
        this.usuario = usuario;
        this.bienvenida.setText(usuario);
        this.setcombo();
        this.setcliente();
        this.h.start();
    }
    
    public void setchat(final String usuario) {
        try {
            int i = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.textchat.setText("");
            final ResultSet mensajes = statement.executeQuery("SELECT * FROM `phonesystem`.`chat` WHERE `emisor` LIKE '" + usuario + "' OR `receptor` LIKE '" + usuario + "'");
            while (mensajes.next()) {
                ++i;
                this.textchat.append("\n" + mensajes.getString("emisor") + "->" + mensajes.getString("receptor") + ":" + mensajes.getString("mensaje") + "\n" + mensajes.getString("hora"));
            }
            conectar2.desconectar();
            if (this.j != 0) {
                if (i == this.j) {
                    this.sonido.start();
                    final Thread sonido = this.sonido;
                    Thread.sleep(5000L);
                    Admin.pausa = true;
                    System.out.println("pausado");
                    final Thread sonido2 = this.sonido;
                    Thread.sleep(2000L);
                    Admin.pausa = false;
                }
            }
            this.j = i + 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            this.error.setText("Error al conectar al servidor");
        }
    }
    
    public void setcliente() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.combosol = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `entregado` LIKE 'no'");
            while (usuario.next()) {
                this.combosol.addElement(usuario.getObject("nequipo"));
            }
            this.jComboBox1.setModel(this.combosol);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setinventario() {
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final int minimo = 0;
            final int cantidad = 0;
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '%" + this.jTextField1.getText() + "%' OR `producto` LIKE '%" + this.jTextField1.getText() + "%' OR `marca` LIKE '%" + this.jTextField1.getText() + "%' OR `modelo` LIKE '%" + this.jTextField1.getText() + "%'");
            while (usuario.next()) {
                final Object[] fila = new Object[12];
                for (int i = 0; i < 12; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mo.addRow(fila);
            }
            (Admin.tcr = new DefaultTableCellRenderer()).setHorizontalAlignment(0);
        }
        catch (SQLException ex) {}
        final int[] anchos = { 70, 90, 90, 40, 15, 15, 10, 10, 20, 40, 40, 40 };
        this.tabla_inventario.setModel(this.mo);
        for (int j = 0; j < 12; ++j) {
            this.tabla_inventario.getColumnModel().getColumn(j).setPreferredWidth(anchos[j]);
            this.tabla_inventario.getColumnModel().getColumn(j).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setregisros() {
        try {
            (this.moregistro = new DefaultTableModel()).addColumn("Nombre");
            this.moregistro.addColumn("Ci");
            this.moregistro.addColumn("Telefono");
            this.moregistro.addColumn("Telefono2");
            this.moregistro.addColumn("Direccion");
            this.moregistro.addColumn("Email");
            this.moregistro.addColumn("Entrega");
            this.moregistro.addColumn("N°");
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `entregado` LIKE 'no'");
            while (usuario.next()) {
                final Object[] fila = new Object[8];
                for (int i = 0; i < 8; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.moregistro.addRow(fila);
                this.jTable1.setModel(this.moregistro);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setregisros2() {
        try {
            (this.moregistro = new DefaultTableModel()).addColumn("Nombre");
            this.moregistro.addColumn("Ci");
            this.moregistro.addColumn("Telefono");
            this.moregistro.addColumn("Telefono2");
            this.moregistro.addColumn("Direccion");
            this.moregistro.addColumn("Email");
            this.moregistro.addColumn("Entrega");
            this.moregistro.addColumn("N°");
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nombre` LIKE '%" + this.Usua.getText() + "%' OR `ci` LIKE '%" + this.Usua.getText() + "%' OR `imei` LIKE '%" + this.Usua.getText() + "%' OR `marca` LIKE '%" + this.Usua.getText() + "%' OR `modelo` LIKE '%" + this.Usua.getText() + "%'");
            while (usuario.next()) {
                final Object[] fila = new Object[8];
                for (int i = 0; i < 8; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.moregistro.addRow(fila);
                this.jTable1.setModel(this.moregistro);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setfacturas(final String bus) {
        try {
            this.facturaslist = new DefaultListModel();
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`facturas` WHERE `nombre` LIKE '%" + bus + "%' ");
            while (usuario.next()) {
                this.facturaslist.addElement(usuario.getString("id") + ":  " + usuario.getString("nombre"));
                this.jList4.setModel(this.facturaslist);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setventatotal() {
        float i = 0.0f;
        int k = 0;
        for (int j = 0; j < this.molistacompra.size(); ++j) {
            ++k;
            i += Float.parseFloat(this.molistacompra.get(j).toString().substring(this.molistacompra.get(j).toString().indexOf(" total: ") + 8, this.molistacompra.get(j).toString().length()));
        }
    }
    
    public void setcompras() {
        (this.mocompras = new DefaultTableModel()).addColumn("Codigo");
        this.mocompras.addColumn("Producto");
        this.mocompras.addColumn("Marca");
        this.mocompras.addColumn("Modelo");
        this.mocompras.addColumn("Proveedor");
        this.mocompras.addColumn("Precio");
        this.mocompras.addColumn("Cantidad");
        this.mocompras.addColumn("Fecha");
        this.mocompras.addColumn("Factura");
        
        int j = 0;
        try {
            final int ano = this.date1.getCalendar().get(1);
            final int mes = this.date1.getCalendar().get(2) + 1;
            final int dia = this.date1.getCalendar().get(5);
            final String fecha = ano + "-" + mes + "-" + dia;
            final int ano2 = this.date2.getCalendar().get(1);
            final int mes2 = this.date2.getCalendar().get(2) + 1;
            final int dia2 = this.date2.getCalendar().get(5);
            final String fecha2 = ano2 + "-" + mes2 + "-" + dia2;
            try {
                final Conectar2 conectar2 = new Conectar2();
                final Statement statement = conectar2.retorna();
                final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`compras` WHERE `fecha` BETWEEN '" + fecha + "' AND '" + fecha2 + "'");
                while (usuario.next()) {
                    final Object[] fila = new Object[9];
                    for (int i = 0; i < 9; ++i) {
                        fila[i] = usuario.getObject(i + 1);
                    }
                    this.mocompras.addRow(fila);
                    ++j;
                }
            }
            catch (SQLException ex) {}
        }
        catch (Exception e) {
            try {
                final Conectar2 conectar3 = new Conectar2();
                final Statement statement2 = conectar3.retorna();
                final ResultSet usuario2 = statement2.executeQuery("SELECT * FROM `phonesystem`.`compras`");
                while (usuario2.next()) {
                    final Object[] fila2 = new Object[9];
                    for (int k = 0; k < 9; ++k) {
                        fila2[k] = usuario2.getObject(k + 1);
                    }
                    this.mocompras.addRow(fila2);
                    ++j;
                }
            }
            catch (SQLException ex2) {}
        }
        this.totalcompras.setText("Compras realizadas: " + j);
        this.comprast.setModel(this.mocompras);
        this.comprast.setEnabled(false);
        final int[] anchos = { 70, 70, 70, 40, 70, 30, 30, 30, 20 };
        for (int l = 0; l < 9; ++l) {
            this.comprast.getColumnModel().getColumn(l).setPreferredWidth(anchos[l]);
            this.comprast.getColumnModel().getColumn(l).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setcompras(final String busq) {
        (this.mocompras = new DefaultTableModel()).addColumn("Codigo");
        this.mocompras.addColumn("Producto");
        this.mocompras.addColumn("Marca");
        this.mocompras.addColumn("Modelo");
        this.mocompras.addColumn("Proveedor");
        this.mocompras.addColumn("Precio");
        this.mocompras.addColumn("Cantidad");
        this.mocompras.addColumn("Fecha");
        this.mocompras.addColumn("Factura");
        int j = 0;
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`compras` WHERE `producto` LIKE '%" + busq + "%' OR `marca` LIKE '%" + this.jTextField6.getText() + "%' OR `modelo` LIKE '%" + this.jTextField6.getText() + "%' OR `proveedor` LIKE '%" + this.jTextField6.getText() + "%' OR `codigo` LIKE '%" + this.jTextField6.getText() + "%'        ");
            while (usuario.next()) {
                final Object[] fila = new Object[9];
                for (int i = 0; i < 9; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mocompras.addRow(fila);
                ++j;
            }
        }
        catch (SQLException s) {
            s.printStackTrace();
        }
        this.totalcompras.setText("Compras realizadas: " + j);
        this.comprast.setModel(this.mocompras);
        this.comprast.setEnabled(false);
        final int[] anchos = { 70, 70, 70, 40, 70, 30, 30, 30, 20 };
        for (int k = 0; k < 9; ++k) {
            this.comprast.getColumnModel().getColumn(k).setPreferredWidth(anchos[k]);
            this.comprast.getColumnModel().getColumn(k).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setsolicitudes() {
        this.mosolicitudes = new DefaultTableModel();
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra` WHERE  `codigo` LIKE '%" + this.jTextField5.getText() + "%' OR `producto` LIKE '%" + this.jTextField5.getText() + "%' OR `marca` LIKE '%" + this.jTextField5.getText() + "%' OR `proveedor` LIKE '%" + this.jTextField5.getText() + "%' OR `modelo` LIKE '%" + this.jTextField5.getText() + "%'");
            this.mosolicitudes.addColumn("ITM");
            this.mosolicitudes.addColumn("Codigo");
            this.mosolicitudes.addColumn("Producto");
            this.mosolicitudes.addColumn("Marca");
            this.mosolicitudes.addColumn("Modelo");
            this.mosolicitudes.addColumn("Proveedor");
            this.mosolicitudes.addColumn("Precio");
            this.mosolicitudes.addColumn("Cant");
            this.mosolicitudes.addColumn("Fecha");
            this.mosolicitudes.addColumn("N° Or");
            this.mosolicitudes.addColumn("Entregado");
            while (usuario.next()) {
                final Object[] fila = new Object[11];
                for (int i = 0; i < 11; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mosolicitudes.addRow(fila);
            }
        }
        catch (SQLException ex) {}
        this.solicitudest.setModel(this.mosolicitudes);
        this.solicitudest.setEnabled(false);
        final int[] anchos = { 20, 70, 70, 40, 35, 35, 30, 30, 30, 10, 20, 40, 60 };
        for (int j = 0; j < 11; ++j) {
            this.solicitudest.getColumnModel().getColumn(j).setPreferredWidth(anchos[j]);
            this.solicitudest.getColumnModel().getColumn(j).setCellRenderer(Admin.tcr);
        }
    }
    
    public int getsalida() {
        return this.salidas;
    }
    
    public void setventas(final String bus) {
        (this.moventas = new DefaultTableModel()).addColumn("Codigo");
        this.moventas.addColumn("Producto");
        this.moventas.addColumn("Marca");
        this.moventas.addColumn("Modelo");
        this.moventas.addColumn("Cliente");
        this.moventas.addColumn("Ci");
        this.moventas.addColumn("Telefono");
        this.moventas.addColumn("Email");
        this.moventas.addColumn("Precio");
        this.moventas.addColumn("Cant");
        this.moventas.addColumn("Fecha");
        this.moventas.addColumn("Factura");
        int j = 0;
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`ventas` WHERE `codigo` LIKE '%" + this.jTextField4.getText() + "%' OR `producto` LIKE '" + this.jTextField4.getText() + "' OR `marca` LIKE '" + this.jTextField4.getText() + "' OR `modelo` LIKE '" + this.jTextField4.getText() + "'");
            while (usuario.next()) {
                final Object[] fila = new Object[12];
                for (int i = 0; i < 12; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.moventas.addRow(fila);
                ++j;
            }
        }
        catch (SQLException ex) {}
        this.jLabel94.setText("Ventas realizadas: " + j);
        this.ventast.setModel(this.moventas);
        this.ventast.setEnabled(false);
        final int[] anchos = { 70, 70, 70, 40, 35, 35, 30, 30, 30, 10, 40, 40 };
        for (int k = 0; k < 12; ++k) {
            this.ventast.getColumnModel().getColumn(k).setPreferredWidth(anchos[k]);
            this.ventast.getColumnModel().getColumn(k).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setsalida(final int es) {
        this.salidas = es;
    }
    
    public void setventas() {
        (this.moventas = new DefaultTableModel()).addColumn("Codigo");
        this.moventas.addColumn("Producto");
        this.moventas.addColumn("Marca");
        this.moventas.addColumn("Modelo");
        this.moventas.addColumn("Cliente");
        this.moventas.addColumn("Ci");
        this.moventas.addColumn("Telefono");
        this.moventas.addColumn("Email");
        this.moventas.addColumn("Precio");
        this.moventas.addColumn("Cantidad");
        this.moventas.addColumn("Fecha");
        this.moventas.addColumn("Factura");
        int j = 0;
        try {
            final int ano = this.date3.getCalendar().get(1);
            final int mes = this.date3.getCalendar().get(2) + 1;
            final int dia = this.date3.getCalendar().get(5);
            final String fecha = ano + "-" + mes + "-" + dia;
            final int ano2 = this.date4.getCalendar().get(1);
            final int mes2 = this.date4.getCalendar().get(2) + 1;
            final int dia2 = this.date4.getCalendar().get(5);
            final String fecha2 = ano2 + "-" + mes2 + "-" + dia2;
            try {
                final Conectar2 conectar2 = new Conectar2();
                final Statement statement = conectar2.retorna();
                final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`ventas` WHERE `fecha` BETWEEN '" + fecha + "' AND '" + fecha2 + "'");
                while (usuario.next()) {
                    final Object[] fila = new Object[12];
                    for (int i = 0; i < 12; ++i) {
                        fila[i] = usuario.getObject(i + 1);
                    }
                    this.moventas.addRow(fila);
                    ++j;
                }
            }
            catch (SQLException ex) {}
        }
        catch (Exception ex2) {}
        this.jLabel94.setText("Ventas realizadas: " + j);
        this.ventast.setModel(this.moventas);
        this.ventast.setEnabled(false);
        final int[] anchos = { 70, 70, 70, 40, 35, 35, 30, 30, 30, 10, 40, 40 };
        for (int k = 0; k < 12; ++k) {
            this.ventast.getColumnModel().getColumn(k).setPreferredWidth(anchos[k]);
            this.ventast.getColumnModel().getColumn(k).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setproveedores() {
        this.moproveedores = new DefaultTableModel();
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`proveedores`");
            this.moproveedores.addColumn("ITM");
            this.moproveedores.addColumn("Nombre");
            this.moproveedores.addColumn("Rif");
            this.moproveedores.addColumn("Telefono");
            this.moproveedores.addColumn("Direccion");
            this.moproveedores.addColumn("Email");
            this.moproveedores.addColumn("Banco");
            this.moproveedores.addColumn("Tipo");
            this.moproveedores.addColumn("Cuenta");
            this.moproveedores.addColumn("Productos");
            this.moproveedores.addColumn("Ingresado");
            while (usuario.next()) {
                final Object[] fila = new Object[11];
                for (int i = 0; i < 11; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.moproveedores.addRow(fila);
            }
        }
        catch (SQLException ex) {}
        this.proveedorest.setModel(this.moproveedores);
        this.proveedorest.setEnabled(false);
    }
    
    public void setcombommproductos() {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        try {
            this.combosmmpro = new DefaultComboBoxModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` ");
            while (usuario.next()) {
                this.combosmmpro.addElement(usuario.getString(1));
            }
            this.jComboBox7.setModel(this.combosmmpro);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setproductos() {
        this.moproductos = new DefaultTableModel();
        try {
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` WHERE `codigo` LIKE '%" + this.jTextField3.getText() + "%' OR `producto` LIKE '%" + this.jTextField3.getText() + "%' OR `marca` LIKE '%" + this.jTextField3.getText() + "%' OR `modelo` LIKE '%" + this.jTextField3.getText() + "%'");
            this.moproductos.addColumn("Codigo");
            this.moproductos.addColumn("Producto");
            this.moproductos.addColumn("Marca");
            this.moproductos.addColumn("Modelo");
            this.moproductos.addColumn("Estado");
            this.moproductos.addColumn("Minimo");
            this.moproductos.addColumn("Maximo");
            while (usuario.next()) {
                final Object[] fila = new Object[7];
                for (int i = 0; i < 7; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.moproductos.addRow(fila);
            }
        }
        catch (SQLException ex) {}
        this.productost.setModel(this.moproductos);
        final int[] anchos = { 70, 70, 70, 70, 35, 35, 30 };
        for (int j = 0; j < 7; ++j) {
            this.productost.getColumnModel().getColumn(j).setPreferredWidth(anchos[j]);
            this.productost.getColumnModel().getColumn(j).setCellRenderer(Admin.tcr);
        }
    }
    
    public void setinfor(final String n) {
        final ArrayList a = this.metodos.getdisadmin(n);
        this.nombre.setText(a.get(0).toString());
        this.jLabel34.setText(a.get(1).toString());
        this.jLabel95.setText(a.get(2).toString());
        this.jLabel96.setText(a.get(3).toString());
        this.jLabel97.setText(a.get(4).toString());
        this.jLabel101.setText(a.get(5).toString());
        this.jLabel102.setText(a.get(6).toString());
        this.jLabel121.setText(a.get(7).toString());
        this.jLabel152.setText(a.get(8).toString());
        this.jLabel153.setText(a.get(9).toString());
        this.jLabel154.setText(a.get(10).toString());
        this.jLabel155.setText(a.get(11).toString());
        this.jLabel156.setText(a.get(12).toString());
        this.jLabel157.setText(a.get(13).toString());
        this.jLabel158.setText(a.get(14).toString());
        this.jLabel159.setText(a.get(15).toString());
        this.jLabel160.setText(a.get(16).toString());
        this.jLabel164.setText(a.get(17).toString());
        this.jLabel162.setText(a.get(18).toString());
        this.jLabel161.setText(a.get(19).toString());
        this.jLabel163.setText(a.get(20).toString());
        this.jLabel109.setText("  ");
        this.nombre1.setText(a.get(21).toString());
        this.jLabel167.setText(a.get(22).toString());
        this.jLabel172.setText(a.get(23).toString());
    }
    
    public void setcombo() {
        try {
            this.usuario = this.bienvenida.getText();
            this.combo.removeAllElements();
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios` WHERE `nombre` NOT LIKE '" + this.getUsuario() + "'");
            int i = 0;
            while (usuario.next()) {
                this.combo.addElement(usuario.getObject("nombre"));
                ++i;
            }
            if (i == 0) {
                this.combo.addElement("Sin usuarios");
            }
        }
        catch (SQLException ex) {}
    }
    
    public void setcombocambio() {
        try {
            this.combocambio = new DefaultComboBoxModel();
            final int i = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario`");
            while (usuario.next()) {
                this.combocambio.addElement(usuario.getObject("codigo") + ": " + usuario.getObject("producto") + ", " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " $: " + usuario.getObject("precio") + " cant: " + usuario.getObject("cantidad"));
            }
            this.jComboBox5.setModel(this.combocambio);
        }
        catch (SQLException ex) {}
    }
    
    public void setcombocambio(final String codigo) {
        try {
            this.combocambio = new DefaultComboBoxModel();
            final int i = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
            while (usuario.next()) {
                this.combocambio.addElement(usuario.getObject("codigo") + ": " + usuario.getObject("producto") + ", " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " $: " + usuario.getObject("precio") + " cant: " + usuario.getObject("cantidad"));
            }
            this.jComboBox5.setModel(this.combocambio);
        }
        catch (SQLException ex) {}
    }
    
    public void setcombocodigo2() {
        try {
            this.combo2s.removeAllElements();
            final int i = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '%" + this.facturaventa8.getText() + "%'");
            while (usuario.next()) {
                this.combo2s.addElement(usuario.getObject("codigo") + ": " + usuario.getObject("producto") + ", " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " $: " + usuario.getObject("precio") + " cant: " + usuario.getObject("cantidad"));
            }
        }
        catch (SQLException ex) {}
    }
    
    public void setcombocambiar() {
        try {
            this.usuario = this.bienvenida.getText();
            this.combocam.removeAllElements();
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios`");
            while (usuario.next()) {
                this.combocam.addElement(usuario.getObject("nombre"));
            }
        }
        catch (SQLException ex) {}
    }
    
    private void initComponents() {
        this.eliminar = new JFrame();
        this.jButton2 = new JButton();
        this.jLabel7 = new JLabel();
        this.getusueli = new JComboBox<String>();
        this.jButton3 = new JButton();
        this.jLabel18 = new JLabel();
        this.agregaempleado = new JFrame();
        this.addnombre = new JTextField();
        this.jLabel5 = new JLabel();
        this.erroragregar = new JLabel();
        this.jButton7 = new JButton();
        this.jLabel4 = new JLabel();
        this.addtipo = new JComboBox<String>();
        this.addcontra = new JPasswordField();
        this.jLabel3 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jButton9 = new JButton();
        this.jLabel41 = new JLabel();
        this.solicitar = new JFrame();
        this.jPanel22 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel12 = new JLabel();
        this.addproductoa = new JComboBox<String>();
        this.jComboBox3 = new JComboBox<String>();
        this.jLabel11 = new JLabel();
        this.jButton35 = new JButton();
        this.addfacturacom = new JTextField();
        this.jLabel8 = new JLabel();
        this.jButton17 = new JButton();
        this.addprecioa = new JSpinner();
        this.jLabel17 = new JLabel();
        this.addcantidada = new JSpinner();
        this.jLabel15 = new JLabel();
        this.jLabel86 = new JLabel();
        this.jScrollPane18 = new JScrollPane();
        this.jTable3 = new JTable();
        this.jButton69 = new JButton();
        this.jButton70 = new JButton();
        this.jLabel10 = new JLabel();
        this.comprar = new JFrame();
        this.jPanel3 = new JPanel();
        this.jButton11 = new JButton();
        this.addcostob = new JSpinner();
        this.addsolici = new JComboBox<String>();
        this.jButton12 = new JButton();
        this.Comprar = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel23 = new JLabel();
        this.addcantidad2 = new JSpinner();
        this.facturacompr = new JTextField();
        this.jLabel59 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jScrollPane8 = new JScrollPane();
        this.jList1 = new JList<String>();
        this.jLabel131 = new JLabel();
        this.jButton60 = new JButton();
        this.jScrollPane13 = new JScrollPane();
        this.jList2 = new JList<String>();
        this.jButton61 = new JButton();
        this.jTextField2 = new JTextField();
        this.jButton64 = new JButton();
        this.comprasrea = new JFrame();
        this.jPanel7 = new JPanel();
        this.jScrollPane2 = new JScrollPane();
        this.comprast = new JTable();
        this.jLabel32 = new JLabel();
        this.jButton24 = new JButton();
        this.totalcompras = new JLabel();
        this.date1 = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
        this.date2 = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
        this.jLabel90 = new JLabel();
        this.jLabel91 = new JLabel();
        this.jButton51 = new JButton();
        this.jTextField6 = new JTextField();
        this.ventasrea = new JFrame();
        this.jPanel8 = new JPanel();
        this.jScrollPane4 = new JScrollPane();
        this.ventast = new JTable();
        this.jLabel31 = new JLabel();
        this.jButton20 = new JButton();
        this.date3 = new JDateChooser();
        this.date4 = new JDateChooser();
        this.jLabel92 = new JLabel();
        this.jLabel93 = new JLabel();
        this.jLabel94 = new JLabel();
        this.jButton53 = new JButton();
        this.jTextField4 = new JTextField();
        this.registros = new JFrame();
        this.jPanel9 = new JPanel();
        this.jComboBox1 = new JComboBox<String>();
        this.precio = new JSpinner();
        this.jButton6 = new JButton();
        this.jButton8 = new JButton();
        this.jLabel24 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel87 = new JLabel();
        this.jScrollPane11 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton36 = new JButton();
        this.Usua = new JTextField();
        this.jButton52 = new JButton();
        this.cambiarclave = new JFrame();
        this.jPanel10 = new JPanel();
        this.usuariocam = new JComboBox<String>();
        this.clavecam = new JPasswordField();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jButton25 = new JButton();
        this.jButton26 = new JButton();
        this.jLabel53 = new JLabel();
        this.jLabel54 = new JLabel();
        this.addproveedor = new JFrame();
        this.jPanel11 = new JPanel();
        this.jLabel40 = new JLabel();
        this.nombrepro = new JTextField();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.rifpro = new JTextField();
        this.jLabel44 = new JLabel();
        this.telpro = new JTextField();
        this.jLabel45 = new JLabel();
        this.jLabel46 = new JLabel();
        this.jLabel47 = new JLabel();
        this.jLabel48 = new JLabel();
        this.jLabel49 = new JLabel();
        this.ciudadpro = new JTextField();
        this.emailpro = new JTextField();
        this.bancopro = new JTextField();
        this.tipopro = new JComboBox<String>();
        this.cuentapro = new JTextField();
        this.jButton30 = new JButton();
        this.jButton31 = new JButton();
        this.jLabel50 = new JLabel();
        this.productopro = new JTextField();
        this.jLabel51 = new JLabel();
        this.proveedores = new JFrame();
        this.jButton37 = new JButton();
        this.jLabel56 = new JLabel();
        this.jScrollPane6 = new JScrollPane();
        this.proveedorest = new JTable();
        this.jLabel55 = new JLabel();
        this.productos = new JFrame();
        this.jPanel19 = new JPanel();
        this.jScrollPane7 = new JScrollPane();
        this.productost = new JTable();
        this.jButton38 = new JButton();
        this.jButton54 = new JButton();
        this.jSpinner5 = new JSpinner();
        this.jLabel100 = new JLabel();
        this.jSpinner4 = new JSpinner();
        this.jTextField3 = new JTextField();
        this.jLabel67 = new JLabel();
        this.jLabel99 = new JLabel();
        this.jComboBox7 = new JComboBox<String>();
        this.jLabel98 = new JLabel();
        this.agregaproducto = new JFrame();
        this.jPanel2 = new JPanel();
        this.addpropro = new JTextField();
        this.addmarca = new JTextField();
        this.addestadopro = new JComboBox<String>();
        this.jButton40 = new JButton();
        this.jButton41 = new JButton();
        this.jLabel71 = new JLabel();
        this.jLabel72 = new JLabel();
        this.jLabel73 = new JLabel();
        this.jLabel74 = new JLabel();
        this.jLabel75 = new JLabel();
        this.addmodelo = new JTextField();
        this.jLabel78 = new JLabel();
        this.addcodigopro = new JTextField();
        this.jSpinner2 = new JSpinner();
        this.jSpinner3 = new JSpinner();
        this.jLabel88 = new JLabel();
        this.jLabel89 = new JLabel();
        this.jLabel125 = new JLabel();
        this.jLabel70 = new JLabel();
        this.solicitudes = new JFrame();
        this.jPanel5 = new JPanel();
        this.jScrollPane9 = new JScrollPane();
        this.solicitudest = new JTable();
        this.jLabel76 = new JLabel();
        this.jButton42 = new JButton();
        this.jTextField5 = new JTextField();
        this.Emailconfig = new JFrame();
        this.jPanel4 = new JPanel();
        this.facturaventa5 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jComboBox2 = new JComboBox<String>();
        this.facturaventa6 = new JTextField();
        this.jLabel64 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel65 = new JLabel();
        this.jLabel68 = new JLabel();
        this.jLabel69 = new JLabel();
        this.jButton34 = new JButton();
        this.jButton39 = new JButton();
        this.jLabel14 = new JLabel();
        this.cambioprecio = new JFrame();
        this.jPanel12 = new JPanel();
        this.jComboBox5 = new JComboBox<String>();
        this.jSpinner1 = new JSpinner();
        this.jLabel80 = new JLabel();
        this.jButton43 = new JButton();
        this.jButton45 = new JButton();
        this.jLabel81 = new JLabel();
        this.jLabel82 = new JLabel();
        this.jLabel79 = new JLabel();
        this.Pendientes = new JFrame();
        this.jPanel13 = new JPanel();
        this.jLabel84 = new JLabel();
        this.jLabel85 = new JLabel();
        this.jButton48 = new JButton();
        this.jComboBox6 = new JComboBox<String>();
        this.jButton49 = new JButton();
        this.jLabel83 = new JLabel();
        this.informa = new JFrame();
        this.jPanel14 = new JPanel();
        this.nombre = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel95 = new JLabel();
        this.jLabel96 = new JLabel();
        this.jLabel97 = new JLabel();
        this.jLabel101 = new JLabel();
        this.jLabel102 = new JLabel();
        this.jLabel105 = new JLabel();
        this.nombre1 = new JLabel();
        this.jLabel109 = new JLabel();
        this.nombre2 = new JLabel();
        this.jLabel103 = new JLabel();
        this.jLabel104 = new JLabel();
        this.jLabel106 = new JLabel();
        this.jLabel107 = new JLabel();
        this.jLabel108 = new JLabel();
        this.jLabel110 = new JLabel();
        this.jLabel111 = new JLabel();
        this.jLabel112 = new JLabel();
        this.jLabel113 = new JLabel();
        this.jLabel114 = new JLabel();
        this.jLabel115 = new JLabel();
        this.jLabel116 = new JLabel();
        this.jLabel117 = new JLabel();
        this.jLabel118 = new JLabel();
        this.jLabel119 = new JLabel();
        this.jLabel120 = new JLabel();
        this.jLabel121 = new JLabel();
        this.jLabel122 = new JLabel();
        this.jLabel123 = new JLabel();
        this.jLabel124 = new JLabel();
        this.jLabel152 = new JLabel();
        this.jLabel153 = new JLabel();
        this.jLabel154 = new JLabel();
        this.jLabel155 = new JLabel();
        this.jLabel156 = new JLabel();
        this.jLabel157 = new JLabel();
        this.jLabel158 = new JLabel();
        this.jLabel159 = new JLabel();
        this.jLabel161 = new JLabel();
        this.jLabel162 = new JLabel();
        this.jLabel163 = new JLabel();
        this.jLabel165 = new JLabel();
        this.jLabel166 = new JLabel();
        this.jLabel167 = new JLabel();
        this.jLabel132 = new JLabel();
        this.jComboBox9 = new JComboBox<String>();
        this.jButton62 = new JButton();
        this.jLabel58 = new JLabel();
        this.jScrollPane14 = new JScrollPane();
        this.jList3 = new JList<String>();
        this.jButton63 = new JButton();
        this.facturaventa8 = new JTextField();
        this.jScrollPane15 = new JScrollPane();
        this.jLabel172 = new JTextArea();
        this.jLabel22 = new JLabel();
        this.jScrollPane16 = new JScrollPane();
        this.jLabel160 = new JTextArea();
        this.jScrollPane17 = new JScrollPane();
        this.jLabel164 = new JTextArea();
        this.jLabel133 = new JLabel();
        this.jButton71 = new JButton();
        this.registros1 = new JFrame();
        this.jPanel16 = new JPanel();
        this.jComboBox8 = new JComboBox<String>();
        this.precio1 = new JSpinner();
        this.jButton16 = new JButton();
        this.jButton55 = new JButton();
        this.jLabel168 = new JLabel();
        this.jLabel169 = new JLabel();
        this.jLabel170 = new JLabel();
        this.jLabel171 = new JLabel();
        this.jButton56 = new JButton();
        this.jScrollPane12 = new JScrollPane();
        this.jTable2 = new JTable();
        this.jFrame1 = new JFrame();
        this.jPanel15 = new JPanel();
        this.jLabel39 = new JLabel();
        this.jLabel126 = new JLabel();
        this.jLabel127 = new JLabel();
        this.jLabel128 = new JLabel();
        this.jLabel129 = new JLabel();
        this.jButton58 = new JButton();
        this.jButton59 = new JButton();
        this.addnombre1 = new JTextField();
        this.addnombre2 = new JTextField();
        this.addnombre3 = new JTextField();
        this.jLabel130 = new JLabel();
        this.jPanel20 = new JPanel();
        this.salida = new JFrame();
        this.jPanel21 = new JPanel();
        this.jButton65 = new JButton();
        this.jButton66 = new JButton();
        this.bienvenida1 = new JLabel();
        this.jFrame2 = new JFrame();
        this.jPanel23 = new JPanel();
        this.bienvenida2 = new JLabel();
        this.jButton67 = new JButton();
        this.jButton68 = new JButton();
        this.jFrame3 = new JFrame();
        this.jPanel6 = new JPanel();
        this.jButton10 = new JButton();
        this.jButton13 = new JButton();
        this.jLabel9 = new JLabel();
        this.listfacturas = new JFrame();
        this.jPanel24 = new JPanel();
        this.jScrollPane5 = new JScrollPane();
        this.jList4 = new JList<String>();
        this.bienvenida3 = new JLabel();
        this.jButton28 = new JButton();
        this.bienvenida4 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.tabla_inventario = new JTable();
        this.jButton5 = new JButton();
        this.jScrollPane3 = new JScrollPane();
        this.textchat = new JTextArea();
        this.chatereceptor = new JComboBox<String>();
        this.jButton18 = new JButton();
        this.bienvenida = new JLabel();
        this.jLabel6 = new JLabel();
        this.jButton50 = new JButton();
        this.jScrollPane10 = new JScrollPane();
        this.chatadmin = new JTextArea();
        this.jPanel17 = new JPanel();
        this.jButton4 = new JButton();
        this.jButton15 = new JButton();
        this.jButton46 = new JButton();
        this.jButton27 = new JButton();
        this.jButton47 = new JButton();
        this.error = new JLabel();
        this.jTextField1 = new JTextField();
        this.jPanel18 = new JPanel();
        this.jButton29 = new JButton();
        this.jButton32 = new JButton();
        this.clientesbtn2 = new JButton();
        this.jButton1 = new JButton();
        this.clientesbtn1 = new JButton();
        this.jButton23 = new JButton();
        this.jButton22 = new JButton();
        this.jButton19 = new JButton();
        this.clientesbtn3 = new JButton();
        this.jButton21 = new JButton();
        this.jButton44 = new JButton();
        this.jButton14 = new JButton();
        this.jLabel13 = new JLabel();
        this.eliminar.setDefaultCloseOperation(2);
        this.eliminar.setUndecorated(true);
        this.eliminar.getContentPane().setLayout(null);
        this.jButton2.setBackground(new Color(255, 255, 255));
        this.jButton2.setFont(new Font("Roboto", 1, 14));
        this.jButton2.setForeground(new Color(14, 82, 151));
        this.jButton2.setText("Salir");
        this.jButton2.setBorder(null);
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton2ActionPerformed(evt);
            }
        });
        this.eliminar.getContentPane().add(this.jButton2);
        this.jButton2.setBounds(20, 160, 100, 40);
        this.jLabel7.setBackground(new Color(255, 255, 255));
        this.jLabel7.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel7.setForeground(new Color(255, 255, 255));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setText("Eliminar usuario");
        this.eliminar.getContentPane().add(this.jLabel7);
        this.jLabel7.setBounds(0, 10, 440, 34);
        this.getusueli.setModel(this.combo);
        this.getusueli.setDebugGraphicsOptions(-1);
        this.eliminar.getContentPane().add(this.getusueli);
        this.getusueli.setBounds(160, 80, 150, 26);
        this.jButton3.setBackground(new Color(255, 255, 255));
        this.jButton3.setFont(new Font("Roboto", 1, 14));
        this.jButton3.setForeground(new Color(14, 82, 151));
        this.jButton3.setText("Eliminar");
        this.jButton3.setBorder(null);
        this.jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton3ActionPerformed(evt);
            }
        });
        this.eliminar.getContentPane().add(this.jButton3);
        this.jButton3.setBounds(340, 160, 100, 40);
        this.jLabel18.setHorizontalAlignment(0);
        this.jLabel18.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1).png")));
        this.eliminar.getContentPane().add(this.jLabel18);
        this.jLabel18.setBounds(0, 0, 460, 220);
        this.agregaempleado.setDefaultCloseOperation(3);
        this.agregaempleado.setFont(new Font("Roboto", 0, 14));
        this.agregaempleado.setUndecorated(true);
        this.agregaempleado.setResizable(false);
        this.agregaempleado.getContentPane().setLayout(null);
        this.addnombre.setBorder(new SoftBevelBorder(0));
        this.agregaempleado.getContentPane().add(this.addnombre);
        this.addnombre.setBounds(10, 110, 140, 22);
        this.jLabel5.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel5.setForeground(new Color(255, 255, 255));
        this.jLabel5.setHorizontalAlignment(0);
        this.jLabel5.setText("Agregar usuario");
        this.agregaempleado.getContentPane().add(this.jLabel5);
        this.jLabel5.setBounds(0, 0, 520, 34);
        this.erroragregar.setForeground(new Color(255, 255, 255));
        this.agregaempleado.getContentPane().add(this.erroragregar);
        this.erroragregar.setBounds(240, 270, 0, 0);
        this.jButton7.setBackground(new Color(255, 255, 255));
        this.jButton7.setFont(new Font("Roboto", 1, 14));
        this.jButton7.setForeground(new Color(14, 82, 151));
        this.jButton7.setText("Salir");
        this.jButton7.setBorder(null);
        this.jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton7ActionPerformed(evt);
            }
        });
        this.agregaempleado.getContentPane().add(this.jButton7);
        this.jButton7.setBounds(10, 190, 120, 50);
        this.jLabel4.setFont(new Font("Roboto", 1, 14));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setHorizontalAlignment(0);
        this.jLabel4.setText("Tipo");
        this.agregaempleado.getContentPane().add(this.jLabel4);
        this.jLabel4.setBounds(400, 70, 100, 17);
        this.addtipo.setModel(new DefaultComboBoxModel<String>(new String[] { "admin", "recepcion", "tecnico" }));
        this.addtipo.setBorder(new SoftBevelBorder(0));
        this.agregaempleado.getContentPane().add(this.addtipo);
        this.addtipo.setBounds(400, 110, 100, 26);
        this.addcontra.setBorder(new SoftBevelBorder(0));
        this.agregaempleado.getContentPane().add(this.addcontra);
        this.addcontra.setBounds(210, 110, 140, 22);
        this.jLabel3.setFont(new Font("Roboto", 1, 14));
        this.jLabel3.setForeground(new Color(255, 255, 255));
        this.jLabel3.setHorizontalAlignment(0);
        this.jLabel3.setText("Contrase\u00f1a");
        this.agregaempleado.getContentPane().add(this.jLabel3);
        this.jLabel3.setBounds(210, 70, 140, 17);
        this.jLabel1.setFont(new Font("Roboto", 1, 14));
        this.jLabel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("Usuario");
        this.agregaempleado.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(10, 70, 140, 17);
        this.jButton9.setBackground(new Color(255, 255, 255));
        this.jButton9.setFont(new Font("Roboto", 1, 14));
        this.jButton9.setForeground(new Color(14, 82, 151));
        this.jButton9.setText("Aceptar");
        this.jButton9.setBorder(null);
        this.jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton9ActionPerformed(evt);
            }
        });
        this.agregaempleado.getContentPane().add(this.jButton9);
        this.jButton9.setBounds(380, 180, 120, 50);
        this.jLabel41.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1).png")));
        this.agregaempleado.getContentPane().add(this.jLabel41);
        this.jLabel41.setBounds(0, -10, 590, 340);
        this.solicitar.setTitle("Nueva Solicitud");
        this.solicitar.setLocation(new Point(0, 0));
        this.solicitar.setMaximizedBounds(new Rectangle(0, 0, 0, 0));
        this.jPanel22.setBackground(new Color(18, 51, 144));
        this.jLabel2.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel2.setForeground(new Color(255, 255, 255));
        this.jLabel2.setHorizontalAlignment(0);
        this.jLabel2.setText("Nueva solicitud de compra");
        this.jLabel12.setFont(new Font("Roboto", 1, 14));
        this.jLabel12.setForeground(new Color(255, 255, 255));
        this.jLabel12.setHorizontalAlignment(0);
        this.jLabel12.setText("Producto");
        this.addproductoa.setModel(this.comboproducto);
        this.jComboBox3.setModel(this.combopro);
        this.jLabel11.setFont(new Font("Roboto", 1, 14));
        this.jLabel11.setForeground(new Color(255, 255, 255));
        this.jLabel11.setHorizontalAlignment(0);
        this.jLabel11.setText("Proveedor");
        this.jButton35.setBackground(new Color(255, 255, 255));
        this.jButton35.setFont(new Font("Roboto", 1, 18));
        this.jButton35.setForeground(new Color(14, 82, 151));
        this.jButton35.setText("Solicitar");
        this.jButton35.setBorder(null);
        this.jButton35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton35ActionPerformed(evt);
            }
        });
        this.jLabel8.setFont(new Font("Roboto", 1, 14));
        this.jLabel8.setForeground(new Color(255, 255, 255));
        this.jLabel8.setHorizontalAlignment(0);
        this.jLabel8.setText("N° Orden");
        this.jButton17.setBackground(new Color(255, 255, 255));
        this.jButton17.setFont(new Font("Roboto", 1, 18));
        this.jButton17.setForeground(new Color(14, 82, 151));
        this.jButton17.setText("Salir");
        this.jButton17.setBorder(null);
        this.jButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton17ActionPerformed(evt);
            }
        });
        this.addprecioa.setModel(new SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        this.jLabel17.setFont(new Font("Roboto", 1, 14));
        this.jLabel17.setForeground(new Color(255, 255, 255));
        this.jLabel17.setHorizontalAlignment(0);
        this.jLabel17.setText("Costo");
        this.addcantidada.setModel(new SpinnerNumberModel(0, 0, null, 1));
        this.jLabel15.setFont(new Font("Roboto", 1, 14));
        this.jLabel15.setForeground(new Color(255, 255, 255));
        this.jLabel15.setHorizontalAlignment(0);
        this.jLabel15.setText("Cantidad");
        this.jLabel86.setFont(new Font("Roboto", 1, 14));
        this.jLabel86.setForeground(new Color(255, 255, 255));
        this.jLabel86.setHorizontalAlignment(0);
        this.jLabel86.setText("    ");
        this.jTable3.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTable3KeyReleased(evt);
            }
        });
        this.jScrollPane18.setViewportView(this.jTable3);
        this.jButton69.setBackground(new Color(255, 255, 255));
        this.jButton69.setFont(new Font("Roboto", 1, 18));
        this.jButton69.setForeground(new Color(14, 82, 151));
        this.jButton69.setText("PDF");
        this.jButton69.setBorder(null);
        this.jButton69.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton69ActionPerformed(evt);
            }
        });
        this.jButton70.setBackground(new Color(255, 255, 255));
        this.jButton70.setFont(new Font("Roboto", 1, 18));
        this.jButton70.setForeground(new Color(14, 82, 151));
        this.jButton70.setText("Add");
        this.jButton70.setBorder(null);
        this.jButton70.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton70ActionPerformed(evt);
            }
        });
        this.jLabel10.setFont(new Font("Roboto", 1, 14));
        this.jLabel10.setForeground(new Color(255, 255, 255));
        this.jLabel10.setHorizontalAlignment(0);
        this.jLabel10.setText("Lista de solicitud");
        final GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
        this.jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -1, -1, 32767).addGroup(jPanel22Layout.createSequentialGroup().addContainerGap().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jLabel15, -2, 130, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel17, -2, 130, -2)).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.addcantidada, -2, 130, -2).addGap(80, 80, 80).addComponent(this.addprecioa, -2, 130, -2))).addGap(38, 38, 38).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.addfacturacom, GroupLayout.Alignment.TRAILING, -2, 130, -2).addComponent(this.jLabel8, GroupLayout.Alignment.TRAILING, -2, 130, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton70, -2, 115, -2)).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jLabel12, -1, -1, 32767).addGap(18, 18, 18).addComponent(this.jLabel11, -2, 130, -2)).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.addproductoa, 0, -1, 32767).addGap(18, 18, 18).addComponent(this.jComboBox3, -2, 130, -2))).addGap(26, 26, 26)).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addComponent(this.jButton17, -2, 136, -2).addGap(30, 30, 30).addComponent(this.jButton69, -2, 115, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel86, -2, 160, -2).addGap(27, 27, 27).addComponent(this.jButton35, -2, 200, -2).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel10, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jScrollPane18)).addContainerGap()))));
        jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(29, 29, 29).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel11).addComponent(this.jLabel12, -2, 20, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addproductoa, -2, -1, -2).addComponent(this.jComboBox3, -2, -1, -2)).addGap(15, 15, 15).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.jLabel17).addComponent(this.jLabel15)).addGap(10, 10, 10).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addfacturacom, -2, -1, -2).addComponent(this.addprecioa, -2, -1, -2).addComponent(this.addcantidada, -2, -1, -2).addComponent(this.jButton70, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addComponent(this.jLabel10).addGap(18, 18, 18).addComponent(this.jScrollPane18, -1, 269, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton35, -2, 50, -2).addComponent(this.jButton69, -2, 50, -2).addComponent(this.jButton17, -2, 50, -2).addComponent(this.jLabel86)).addGap(25, 25, 25)));
        final GroupLayout solicitarLayout = new GroupLayout(this.solicitar.getContentPane());
        this.solicitar.getContentPane().setLayout(solicitarLayout);
        solicitarLayout.setHorizontalGroup(solicitarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel22, -1, -1, 32767));
        solicitarLayout.setVerticalGroup(solicitarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel22, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        this.comprar.setLocation(new Point(0, 0));
        this.jPanel3.setBackground(new Color(5, 51, 137));
        this.jPanel3.setBorder(new SoftBevelBorder(0));
        this.jButton11.setBackground(new Color(255, 255, 255));
        this.jButton11.setFont(new Font("Roboto", 1, 14));
        this.jButton11.setForeground(new Color(14, 82, 151));
        this.jButton11.setText("Comprar");
        this.jButton11.setBorder(null);
        this.jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton11ActionPerformed(evt);
            }
        });
        this.addcostob.setModel(new SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        this.addsolici.setFont(new Font("Roboto", 1, 14));
        this.addsolici.setModel(this.combo2);
        this.addsolici.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.addsoliciActionPerformed(evt);
            }
        });
        this.jButton12.setBackground(new Color(255, 255, 255));
        this.jButton12.setFont(new Font("Roboto", 1, 18));
        this.jButton12.setForeground(new Color(14, 82, 151));
        this.jButton12.setText("Salir");
        this.jButton12.setBorder(null);
        this.jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton12ActionPerformed(evt);
            }
        });
        this.Comprar.setFont(new Font("Comic Sans MS", 1, 36));
        this.Comprar.setForeground(new Color(255, 255, 255));
        this.Comprar.setHorizontalAlignment(0);
        this.Comprar.setText("Comprar");
        this.jLabel19.setFont(new Font("Roboto", 1, 14));
        this.jLabel19.setForeground(new Color(255, 255, 255));
        this.jLabel19.setHorizontalAlignment(0);
        this.jLabel19.setText("Solicitud");
        this.jLabel21.setFont(new Font("Roboto", 1, 14));
        this.jLabel21.setForeground(new Color(255, 255, 255));
        this.jLabel21.setHorizontalAlignment(0);
        this.jLabel21.setText("Costo");
        this.jLabel23.setFont(new Font("Roboto", 1, 14));
        this.jLabel23.setForeground(new Color(255, 255, 255));
        this.jLabel23.setHorizontalAlignment(0);
        this.jLabel23.setText("Cantidad");
        this.addcantidad2.setModel(new SpinnerNumberModel(0, 0, null, 1));
        this.jLabel59.setFont(new Font("Roboto", 1, 14));
        this.jLabel59.setForeground(new Color(255, 255, 255));
        this.jLabel59.setHorizontalAlignment(0);
        this.jLabel59.setText("Factura");
        this.jLabel38.setFont(new Font("Roboto", 1, 14));
        this.jLabel38.setForeground(new Color(255, 255, 255));
        this.jLabel38.setHorizontalAlignment(0);
        this.jList1.setSelectionMode(0);
        this.jList1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Admin.this.jList1KeyPressed(evt);
            }
        });
        this.jScrollPane8.setViewportView(this.jList1);
        this.jLabel131.setFont(new Font("Roboto", 1, 14));
        this.jLabel131.setForeground(new Color(255, 255, 255));
        this.jLabel131.setHorizontalAlignment(0);
        this.jLabel131.setText("Lista de compra");
        this.jButton60.setBackground(new Color(255, 255, 255));
        this.jButton60.setFont(new Font("Roboto", 1, 14));
        this.jButton60.setForeground(new Color(14, 82, 151));
        this.jButton60.setText("Agregar");
        this.jButton60.setBorder(null);
        this.jButton60.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton60ActionPerformed(evt);
            }
        });
        this.jList2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Admin.this.jList2KeyPressed(evt);
            }
        });
        this.jScrollPane13.setViewportView(this.jList2);
        this.jButton61.setBackground(new Color(255, 255, 255));
        this.jButton61.setFont(new Font("Roboto", 1, 14));
        this.jButton61.setForeground(new Color(14, 82, 151));
        this.jButton61.setText("Agregar");
        this.jButton61.setBorder(null);
        this.jButton61.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton61ActionPerformed(evt);
            }
        });
        this.jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField2KeyReleased(evt);
            }
        });
        this.jButton64.setBackground(new Color(255, 255, 255));
        this.jButton64.setFont(new Font("Roboto", 1, 14));
        this.jButton64.setForeground(new Color(14, 82, 151));
        this.jButton64.setText("Eliminar");
        this.jButton64.setBorder(null);
        this.jButton64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton64ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(345, 345, 345).addComponent(this.jLabel38, -1, -1, 32767).addGap(484, 484, 484)).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Comprar, -1, -1, 32767).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jButton60, -2, 74, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton64, -2, 74, -2).addGap(15, 15, 15)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel19, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane13, -1, 426, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.addcantidad2, -2, 130, -2).addGap(40, 40, 40).addComponent(this.addcostob, -2, 130, -2)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel23, -2, 130, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel21, -2, 130, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton61, -2, 74, -2)).addComponent(this.addsolici, GroupLayout.Alignment.LEADING, -2, 408, -2)).addComponent(this.jTextField2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGroup(jPanel3Layout.createSequentialGroup().addGap(61, 61, 61).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.facturacompr, -2, 200, -2).addComponent(this.jLabel59, -2, 200, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767))).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jButton11, -2, 152, -2).addGap(205, 205, 205).addComponent(this.jButton12, -2, 129, -2)).addComponent(this.jLabel131, -2, 486, -2).addComponent(this.jScrollPane8, -2, 486, -2)).addContainerGap()))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.Comprar).addGap(10, 10, 10).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel131).addComponent(this.jLabel19, -2, 19, -2)).addGap(15, 15, 15).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jScrollPane8, -2, 381, -2).addGap(10, 10, 10).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton12, -2, 50, -2).addComponent(this.jButton11, -2, 50, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel38)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jTextField2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane13, -2, 155, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton60, -2, 43, -2).addComponent(this.jButton64, -2, 43, -2)).addGap(10, 10, 10).addComponent(this.addsolici, -1, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel21).addComponent(this.jLabel23)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addcantidad2, -2, -1, -2).addComponent(this.addcostob, -2, -1, -2).addComponent(this.jButton61, -2, 43, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel59).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.facturacompr, -2, -1, -2).addGap(0, 0, 32767)))));
        final GroupLayout comprarLayout = new GroupLayout(this.comprar.getContentPane());
        this.comprar.getContentPane().setLayout(comprarLayout);
        comprarLayout.setHorizontalGroup(comprarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        comprarLayout.setVerticalGroup(comprarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767));
        this.jPanel7.setBackground(new Color(18, 51, 144));
        this.comprast.setModel(this.mocompras);
        this.jScrollPane2.setViewportView(this.comprast);
        this.jLabel32.setBackground(new Color(255, 255, 255));
        this.jLabel32.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel32.setForeground(new Color(255, 255, 255));
        this.jLabel32.setHorizontalAlignment(0);
        this.jLabel32.setText("Compras");
        this.jButton24.setBackground(new Color(255, 255, 255));
        this.jButton24.setFont(new Font("Roboto", 1, 18));
        this.jButton24.setForeground(new Color(14, 82, 151));
        this.jButton24.setText("Aceptar");
        this.jButton24.setBorder(null);
        this.jButton24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton24ActionPerformed(evt);
            }
        });
        this.totalcompras.setFont(new Font("Roboto", 1, 16));
        this.totalcompras.setForeground(new Color(255, 255, 255));
        this.totalcompras.setText("jLabel78");
        this.date1.addAncestorListener((AncestorListener)new AncestorListener() {
            @Override
            public void ancestorMoved(final AncestorEvent evt) {
            }
            
            @Override
            public void ancestorAdded(final AncestorEvent evt) {
                Admin.this.date1AncestorAdded(evt);
            }
            
            @Override
            public void ancestorRemoved(final AncestorEvent evt) {
            }
        });
        this.date1.addMouseListener((MouseListener)new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.date1MouseClicked(evt);
            }
            
            @Override
            public void mousePressed(final MouseEvent evt) {
                Admin.this.date1MousePressed(evt);
            }
        });
        this.date1.addPropertyChangeListener((PropertyChangeListener)new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Admin.this.date1PropertyChange(evt);
            }
        });
        this.date2.addAncestorListener((AncestorListener)new AncestorListener() {
            @Override
            public void ancestorMoved(final AncestorEvent evt) {
            }
            
            @Override
            public void ancestorAdded(final AncestorEvent evt) {
                Admin.this.date2AncestorAdded(evt);
            }
            
            @Override
            public void ancestorRemoved(final AncestorEvent evt) {
            }
        });
        this.date2.addMouseListener((MouseListener)new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.date2MouseClicked(evt);
            }
        });
        this.date2.addPropertyChangeListener((PropertyChangeListener)new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Admin.this.date2PropertyChange(evt);
            }
        });
        this.jLabel90.setFont(new Font("Roboto", 1, 14));
        this.jLabel90.setForeground(new Color(255, 255, 255));
        this.jLabel90.setHorizontalAlignment(4);
        this.jLabel90.setText("Desde:");
        this.jLabel91.setFont(new Font("Roboto", 1, 14));
        this.jLabel91.setForeground(new Color(255, 255, 255));
        this.jLabel91.setHorizontalAlignment(4);
        this.jLabel91.setText("Hasta:");
        this.jButton51.setBackground(new Color(255, 255, 255));
        this.jButton51.setFont(new Font("Roboto", 1, 18));
        this.jButton51.setForeground(new Color(14, 82, 151));
        this.jButton51.setText("Exportar");
        this.jButton51.setBorder(null);
        this.jButton51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton51ActionPerformed(evt);
            }
        });
        this.jTextField6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jTextField6ActionPerformed(evt);
            }
        });
        this.jTextField6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField6KeyReleased(evt);
            }
        });
        final GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(16, 16, 16).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton24, -2, 200, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.totalcompras, -2, 266, -2).addGap(98, 98, 98).addComponent(this.jButton51, -2, 200, -2)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jTextField6, -2, 179, -2).addGap(103, 103, 103).addComponent(this.jLabel90, -2, 98, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent((Component)this.date1, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel91, -2, 76, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent((Component)this.date2, -2, 150, -2)))).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -1, 858, 32767))).addContainerGap()).addComponent(this.jLabel32, -1, -1, 32767));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jLabel32).addGap(18, 18, 18).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jTextField6, -2, 24, -2).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel90, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel91, -2, 20, -2).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent((Component)this.date2, -1, -1, 32767).addComponent((Component)this.date1, -1, -1, 32767))))).addGap(10, 10, 10).addComponent(this.jScrollPane2, -1, 377, 32767).addGap(18, 18, 18).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton24, -2, 40, -2).addComponent(this.totalcompras).addComponent(this.jButton51, -2, 40, -2)).addGap(21, 21, 21)));
        final GroupLayout comprasreaLayout = new GroupLayout(this.comprasrea.getContentPane());
        this.comprasrea.getContentPane().setLayout(comprasreaLayout);
        comprasreaLayout.setHorizontalGroup(comprasreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, -1, 32767));
        comprasreaLayout.setVerticalGroup(comprasreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, -1, 32767));
        this.ventasrea.setBackground(new Color(18, 51, 144));
        this.jPanel8.setBackground(new Color(18, 51, 144));
        this.ventast.setModel(this.moventas);
        this.jScrollPane4.setViewportView(this.ventast);
        this.jLabel31.setBackground(new Color(255, 255, 255));
        this.jLabel31.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel31.setForeground(new Color(255, 255, 255));
        this.jLabel31.setHorizontalAlignment(0);
        this.jLabel31.setText("Ventas");
        this.jButton20.setBackground(new Color(255, 255, 255));
        this.jButton20.setFont(new Font("Roboto", 1, 18));
        this.jButton20.setForeground(new Color(14, 82, 151));
        this.jButton20.setText("Aceptar");
        this.jButton20.setBorder(null);
        this.jButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton20ActionPerformed(evt);
            }
        });
        this.date3.addPropertyChangeListener((PropertyChangeListener)new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Admin.this.date3PropertyChange(evt);
            }
        });
        this.date4.addPropertyChangeListener((PropertyChangeListener)new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Admin.this.date4PropertyChange(evt);
            }
        });
        this.jLabel92.setFont(new Font("Roboto", 1, 14));
        this.jLabel92.setForeground(new Color(255, 255, 255));
        this.jLabel92.setHorizontalAlignment(4);
        this.jLabel92.setText("Hasta:");
        this.jLabel93.setFont(new Font("Roboto", 1, 14));
        this.jLabel93.setForeground(new Color(255, 255, 255));
        this.jLabel93.setHorizontalAlignment(4);
        this.jLabel93.setText("Desde:");
        this.jLabel94.setFont(new Font("Roboto", 1, 18));
        this.jLabel94.setForeground(new Color(255, 255, 255));
        this.jLabel94.setHorizontalAlignment(0);
        this.jLabel94.setText("Hasta:");
        this.jButton53.setBackground(new Color(255, 255, 255));
        this.jButton53.setFont(new Font("Roboto", 1, 18));
        this.jButton53.setForeground(new Color(14, 82, 151));
        this.jButton53.setText("Exportar");
        this.jButton53.setBorder(null);
        this.jButton53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton53ActionPerformed(evt);
            }
        });
        this.jTextField4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField4KeyReleased(evt);
            }
        });
        final GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel31, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane4).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.jButton20, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel94, -2, 536, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, 32767).addComponent(this.jButton53, -2, 150, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addComponent(this.jTextField4, -2, 315, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel93, -2, 90, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent((Component)this.date3, -2, -1, -2).addGap(21, 21, 21).addComponent(this.jLabel92, -2, 84, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent((Component)this.date4, -2, -1, -2))).addContainerGap()));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addComponent(this.jLabel31).addGap(16, 16, 16).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel92, -2, 20, -2).addComponent((Component)this.date4, -2, -1, -2).addComponent((Component)this.date3, -2, -1, -2).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel93, -2, 20, -2).addComponent(this.jTextField4, -2, -1, -2))).addGap(14, 14, 14).addComponent(this.jScrollPane4, -1, 231, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton20, -2, 50, -2).addComponent(this.jLabel94, -2, 32, -2).addComponent(this.jButton53, -2, 50, -2)).addContainerGap(30, 32767)));
        final GroupLayout ventasreaLayout = new GroupLayout(this.ventasrea.getContentPane());
        this.ventasrea.getContentPane().setLayout(ventasreaLayout);
        ventasreaLayout.setHorizontalGroup(ventasreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, -1, -1, 32767));
        ventasreaLayout.setVerticalGroup(ventasreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, -1, -1, 32767));
        this.jPanel9.setBackground(new Color(18, 51, 144));
        this.jPanel9.setBorder(new SoftBevelBorder(0));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        this.precio.setModel(new SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        this.jButton6.setBackground(new Color(255, 255, 255));
        this.jButton6.setFont(new Font("Roboto", 1, 14));
        this.jButton6.setForeground(new Color(14, 82, 151));
        this.jButton6.setText("Poner precio");
        this.jButton6.setBorder(null);
        this.jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton6ActionPerformed(evt);
            }
        });
        this.jButton8.setBackground(new Color(255, 255, 255));
        this.jButton8.setFont(new Font("Roboto", 1, 14));
        this.jButton8.setForeground(new Color(14, 82, 151));
        this.jButton8.setText("Salir");
        this.jButton8.setBorder(null);
        this.jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton8ActionPerformed(evt);
            }
        });
        this.jLabel24.setFont(new Font("Roboto", 1, 14));
        this.jLabel24.setForeground(new Color(255, 255, 255));
        this.jLabel24.setHorizontalAlignment(0);
        this.jLabel24.setText("Precio");
        this.jLabel24.setToolTipText("");
        this.jLabel29.setFont(new Font("Roboto", 1, 14));
        this.jLabel29.setForeground(new Color(255, 255, 255));
        this.jLabel29.setHorizontalAlignment(0);
        this.jLabel29.setText("N° Equipo");
        this.jLabel30.setBackground(new Color(255, 255, 255));
        this.jLabel30.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel30.setForeground(new Color(255, 255, 255));
        this.jLabel30.setHorizontalAlignment(0);
        this.jLabel30.setText("Clientes");
        this.jLabel87.setForeground(new Color(255, 255, 255));
        this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable1.setGridColor(new Color(43, 142, 235));
        this.jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane11.setViewportView(this.jTable1);
        this.jButton36.setBackground(new Color(255, 255, 255));
        this.jButton36.setFont(new Font("Roboto", 1, 14));
        this.jButton36.setForeground(new Color(14, 82, 151));
        this.jButton36.setText("Ver clientes");
        this.jButton36.setBorder(null);
        this.jButton36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton36ActionPerformed(evt);
            }
        });
        this.Usua.setFont(new Font("Roboto", 1, 12));
        this.Usua.setHorizontalAlignment(0);
        this.Usua.setBorder(new SoftBevelBorder(0));
        this.Usua.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Admin.this.UsuaKeyPressed(evt);
            }
        });
        this.jButton52.setBackground(new Color(9, 46, 162));
        this.jButton52.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton52.setBorder(null);
        this.jButton52.setBorderPainted(false);
        this.jButton52.setFocusPainted(false);
        this.jButton52.setFocusable(false);
        this.jButton52.setOpaque(false);
        this.jButton52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton52ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel30, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel29, -2, 120, -2).addComponent(this.jComboBox1, -2, 120, -2)).addGap(34, 34, 34).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel24, -2, 100, -2).addGroup(jPanel9Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.precio, -2, 100, -2).addGap(34, 34, 34).addComponent(this.jButton6, -2, 150, -2).addGap(18, 18, 18).addComponent(this.jButton36, -2, 150, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 167, 32767).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel87, -2, 79, -2).addComponent(this.jButton8, -2, 150, -2)).addGap(9, 9, 9))).addContainerGap(74, 32767)).addComponent(this.jScrollPane11, GroupLayout.Alignment.TRAILING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(this.Usua, -2, 596, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton52).addContainerGap(-1, 32767)));
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jLabel30).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, 32767).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Usua, -2, -1, -2).addComponent(this.jButton52)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane11, -2, 227, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, 32767).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel87).addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel24).addComponent(this.jLabel29)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox1, -2, -1, -2).addComponent(this.precio, -2, -1, -2))).addGroup(jPanel9Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton6, -2, 40, -2).addComponent(this.jButton36, -2, 40, -2).addComponent(this.jButton8, -2, 40, -2)))).addContainerGap(52, 32767)));
        final GroupLayout registrosLayout = new GroupLayout(this.registros.getContentPane());
        this.registros.getContentPane().setLayout(registrosLayout);
        registrosLayout.setHorizontalGroup(registrosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel9, -1, -1, 32767));
        registrosLayout.setVerticalGroup(registrosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel9, -1, -1, 32767));
        this.cambiarclave.setUndecorated(true);
        this.cambiarclave.getContentPane().setLayout(null);
        this.jPanel10.setBackground(new Color(5, 51, 137));
        this.jPanel10.setBorder(new SoftBevelBorder(0));
        this.jPanel10.setOpaque(false);
        this.usuariocam.setModel(this.combocam);
        this.jLabel35.setBackground(new Color(255, 255, 255));
        this.jLabel35.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel35.setForeground(new Color(255, 255, 255));
        this.jLabel35.setHorizontalAlignment(0);
        this.jLabel35.setText("Cambiar clave");
        this.jLabel36.setFont(new Font("Roboto", 1, 14));
        this.jLabel36.setForeground(new Color(255, 255, 255));
        this.jLabel36.setText("Usuario");
        this.jLabel37.setFont(new Font("Roboto", 1, 14));
        this.jLabel37.setForeground(new Color(255, 255, 255));
        this.jLabel37.setText("Clave nueva");
        this.jButton25.setBackground(new Color(255, 255, 255));
        this.jButton25.setFont(new Font("Roboto", 1, 14));
        this.jButton25.setForeground(new Color(14, 82, 151));
        this.jButton25.setText("Aceptar");
        this.jButton25.setBorder(null);
        this.jButton25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton25ActionPerformed(evt);
            }
        });
        this.jButton26.setBackground(new Color(255, 255, 255));
        this.jButton26.setFont(new Font("Roboto", 1, 14));
        this.jButton26.setForeground(new Color(14, 82, 151));
        this.jButton26.setText("Cancelar");
        this.jButton26.setBorder(null);
        this.jButton26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton26ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
        this.jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel35, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(jPanel10Layout.createSequentialGroup().addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addContainerGap(71, 32767).addComponent(this.usuariocam, -2, 100, -2).addGap(150, 150, 150)).addGroup(jPanel10Layout.createSequentialGroup().addGap(95, 95, 95).addComponent(this.jLabel36))).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.clavecam, -2, 120, -2).addGap(84, 84, 84)).addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup().addComponent(this.jLabel37).addGap(109, 109, 109)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton26, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton25, -2, 150, -2).addContainerGap()));
        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel35).addGap(38, 38, 38).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel36).addComponent(this.jLabel37)).addGap(18, 18, 18).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.usuariocam, -2, -1, -2).addComponent(this.clavecam, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, 32767).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton25, -2, 40, -2).addComponent(this.jButton26, -2, 50, -2)).addContainerGap()));
        this.cambiarclave.getContentPane().add(this.jPanel10);
        this.jPanel10.setBounds(0, 0, 560, 270);
        this.cambiarclave.getContentPane().add(this.jLabel53);
        this.jLabel53.setBounds(332, 386, 0, 0);
        this.jLabel54.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1)_2.png")));
        this.cambiarclave.getContentPane().add(this.jLabel54);
        this.jLabel54.setBounds(0, 0, 610, 320);
        this.addproveedor.setUndecorated(true);
        this.addproveedor.getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
        this.jPanel11.setBackground(new Color(5, 51, 137));
        this.jPanel11.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel11.setOpaque(false);
        this.jLabel40.setBackground(new Color(255, 255, 255));
        this.jLabel40.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel40.setForeground(new Color(255, 255, 255));
        this.jLabel40.setHorizontalAlignment(0);
        this.jLabel40.setText("Agregar Proveedor");
        this.nombrepro.setBorder(BorderFactory.createBevelBorder(0));
        this.jLabel42.setFont(new Font("Roboto", 1, 14));
        this.jLabel42.setForeground(new Color(255, 255, 255));
        this.jLabel42.setText("Nombre");
        this.jLabel43.setFont(new Font("Roboto", 1, 14));
        this.jLabel43.setForeground(new Color(255, 255, 255));
        this.jLabel43.setText("Rif");
        this.rifpro.setBorder(BorderFactory.createBevelBorder(0));
        this.jLabel44.setFont(new Font("Roboto", 1, 14));
        this.jLabel44.setForeground(new Color(255, 255, 255));
        this.jLabel44.setText("Telefono");
        this.telpro.setBorder(BorderFactory.createBevelBorder(0));
        this.jLabel45.setFont(new Font("Roboto", 1, 14));
        this.jLabel45.setForeground(new Color(255, 255, 255));
        this.jLabel45.setText("Ciudad");
        this.jLabel46.setFont(new Font("Roboto", 1, 14));
        this.jLabel46.setForeground(new Color(255, 255, 255));
        this.jLabel46.setText("Email");
        this.jLabel47.setFont(new Font("Roboto", 1, 14));
        this.jLabel47.setForeground(new Color(255, 255, 255));
        this.jLabel47.setText("Banco");
        this.jLabel48.setFont(new Font("Roboto", 1, 14));
        this.jLabel48.setForeground(new Color(255, 255, 255));
        this.jLabel48.setText("Tipo de cuenta");
        this.jLabel49.setFont(new Font("Roboto", 1, 14));
        this.jLabel49.setForeground(new Color(255, 255, 255));
        this.jLabel49.setText("Productos");
        this.ciudadpro.setBorder(BorderFactory.createBevelBorder(0));
        this.emailpro.setBorder(BorderFactory.createBevelBorder(0));
        this.bancopro.setBorder(BorderFactory.createBevelBorder(0));
        this.tipopro.setModel(new DefaultComboBoxModel<String>(new String[] { "Ahorro", "Corriente" }));
        this.tipopro.setBorder(BorderFactory.createBevelBorder(0));
        this.tipopro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.tipoproActionPerformed(evt);
            }
        });
        this.cuentapro.setBorder(BorderFactory.createBevelBorder(0));
        this.jButton30.setBackground(new Color(255, 255, 255));
        this.jButton30.setFont(new Font("Roboto", 1, 18));
        this.jButton30.setForeground(new Color(14, 82, 151));
        this.jButton30.setText("Agregar");
        this.jButton30.setBorder(null);
        this.jButton30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton30ActionPerformed(evt);
            }
        });
        this.jButton31.setBackground(new Color(255, 255, 255));
        this.jButton31.setFont(new Font("Roboto", 1, 18));
        this.jButton31.setForeground(new Color(14, 82, 151));
        this.jButton31.setText("Cancelar");
        this.jButton31.setBorder(null);
        this.jButton31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton31ActionPerformed(evt);
            }
        });
        this.jLabel50.setFont(new Font("Roboto", 1, 14));
        this.jLabel50.setForeground(new Color(255, 255, 255));
        this.jLabel50.setText("Cuenta");
        this.productopro.setBorder(BorderFactory.createBevelBorder(0));
        final GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
        this.jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jButton31, -2, 200, -2).addGap(116, 116, 116).addComponent(this.jButton30, -2, 200, -2)).addGroup(jPanel11Layout.createSequentialGroup().addGap(74, 74, 74).addComponent(this.jLabel42).addGap(154, 154, 154).addComponent(this.jLabel43).addGap(128, 128, 128).addComponent(this.jLabel44)).addGroup(jPanel11Layout.createSequentialGroup().addGap(77, 77, 77).addComponent(this.jLabel45).addGap(147, 147, 147).addComponent(this.jLabel46).addGap(113, 113, 113).addComponent(this.jLabel49)).addGroup(jPanel11Layout.createSequentialGroup().addGap(38, 38, 38).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.jLabel48).addGap(122, 122, 122).addComponent(this.jLabel50).addGap(115, 115, 115).addComponent(this.jLabel47)).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ciudadpro, -2, 130, -2).addComponent(this.nombrepro, -2, 130, -2)).addComponent(this.tipopro, -2, 130, -2)).addGap(56, 56, 56).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.emailpro, -2, 130, -2).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.rifpro, -2, 130, -2).addComponent(this.cuentapro, -2, 130, -2)).addGap(30, 30, 30).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bancopro, -2, 130, -2).addComponent(this.productopro, -2, 130, -2).addComponent(this.telpro, -2, 130, -2))))))).addComponent(this.jLabel40, -2, 564, -2)).addContainerGap(102, 32767)));
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(this.jLabel40).addGap(29, 29, 29).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel42, GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel43).addComponent(this.jLabel44))).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.rifpro, -2, -1, -2).addComponent(this.telpro, -2, -1, -2)).addComponent(this.nombrepro, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel49).addComponent(this.jLabel46)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.productopro, -2, -1, -2).addComponent(this.emailpro, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel47).addComponent(this.jLabel50).addComponent(this.jLabel48)).addGap(12, 12, 12).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bancopro, -2, -1, -2).addComponent(this.tipopro, -2, -1, -2).addComponent(this.cuentapro, -2, -1, -2))).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jLabel45).addGap(10, 10, 10).addComponent(this.ciudadpro, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, 32767).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton31, -2, 50, -2).addComponent(this.jButton30, -2, 50, -2)).addGap(70, 70, 70)));
        this.addproveedor.getContentPane().add(this.jPanel11, new AbsoluteConstraints(-6, 0, 670, 480));
        this.jLabel51.setHorizontalAlignment(0);
        this.jLabel51.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1).png")));
        this.addproveedor.getContentPane().add(this.jLabel51, new AbsoluteConstraints(0, 2, 830, 580));
        this.proveedores.setUndecorated(true);
        this.proveedores.getContentPane().setLayout(null);
        this.jButton37.setBackground(new Color(255, 255, 255));
        this.jButton37.setFont(new Font("Roboto", 1, 18));
        this.jButton37.setForeground(new Color(14, 82, 151));
        this.jButton37.setText("Aceptar");
        this.jButton37.setBorder(null);
        this.jButton37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton37ActionPerformed(evt);
            }
        });
        this.proveedores.getContentPane().add(this.jButton37);
        this.jButton37.setBounds(340, 460, 150, 50);
        this.jLabel56.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel56.setForeground(new Color(255, 255, 255));
        this.jLabel56.setHorizontalAlignment(0);
        this.jLabel56.setText("Proveedores");
        this.proveedores.getContentPane().add(this.jLabel56);
        this.jLabel56.setBounds(0, 0, 860, 60);
        this.proveedorest.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jScrollPane6.setViewportView(this.proveedorest);
        this.proveedores.getContentPane().add(this.jScrollPane6);
        this.jScrollPane6.setBounds(20, 80, 810, 350);
        this.jLabel55.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1).png")));
        this.proveedores.getContentPane().add(this.jLabel55);
        this.jLabel55.setBounds(0, 0, 880, 630);
        this.jPanel19.setBackground(new Color(18, 51, 144));
        this.productost.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.productost.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.productostMouseClicked(evt);
            }
        });
        this.jScrollPane7.setViewportView(this.productost);
        this.jButton38.setBackground(new Color(255, 255, 255));
        this.jButton38.setFont(new Font("Roboto", 1, 18));
        this.jButton38.setForeground(new Color(14, 82, 151));
        this.jButton38.setText("Salir");
        this.jButton38.setBorder(null);
        this.jButton38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton38ActionPerformed(evt);
            }
        });
        this.jButton54.setBackground(new Color(255, 255, 255));
        this.jButton54.setFont(new Font("Roboto", 1, 14));
        this.jButton54.setForeground(new Color(14, 82, 151));
        this.jButton54.setText("Cambiar");
        this.jButton54.setBorder(null);
        this.jButton54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton54ActionPerformed(evt);
            }
        });
        this.jLabel100.setFont(new Font("Roboto", 1, 14));
        this.jLabel100.setForeground(new Color(255, 255, 255));
        this.jLabel100.setHorizontalAlignment(0);
        this.jLabel100.setText("Maximo");
        this.jTextField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField3KeyReleased(evt);
            }
        });
        this.jLabel67.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel67.setForeground(new Color(255, 255, 255));
        this.jLabel67.setHorizontalAlignment(0);
        this.jLabel67.setText("Productos");
        this.jLabel99.setFont(new Font("Roboto", 1, 14));
        this.jLabel99.setForeground(new Color(255, 255, 255));
        this.jLabel99.setHorizontalAlignment(0);
        this.jLabel99.setText("Minimo");
        this.jLabel99.setToolTipText("");
        this.jComboBox7.setModel(new DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        this.jComboBox7.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Admin.this.jComboBox7PropertyChange(evt);
            }
        });
        this.jLabel98.setFont(new Font("Roboto", 1, 14));
        this.jLabel98.setForeground(new Color(255, 255, 255));
        this.jLabel98.setHorizontalAlignment(0);
        this.jLabel98.setText("Codigo");
        final GroupLayout jPanel19Layout = new GroupLayout(this.jPanel19);
        this.jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jLabel67, -2, 780, -2).addGap(0, 44, 32767)).addGroup(jPanel19Layout.createSequentialGroup().addContainerGap().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField3).addGroup(GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox7, -2, 150, -2).addComponent(this.jLabel98, -2, 150, -2)).addGap(46, 46, 46).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jLabel99, -2, 80, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel100, -2, 90, -2)).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jSpinner4, -2, 90, -2).addGap(53, 53, 53).addComponent(this.jSpinner5, -2, 90, -2))).addGap(18, 18, 18).addComponent(this.jButton54, -2, 100, -2).addGap(33, 33, 33).addComponent(this.jButton38, -2, 150, -2)).addComponent(this.jScrollPane7, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        jPanel19Layout.setVerticalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.jLabel67, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane7, -1, 363, 32767).addGap(18, 18, 18).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel98).addComponent(this.jLabel99)).addComponent(this.jLabel100)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, 32767).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSpinner4, -2, -1, -2).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox7, -2, -1, -2).addComponent(this.jSpinner5, -2, -1, -2)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton54, -2, 40, -2).addComponent(this.jButton38, -2, 40, -2)))).addContainerGap()));
        final GroupLayout productosLayout = new GroupLayout(this.productos.getContentPane());
        this.productos.getContentPane().setLayout(productosLayout);
        productosLayout.setHorizontalGroup(productosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel19, -1, -1, 32767));
        productosLayout.setVerticalGroup(productosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel19, -1, -1, 32767));
        this.agregaproducto.setUndecorated(true);
        this.agregaproducto.getContentPane().setLayout(null);
        this.jPanel2.setOpaque(false);
        this.addestadopro.setModel(new DefaultComboBoxModel<String>(new String[] { "Nuevo", "Usado" }));
        this.jButton40.setBackground(new Color(255, 255, 255));
        this.jButton40.setFont(new Font("Roboto", 1, 18));
        this.jButton40.setForeground(new Color(14, 82, 151));
        this.jButton40.setText("Agregar");
        this.jButton40.setBorder(null);
        this.jButton40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton40ActionPerformed(evt);
            }
        });
        this.jButton41.setBackground(new Color(255, 255, 255));
        this.jButton41.setFont(new Font("Roboto", 1, 18));
        this.jButton41.setForeground(new Color(14, 82, 151));
        this.jButton41.setText("Salir");
        this.jButton41.setBorder(null);
        this.jButton41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton41ActionPerformed(evt);
            }
        });
        this.jLabel71.setFont(new Font("Roboto", 1, 36));
        this.jLabel71.setForeground(new Color(255, 255, 255));
        this.jLabel71.setHorizontalAlignment(0);
        this.jLabel71.setText("Agregar producto");
        this.jLabel72.setFont(new Font("Roboto", 1, 14));
        this.jLabel72.setForeground(new Color(255, 255, 255));
        this.jLabel72.setHorizontalAlignment(0);
        this.jLabel72.setText("Codigo");
        this.jLabel73.setFont(new Font("Roboto", 1, 14));
        this.jLabel73.setForeground(new Color(255, 255, 255));
        this.jLabel73.setHorizontalAlignment(0);
        this.jLabel73.setText("Producto");
        this.jLabel74.setFont(new Font("Roboto", 1, 14));
        this.jLabel74.setForeground(new Color(255, 255, 255));
        this.jLabel74.setHorizontalAlignment(0);
        this.jLabel74.setText("Estado");
        this.jLabel75.setFont(new Font("Roboto", 1, 14));
        this.jLabel75.setForeground(new Color(255, 255, 255));
        this.jLabel75.setHorizontalAlignment(0);
        this.jLabel75.setText("Modelo");
        this.jLabel78.setFont(new Font("Roboto", 1, 14));
        this.jLabel78.setForeground(new Color(255, 255, 255));
        this.jLabel78.setHorizontalAlignment(0);
        this.jLabel78.setText("Marca");
        this.addcodigopro.setFont(new Font("Roboto", 0, 12));
        this.jLabel88.setForeground(new Color(255, 255, 255));
        this.jLabel88.setHorizontalAlignment(0);
        this.jLabel88.setText("Minimo");
        this.jLabel89.setForeground(new Color(255, 255, 255));
        this.jLabel89.setHorizontalAlignment(0);
        this.jLabel89.setText("Maximo");
        this.jLabel125.setFont(new Font("Roboto", 1, 14));
        this.jLabel125.setForeground(new Color(255, 255, 255));
        this.jLabel125.setHorizontalAlignment(0);
        this.jLabel125.setText("  ");
        final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.jButton41, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel125, -2, 142, -2).addGap(47, 47, 47).addComponent(this.jButton40, -2, 150, -2).addGap(32, 32, 32)).addGroup(jPanel2Layout.createSequentialGroup().addGap(36, 36, 36).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.addcodigopro).addComponent(this.jLabel72, -1, 102, 32767)).addComponent(this.addmodelo, -2, 140, -2).addComponent(this.jLabel75, -2, 142, -2)).addGap(29, 29, 29).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel74, -2, 130, -2).addComponent(this.addestadopro, -2, 130, -2).addComponent(this.addpropro, -2, 130, -2).addComponent(this.jLabel73, -2, 130, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(67, 67, 67).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel78, -2, 142, -2).addComponent(this.addmarca, -2, 140, -2)).addContainerGap(44, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addGap(45, 45, 45).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel88, -1, -1, 32767).addComponent(this.jSpinner2, -1, 70, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jSpinner3, -1, 70, 32767).addComponent(this.jLabel89, -1, -1, 32767)).addGap(22, 22, 22)))).addComponent(this.jLabel71, -1, -1, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel71).addGap(66, 66, 66).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel73).addComponent(this.jLabel78).addComponent(this.jLabel72)).addGap(20, 20, 20).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addpropro, -2, -1, -2).addComponent(this.addmarca, -2, -1, -2).addComponent(this.addcodigopro, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel75).addComponent(this.jLabel74).addComponent(this.jLabel88).addComponent(this.jLabel89)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addmodelo, -2, -1, -2).addComponent(this.addestadopro, -2, -1, -2).addComponent(this.jSpinner2, -2, -1, -2).addComponent(this.jSpinner3, -2, -1, -2)).addGap(69, 69, 69).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton40, -2, 40, -2).addComponent(this.jButton41, -2, 40, -2).addComponent(this.jLabel125)).addGap(15, 15, 15)));
        this.agregaproducto.getContentPane().add(this.jPanel2);
        this.jPanel2.setBounds(0, 0, 590, 410);
        this.jLabel70.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1)_2.png")));
        this.agregaproducto.getContentPane().add(this.jLabel70);
        this.jLabel70.setBounds(0, 0, 640, 460);
        this.jPanel5.setBackground(new Color(18, 51, 144));
        this.solicitudest.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jScrollPane9.setViewportView(this.solicitudest);
        this.jLabel76.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel76.setForeground(new Color(255, 255, 255));
        this.jLabel76.setHorizontalAlignment(0);
        this.jLabel76.setText("Solicitudes de compra");
        this.jButton42.setBackground(new Color(255, 255, 255));
        this.jButton42.setFont(new Font("Roboto", 1, 18));
        this.jButton42.setForeground(new Color(14, 82, 151));
        this.jButton42.setText("Aceptar");
        this.jButton42.setBorder(null);
        this.jButton42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton42ActionPerformed(evt);
            }
        });
        this.jTextField5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField5KeyReleased(evt);
            }
        });
        final GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel76, -1, -1, 32767).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.jScrollPane9, -1, 686, 32767).addGap(17, 17, 17)).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton42, -2, 150, -2).addComponent(this.jTextField5, -2, 459, -2)).addContainerGap(-1, 32767)))));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.jLabel76).addGap(18, 18, 18).addComponent(this.jTextField5, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, 32767).addComponent(this.jScrollPane9, -2, 439, -2).addGap(18, 18, 18).addComponent(this.jButton42, -2, 40, -2).addGap(21, 21, 21)));
        final GroupLayout solicitudesLayout = new GroupLayout(this.solicitudes.getContentPane());
        this.solicitudes.getContentPane().setLayout(solicitudesLayout);
        solicitudesLayout.setHorizontalGroup(solicitudesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -1, -1, 32767));
        solicitudesLayout.setVerticalGroup(solicitudesLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -1, -1, 32767));
        this.Emailconfig.setUndecorated(true);
        this.Emailconfig.getContentPane().setLayout(null);
        this.jPanel4.setOpaque(false);
        this.jComboBox2.setModel(new DefaultComboBoxModel<String>(new String[] { "Habilitado", "Inhablitado" }));
        this.jLabel64.setBackground(new Color(255, 255, 255));
        this.jLabel64.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel64.setForeground(new Color(255, 255, 255));
        this.jLabel64.setHorizontalAlignment(0);
        this.jLabel64.setText("Envio de Email");
        this.jLabel16.setFont(new Font("Roboto", 1, 14));
        this.jLabel16.setForeground(new Color(255, 255, 255));
        this.jLabel16.setHorizontalAlignment(0);
        this.jLabel16.setText("Email");
        this.jLabel65.setFont(new Font("Roboto", 1, 14));
        this.jLabel65.setForeground(new Color(255, 255, 255));
        this.jLabel65.setHorizontalAlignment(0);
        this.jLabel65.setText("Contrase\u00f1a");
        this.jLabel68.setFont(new Font("Roboto", 1, 14));
        this.jLabel68.setForeground(new Color(255, 255, 255));
        this.jLabel68.setHorizontalAlignment(0);
        this.jLabel68.setText("Empresa");
        this.jLabel69.setFont(new Font("Roboto", 1, 14));
        this.jLabel69.setForeground(new Color(255, 255, 255));
        this.jLabel69.setHorizontalAlignment(0);
        this.jLabel69.setText("Envio de Email");
        this.jButton34.setBackground(new Color(255, 255, 255));
        this.jButton34.setFont(new Font("Roboto", 1, 14));
        this.jButton34.setForeground(new Color(14, 82, 151));
        this.jButton34.setText("Cancelar");
        this.jButton34.setBorder(null);
        this.jButton34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton34ActionPerformed(evt);
            }
        });
        this.jButton39.setBackground(new Color(255, 255, 255));
        this.jButton39.setFont(new Font("Roboto", 1, 14));
        this.jButton39.setForeground(new Color(14, 82, 151));
        this.jButton39.setText("Aceptar");
        this.jButton39.setBorder(null);
        this.jButton39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton39ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel64, -1, -1, 32767).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel68, -2, 140, -2).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel16, -2, 140, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup().addGap(19, 19, 19).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton34, -2, 150, -2).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.facturaventa6, -2, 160, -2).addComponent(this.facturaventa5, -2, 160, -2)))))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 151, 32767).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox2, GroupLayout.Alignment.TRAILING, -2, 140, -2).addComponent(this.jPasswordField1, GroupLayout.Alignment.TRAILING, -2, 140, -2).addComponent(this.jLabel65, GroupLayout.Alignment.TRAILING, -2, 140, -2).addComponent(this.jLabel69, GroupLayout.Alignment.TRAILING, -2, 140, -2)).addGap(80, 80, 80)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addComponent(this.jButton39, -2, 150, -2).addGap(36, 36, 36)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel64).addGap(39, 39, 39).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel16).addComponent(this.jLabel65)).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.facturaventa5, -2, -1, -2).addComponent(this.jPasswordField1, -2, -1, -2)).addGap(46, 46, 46).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel68).addComponent(this.jLabel69)).addGap(18, 18, 18).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.facturaventa6, -2, -1, -2).addComponent(this.jComboBox2, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton34, -2, 40, -2).addComponent(this.jButton39, -2, 40, -2)).addGap(15, 15, 15)));
        this.Emailconfig.getContentPane().add(this.jPanel4);
        this.jPanel4.setBounds(0, 0, 550, 350);
        this.jLabel14.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1)_2.png")));
        this.jLabel14.setText("jLabel14");
        this.Emailconfig.getContentPane().add(this.jLabel14);
        this.jLabel14.setBounds(-2, -7, 750, 690);
        this.cambioprecio.setUndecorated(true);
        this.cambioprecio.getContentPane().setLayout(null);
        this.jPanel12.setOpaque(false);
        this.jComboBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jComboBox5ActionPerformed(evt);
            }
        });
        this.jSpinner1.setModel(new SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        this.jLabel80.setBackground(new Color(255, 255, 255));
        this.jLabel80.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel80.setForeground(new Color(255, 255, 255));
        this.jLabel80.setHorizontalAlignment(0);
        this.jLabel80.setText("Cambio de precio ");
        this.jButton43.setBackground(new Color(255, 255, 255));
        this.jButton43.setFont(new Font("Dialog", 1, 14));
        this.jButton43.setForeground(new Color(14, 82, 151));
        this.jButton43.setText("Cambiar");
        this.jButton43.setBorder(null);
        this.jButton43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton43ActionPerformed(evt);
            }
        });
        this.jButton45.setBackground(new Color(255, 255, 255));
        this.jButton45.setFont(new Font("Dialog", 1, 14));
        this.jButton45.setForeground(new Color(14, 82, 151));
        this.jButton45.setText("Cancelar");
        this.jButton45.setBorder(null);
        this.jButton45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton45ActionPerformed(evt);
            }
        });
        this.jLabel81.setForeground(new Color(255, 255, 255));
        this.jLabel81.setHorizontalAlignment(0);
        this.jLabel81.setText("Producto");
        this.jLabel82.setForeground(new Color(255, 255, 255));
        this.jLabel82.setHorizontalAlignment(0);
        this.jLabel82.setText("Nuevo precio");
        final GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
        this.jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel80, -1, -1, 32767).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addComponent(this.jButton45, -2, 150, -2).addGap(0, 310, 32767)).addComponent(this.jComboBox5, 0, -1, 32767).addComponent(this.jLabel81, -1, -1, 32767)).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGap(68, 68, 68).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jSpinner1, -2, 100, -2).addComponent(this.jLabel82, -2, 100, -2)).addGap(22, 22, 22)).addGroup(GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton43, -2, 150, -2).addContainerGap()))));
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel80).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel81).addComponent(this.jLabel82)).addGap(18, 18, 18).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox5, -2, -1, -2).addComponent(this.jSpinner1, -2, -1, -2)).addGap(56, 56, 56).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton43, -2, 40, -2).addComponent(this.jButton45, -2, 40, -2)).addGap(19, 19, 19)));
        this.cambioprecio.getContentPane().add(this.jPanel12);
        this.jPanel12.setBounds(0, 0, 660, 250);
        this.jLabel79.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1)_2.png")));
        this.cambioprecio.getContentPane().add(this.jLabel79);
        this.jLabel79.setBounds(-2, -4, 670, 390);
        this.Pendientes.setUndecorated(true);
        this.Pendientes.getContentPane().setLayout(null);
        this.jPanel13.setOpaque(false);
        this.jLabel84.setBackground(new Color(255, 255, 255));
        this.jLabel84.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel84.setForeground(new Color(255, 255, 255));
        this.jLabel84.setHorizontalAlignment(0);
        this.jLabel84.setText("Emails pendientes");
        this.jLabel85.setFont(new Font("Roboto", 1, 14));
        this.jLabel85.setForeground(new Color(255, 255, 255));
        this.jButton48.setBackground(new Color(255, 255, 255));
        this.jButton48.setFont(new Font("Roboto", 1, 14));
        this.jButton48.setForeground(new Color(14, 82, 151));
        this.jButton48.setText("Cerrar");
        this.jButton48.setBorder(null);
        this.jButton48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton48ActionPerformed(evt);
            }
        });
        this.jComboBox6.setModel(this.combopendiente);
        this.jButton49.setBackground(new Color(255, 255, 255));
        this.jButton49.setForeground(new Color(14, 82, 151));
        this.jButton49.setText("Enviar");
        this.jButton49.setBorder(null);
        this.jButton49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton49ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
        this.jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel84, -1, -1, 32767).addGroup(jPanel13Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel85, -1, -1, 32767).addComponent(this.jComboBox6, 0, 284, 32767)).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jButton49, -2, 80, -2).addContainerGap(-1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.jButton48, -2, 130, -2).addGap(30, 30, 30)))));
        jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel84).addGap(51, 51, 51).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox6, -2, -1, -2).addComponent(this.jButton49, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 88, 32767).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton48, -2, 40, -2).addComponent(this.jLabel85)).addGap(11, 11, 11)));
        this.Pendientes.getContentPane().add(this.jPanel13);
        this.jPanel13.setBounds(0, 0, 520, 270);
        this.jLabel83.setIcon(new ImageIcon(this.getClass().getResource("/img/triangles-download (1)_2.png")));
        this.Pendientes.getContentPane().add(this.jLabel83);
        this.jLabel83.setBounds(0, -4, 650, 530);
        this.jPanel14.setBackground(new Color(18, 51, 144));
        this.nombre.setFont(new Font("Roboto", 1, 18));
        this.nombre.setForeground(new Color(255, 255, 255));
        this.nombre.setText("jLabel15");
        this.jLabel34.setFont(new Font("Roboto", 1, 14));
        this.jLabel34.setForeground(new Color(255, 255, 255));
        this.jLabel34.setText("jLabel17");
        this.jLabel95.setFont(new Font("Roboto", 1, 14));
        this.jLabel95.setForeground(new Color(255, 255, 255));
        this.jLabel95.setText("jLabel17");
        this.jLabel96.setFont(new Font("Roboto", 1, 14));
        this.jLabel96.setForeground(new Color(255, 255, 255));
        this.jLabel96.setText("jLabel17");
        this.jLabel97.setFont(new Font("Roboto", 1, 14));
        this.jLabel97.setForeground(new Color(255, 255, 255));
        this.jLabel97.setText("jLabel17");
        this.jLabel101.setFont(new Font("Roboto", 1, 14));
        this.jLabel101.setForeground(new Color(255, 255, 255));
        this.jLabel101.setText("jLabel17");
        this.jLabel102.setFont(new Font("Roboto", 1, 14));
        this.jLabel102.setForeground(new Color(255, 255, 255));
        this.jLabel102.setText("jLabel17");
        this.jLabel105.setFont(new Font("Roboto", 1, 24));
        this.jLabel105.setForeground(new Color(255, 255, 255));
        this.jLabel105.setHorizontalAlignment(0);
        this.jLabel105.setText("Datos del cliente");
        this.nombre1.setFont(new Font("Roboto", 1, 36));
        this.nombre1.setForeground(new Color(255, 255, 255));
        this.nombre1.setHorizontalAlignment(0);
        this.nombre1.setText("jLabel15");
        this.jLabel109.setFont(new Font("Roboto", 1, 14));
        this.jLabel109.setForeground(new Color(255, 255, 255));
        this.jLabel109.setText("  ");
        this.nombre2.setFont(new Font("Roboto", 1, 18));
        this.nombre2.setForeground(new Color(248, 248, 46));
        this.nombre2.setHorizontalAlignment(4);
        this.nombre2.setText("Servicio N°:");
        this.jLabel103.setFont(new Font("Roboto", 1, 14));
        this.jLabel103.setForeground(new Color(248, 248, 46));
        this.jLabel103.setHorizontalAlignment(4);
        this.jLabel103.setText("Ci:");
        this.jLabel104.setFont(new Font("Roboto", 1, 14));
        this.jLabel104.setForeground(new Color(248, 248, 46));
        this.jLabel104.setHorizontalAlignment(4);
        this.jLabel104.setText("Nombre:");
        this.jLabel106.setFont(new Font("Roboto", 1, 14));
        this.jLabel106.setForeground(new Color(248, 248, 46));
        this.jLabel106.setHorizontalAlignment(4);
        this.jLabel106.setText("Telefono:");
        this.jLabel107.setFont(new Font("Roboto", 1, 14));
        this.jLabel107.setForeground(new Color(248, 248, 46));
        this.jLabel107.setHorizontalAlignment(4);
        this.jLabel107.setText("Direcci\u00f3n:");
        this.jLabel108.setFont(new Font("Roboto", 1, 14));
        this.jLabel108.setForeground(new Color(248, 248, 46));
        this.jLabel108.setHorizontalAlignment(4);
        this.jLabel108.setText("Telefono 2:");
        this.jLabel110.setFont(new Font("Roboto", 1, 14));
        this.jLabel110.setForeground(new Color(248, 248, 46));
        this.jLabel110.setHorizontalAlignment(4);
        this.jLabel110.setText("Entrega:");
        this.jLabel111.setFont(new Font("Roboto", 1, 14));
        this.jLabel111.setForeground(new Color(248, 248, 46));
        this.jLabel111.setHorizontalAlignment(4);
        this.jLabel111.setText("Marca:");
        this.jLabel112.setFont(new Font("Roboto", 1, 14));
        this.jLabel112.setForeground(new Color(248, 248, 46));
        this.jLabel112.setHorizontalAlignment(4);
        this.jLabel112.setText("Modelo:");
        this.jLabel113.setFont(new Font("Roboto", 1, 14));
        this.jLabel113.setForeground(new Color(248, 248, 46));
        this.jLabel113.setHorizontalAlignment(4);
        this.jLabel113.setText("Gama:");
        this.jLabel114.setFont(new Font("Roboto", 1, 14));
        this.jLabel114.setForeground(new Color(248, 248, 46));
        this.jLabel114.setHorizontalAlignment(4);
        this.jLabel114.setText("Memoria:");
        this.jLabel115.setFont(new Font("Roboto", 1, 14));
        this.jLabel115.setForeground(new Color(248, 248, 46));
        this.jLabel115.setHorizontalAlignment(4);
        this.jLabel115.setText("Bateria:");
        this.jLabel116.setFont(new Font("Roboto", 1, 14));
        this.jLabel116.setForeground(new Color(248, 248, 46));
        this.jLabel116.setHorizontalAlignment(4);
        this.jLabel116.setText("Fallas:");
        this.jLabel117.setFont(new Font("Roboto", 1, 14));
        this.jLabel117.setForeground(new Color(248, 248, 46));
        this.jLabel117.setHorizontalAlignment(4);
        this.jLabel117.setText("tapa:");
        this.jLabel118.setFont(new Font("Roboto", 1, 14));
        this.jLabel118.setForeground(new Color(248, 248, 46));
        this.jLabel118.setHorizontalAlignment(4);
        this.jLabel118.setText("Tipo de fallas:");
        this.jLabel119.setFont(new Font("Roboto", 1, 14));
        this.jLabel119.setForeground(new Color(248, 248, 46));
        this.jLabel119.setHorizontalAlignment(4);
        this.jLabel119.setText("Imei:");
        this.jLabel120.setFont(new Font("Roboto", 1, 14));
        this.jLabel120.setForeground(new Color(248, 248, 46));
        this.jLabel120.setHorizontalAlignment(4);
        this.jLabel120.setText("Solo Diag:");
        this.jLabel121.setFont(new Font("Roboto", 1, 14));
        this.jLabel121.setForeground(new Color(255, 255, 255));
        this.jLabel121.setText("Marca:");
        this.jLabel122.setFont(new Font("Roboto", 1, 14));
        this.jLabel122.setForeground(new Color(248, 248, 46));
        this.jLabel122.setHorizontalAlignment(4);
        this.jLabel122.setText("Tecnico:");
        this.jLabel123.setFont(new Font("Roboto", 1, 14));
        this.jLabel123.setForeground(new Color(248, 248, 46));
        this.jLabel123.setHorizontalAlignment(4);
        this.jLabel123.setText("Entregado:");
        this.jLabel124.setFont(new Font("Roboto", 1, 14));
        this.jLabel124.setForeground(new Color(248, 248, 46));
        this.jLabel124.setHorizontalAlignment(4);
        this.jLabel124.setText("Fecha tope:");
        this.jLabel152.setFont(new Font("Roboto", 1, 14));
        this.jLabel152.setForeground(new Color(255, 255, 255));
        this.jLabel152.setText("jLabel17");
        this.jLabel153.setFont(new Font("Roboto", 1, 14));
        this.jLabel153.setForeground(new Color(255, 255, 255));
        this.jLabel153.setText("jLabel17");
        this.jLabel154.setFont(new Font("Roboto", 1, 14));
        this.jLabel154.setForeground(new Color(255, 255, 255));
        this.jLabel154.setText("jLabel17");
        this.jLabel155.setFont(new Font("Roboto", 1, 14));
        this.jLabel155.setForeground(new Color(255, 255, 255));
        this.jLabel155.setText("jLabel17");
        this.jLabel156.setFont(new Font("Roboto", 1, 14));
        this.jLabel156.setForeground(new Color(255, 255, 255));
        this.jLabel156.setText("jLabel17");
        this.jLabel157.setFont(new Font("Roboto", 1, 14));
        this.jLabel157.setForeground(new Color(255, 255, 255));
        this.jLabel157.setText("jLabel17");
        this.jLabel158.setFont(new Font("Roboto", 1, 14));
        this.jLabel158.setForeground(new Color(255, 255, 255));
        this.jLabel158.setText("jLabel17");
        this.jLabel159.setFont(new Font("Roboto", 1, 14));
        this.jLabel159.setForeground(new Color(255, 255, 255));
        this.jLabel159.setText("jLabel17");
        this.jLabel161.setFont(new Font("Roboto", 1, 14));
        this.jLabel161.setForeground(new Color(255, 255, 255));
        this.jLabel161.setText("jLabel17");
        this.jLabel162.setFont(new Font("Roboto", 1, 14));
        this.jLabel162.setForeground(new Color(255, 255, 255));
        this.jLabel162.setText("jLabel17");
        this.jLabel163.setFont(new Font("Roboto", 1, 14));
        this.jLabel163.setForeground(new Color(255, 255, 255));
        this.jLabel163.setText("jLabel17");
        this.jLabel165.setFont(new Font("Roboto", 1, 14));
        this.jLabel165.setForeground(new Color(248, 248, 46));
        this.jLabel165.setHorizontalAlignment(4);
        this.jLabel165.setText("Correcciones:");
        this.jLabel166.setFont(new Font("Roboto", 1, 14));
        this.jLabel166.setForeground(new Color(248, 248, 46));
        this.jLabel166.setHorizontalAlignment(4);
        this.jLabel166.setText("Email:");
        this.jLabel167.setFont(new Font("Roboto", 1, 14));
        this.jLabel167.setForeground(new Color(255, 255, 255));
        this.jLabel167.setText("jLabel17");
        this.jLabel132.setFont(new Font("Roboto", 1, 14));
        this.jLabel132.setForeground(new Color(248, 248, 46));
        this.jLabel132.setHorizontalAlignment(0);
        this.jLabel132.setText("Servicios:");
        this.jComboBox9.setModel(new DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        this.jButton62.setBackground(new Color(255, 255, 255));
        this.jButton62.setFont(new Font("Roboto", 1, 14));
        this.jButton62.setForeground(new Color(14, 82, 151));
        this.jButton62.setText("Agregar");
        this.jButton62.setBorder(null);
        this.jButton62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton62ActionPerformed(evt);
            }
        });
        this.jLabel58.setFont(new Font("Roboto", 1, 14));
        this.jLabel58.setForeground(new Color(255, 255, 255));
        this.jLabel58.setHorizontalAlignment(0);
        this.jLabel58.setText("Agregar servicios");
        this.jList3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Admin.this.jList3KeyPressed(evt);
            }
            
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jList3KeyReleased(evt);
            }
        });
        this.jScrollPane14.setViewportView(this.jList3);
        this.jButton63.setBackground(new Color(255, 255, 255));
        this.jButton63.setFont(new Font("Roboto", 1, 14));
        this.jButton63.setForeground(new Color(14, 82, 151));
        this.jButton63.setText("Aceptar");
        this.jButton63.setBorder(null);
        this.jButton63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton63ActionPerformed(evt);
            }
        });
        this.facturaventa8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.facturaventa8ActionPerformed(evt);
            }
        });
        this.facturaventa8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Admin.this.facturaventa8KeyPressed(evt);
            }
            
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.facturaventa8KeyReleased(evt);
            }
        });
        this.jLabel172.setEditable(false);
        this.jLabel172.setColumns(20);
        this.jLabel172.setLineWrap(true);
        this.jLabel172.setRows(5);
        this.jLabel172.setToolTipText("");
        this.jLabel172.setWrapStyleWord(true);
        this.jScrollPane15.setViewportView(this.jLabel172);
        this.jLabel22.setForeground(new Color(255, 255, 255));
        this.jLabel22.setText("     ");
        this.jLabel160.setColumns(20);
        this.jLabel160.setLineWrap(true);
        this.jLabel160.setRows(5);
        this.jLabel160.setWrapStyleWord(true);
        this.jScrollPane16.setViewportView(this.jLabel160);
        this.jLabel164.setColumns(20);
        this.jLabel164.setLineWrap(true);
        this.jLabel164.setRows(5);
        this.jLabel164.setWrapStyleWord(true);
        this.jScrollPane17.setViewportView(this.jLabel164);
        this.jLabel133.setFont(new Font("Roboto", 1, 14));
        this.jLabel133.setForeground(new Color(255, 255, 255));
        this.jLabel133.setText("Precio:0");
        this.jButton71.setBackground(new Color(255, 255, 255));
        this.jButton71.setFont(new Font("Roboto", 1, 14));
        this.jButton71.setForeground(new Color(14, 82, 151));
        this.jButton71.setText("Editar");
        this.jButton71.setBorder(null);
        this.jButton71.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton71ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
        this.jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addContainerGap().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addComponent(this.jLabel58, -1, -1, 32767).addGap(22, 22, 22).addComponent(this.nombre2, -2, 131, -2)).addGroup(jPanel14Layout.createSequentialGroup().addGap(27, 27, 27).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel133, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel106, -2, 131, -2).addGap(6, 6, 6)).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel132, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jScrollPane15).addComponent(this.nombre1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jScrollPane14, GroupLayout.Alignment.LEADING).addComponent(this.jButton63, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup().addComponent(this.jLabel22, -2, 236, -2).addGap(0, 2, 32767)).addComponent(this.facturaventa8, GroupLayout.Alignment.LEADING).addComponent(this.jComboBox9, GroupLayout.Alignment.LEADING, 0, -1, 32767)).addGap(18, 18, 18).addComponent(this.jButton62, -2, 80, -2)).addComponent(this.jButton71, -1, -1, 32767)).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel103, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel113, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel112, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel111, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel110, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel166, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel107, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel104, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel120, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel119, GroupLayout.Alignment.TRAILING, -2, 89, -2).addComponent(this.jLabel117, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel115, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel114, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel108, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel116, GroupLayout.Alignment.TRAILING, -1, 131, 32767).addComponent(this.jLabel118, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addComponent(this.jLabel122)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, 32767).addComponent(this.jLabel165).addGap(4, 4, 4)))))))).addGroup(jPanel14Layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.jLabel109, -2, 271, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel124, -2, 91, -2)).addGroup(jPanel14Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel123))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel95, GroupLayout.Alignment.TRAILING, -1, 283, 32767).addComponent(this.jLabel96, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel101, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel97, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel102, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel121, -1, -1, 32767).addComponent(this.jLabel152, -1, -1, 32767).addComponent(this.jLabel153, -1, -1, 32767).addComponent(this.jLabel154, -1, -1, 32767).addComponent(this.jLabel155, -1, -1, 32767).addComponent(this.jLabel156, -1, -1, 32767).addComponent(this.jLabel157, -1, -1, 32767).addComponent(this.jLabel158, -1, -1, 32767).addComponent(this.jLabel159, -1, -1, 32767).addComponent(this.jLabel162, -1, -1, 32767).addComponent(this.jLabel163, -1, -1, 32767).addComponent(this.jLabel167, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel34, -1, -1, 32767).addComponent(this.nombre, -1, -1, 32767).addGroup(jPanel14Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jLabel161, -1, -1, 32767))).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane16, GroupLayout.Alignment.TRAILING, -2, 275, -2).addComponent(this.jScrollPane17, GroupLayout.Alignment.TRAILING, -2, 275, -2)).addContainerGap()))).addComponent(this.jLabel105, -1, -1, 32767));
        jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel105, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.nombre, -2, 36, -2).addComponent(this.nombre2, -2, 36, -2).addComponent(this.jLabel58)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel34).addComponent(this.jLabel104).addComponent(this.facturaventa8, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel95).addComponent(this.jLabel103).addComponent(this.jComboBox9, -2, -1, -2))).addComponent(this.jButton62, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel96).addComponent(this.jLabel106).addComponent(this.jLabel133)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel97).addComponent(this.jLabel108, -2, 17, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel101, -2, 19, -2).addComponent(this.jLabel107)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel167, -2, 19, -2).addComponent(this.jLabel166)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel102).addComponent(this.jLabel110)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel111).addComponent(this.jLabel121)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel112).addComponent(this.jLabel152)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel113).addComponent(this.jLabel153)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel114).addComponent(this.jLabel155)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel115).addComponent(this.jLabel154)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel117).addComponent(this.jLabel156)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel119).addComponent(this.jLabel157))).addComponent(this.jScrollPane14)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel120).addComponent(this.jLabel158).addComponent(this.jLabel22)).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel118).addComponent(this.jLabel159).addComponent(this.jButton63, -2, 27, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane16, -2, 62, -2).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.nombre1, -2, 36, -2).addComponent(this.jLabel116)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel132, -2, 17, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jScrollPane17, -2, 0, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addComponent(this.jLabel165).addGap(30, 30, 30))).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel122).addComponent(this.jLabel162))).addComponent(this.jScrollPane15, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel123).addComponent(this.jLabel161)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel124).addComponent(this.jLabel163)).addComponent(this.jLabel109))).addComponent(this.jButton71, -2, 27, -2)).addGap(1, 1, 1)));
        final GroupLayout informaLayout = new GroupLayout(this.informa.getContentPane());
        this.informa.getContentPane().setLayout(informaLayout);
        informaLayout.setHorizontalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel14, -1, -1, 32767));
        informaLayout.setVerticalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel14, -1, -1, 32767));
        this.jPanel16.setBackground(new Color(18, 51, 144));
        this.jPanel16.setBorder(new SoftBevelBorder(0));
        this.jComboBox8.setModel(new DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        this.precio1.setModel(new SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        this.jButton16.setBackground(new Color(255, 255, 255));
        this.jButton16.setFont(new Font("Roboto", 1, 14));
        this.jButton16.setForeground(new Color(14, 82, 151));
        this.jButton16.setText("Poner precio");
        this.jButton16.setBorder(null);
        this.jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton16ActionPerformed(evt);
            }
        });
        this.jButton55.setBackground(new Color(255, 255, 255));
        this.jButton55.setFont(new Font("Roboto", 1, 14));
        this.jButton55.setForeground(new Color(14, 82, 151));
        this.jButton55.setText("Salir");
        this.jButton55.setBorder(null);
        this.jButton55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton55ActionPerformed(evt);
            }
        });
        this.jLabel168.setFont(new Font("Roboto", 1, 14));
        this.jLabel168.setForeground(new Color(255, 255, 255));
        this.jLabel168.setHorizontalAlignment(0);
        this.jLabel168.setText("Precio");
        this.jLabel168.setToolTipText("");
        this.jLabel169.setFont(new Font("Roboto", 1, 14));
        this.jLabel169.setForeground(new Color(255, 255, 255));
        this.jLabel169.setHorizontalAlignment(0);
        this.jLabel169.setText("N° Equipo");
        this.jLabel170.setBackground(new Color(255, 255, 255));
        this.jLabel170.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel170.setForeground(new Color(255, 255, 255));
        this.jLabel170.setHorizontalAlignment(0);
        this.jLabel170.setText("Clientes");
        this.jLabel171.setForeground(new Color(255, 255, 255));
        this.jButton56.setBackground(new Color(255, 255, 255));
        this.jButton56.setFont(new Font("Roboto", 1, 14));
        this.jButton56.setForeground(new Color(14, 82, 151));
        this.jButton56.setText("Exportar");
        this.jButton56.setBorder(null);
        this.jButton56.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton56ActionPerformed(evt);
            }
        });
        this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable2.setGridColor(new Color(43, 142, 235));
        this.jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.jTable2MouseClicked(evt);
            }
        });
        this.jScrollPane12.setViewportView(this.jTable2);
        final GroupLayout jPanel16Layout = new GroupLayout(this.jPanel16);
        this.jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel170, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup().addContainerGap().addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel169, -2, 120, -2).addComponent(this.jComboBox8, -2, 120, -2)).addGap(34, 34, 34).addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.precio1, -2, 100, -2)).addComponent(this.jLabel168, -2, 100, -2)).addGap(0, 0, 32767)).addGroup(jPanel16Layout.createSequentialGroup().addGap(0, 477, 32767).addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel171, -2, 79, -2).addGroup(jPanel16Layout.createSequentialGroup().addComponent(this.jButton16, -2, 150, -2).addGap(156, 156, 156).addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton55, -2, 150, -2).addComponent(this.jButton56, -2, 140, -2)))))).addGap(9, 9, 9))).addContainerGap(74, 32767)).addComponent(this.jScrollPane12, GroupLayout.Alignment.TRAILING));
        jPanel16Layout.setVerticalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addComponent(this.jLabel170).addGap(44, 44, 44).addComponent(this.jScrollPane12, -2, 227, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addComponent(this.jButton56, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton55, -2, 40, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel171).addContainerGap(-1, 32767)).addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel168).addComponent(this.jLabel169)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox8, -2, -1, -2).addComponent(this.precio1, -2, -1, -2).addComponent(this.jButton16, -2, 40, -2)).addContainerGap(-1, 32767)))));
        final GroupLayout registros1Layout = new GroupLayout(this.registros1.getContentPane());
        this.registros1.getContentPane().setLayout(registros1Layout);
        registros1Layout.setHorizontalGroup(registros1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel16, -1, -1, 32767));
        registros1Layout.setVerticalGroup(registros1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel16, -1, -1, 32767));
        this.jPanel15.setBackground(new Color(18, 51, 144));
        this.jLabel39.setFont(new Font("Roboto", 1, 14));
        this.jLabel39.setForeground(new Color(255, 255, 255));
        this.jLabel39.setHorizontalAlignment(0);
        this.jLabel39.setText("Producto:");
        this.jLabel126.setFont(new Font("Roboto", 1, 14));
        this.jLabel126.setForeground(new Color(255, 255, 255));
        this.jLabel126.setHorizontalAlignment(0);
        this.jLabel126.setText("Codigo:");
        this.jLabel127.setFont(new Font("Roboto", 1, 14));
        this.jLabel127.setForeground(new Color(255, 255, 255));
        this.jLabel127.setHorizontalAlignment(0);
        this.jLabel127.setText("Marca:");
        this.jLabel128.setFont(new Font("Roboto", 1, 14));
        this.jLabel128.setForeground(new Color(255, 255, 255));
        this.jLabel128.setHorizontalAlignment(0);
        this.jLabel128.setText("Modelo:");
        this.jLabel129.setFont(new Font("Roboto", 1, 14));
        this.jLabel129.setForeground(new Color(255, 255, 255));
        this.jLabel129.setHorizontalAlignment(0);
        this.jLabel129.setText("  ");
        this.jButton58.setBackground(new Color(255, 255, 255));
        this.jButton58.setFont(new Font("Roboto", 1, 18));
        this.jButton58.setForeground(new Color(14, 82, 151));
        this.jButton58.setText("Cambiar");
        this.jButton58.setBorder(null);
        this.jButton58.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton58ActionPerformed(evt);
            }
        });
        this.jButton59.setBackground(new Color(255, 255, 255));
        this.jButton59.setFont(new Font("Roboto", 1, 18));
        this.jButton59.setForeground(new Color(14, 82, 151));
        this.jButton59.setText("Salir");
        this.jButton59.setBorder(null);
        this.jButton59.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton59ActionPerformed(evt);
            }
        });
        this.addnombre1.setHorizontalAlignment(0);
        this.addnombre1.setBorder(new SoftBevelBorder(0));
        this.addnombre2.setHorizontalAlignment(0);
        this.addnombre2.setBorder(new SoftBevelBorder(0));
        this.addnombre2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.addnombre2ActionPerformed(evt);
            }
        });
        this.addnombre3.setHorizontalAlignment(0);
        this.addnombre3.setBorder(new SoftBevelBorder(0));
        this.jLabel130.setFont(new Font("Roboto", 1, 14));
        this.jLabel130.setForeground(new Color(255, 255, 255));
        this.jLabel130.setHorizontalAlignment(0);
        this.jLabel130.setText("  ");
        final GroupLayout jPanel15Layout = new GroupLayout(this.jPanel15);
        this.jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel15Layout.createSequentialGroup().addGap(40, 40, 40).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel15Layout.createSequentialGroup().addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel126, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel39, -2, 100, -2)).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel127, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel128, -2, 100, -2))).addGap(62, 62, 62)).addGroup(jPanel15Layout.createSequentialGroup().addComponent(this.jLabel129, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.addnombre1, -2, 130, -2).addGap(51, 51, 51)))).addGroup(jPanel15Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton59, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel130, -2, 204, -2).addGap(18, 18, 18).addComponent(this.jButton58, -2, 100, -2).addGap(34, 34, 34)).addGroup(GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.addnombre2, -2, 130, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.addnombre3, -2, 130, -2).addGap(51, 51, 51)));
        jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel15Layout.createSequentialGroup().addGap(53, 53, 53).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel126).addComponent(this.jLabel39)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel129).addComponent(this.addnombre1, -2, -1, -2)).addGap(94, 94, 94).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel128).addComponent(this.jLabel127)).addGap(19, 19, 19).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.addnombre3, -2, -1, -2).addComponent(this.addnombre2, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, 32767).addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton58, -2, 35, -2).addComponent(this.jButton59, -2, 35, -2).addComponent(this.jLabel130)).addGap(23, 23, 23)));
        final GroupLayout jFrame1Layout = new GroupLayout(this.jFrame1.getContentPane());
        this.jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel15, -1, -1, 32767));
        jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel15, -1, -1, 32767));
        final GroupLayout jPanel20Layout = new GroupLayout(this.jPanel20);
        this.jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
        jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
        this.jPanel21.setBackground(new Color(173, 49, 17));
        this.jButton65.setBackground(new Color(255, 255, 255));
        this.jButton65.setFont(new Font("Roboto", 1, 18));
        this.jButton65.setForeground(new Color(14, 82, 151));
        this.jButton65.setText("No");
        this.jButton65.setBorder(null);
        this.jButton65.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton65ActionPerformed(evt);
            }
        });
        this.jButton66.setBackground(new Color(255, 255, 255));
        this.jButton66.setFont(new Font("Roboto", 1, 18));
        this.jButton66.setForeground(new Color(14, 82, 151));
        this.jButton66.setText("Si");
        this.jButton66.setBorder(null);
        this.jButton66.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton66ActionPerformed(evt);
            }
        });
        this.bienvenida1.setFont(new Font("Roboto", 1, 40));
        this.bienvenida1.setForeground(new Color(255, 255, 255));
        this.bienvenida1.setHorizontalAlignment(0);
        this.bienvenida1.setText("Desea salir?");
        final GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
        this.jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addContainerGap().addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jButton66, -2, 128, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton65, -2, 128, -2).addGap(22, 22, 22)).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addComponent(this.bienvenida1, -1, 403, 32767).addContainerGap()))));
        jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addContainerGap(27, 32767).addComponent(this.bienvenida1, -2, 77, -2).addGap(18, 18, 18).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton66, -2, 67, -2).addComponent(this.jButton65, -2, 67, -2)).addContainerGap()));
        final GroupLayout salidaLayout = new GroupLayout(this.salida.getContentPane());
        this.salida.getContentPane().setLayout(salidaLayout);
        salidaLayout.setHorizontalGroup(salidaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel21, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        salidaLayout.setVerticalGroup(salidaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel21, -1, -1, 32767));
        this.jPanel23.setBackground(new Color(18, 51, 144));
        this.bienvenida2.setFont(new Font("Roboto", 1, 36));
        this.bienvenida2.setForeground(new Color(255, 255, 255));
        this.bienvenida2.setHorizontalAlignment(0);
        this.bienvenida2.setText("Desea agregar los servicios?");
        this.jButton67.setBackground(new Color(255, 255, 255));
        this.jButton67.setFont(new Font("Roboto", 1, 18));
        this.jButton67.setForeground(new Color(27, 48, 107));
        this.jButton67.setText("Si");
        this.jButton67.setBorder(null);
        this.jButton67.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton67ActionPerformed(evt);
            }
        });
        this.jButton68.setBackground(new Color(255, 255, 255));
        this.jButton68.setFont(new Font("Roboto", 1, 18));
        this.jButton68.setForeground(new Color(27, 48, 107));
        this.jButton68.setText("No");
        this.jButton68.setBorder(null);
        this.jButton68.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton68ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel23Layout = new GroupLayout(this.jPanel23);
        this.jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bienvenida2, -1, 519, 32767).addGroup(jPanel23Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jButton67, -2, 175, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton68, -2, 175, -2).addGap(39, 39, 39)));
        jPanel23Layout.setVerticalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addComponent(this.bienvenida2, -2, 114, -2).addGap(18, 18, 18).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton68, -2, 40, -2).addComponent(this.jButton67, -2, 40, -2)).addContainerGap(35, 32767)));
        final GroupLayout jFrame2Layout = new GroupLayout(this.jFrame2.getContentPane());
        this.jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(jFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel23, -1, -1, 32767));
        jFrame2Layout.setVerticalGroup(jFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel23, -1, -1, 32767));
        this.jPanel6.setBackground(new Color(18, 51, 144));
        this.jButton10.setBackground(new Color(255, 255, 255));
        this.jButton10.setFont(new Font("Roboto", 1, 14));
        this.jButton10.setForeground(new Color(14, 82, 151));
        this.jButton10.setText("No");
        this.jButton10.setBorder(null);
        this.jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton10ActionPerformed(evt);
            }
        });
        this.jButton13.setBackground(new Color(255, 255, 255));
        this.jButton13.setFont(new Font("Roboto", 1, 14));
        this.jButton13.setForeground(new Color(14, 82, 151));
        this.jButton13.setText("Si");
        this.jButton13.setBorder(null);
        this.jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton13ActionPerformed(evt);
            }
        });
        this.jLabel9.setFont(new Font("Dialog", 1, 36));
        this.jLabel9.setForeground(new Color(255, 255, 255));
        this.jLabel9.setHorizontalAlignment(0);
        this.jLabel9.setText("Desea editar?");
        this.jLabel9.setToolTipText("");
        final GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jButton13, -2, 80, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton10, -2, 80, -2).addGap(25, 25, 25)).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel9, -1, 488, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel9, -2, 109, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, 32767).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton10, -2, 40, -2).addComponent(this.jButton13, -2, 40, -2)).addGap(16, 16, 16)));
        final GroupLayout jFrame3Layout = new GroupLayout(this.jFrame3.getContentPane());
        this.jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(jFrame3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        jFrame3Layout.setVerticalGroup(jFrame3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        this.jPanel24.setBackground(new Color(18, 50, 109));
        this.jList4.setBackground(new Color(255, 255, 255));
        this.jList4.setForeground(new Color(0, 0, 0));
        this.jList4.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            
            @Override
            public int getSize() {
                return this.strings.length;
            }
            
            @Override
            public String getElementAt(final int i) {
                return this.strings[i];
            }
        });
        this.jList4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(final MouseEvent evt) {
                Admin.this.jList4MouseReleased(evt);
            }
        });
        this.jScrollPane5.setViewportView(this.jList4);
        this.bienvenida3.setFont(new Font("Roboto", 1, 40));
        this.bienvenida3.setForeground(new Color(255, 255, 255));
        this.bienvenida3.setHorizontalAlignment(0);
        this.bienvenida3.setText("Facturas");
        this.jButton28.setBackground(new Color(255, 255, 255));
        this.jButton28.setFont(new Font("Roboto", 1, 18));
        this.jButton28.setForeground(new Color(27, 48, 107));
        this.jButton28.setText("Exportar");
        this.jButton28.setBorder(null);
        this.jButton28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton28ActionPerformed(evt);
            }
        });
        this.bienvenida4.setFont(new Font("Roboto", 1, 18));
        this.bienvenida4.setForeground(new Color(255, 255, 255));
        this.bienvenida4.setHorizontalAlignment(0);
        final GroupLayout jPanel24Layout = new GroupLayout(this.jPanel24);
        this.jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bienvenida3, -1, 542, 32767).addGroup(jPanel24Layout.createSequentialGroup().addGap(14, 14, 14).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.bienvenida4, -2, 404, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton28, -2, 100, -2)).addComponent(this.jScrollPane5, -2, 526, -2)))).addContainerGap(24, 32767)));
        jPanel24Layout.setVerticalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup().addComponent(this.bienvenida3, -2, 77, -2).addGap(43, 43, 43).addComponent(this.jScrollPane5, -1, 483, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton28, -2, 40, -2).addComponent(this.bienvenida4, -2, 29, -2)).addGap(7, 7, 7)));
        final GroupLayout listfacturasLayout = new GroupLayout(this.listfacturas.getContentPane());
        this.listfacturas.getContentPane().setLayout(listfacturasLayout);
        listfacturasLayout.setHorizontalGroup(listfacturasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel24, -1, -1, 32767));
        listfacturasLayout.setVerticalGroup(listfacturasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel24, -1, -1, 32767));
        this.setDefaultCloseOperation(3);
        this.setTitle("PhoneSystem");
        this.setBounds(new Rectangle(0, 0, 0, 0));
        this.setCursor(new Cursor(0));
        this.setFont(new Font("Material Design Icons", 0, 12));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), 2));
        this.jPanel1.setBackground(new Color(18, 51, 144));
        this.jPanel1.setForeground(UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        this.jPanel1.setPreferredSize(new Dimension(1147, 668));
        this.mo = new DefaultTableModel();
        this.tabla_inventario.setBorder(BorderFactory.createBevelBorder(1));
        this.tabla_inventario.setModel(this.mo);
        this.tabla_inventario.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(final FocusEvent evt) {
                Admin.this.tabla_inventarioFocusGained(evt);
            }
        });
        this.tabla_inventario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Admin.this.tabla_inventarioMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.tabla_inventario);
        this.jButton5.setBackground(new Color(18, 51, 144));
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_highlight_off_white_18dp.png")));
        this.jButton5.setBorder(null);
        this.jButton5.setFocusable(false);
        this.jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton5ActionPerformed(evt);
            }
        });
        this.textchat.setEditable(false);
        this.textchat.setColumns(20);
        this.textchat.setFont(new Font("Roboto", 0, 14));
        this.textchat.setLineWrap(true);
        this.textchat.setRows(5);
        this.textchat.setWrapStyleWord(true);
        this.textchat.setBorder(BorderFactory.createBevelBorder(0));
        this.jScrollPane3.setViewportView(this.textchat);
        this.chatereceptor.setModel(this.combo);
        this.chatereceptor.setDebugGraphicsOptions(-1);
        this.chatereceptor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.chatereceptorActionPerformed(evt);
            }
        });
        this.jButton18.setBackground(new Color(10, 28, 85));
        this.jButton18.setFont(this.jButton18.getFont());
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_send_white_18dp.png")));
        this.jButton18.setBorder(null);
        this.jButton18.setBorderPainted(false);
        this.jButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton18ActionPerformed(evt);
            }
        });
        this.bienvenida.setFont(new Font("Roboto", 1, 36));
        this.bienvenida.setForeground(new Color(255, 255, 255));
        this.bienvenida.setHorizontalAlignment(0);
        this.bienvenida.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_business_center_white_36dp.png")));
        this.bienvenida.setText("Administraci\u00f3n");
        this.jLabel6.setBackground(new Color(8, 38, 131));
        this.jLabel6.setFont(new Font("Roboto", 1, 24));
        this.jLabel6.setForeground(new Color(255, 255, 255));
        this.jLabel6.setHorizontalAlignment(0);
        this.jLabel6.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_receipt_white_24dp.png")));
        this.jLabel6.setText("Inventario");
        this.jLabel6.setOpaque(true);
        this.jButton50.setBackground(new Color(9, 46, 162));
        this.jButton50.setFont(new Font("Roboto", 1, 14));
        this.jButton50.setForeground(new Color(255, 255, 255));
        this.jButton50.setText("Exportar");
        this.jButton50.setBorder(null);
        this.jButton50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton50ActionPerformed(evt);
            }
        });
        this.chatadmin.setColumns(16);
        this.chatadmin.setFont(new Font("Roboto", 0, 14));
        this.chatadmin.setLineWrap(true);
        this.chatadmin.setRows(3);
        this.chatadmin.setTabSize(6);
        this.chatadmin.setWrapStyleWord(true);
        this.jScrollPane10.setViewportView(this.chatadmin);
        this.jPanel17.setBackground(new Color(18, 46, 124));
        this.jPanel17.setLayout(new GridLayout(2, 2, 30, 30));
        this.jButton4.setBackground(new Color(16, 39, 114));
        this.jButton4.setFont(new Font("Roboto", 1, 14));
        this.jButton4.setForeground(new Color(255, 255, 255));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_person_add_white_24dp.png")));
        this.jButton4.setText("Agregar Usuario");
        this.jButton4.setBorder(null);
        this.jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton4);
        this.jButton15.setBackground(new Color(16, 39, 114));
        this.jButton15.setFont(new Font("Roboto", 1, 14));
        this.jButton15.setForeground(new Color(255, 255, 255));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_not_interested_white_24dp.png")));
        this.jButton15.setText("Eliminar Usuario");
        this.jButton15.setBorder(null);
        this.jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton15);
        this.jButton46.setBackground(new Color(16, 39, 114));
        this.jButton46.setFont(new Font("Roboto", 1, 14));
        this.jButton46.setForeground(new Color(255, 255, 255));
        this.jButton46.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_mail_outline_white_24dp.png")));
        this.jButton46.setText("Email");
        this.jButton46.setBorder(null);
        this.jButton46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton46ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton46);
        this.jButton27.setBackground(new Color(16, 39, 114));
        this.jButton27.setFont(new Font("Roboto", 1, 14));
        this.jButton27.setForeground(new Color(255, 255, 255));
        this.jButton27.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_mode_edit_white_24dp.png")));
        this.jButton27.setText("Cambio de Contrase\u00f1a");
        this.jButton27.setBorder(null);
        this.jButton27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton27ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton27);
        this.jButton47.setBackground(new Color(16, 39, 114));
        this.jButton47.setFont(new Font("Roboto", 1, 14));
        this.jButton47.setForeground(new Color(255, 255, 255));
        this.jButton47.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_call_missed_outgoing_white_24dp.png")));
        this.jButton47.setText("Emails pendientes");
        this.jButton47.setBorder(null);
        this.jButton47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton47ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton47);
        this.error.setFont(new Font("Roboto", 1, 18));
        this.error.setForeground(new Color(255, 255, 255));
        this.error.setText(" ");
        this.jPanel17.add(this.error);
        this.jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                Admin.this.jTextField1KeyReleased(evt);
            }
        });
        this.jPanel18.setLayout(new GridLayout(2, 6, 2, 2));
        this.jButton29.setBackground(new Color(255, 255, 255));
        this.jButton29.setFont(new Font("Roboto", 1, 14));
        this.jButton29.setForeground(new Color(14, 82, 151));
        this.jButton29.setText("Agregar proveedor");
        this.jButton29.setBorder(null);
        this.jButton29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton29ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton29);
        this.jButton32.setBackground(new Color(255, 255, 255));
        this.jButton32.setFont(new Font("Roboto", 1, 14));
        this.jButton32.setForeground(new Color(14, 82, 151));
        this.jButton32.setText("Nuevo pedido");
        this.jButton32.setBorder(null);
        this.jButton32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton32ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton32);
        this.clientesbtn2.setBackground(new Color(255, 255, 255));
        this.clientesbtn2.setFont(new Font("Roboto", 1, 14));
        this.clientesbtn2.setForeground(new Color(14, 82, 151));
        this.clientesbtn2.setText("Agregar producto");
        this.clientesbtn2.setBorder(null);
        this.clientesbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.clientesbtn2ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.clientesbtn2);
        this.jButton1.setBackground(new Color(255, 255, 255));
        this.jButton1.setFont(new Font("Roboto", 1, 14));
        this.jButton1.setForeground(new Color(14, 82, 151));
        this.jButton1.setText("Ventas");
        this.jButton1.setBorder(null);
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton1);
        this.clientesbtn1.setBackground(new Color(255, 255, 255));
        this.clientesbtn1.setFont(new Font("Roboto", 1, 14));
        this.clientesbtn1.setForeground(new Color(14, 82, 151));
        this.clientesbtn1.setText("Pedidos de compra");
        this.clientesbtn1.setBorder(null);
        this.clientesbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.clientesbtn1ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.clientesbtn1);
        this.jButton23.setBackground(new Color(255, 255, 255));
        this.jButton23.setFont(new Font("Roboto", 1, 14));
        this.jButton23.setForeground(new Color(14, 82, 151));
        this.jButton23.setText("Compras");
        this.jButton23.setBorder(null);
        this.jButton23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton23ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton23);
        this.jButton22.setBackground(new Color(255, 255, 255));
        this.jButton22.setFont(new Font("Roboto", 1, 14));
        this.jButton22.setForeground(new Color(14, 82, 151));
        this.jButton22.setText("Clientes");
        this.jButton22.setBorder(null);
        this.jButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton22ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton22);
        this.jButton19.setBackground(new Color(255, 255, 255));
        this.jButton19.setFont(new Font("Roboto", 1, 14));
        this.jButton19.setForeground(new Color(14, 82, 151));
        this.jButton19.setText("Proveedores");
        this.jButton19.setBorder(null);
        this.jButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton19);
        this.clientesbtn3.setBackground(new Color(255, 255, 255));
        this.clientesbtn3.setFont(new Font("Roboto", 1, 14));
        this.clientesbtn3.setForeground(new Color(14, 82, 151));
        this.clientesbtn3.setText("Inventario");
        this.clientesbtn3.setBorder(null);
        this.clientesbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.clientesbtn3ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.clientesbtn3);
        this.jButton21.setBackground(new Color(255, 255, 255));
        this.jButton21.setFont(new Font("Roboto", 1, 14));
        this.jButton21.setForeground(new Color(14, 82, 151));
        this.jButton21.setText("Comprar");
        this.jButton21.setBorder(null);
        this.jButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton21ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton21);
        this.jButton44.setBackground(new Color(255, 255, 255));
        this.jButton44.setFont(new Font("Roboto", 1, 14));
        this.jButton44.setForeground(new Color(14, 82, 151));
        this.jButton44.setText("Actualizar precios");
        this.jButton44.setBorder(null);
        this.jButton44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton44ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton44);
        this.jButton14.setBackground(new Color(255, 255, 255));
        this.jButton14.setFont(new Font("Roboto", 1, 14));
        this.jButton14.setForeground(new Color(14, 82, 151));
        this.jButton14.setText("Facturas");
        this.jButton14.setBorder(null);
        this.jButton14.setBorderPainted(false);
        this.jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Admin.this.jButton14ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jButton14);
        this.jLabel13.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.bienvenida, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton5, -2, 30, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel6, -2, 705, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton50, -1, 290, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextField1, -2, 705, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel13).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1).addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jPanel17, -1, 736, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.chatereceptor, 0, -1, 32767).addComponent(this.jScrollPane3).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane10, -2, 205, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton18, -2, 30, -2)))).addComponent(this.jPanel18, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addContainerGap()))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(3, 3, 3).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton5, -2, 30, -2).addComponent(this.bienvenida, -2, 42, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton50, -2, 36, -2).addComponent(this.jLabel6, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jLabel13)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -1, 238, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel18, -2, 70, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane3, -2, 112, -2).addComponent(this.jPanel17, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.chatereceptor, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton18, -2, 30, -2).addComponent(this.jScrollPane10, -2, -1, -2))));
        this.getContentPane().add(this.jPanel1);
        this.pack();
    }
    
    private void jButton4ActionPerformed(final ActionEvent evt) {
        this.agregaempleado.setVisible(true);
        this.agregaempleado.setSize(521, 252);
        this.agregaempleado.setLocationRelativeTo(this);
    }
    
    private void jButton15ActionPerformed(final ActionEvent evt) {
        this.eliminar.setVisible(true);
        this.eliminar.setSize(449, 213);
        this.eliminar.setLocationRelativeTo(this);
    }
    
    private void jButton3ActionPerformed(final ActionEvent evt) {
        this.setcombo();
        this.metodos.eliminar_usuario((String)this.getusueli.getSelectedItem());
        this.eliminar.setVisible(false);
        this.setcombo();
    }
    
    private void jButton5ActionPerformed(final ActionEvent evt) {
        this.setVisible(false);
        final Inicio i = new Inicio();
        i.setSize(500, 548);
        i.setLocationRelativeTo(null);
        i.setVisible(true);
    }
    
    private void jButton7ActionPerformed(final ActionEvent evt) {
        this.agregaempleado.setVisible(false);
    }
    
    private void jButton9ActionPerformed(final ActionEvent evt) {
        try {
            if (this.addnombre.getText().equals("") || this.addcontra.getText().equals("")) {
                this.erroragregar.setText("Complete todos los campos");
            }
            else {
                this.metodos.agregar_empleado(this.addnombre.getText(), this.addcontra.getText(), (String)this.addtipo.getSelectedItem(), this.error);
                this.agregaempleado.setVisible(false);
                this.setchat(this.bienvenida.getText());
                this.addnombre.setText("");
                this.addcontra.setText("");
                this.setcombo();
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }
    
    private void jButton18ActionPerformed(final ActionEvent evt) {
        if (!this.chatadmin.getText().equals("")) {
            this.metodos.enviar_chat((String)this.chatereceptor.getSelectedItem(), this.bienvenida.getText(), this.chatadmin.getText());
            this.chatadmin.setText("");
        }
    }
    
    private void jButton21ActionPerformed(final ActionEvent evt) {
        this.setsalida(2);
        this.comprar.setVisible(true);
        this.setcombosolicitar();
        this.jList2.setModel(this.molistasolici);
        this.comprar.setLocationRelativeTo(null);
        this.comprar.setExtendedState(6);
        this.jList2.setModel(this.molistasolici);
    }
    
    private void jButton11ActionPerformed(final ActionEvent evt) {
        final Conectar2 conectar2 = new Conectar2();
        final Statement statement = conectar2.retorna();
        for (int i2 = 0; i2 < this.listcompra.getSize(); ++i2) {
            final String soli = this.listcompra.get(i2).toString();
            final String id = soli.substring(soli.indexOf("ITM: ") + 5, soli.indexOf(" CO:"));
            final String codigo = soli.substring(soli.indexOf("CO: ") + 4, soli.indexOf(" Prd:"));
            final String proveedor = soli.substring(soli.indexOf(" Prove: ") + 8, soli.indexOf(" $:"));
            final String producto = soli.substring(soli.indexOf(" Prd: ") + 6, soli.indexOf(","));
            final String preci = soli.substring(soli.indexOf("$: ") + 3, soli.indexOf(" Ca"));
            final String canti = soli.substring(soli.indexOf("Cant: ") + 6);
            try {
                int j = 0;
                final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `codigo` LIKE '" + codigo + "'");
                while (usuario.next()) {
                    ++j;
                }
                final ResultSet usuario2 = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra` WHERE `id` LIKE '" + codigo + "' AND `proveedor` LIKE '" + proveedor + "' AND`entregado` LIKE 'no'");
                if (j == 1) {
                    this.metodos.compra(proveedor, codigo, canti + "", preci + "", this.facturacompr.getText());
                    System.out.println(codigo);
                    this.setcombosolicitar();
                    this.jLabel38.setText("Agregado al inventario");
                    this.metodos.setentregacompra(id);
                    final Timer t = new Timer(3000, new ActionListener() {
                        @Override
                        public void actionPerformed(final ActionEvent e) {
                            Admin.this.jLabel38.setText("");
                        }
                    });
                    t.start();
                }
                else {
                    final ResultSet usuario3 = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` WHERE `codigo` LIKE '" + codigo + "'");
                    while (usuario3.next()) {
                        final String marca = usuario3.getString("marca");
                        final String modelo = usuario3.getString("modelo");
                        final String estado = usuario3.getString("estado");
                        final String minimo = usuario3.getString("minimo");
                        final String maximo = usuario3.getString("maximo");
                        System.out.println(codigo);
                        System.out.println(canti);
                        this.metodos.agregar_inventario(codigo, proveedor, producto, marca, modelo, estado, canti, preci, minimo, maximo, this.facturacompr.getText());
                        this.setcombosolicitar();
                        this.jLabel38.setText("Agregado al inventario");
                        this.metodos.setentregacompra(id);
                        final Timer t2 = new Timer(3000, new ActionListener() {
                            @Override
                            public void actionPerformed(final ActionEvent e) {
                                Admin.this.jLabel38.setText("");
                            }
                        });
                        t2.start();
                    }
                }
                System.out.println("correcto");
                this.setcolum();
                this.setcombosolicitar();
                this.setinventario();
                this.jList1.setModel(this.listcompra);
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            finally {
                conectar2.desconectar();
            }
        }
        this.listcompra.clear();
    }
    
    private void jButton19ActionPerformed(final ActionEvent evt) {
        this.proveedores.setVisible(true);
        this.proveedores.setSize(861, 543);
        this.proveedores.setLocationRelativeTo(this);
        this.setproveedores();
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        this.eliminar.setVisible(false);
    }
    
    private void jButton12ActionPerformed(final ActionEvent evt) {
        this.salida.setVisible(true);
        this.salida.setSize(423, 230);
        this.salida.setLocationRelativeTo(this);
    }
    
    private void jButton17ActionPerformed(final ActionEvent evt) {
        this.setsalida(1);
        System.out.println(this.salidas);
        this.salida.setVisible(true);
        this.salida.setSize(423, 230);
        this.salida.setLocationRelativeTo(this);
    }
    
    private void jButton23ActionPerformed(final ActionEvent evt) {
        this.comprasrea.setVisible(true);
        this.comprasrea.setSize(723, 472);
        this.comprasrea.setLocationRelativeTo(this);
        this.setcompras();
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        this.ventasrea.setVisible(true);
        this.ventasrea.setSize(879, 385);
        this.ventasrea.setLocationRelativeTo(this);
        this.setventas(this.jTextField4.getText());
    }
    
    private void chatereceptorActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton22ActionPerformed(final ActionEvent evt) {
        this.registros.setVisible(true);
        this.registros.setSize(910, 520);
        this.registros.setLocationRelativeTo(this);
        this.setregisros2();
        this.setcliente();
    }
    
    private void jButton20ActionPerformed(final ActionEvent evt) {
        this.ventasrea.dispose();
    }
    
    private void jButton24ActionPerformed(final ActionEvent evt) {
        this.comprasrea.setVisible(false);
    }
    
    private void jButton25ActionPerformed(final ActionEvent evt) {
        if (!this.clavecam.getText().toString().equals("")) {
            this.metodos.cambia_clave(this.usuariocam.getSelectedItem().toString(), this.clavecam.getText());
            this.cambiarclave.setVisible(false);
        }
    }
    
    private void jButton27ActionPerformed(final ActionEvent evt) {
        this.cambiarclave.setVisible(true);
        this.cambiarclave.setSize(553, 268);
        this.cambiarclave.setLocationRelativeTo(this);
        this.setcombocambiar();
    }
    
    private void jButton26ActionPerformed(final ActionEvent evt) {
        this.cambiarclave.dispose();
    }
    
    private void jButton29ActionPerformed(final ActionEvent evt) {
        this.addproveedor.setVisible(true);
        this.addproveedor.setSize(562, 425);
        this.addproveedor.setLocationRelativeTo(this);
    }
    
    private void jButton30ActionPerformed(final ActionEvent evt) {
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet mensajes = statement.executeQuery("SELECT * FROM `phonesystem`.`proveedores`");
            int cod = 0;
            while (mensajes.next()) {
                ++cod;
            }
            this.metodos.addproveedor(cod, this.nombrepro.getText(), this.rifpro.getText(), this.telpro.getText(), this.ciudadpro.getText(), this.emailpro.getText(), this.bancopro.getText(), this.tipopro.getSelectedItem().toString(), this.cuentapro.getText(), this.productopro.getText());
            this.addproveedor.setVisible(false);
        }
        catch (Exception ex) {}
        finally {
            conectar2.desconectar();
        }
    }
    
    private void jButton31ActionPerformed(final ActionEvent evt) {
        this.addproveedor.dispose();
    }
    
    private void jButton32ActionPerformed(final ActionEvent evt) {
        this.solicitar.setVisible(true);
        this.solicitar.setSize(692, 641);
        this.setcombopro();
        this.setsalida(1);
        this.setcomboproducto();
    }
    
    private void addsoliciActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton35ActionPerformed(final ActionEvent evt) {
        for (int i = 0; i < this.jTable3.getRowCount(); ++i) {
            this.metodos.add_solicitud(this.jTable3.getModel().getValueAt(i, 0).toString(), this.jTable3.getModel().getValueAt(i, 1).toString(), this.jTable3.getModel().getValueAt(i, 2).toString(), this.jTable3.getModel().getValueAt(i, 3).toString(), this.jTable3.getModel().getValueAt(i, 4).toString(), this.jTable3.getModel().getValueAt(i, 5).toString(), this.jTable3.getModel().getValueAt(i, 6).toString(), this.addfacturacom.getText());
            this.jLabel86.setText("Agregado");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.jLabel86.setText("");
                }
            });
            t.start();
        }
        this.addcantidada.setValue(1);
        this.addprecioa.setValue(0);
        this.molistasoli.setRowCount(0);
    }
    
    private void tipoproActionPerformed(final ActionEvent evt) {
    }
    
    private void clientesbtn1ActionPerformed(final ActionEvent evt) {
        this.solicitudes.setVisible(true);
        this.solicitudes.setSize(808, 562);
        this.solicitudes.setLocationRelativeTo(this);
        this.setsolicitudes();
    }
    
    private void clientesbtn2ActionPerformed(final ActionEvent evt) {
        this.agregaproducto.setVisible(true);
        this.agregaproducto.setSize(597, 417);
        this.agregaproducto.setLocationRelativeTo(this);
    }
    
    private void clientesbtn3ActionPerformed(final ActionEvent evt) {
        this.setcombommproductos();
        this.productos.setVisible(true);
        this.productos.setSize(778, 553);
        this.productos.setLocationRelativeTo(this);
        this.setproductos();
    }
    
    private void jButton37ActionPerformed(final ActionEvent evt) {
        this.proveedores.dispose();
    }
    
    private void jButton38ActionPerformed(final ActionEvent evt) {
        this.productos.dispose();
    }
    
    private void jButton40ActionPerformed(final ActionEvent evt) {
        try {
            this.metodos.add_producto(this.addcodigopro.getText(), this.addpropro.getText(), this.addmarca.getText(), this.addmodelo.getText(), this.addestadopro.getSelectedItem() + "", this.jSpinner2.getValue() + "", this.jSpinner3.getValue() + "");
            this.jLabel125.setText("Agregado");
            this.addcodigopro.setText("");
            this.addpropro.setText("");
            this.addmarca.setText("");
            this.addmodelo.setText("");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.jLabel125.setText("");
                }
            });
            t.start();
        }
        catch (SQLException ex) {
            final Duplicado du = new Duplicado();
            du.setLocationRelativeTo(null);
            du.setVisible(true);
        }
    }
    
    private void jButton41ActionPerformed(final ActionEvent evt) {
        this.agregaproducto.dispose();
    }
    
    private void jButton42ActionPerformed(final ActionEvent evt) {
        this.solicitudes.dispose();
    }
    
    private void tabla_inventarioFocusGained(final FocusEvent evt) {
    }
    
    private void tabla_inventarioMouseClicked(final MouseEvent evt) {
        this.cambioprecio.setVisible(true);
        this.cambioprecio.setSize(656, 240);
        this.setcombocambio(this.mo.getValueAt(this.tabla_inventario.getSelectedRow(), 0).toString());
        this.cambioprecio.setLocationRelativeTo(this);
    }
    
    private void jButton44ActionPerformed(final ActionEvent evt) {
        this.cambioprecio.setVisible(true);
        this.cambioprecio.setSize(656, 240);
        this.cambioprecio.setLocationRelativeTo(this);
        this.setcombocambio();
    }
    
    private void jButton46ActionPerformed(final ActionEvent evt) {
        this.Emailconfig.setVisible(true);
        this.Emailconfig.setSize(555, 349);
        this.Emailconfig.setLocationRelativeTo(this);
    }
    
    private void jButton47ActionPerformed(final ActionEvent evt) {
        this.Pendientes.setVisible(true);
        this.setcombopendiente();
        this.Pendientes.setSize(517, 265);
        this.Pendientes.setLocationRelativeTo(this);
    }
    
    private void jButton34ActionPerformed(final ActionEvent evt) {
        this.Emailconfig.setVisible(false);
    }
    
    private void jButton39ActionPerformed(final ActionEvent evt) {
        if (this.facturaventa5.getText().equals("") || this.jPasswordField1.getText().equals("")) {
            this.jComboBox2.setSelectedIndex(1);
            this.metodos.setemail(this.facturaventa5.getText(), this.jPasswordField1.getText(), this.facturaventa6.getText(), this.jComboBox2.getSelectedItem().toString());
        }
        else {
            this.metodos.setemail(this.facturaventa5.getText(), this.jPasswordField1.getText(), this.facturaventa6.getText(), this.jComboBox2.getSelectedItem().toString());
        }
        this.Emailconfig.setVisible(false);
    }
    
    private void jButton43ActionPerformed(final ActionEvent evt) {
        this.metodos.cambiarprecio(this.jComboBox5.getSelectedItem().toString().substring(0, this.jComboBox5.getSelectedItem().toString().indexOf(":")), this.jSpinner1.getValue().toString());
        this.setcolum();
        this.jSpinner1.setValue(0.0);
        this.setinventario();
        this.cambioprecio.setVisible(false);
    }
    
    private void jComboBox5ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton45ActionPerformed(final ActionEvent evt) {
        this.cambioprecio.setVisible(false);
    }
    
    private void jButton49ActionPerformed(final ActionEvent evt) {
        final Email email = new Email();
        email.envio(this.jComboBox6.getSelectedItem().toString().substring(0, this.jComboBox6.getSelectedItem().toString().indexOf(":")), this.jLabel85);
        this.setcombopendiente();
    }
    
    private void jButton48ActionPerformed(final ActionEvent evt) {
        this.Pendientes.dispose();
    }
    
    private void jButton50ActionPerformed(final ActionEvent evt) {
        try {
            final Calendar c2 = new GregorianCalendar();
            String dia = Integer.toString(c2.get(5));
            String mes = Integer.toString(c2.get(2) + 1);
            if (dia.length() == 1) {
                dia = "0" + dia;
            }
            if (mes.length() == 1) {
                mes = "0" + mes;
            }
            final String annio = Integer.toString(c2.get(1));
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            final String date1 = dia + "-" + mes + "-" + annio;
            final Date d = new Date();
            final ToPDF pdf = new ToPDF();
            final File fl = new File("../PDF");
            fl.mkdir();
            pdf.utilJTableToPdf(this.tabla_inventario, new File("../PDF/inventario " + date1 + ".pdf"), "Inventario");
            this.error.setText("Inventario exportado");
        }
        catch (DocumentException ex) {
            this.error.setText("Error 001");
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        catch (FileNotFoundException ex2) {
            this.error.setText("Error Archivo en uso");
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }
    
    private void date1AncestorAdded(final AncestorEvent evt) {
        this.setcompras();
    }
    
    private void date1MouseClicked(final MouseEvent evt) {
        this.setcompras();
    }
    
    private void date2AncestorAdded(final AncestorEvent evt) {
        this.setcompras();
    }
    
    private void date2MouseClicked(final MouseEvent evt) {
        this.setcompras();
    }
    
    private void date1MousePressed(final MouseEvent evt) {
    }
    
    private void date1PropertyChange(final PropertyChangeEvent evt) {
        this.setcompras();
    }
    
    private void date2PropertyChange(final PropertyChangeEvent evt) {
        this.setcompras();
    }
    
    private void date3PropertyChange(final PropertyChangeEvent evt) {
        this.setventas();
    }
    
    private void date4PropertyChange(final PropertyChangeEvent evt) {
        this.setventas();
    }
    
    private void jButton53ActionPerformed(final ActionEvent evt) {
        try {
            final Calendar c2 = new GregorianCalendar();
            String dia = Integer.toString(c2.get(5));
            String mes = Integer.toString(c2.get(2) + 1);
            if (dia.length() == 1) {
                dia = "0" + dia;
            }
            if (mes.length() == 1) {
                mes = "0" + mes;
            }
            final String annio = Integer.toString(c2.get(1));
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            final String date1 = dia + "-" + mes + "-" + annio;
            final Date d = new Date();
            final ToPDF pdf = new ToPDF();
            final File fl = new File("../PDF");
            fl.mkdir();
            pdf.utiltableventas(this.ventast, new File("../PDF/ventas " + date1 + ".pdf"), "Ventas");
            this.jLabel94.setText("Archivo exportado");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                }
            });
            t.start();
        }
        catch (DocumentException ex) {
            this.jLabel94.setText("Error");
            final Timer t2 = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.jLabel94.setText("");
                }
            });
            t2.start();
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        catch (FileNotFoundException ex2) {
            this.jLabel94.setText("Error en archivo");
            final Timer t2 = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.jLabel94.setText("");
                }
            });
            t2.start();
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }
    
    private void jButton51ActionPerformed(final ActionEvent evt) {
        try {
            System.out.println("ss");
            final Calendar c2 = new GregorianCalendar();
            String dia = Integer.toString(c2.get(5));
            String mes = Integer.toString(c2.get(2) + 1);
            if (dia.length() == 1) {
                dia = "0" + dia;
            }
            if (mes.length() == 1) {
                mes = "0" + mes;
            }
            final String annio = Integer.toString(c2.get(1));
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            final String date1 = dia + "-" + mes + "-" + annio;
            final Date d = new Date();
            final ToPDF pdf = new ToPDF();
            final File fl = new File("../PDF");
            fl.mkdir();
            pdf.utiltablecompras(this.comprast, new File("../PDF/compras " + date1 + ".pdf"), "Compras");
            System.out.println("aa");
            this.totalcompras.setText("Exportado");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.totalcompras.setText("");
                }
            });
            t.start();
        }
        catch (DocumentException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
            final Timer t2 = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.totalcompras.setText("");
                }
            });
            t2.start();
            this.totalcompras.setText("Error");
        }
        catch (FileNotFoundException ex2) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex2);
            final Timer t2 = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Admin.this.totalcompras.setText("");
                }
            });
            t2.start();
            this.totalcompras.setText("Error");
        }
    }
    
    private void jButton54ActionPerformed(final ActionEvent evt) {
        this.metodos.cambiarmaximo(this.jComboBox7.getSelectedItem() + "", this.jSpinner5.getValue() + "");
        this.metodos.cambiarminimo(this.jComboBox7.getSelectedItem() + "", this.jSpinner4.getValue() + "");
        this.setproductos();
        this.setcolum();
        this.setinventario();
    }
    
    private void jComboBox7PropertyChange(final PropertyChangeEvent evt) {
    }
    
    private void jButton8ActionPerformed(final ActionEvent evt) {
        this.registros.dispose();
    }
    
    private void jButton6ActionPerformed(final ActionEvent evt) {
        this.metodos.setprecio(this.jComboBox1.getSelectedItem().toString(), this.precio.getValue().toString());
        if (this.metodos.email_habilitado()) {}
        this.setregisros2();
        this.setcliente();
    }
    
    private void jTable1MouseClicked(final MouseEvent evt) {
        this.molistaservi.clear();
        final String t = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 7).toString();
        this.setinfor(t);
        this.informa.setVisible(true);
        this.informa.setSize(900, 800);
        this.informa.setState(6);
        this.jComboBox9.setModel(this.combo2s);
        this.setcombocodigo2();
    }
    
    private void jButton16ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton55ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton56ActionPerformed(final ActionEvent evt) {
    }
    
    private void jTable2MouseClicked(final MouseEvent evt) {
    }
    
    private void jButton36ActionPerformed(final ActionEvent evt) {
        if (this.jButton36.getText().equals("Ver todo")) {
            this.jButton36.setText("Ver clientes");
            this.setregisros2();
        }
        else {
            this.jButton36.setText("Ver todo");
            this.setregisros();
        }
    }
    
    private void UsuaKeyPressed(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.setregisros2();
            this.jButton36.setText("Ver clientes");
        }
    }
    
    private void jButton52ActionPerformed(final ActionEvent evt) {
        this.setregisros2();
        this.jButton36.setText("Ver clientes");
    }
    
    private void productostMouseClicked(final MouseEvent evt) {
        final String t = this.productost.getValueAt(this.productost.getSelectedRow(), 0).toString();
        final String t2 = this.productost.getValueAt(this.productost.getSelectedRow(), 1).toString();
        final String t3 = this.productost.getValueAt(this.productost.getSelectedRow(), 2).toString();
        final String t4 = this.productost.getValueAt(this.productost.getSelectedRow(), 3).toString();
        this.jFrame1.setVisible(true);
        this.jFrame1.setSize(600, 450);
        this.jFrame1.setLocationRelativeTo(this);
        this.jLabel129.setText(t);
        this.addnombre1.setText(t2);
        this.addnombre2.setText(t3);
        this.addnombre3.setText(t4);
    }
    
    private void jButton60ActionPerformed(final ActionEvent evt) {
        for (int j = 0; j < this.jList2.getSelectedValuesList().size(); ++j) {
            this.listcompra.addElement(this.jList2.getSelectedValuesList().get(j));
        }
        this.jList1.setModel(this.listcompra);
        System.out.println("11111");
    }
    
    private void jButton61ActionPerformed(final ActionEvent evt) {
        String pro = this.addsolici.getSelectedItem().toString();
        pro = pro.substring(0, pro.indexOf("$:"));
        pro = pro + this.addcostob.getValue() + " Cant:" + this.addcantidad2.getValue();
        this.listcompra.addElement(pro);
        this.jList1.setModel(this.listcompra);
    }
    
    private void jList1KeyPressed(final KeyEvent evt) {
        this.listcompra.removeElementAt(this.jList1.getSelectedIndex());
    }
    
    private void jButton62ActionPerformed(final ActionEvent evt) {
        final String ser = this.jComboBox9.getSelectedItem().toString();
        final String press = ser.substring(ser.indexOf("$: ") + 3, ser.indexOf("cant"));
        this.preciore += Float.parseFloat(press);
        this.molistaservi.addElement(ser.substring(0, ser.indexOf("$:")));
        this.jList3.setModel(this.molistaservi);
        System.out.println(this.preciore);
        this.jLabel133.setText("Precio: " + this.preciore);
    }
    
    private void jButton63ActionPerformed(final ActionEvent evt) {
        this.jFrame2.setVisible(true);
        this.jFrame2.setSize(519, 295);
        this.jFrame2.setLocationRelativeTo(this);
    }
    
    private void facturaventa8ActionPerformed(final ActionEvent evt) {
    }
    
    private void facturaventa8KeyPressed(final KeyEvent evt) {
        this.setcombocodigo2();
    }
    
    private void facturaventa8KeyReleased(final KeyEvent evt) {
        this.setcombocodigo2();
    }
    
    private void jList3KeyReleased(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            final String codig = this.jList3.getSelectedValue();
            final String codigopre = codig.substring(0, codig.indexOf(":"));
            this.preciore -= this.metodos.getprecio(codigopre);
            this.jLabel133.setText("Precio: " + this.preciore + "");
            this.molistaservi.remove(this.jList3.getSelectedIndex());
            this.jList3.setModel(this.molistaservi);
            if (this.molistaservi.isEmpty()) {
                this.preciore = 0.0f;
                this.jLabel133.setText("Precio: " + this.preciore + "");
            }
        }
    }
    
    private void jList2KeyPressed(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            for (int j = 0; j < this.jList2.getSelectedValuesList().size(); ++j) {
                this.listcompra.addElement(this.jList2.getSelectedValuesList().get(j));
            }
            this.jList1.setModel(this.listcompra);
        }
    }
    
    private void jList3KeyPressed(final KeyEvent evt) {
    }
    
    private void jTextField1KeyReleased(final KeyEvent evt) {
        this.setcolum();
        this.setinventario();
    }
    
    private void addnombre2ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton59ActionPerformed(final ActionEvent evt) {
        this.jFrame1.dispose();
    }
    
    private void jButton58ActionPerformed(final ActionEvent evt) {
        this.metodos.editarproducto(this.jLabel129.getText(), this.addnombre1.getText(), this.addnombre2.getText(), this.addnombre3.getText());
        this.jLabel130.setText("Producto editado");
        final Timer t = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Admin.this.jLabel130.setText("");
            }
        });
        t.start();
        this.setproductos();
        this.setcolum();
        this.setinventario();
    }
    
    private void jTextField2KeyReleased(final KeyEvent evt) {
        this.setcombosolicitar();
    }
    
    private void jTextField3KeyReleased(final KeyEvent evt) {
        this.setproductos();
    }
    
    private void jButton64ActionPerformed(final ActionEvent evt) {
        try {
            final String itm = this.jList2.getSelectedValue();
            this.metodos.eliminasoli(itm.substring(5, itm.indexOf("CO")).trim());
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            this.combosoli = new DefaultComboBoxModel();
            (this.molistasolici = new DefaultListModel()).clear();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`solicitud de compra` WHERE `entregado` LIKE 'no'");
            while (usuario.next()) {
                this.molistasolici.addElement("ITM: " + usuario.getObject("id") + " CO: " + usuario.getObject("codigo") + " Prd: " + usuario.getObject("producto") + " , " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " Prove: " + usuario.getObject("proveedor") + " $: " + usuario.getObject("precio") + " Cant: " + usuario.getObject("cantidad"));
                this.combosoli.addElement("ITM: " + usuario.getObject("id") + " CO: " + usuario.getObject("codigo") + " Prd: " + usuario.getObject("producto") + " , " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " Prove: " + usuario.getObject("proveedor") + " $: " + usuario.getObject("precio") + " Cant: " + usuario.getObject("cantidad"));
            }
            this.setcombosolicitar();
            this.jList2.setModel(this.molistasolici);
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jTextField4KeyReleased(final KeyEvent evt) {
        this.setventas(this.jTextField4.getText());
    }
    
    private void jTextField3ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton65ActionPerformed(final ActionEvent evt) {
        this.salida.dispose();
    }
    
    private void jButton66ActionPerformed(final ActionEvent evt) {
        if (this.getsalida() == 1) {
            System.out.println("aa");
            this.solicitar.dispose();
        }
        else {
            this.comprar.dispose();
            this.listcompra.clear();
            this.jList1.setModel(this.listcompra);
            this.comprar.dispose();
        }
        this.salida.dispose();
    }
    
    private void jTextField5KeyReleased(final KeyEvent evt) {
        this.setsolicitudes();
    }
    
    private void jButton67ActionPerformed(final ActionEvent evt) {
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet consult = statement.executeQuery("SELECT * FROM `phonesystem`.`ventas` ");
            final int fa = 0;
            String ser = "";
            final ResultSet consulta = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `nequipo`=" + this.nombre.getText() + "");
            String prean = "";
            while (consulta.next()) {
                prean = consulta.getString("precio");
            }
            try {
                final float prea = Float.parseFloat(prean);
            }
            catch (Exception e) {
                final float prea = 0.0f;
            }
            System.out.println("2");
            for (int i = 0; i < this.molistaservi.size(); ++i) {
                final String ele = this.molistaservi.get(i).toString();
                ser = ser + '\n' + ele;
            }
            this.metodos.setservi(this.nombre.getText(), ser);
            final float pren = Float.parseFloat(this.jLabel133.getText().substring(8));
            System.out.println(pren);
            this.metodos.setprecio(this.nombre.getText(), pren + "");
            this.nombre1.setText("Precio: " + this.preciore);
            this.preciore = 0.0f;
            this.setinfor(this.nombre.getText());
            this.jLabel22.setText("Servicios agregado");
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            this.jLabel22.setText("error");
        }
        this.jFrame2.setVisible(false);
        conectar2.desconectar();
    }
    
    private void jButton68ActionPerformed(final ActionEvent evt) {
        this.jFrame2.setVisible(false);
    }
    
    private void jTextField6ActionPerformed(final ActionEvent evt) {
    }
    
    private void jTextField6KeyReleased(final KeyEvent evt) {
        this.setcompras(this.jTextField6.getText());
    }
    
    private void jButton69ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton70ActionPerformed(final ActionEvent evt) {
        try {
            final String produc = this.addproductoa.getSelectedItem().toString();
            final String codigo = produc.substring(0, produc.indexOf(58));
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet re = statement.executeQuery("SELECT * FROM `phonesystem`.`productos` WHERE `codigo` LIKE '" + codigo + "'");
            while (re.next()) {
                final String[] pedido = { codigo, re.getString(2), re.getString(3), re.getString(4), this.jComboBox3.getSelectedItem().toString(), this.addprecioa.getValue().toString(), this.addcantidada.getValue().toString() };
                this.molistasoli.addRow(pedido);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.addcantidada.setValue(1);
        this.addprecioa.setValue(0);
    }
    
    private void jTable3KeyReleased(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.molistasoli.removeRow(this.jTable3.getSelectedRow());
        }
    }
    
    private void jButton71ActionPerformed(final ActionEvent evt) {
        if (this.jLabel172.isEditable()) {
            this.jLabel172.setEditable(false);
            this.jFrame3.setVisible(true);
            this.jFrame3.setSize(494, 212);
            this.jFrame3.setLocationRelativeTo(this);
        }
        else {
            this.jLabel172.setEditable(true);
        }
    }
    
    private void jButton10ActionPerformed(final ActionEvent evt) {
        this.jFrame3.setVisible(false);
        this.setinfor(this.nombre.getText());
    }
    
    private void jButton13ActionPerformed(final ActionEvent evt) {
        this.metodos.editaservi(this.nombre.getText(), this.jLabel172.getText());
        this.jFrame3.setVisible(false);
        this.setinfor(this.nombre.getText());
    }
    
    private void jButton14ActionPerformed(final ActionEvent evt) {
        this.setfacturas("");
        this.listfacturas.setVisible(true);
        this.listfacturas.setSize(566, 662);
        this.listfacturas.setLocationRelativeTo(null);
    }
    
    private void jList4MouseReleased(final MouseEvent evt) {
    }
    
    private void jButton28ActionPerformed(final ActionEvent evt) {
        byte[] b = null;
        String nombre = null;
        try {
            final String nfa = this.jList4.getSelectedValue();
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet rs = statement.executeQuery("SELECT * FROM `phonesystem`.`facturas` WHERE `id` LIKE '" + nfa.substring(0, nfa.indexOf(":")) + "'");
            while (rs.next()) {
                b = rs.getBytes("factura");
                nombre = rs.getString(2);
            }
            final InputStream bos = new ByteArrayInputStream(b);
            final int tamanoInput = bos.available();
            final byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);
            final File f = new File("../PDF");
            f.mkdir();
            final OutputStream out = new FileOutputStream("../PDF/" + nombre + ".pdf");
            out.write(datosPDF);
            this.bienvenida4.setText("Exportado");
        }
        catch (SQLException ex2) {
            this.bienvenida4.setText("Error. No Exportado");
        }
        catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            this.bienvenida4.setText("Error. No Exportado");
        }
        final Timer t = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Admin.this.bienvenida4.setText("");
            }
        });
        t.start();
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
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final Admin frame = new Admin();
                frame.setLocationRelativeTo(null);
                frame.setExtendedState(6);
                frame.setVisible(true);
            }
        });
    }
    
    static {
        Admin.pausa = false;
    }
}
