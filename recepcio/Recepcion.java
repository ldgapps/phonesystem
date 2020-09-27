// 
// Decompiled by Procyon v0.5.36
// 

package recepcio;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;
import java.util.Calendar;
import java.util.GregorianCalendar;
import phonesystem.Email;
import java.io.FileNotFoundException;
import DB.ToPDF;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ListModel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.BoxLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.LayoutStyle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import javax.swing.ComboBoxModel;
import java.util.Date;
import java.util.ArrayList;
import DB.Noexiste;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import phonesystem.Inicio;
import java.awt.Component;
import java.io.InputStream;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import DB.Metodos;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import DB.Conectar2;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Recepcion extends JFrame
{
    private DefaultListModel molistacompra;
    private String usuario;
    private DefaultTableModel mo;
    private Conectar2 co;
    private DefaultComboBoxModel combo2;
    private DefaultComboBoxModel combo;
    private DefaultTableModel mocancela;
    private DefaultTableModel modispo;
    private DefaultComboBoxModel combolistapro;
    private SimpleDateFormat sdf;
    private String f;
    private Fecha fecha;
    private Metodos metodos;
    Thread h;
    static boolean pausa;
    int j;
    Thread hc;
    private JTextField addbateria;
    private JTextField addci;
    private JTextField adddireccion;
    private JTextField addemail;
    private JTextField addemail1;
    private JTextArea addfallas;
    private JComboBox<String> addgama;
    private JTextField addimei;
    private JTextField addmarca;
    private JComboBox<String> addmemoria;
    private JTextField addmodelo;
    private JTextField addnombre;
    private JComboBox<String> addsim;
    private JLabel addsolici;
    private JComboBox<String> addtapa;
    private JTextField addtapa1;
    private JComboBox<String> addtecnico;
    private JTextField addtelefono;
    private JTextField addtelefono2;
    private JLabel bienvenida;
    private JSpinner cantidad;
    private JTextArea chatrecepcion;
    private JComboBox<String> chatreceptor;
    private JCheckBox diagnos;
    private JFrame entregar;
    private JTextArea enviarecepcion;
    private JFrame errorframe;
    private JLabel errorrecepcion;
    private JTextField facturaventa1;
    private JTextField facturaventa2;
    private JTextField facturaventa3;
    private JTextField facturaventa4;
    private JTextField facturaventa7;
    private JTextField facturaventa8;
    private JLabel imei;
    private JFrame informa;
    private JFrame inventariorecepcion;
    private JButton jButton1;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton28;
    private JButton jButton3;
    private JButton jButton33;
    private JButton jButton5;
    private JButton jButton57;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox4;
    private JFrame jFrame1;
    private JFrame jFrame2;
    private JFrame jFrame3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel103;
    private JLabel jLabel104;
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
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
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
    private JLabel jLabel52;
    private JLabel jLabel6;
    private JLabel jLabel60;
    private JLabel jLabel61;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTabbedPane jTabbedPane1;
    private JTable jTable1;
    private JTable jTable2;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JList<String> listacompra;
    private JTextField ndispo;
    private JTextField ndispo1;
    private JTextField ndispo2;
    private JLabel nombre;
    private JLabel nombre1;
    private JLabel precio;
    private JComboBox<String> productosli;
    private JTable tabla_inventario;
    private JLabel totalventa;
    private JLabel totalventa1;
    private JFrame vender;
    
    public Recepcion() {
        this.molistacompra = new DefaultListModel();
        this.mo = new DefaultTableModel();
        this.co = new Conectar2();
        this.combo2 = new DefaultComboBoxModel();
        this.combo = new DefaultComboBoxModel();
        this.mocancela = new DefaultTableModel();
        this.modispo = new DefaultTableModel();
        this.combolistapro = new DefaultComboBoxModel();
        this.sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.f = "";
        this.fecha = new Fecha();
        this.metodos = new Metodos();
        this.h = new Thread() {
            @Override
            public void run() {
                final Timer t = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {
                        Recepcion.this.setchat(Recepcion.this.bienvenida.getText());
                    }
                });
                t.start();
            }
        };
        this.j = 0;
        this.hc = new Thread() {
            @Override
            public void run() {
                try {
                    final Player pl = new Player((InputStream)new FileInputStream("sound/mensaje.mp3"));
                    while (Recepcion.pausa || pl.play(1)) {}
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.initComponents();
        this.jTextArea1.setLineWrap(true);
        this.jTextArea1.setWrapStyleWord(true);
        this.jTextArea2.setLineWrap(true);
        this.jTextArea2.setWrapStyleWord(true);
        this.setLocationRelativeTo(null);
        this.setSize(949, 610);
        this.setcombocodigo();
        this.jLabel48.setText(this.metodos.nservicio() + "");
    }
    
    public void salir() {
        this.setVisible(false);
        final Inicio i = new Inicio();
        i.setSize(500, 548);
        i.setLocationRelativeTo(null);
        i.setVisible(true);
    }
    
    public void elimimamo() {
        (this.mocancela = new DefaultTableModel()).addColumn("Nombre");
        this.mocancela.addColumn("Ci");
        this.mocancela.addColumn("Telefono");
        this.mocancela.addColumn("Telefono2");
        this.mocancela.addColumn("Direccion");
        this.mocancela.addColumn("Email");
        this.mocancela.addColumn("Entrega");
        this.mocancela.addColumn("N°");
        this.mocancela.addColumn("Marca");
        this.mocancela.addColumn("Modelo");
        this.mocancela.addColumn("Gama");
        this.mocancela.addColumn("Bateria");
        this.mocancela.addColumn("Memoria");
        this.mocancela.addColumn("Sim");
        this.mocancela.addColumn("Tapa");
        this.mocancela.addColumn("Diagnosticar");
        final int j = 0;
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `entrega` BETWEEN '" + this.fecha.agno() + "-" + this.fecha.mes() + "-" + this.fecha.dia() + "' AND '" + this.fecha.agno() + "-" + this.fecha.mes() + "-" + this.fecha.dia() + "'");
            while (usuario.next()) {
                final Object[] fila = new Object[16];
                for (int i = 0; i < 16; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.mocancela.addRow(fila);
            }
        }
        catch (SQLException e) {
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, e);
        }
        this.jTable1.setModel(this.mocancela);
        conectar2.desconectar();
    }
    
    public void setventatotal() {
        float i = 0.0f;
        int k = 0;
        for (int j = 0; j < this.molistacompra.size(); ++j) {
            ++k;
            i += Float.parseFloat(this.molistacompra.get(j).toString().substring(this.molistacompra.get(j).toString().indexOf(" total: ") + 8, this.molistacompra.get(j).toString().length()));
        }
        this.totalventa.setText("Total: " + i + " productos: " + k);
    }
    
    public void setinfor(final String n) {
        try {
            final ArrayList a = this.metodos.getdisrecep(n);
            System.out.println(a.get(0).toString());
            this.nombre.setText(a.get(0).toString());
            this.jLabel34.setText(a.get(1).toString());
            this.jLabel36.setText(a.get(2).toString());
            this.jLabel37.setText(a.get(3).toString());
            this.jLabel38.setText(a.get(4).toString());
            this.jLabel39.setText(a.get(5).toString());
            this.jLabel40.setText(a.get(6).toString());
            this.jLabel41.setText(a.get(7).toString());
            this.jLabel42.setText(a.get(8).toString());
            this.jLabel44.setText(a.get(9).toString());
            this.imei.setText(a.get(19).toString());
            this.jLabel45.setText(a.get(10).toString());
            this.jLabel46.setText(a.get(11).toString());
            this.nombre1.setText(a.get(14).toString());
            this.jTextArea1.setText(a.get(12).toString());
            this.jTextArea2.setText(a.get(13).toString());
            this.jTextArea3.setText(a.get(20).toString());
            this.informa.setVisible(true);
        }
        catch (Exception ex) {
            final Noexiste err = new Noexiste();
            err.setVisible(true);
            err.setLocationRelativeTo(this);
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setinforci(final String n) {
        try {
            System.out.println(n);
            final ArrayList a = this.metodos.getdisrecepci(n);
            this.nombre.setText(a.get(0).toString());
            this.jLabel34.setText(a.get(1).toString());
            this.jLabel36.setText(a.get(2).toString());
            this.jLabel37.setText(a.get(3).toString());
            this.jLabel38.setText(a.get(4).toString());
            this.jLabel39.setText(a.get(5).toString());
            this.jLabel40.setText(a.get(6).toString());
            this.jLabel41.setText(a.get(7).toString());
            this.jLabel42.setText(a.get(8).toString());
            this.jLabel44.setText(a.get(9).toString());
            this.jLabel45.setText(a.get(10).toString());
            this.jLabel46.setText(a.get(11).toString());
            this.nombre1.setText(a.get(14).toString());
            this.imei.setText(a.get(19).toString());
            this.jTextArea1.setText(a.get(12).toString());
            this.jTextArea2.setText(a.get(13).toString());
            this.jTextArea3.setText(a.get(20).toString());
            final Date date1 = this.sdf.parse(this.fecha.agno() + "-" + this.fecha.mes() + "-" + this.fecha.dia());
            final Date date2 = this.sdf.parse(a.get(16).toString());
            if (!a.get(15).toString().equals("no")) {
                this.jButton9.setEnabled(false);
                this.jLabel47.setText("Ha sido entregado");
            }
            else if (date1.after(date2)) {
                this.jLabel47.setText("Plazo terminado");
                this.jButton9.setEnabled(false);
            }
            else {
                this.jLabel47.setText("");
                this.jButton9.setEnabled(true);
            }
        }
        catch (Exception ex) {
            final Noexiste err = new Noexiste();
            err.setVisible(true);
            err.setLocationRelativeTo(this);
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setinforimei(final String n) {
        try {
            System.out.println(n);
            final ArrayList a = this.metodos.getdisrecepimei(n);
            this.nombre.setText(a.get(0).toString());
            this.jLabel34.setText(a.get(1).toString());
            this.jLabel36.setText(a.get(2).toString());
            this.jLabel37.setText(a.get(3).toString());
            this.jLabel38.setText(a.get(4).toString());
            this.jLabel39.setText(a.get(5).toString());
            this.jLabel40.setText(a.get(6).toString());
            this.jLabel41.setText(a.get(7).toString());
            this.jLabel42.setText(a.get(8).toString());
            this.jLabel44.setText(a.get(9).toString());
            this.jLabel45.setText(a.get(10).toString());
            this.jLabel46.setText(a.get(11).toString());
            this.nombre1.setText(a.get(14).toString());
            this.imei.setText(a.get(19).toString());
            this.jTextArea1.setText(a.get(12).toString());
            this.jTextArea2.setText(a.get(13).toString());
            this.jTextArea3.setText(a.get(20).toString());
            final Date date1 = this.sdf.parse(this.fecha.agno() + "-" + this.fecha.mes() + "-" + this.fecha.dia());
            final Date date2 = this.sdf.parse(a.get(16).toString());
            if (!a.get(15).toString().equals("no")) {
                this.jButton9.setEnabled(false);
                this.jLabel47.setText("Ha sido entregado");
            }
            else if (date1.after(date2)) {
                this.jLabel47.setText("Plazo terminado");
                this.jButton9.setEnabled(false);
            }
            else {
                this.jLabel47.setText("");
                this.jButton9.setEnabled(true);
            }
        }
        catch (Exception ex) {
            final Noexiste err = new Noexiste();
            err.setVisible(true);
            err.setLocationRelativeTo(this);
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setdispoen() {
        this.modispo = new DefaultTableModel();
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`clientes telefonos` WHERE `entregado` LIKE 'no'");
            this.modispo.addColumn("Nombre");
            this.modispo.addColumn("Ci");
            this.modispo.addColumn("Telefono");
            this.modispo.addColumn("Telefono 2");
            this.modispo.addColumn("Direccion");
            this.modispo.addColumn("Email");
            this.modispo.addColumn("Entregado");
            this.modispo.addColumn("N° Servicio");
            this.modispo.addColumn("Marca");
            this.modispo.addColumn("Modelo");
            while (usuario.next()) {
                final Object[] fila = new Object[11];
                for (int i = 0; i < 11; ++i) {
                    fila[i] = usuario.getObject(i + 1);
                }
                this.modispo.addRow(fila);
            }
        }
        catch (SQLException ex) {}
        this.jTable2.setModel(this.modispo);
        conectar2.desconectar();
    }
    
    public String getUsuario() {
        return this.usuario;
    }
    
    public void inventartio() {
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            this.mo = new DefaultTableModel();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `producto` LIKE '%" + this.addimei.getText() + "%' OR `marca` LIKE '%" + this.addimei.getText() + "%' OR `modelo` LIKE '%" + this.addimei.getText() + "%'");
            this.mo.addColumn("Codigo");
            this.mo.addColumn("Producto");
            this.mo.addColumn("Marca");
            this.mo.addColumn("Modelo");
            this.mo.addColumn("Estado");
            this.mo.addColumn("Cantidad");
            this.mo.addColumn("Precio");
            while (usuario.next()) {
                final Object[] fila = new Object[7];
                for (int i = 0; i < 7; ++i) {
                    if (i < 6) {
                        fila[i] = usuario.getObject(i + 1);
                    }
                    else {
                        fila[i] = usuario.getObject(i + 5);
                    }
                }
                this.mo.addRow(fila);
            }
            this.tabla_inventario.setModel(this.mo);
        }
        catch (SQLException ex) {}
        conectar2.desconectar();
    }
    
    public void setchat(final String usuario) {
        final Conectar2 conectar2 = new Conectar2();
        try {
            int i = 0;
            final Statement statement = conectar2.retorna();
            this.chatrecepcion.setText("");
            final ResultSet mensajes = statement.executeQuery("SELECT * FROM `phonesystem`.`chat` WHERE `emisor` LIKE '" + usuario + "' OR `receptor` LIKE '" + usuario + "'");
            while (mensajes.next()) {
                ++i;
                this.chatrecepcion.append("\n" + mensajes.getString("emisor") + ":" + mensajes.getString("mensaje") + "\n" + mensajes.getString("hora"));
            }
            if (this.j != 0) {
                if (i == this.j) {
                    this.hc.start();
                    final Thread hc = this.hc;
                    Thread.sleep(5000L);
                    Recepcion.pausa = true;
                    System.out.println("pausado");
                    final Thread hc2 = this.hc;
                    Thread.sleep(2000L);
                    Recepcion.pausa = false;
                }
            }
            this.j = i + 1;
        }
        catch (Exception ex) {}
        conectar2.desconectar();
    }
    
    public void setUsuario(final String usuario) {
        this.usuario = usuario;
        this.bienvenida.setText(usuario);
        this.setcombo();
        this.h.start();
    }
    
    public void setcombolistapro() {
        this.combolistapro = new DefaultComboBoxModel();
        for (int i = 0; i < this.molistacompra.getSize(); ++i) {
            this.combolistapro.addElement(this.molistacompra.get(i));
        }
        this.jComboBox4.setModel(this.combolistapro);
    }
    
    public void abrirarchivo(final String archivo) {
        try {
            final File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void setcombo() {
        final Conectar2 conectar2 = new Conectar2();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios` WHERE `nombre` NOT LIKE '" + this.bienvenida.getText() + "'");
            while (usuario.next()) {
                this.combo.addElement(usuario.getObject("nombre"));
            }
        }
        catch (SQLException ex) {}
        conectar2.desconectar();
    }
    
    public void setcombocodigo() {
        final Conectar2 conectar2 = new Conectar2();
        try {
            this.combo2.removeAllElements();
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`inventario` WHERE `cantidad` !=0 AND `codigo` LIKE '%" + this.facturaventa7.getText() + "%' OR `marca` LIKE '%" + this.facturaventa7.getText() + "%' OR `producto` LIKE '%" + this.facturaventa7.getText() + "%' OR `modelo` LIKE '%" + this.facturaventa7.getText() + "%' AND `cantidad` NOT LIKE '0'");
            while (usuario.next()) {
                this.combo2.addElement(usuario.getObject("codigo") + ": " + usuario.getObject("producto") + ", " + usuario.getObject("marca") + ", " + usuario.getObject("modelo") + " $: " + usuario.getObject("precio") + " cant: " + usuario.getObject("cantidad"));
            }
        }
        catch (SQLException ex) {}
        conectar2.desconectar();
    }
    
    private void initComponents() {
        this.errorframe = new JFrame();
        this.jPanel3 = new JPanel();
        this.jLabel17 = new JLabel();
        this.inventariorecepcion = new JFrame();
        this.jPanel2 = new JPanel();
        this.jScrollPane4 = new JScrollPane();
        this.tabla_inventario = new JTable();
        this.jButton2 = new JButton();
        this.jLabel21 = new JLabel();
        this.addimei = new JTextField();
        this.jButton19 = new JButton();
        this.entregar = new JFrame();
        this.jPanel4 = new JPanel();
        this.jLabel23 = new JLabel();
        this.jScrollPane10 = new JScrollPane();
        this.jTable2 = new JTable();
        this.vender = new JFrame();
        this.jFrame2 = new JFrame();
        this.jPanel5 = new JPanel();
        this.jScrollPane6 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jFrame1 = new JFrame();
        this.jPanel7 = new JPanel();
        this.jButton16 = new JButton();
        this.jLabel30 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jButton17 = new JButton();
        this.jFrame3 = new JFrame();
        this.informa = new JFrame();
        this.jPanel8 = new JPanel();
        this.nombre = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.jScrollPane8 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jLabel44 = new JLabel();
        this.jLabel45 = new JLabel();
        this.jLabel46 = new JLabel();
        this.jScrollPane9 = new JScrollPane();
        this.jTextArea2 = new JTextArea();
        this.jButton9 = new JButton();
        this.nombre1 = new JLabel();
        this.jLabel47 = new JLabel();
        this.imei = new JLabel();
        this.jLabel104 = new JLabel();
        this.jLabel103 = new JLabel();
        this.jLabel106 = new JLabel();
        this.jLabel107 = new JLabel();
        this.jLabel108 = new JLabel();
        this.jLabel109 = new JLabel();
        this.jLabel110 = new JLabel();
        this.jLabel111 = new JLabel();
        this.jLabel112 = new JLabel();
        this.jLabel113 = new JLabel();
        this.jLabel114 = new JLabel();
        this.jLabel115 = new JLabel();
        this.addemail1 = new JTextField();
        this.jLabel50 = new JLabel();
        this.jScrollPane11 = new JScrollPane();
        this.jTextArea3 = new JTextArea();
        this.jTabbedPane1 = new JTabbedPane();
        this.jPanel1 = new JPanel();
        this.jLabel9 = new JLabel();
        this.jButton3 = new JButton();
        this.jScrollPane2 = new JScrollPane();
        this.chatrecepcion = new JTextArea();
        this.bienvenida = new JLabel();
        this.diagnos = new JCheckBox();
        this.chatreceptor = new JComboBox<String>();
        this.jButton5 = new JButton();
        this.jButton7 = new JButton();
        this.precio = new JLabel();
        this.jButton8 = new JButton();
        this.errorrecepcion = new JLabel();
        this.jLabel20 = new JLabel();
        this.jButton1 = new JButton();
        this.addsolici = new JLabel();
        this.jLabel16 = new JLabel();
        this.jScrollPane3 = new JScrollPane();
        this.addfallas = new JTextArea();
        this.jLabel10 = new JLabel();
        this.jButton12 = new JButton();
        this.jScrollPane7 = new JScrollPane();
        this.enviarecepcion = new JTextArea();
        this.ndispo = new JTextField();
        this.jButton15 = new JButton();
        this.jLabel33 = new JLabel();
        this.jLabel49 = new JLabel();
        this.jButton18 = new JButton();
        this.ndispo1 = new JTextField();
        this.jPanel9 = new JPanel();
        this.jLabel18 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel48 = new JLabel();
        this.addmarca = new JTextField();
        this.addmodelo = new JTextField();
        this.addbateria = new JTextField();
        this.addtapa1 = new JTextField();
        this.jPanel10 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel24 = new JLabel();
        this.addmemoria = new JComboBox<String>();
        this.addsim = new JComboBox<String>();
        this.addtapa = new JComboBox<String>();
        this.addgama = new JComboBox<String>();
        this.addtecnico = new JComboBox<String>();
        this.jComboBox1 = new JComboBox<String>();
        this.jPanel12 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.addnombre = new JTextField();
        this.addci = new JTextField();
        this.addtelefono = new JTextField();
        this.jPanel13 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.addtelefono2 = new JTextField();
        this.addemail = new JTextField();
        this.adddireccion = new JTextField();
        this.ndispo2 = new JTextField();
        this.jLabel51 = new JLabel();
        this.jButton20 = new JButton();
        this.jPanel11 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.facturaventa1 = new JTextField();
        this.facturaventa2 = new JTextField();
        this.facturaventa3 = new JTextField();
        this.jLabel52 = new JLabel();
        this.jLabel61 = new JLabel();
        this.facturaventa4 = new JTextField();
        this.jLabel62 = new JLabel();
        this.jScrollPane5 = new JScrollPane();
        this.listacompra = new JList<String>();
        this.jLabel60 = new JLabel();
        this.productosli = new JComboBox<String>();
        this.jLabel26 = new JLabel();
        this.cantidad = new JSpinner();
        this.jLabel25 = new JLabel();
        this.jButton33 = new JButton();
        this.jComboBox4 = new JComboBox<String>();
        this.jLabel63 = new JLabel();
        this.jButton28 = new JButton();
        this.jButton13 = new JButton();
        this.totalventa = new JLabel();
        this.facturaventa7 = new JTextField();
        this.jButton57 = new JButton();
        this.facturaventa8 = new JTextField();
        this.totalventa1 = new JLabel();
        this.jLabel17.setText("Error al conectar al servidor");
        final GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(120, 120, 120).addComponent(this.jLabel17).addContainerGap(121, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(145, 32767).addComponent(this.jLabel17).addGap(139, 139, 139)));
        final GroupLayout errorframeLayout = new GroupLayout(this.errorframe.getContentPane());
        this.errorframe.getContentPane().setLayout(errorframeLayout);
        errorframeLayout.setHorizontalGroup(errorframeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        errorframeLayout.setVerticalGroup(errorframeLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767));
        this.inventariorecepcion.setBackground(new Color(5, 51, 137));
        this.jPanel2.setBackground(new Color(18, 51, 144));
        this.jPanel2.setBorder(new SoftBevelBorder(0));
        this.tabla_inventario.setModel(this.mo);
        this.jScrollPane4.setViewportView(this.tabla_inventario);
        this.jButton2.setBackground(new Color(255, 255, 255));
        this.jButton2.setFont(new Font("Roboto", 1, 18));
        this.jButton2.setForeground(new Color(14, 82, 151));
        this.jButton2.setText("Salir");
        this.jButton2.setBorder(null);
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton2ActionPerformed(evt);
            }
        });
        this.jLabel21.setBackground(new Color(255, 255, 255));
        this.jLabel21.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel21.setForeground(new Color(255, 255, 255));
        this.jLabel21.setHorizontalAlignment(0);
        this.jLabel21.setText("Inventario");
        this.addimei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.addimeiActionPerformed(evt);
            }
        });
        this.jButton19.setBackground(new Color(153, 102, 255));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton19.setOpaque(false);
        this.jButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton19ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane4, GroupLayout.Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.addimei, -2, 475, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton19).addGap(0, 258, 32767)).addComponent(this.jLabel21, -1, -1, 32767)))).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jButton2, -2, 150, -2).addGap(66, 66, 66)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel21).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton19, -2, 25, -2).addComponent(this.addimei)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane4, -1, 227, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, 32767).addComponent(this.jButton2, -2, 40, -2).addContainerGap()));
        final GroupLayout inventariorecepcionLayout = new GroupLayout(this.inventariorecepcion.getContentPane());
        this.inventariorecepcion.getContentPane().setLayout(inventariorecepcionLayout);
        inventariorecepcionLayout.setHorizontalGroup(inventariorecepcionLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
        inventariorecepcionLayout.setVerticalGroup(inventariorecepcionLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
        this.jPanel4.setBackground(new Color(14, 82, 151));
        this.jPanel4.setBorder(new SoftBevelBorder(0));
        this.jLabel23.setBackground(new Color(255, 255, 255));
        this.jLabel23.setFont(new Font("Comic Sans MS", 1, 24));
        this.jLabel23.setForeground(new Color(255, 255, 255));
        this.jLabel23.setHorizontalAlignment(0);
        this.jLabel23.setText("Entregar Equipo");
        this.jTable2.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Recepcion.this.jTable2MouseClicked(evt);
            }
            
            @Override
            public void mousePressed(final MouseEvent evt) {
                Recepcion.this.jTable2MousePressed(evt);
            }
        });
        this.jScrollPane10.setViewportView(this.jTable2);
        final GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel23, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane10, -1, 974, 32767))).addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel23).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane10, -2, 285, -2).addGap(150, 150, 150)));
        final GroupLayout entregarLayout = new GroupLayout(this.entregar.getContentPane());
        this.entregar.getContentPane().setLayout(entregarLayout);
        entregarLayout.setHorizontalGroup(entregarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -2, -1, -2));
        entregarLayout.setVerticalGroup(entregarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -2, 450, -2));
        final GroupLayout venderLayout = new GroupLayout(this.vender.getContentPane());
        this.vender.getContentPane().setLayout(venderLayout);
        venderLayout.setHorizontalGroup(venderLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 814, 32767));
        venderLayout.setVerticalGroup(venderLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 587, 32767));
        this.jFrame2.getContentPane().setLayout(new BoxLayout(this.jFrame2.getContentPane(), 2));
        this.jPanel5.setBackground(new Color(18, 51, 144));
        this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        this.jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Recepcion.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane6.setViewportView(this.jTable1);
        final GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane6, -1, 784, 32767).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(46, 46, 46).addComponent(this.jScrollPane6, -2, -1, -2).addContainerGap(41, 32767)));
        this.jFrame2.getContentPane().add(this.jPanel5);
        this.jFrame1.setUndecorated(true);
        this.jPanel7.setBackground(new Color(15, 49, 144));
        this.jButton16.setBackground(new Color(255, 255, 255));
        this.jButton16.setFont(new Font("Roboto", 1, 14));
        this.jButton16.setForeground(new Color(15, 49, 144));
        this.jButton16.setText("Eliminar");
        this.jButton16.setBorder(null);
        this.jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton16ActionPerformed(evt);
            }
        });
        this.jLabel30.setFont(new Font("Roboto", 1, 18));
        this.jLabel30.setForeground(new Color(255, 255, 255));
        this.jLabel30.setHorizontalAlignment(0);
        this.jLabel30.setText("Desea eliminar el cliente:");
        this.jLabel32.setFont(new Font("Roboto", 1, 18));
        this.jLabel32.setForeground(new Color(255, 255, 255));
        this.jLabel32.setHorizontalAlignment(0);
        this.jLabel32.setText("1");
        this.jLabel31.setFont(new Font("Roboto", 1, 18));
        this.jLabel31.setForeground(new Color(255, 255, 255));
        this.jLabel31.setHorizontalAlignment(0);
        this.jLabel31.setText("Desea eliminar el cliente?:");
        this.jButton17.setBackground(new Color(255, 255, 255));
        this.jButton17.setFont(new Font("Roboto", 1, 14));
        this.jButton17.setForeground(new Color(15, 49, 144));
        this.jButton17.setText("Cancelar");
        this.jButton17.setBorder(null);
        this.jButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton17ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jButton17, -2, 100, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 142, 32767).addComponent(this.jButton16, -2, 100, -2).addGap(32, 32, 32)).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel31, -1, -1, 32767).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jLabel30, -2, 261, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel32, -2, 56, -2).addGap(0, 0, 32767))).addContainerGap()));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel30, -2, 17, -2).addComponent(this.jLabel32)).addGap(31, 31, 31).addComponent(this.jLabel31, -2, 17, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, 32767).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton16, -2, 40, -2).addComponent(this.jButton17, -2, 40, -2)).addGap(50, 50, 50)));
        final GroupLayout jFrame1Layout = new GroupLayout(this.jFrame1.getContentPane());
        this.jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, -1, 32767));
        jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, -1, 32767));
        final GroupLayout jFrame3Layout = new GroupLayout(this.jFrame3.getContentPane());
        this.jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(jFrame3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 493, 32767));
        jFrame3Layout.setVerticalGroup(jFrame3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 245, 32767));
        this.jPanel8.setBackground(new Color(18, 51, 144));
        this.nombre.setFont(new Font("Roboto", 1, 18));
        this.nombre.setForeground(new Color(255, 255, 255));
        this.nombre.setText("jLabel15");
        this.jLabel34.setFont(new Font("Roboto", 1, 14));
        this.jLabel34.setForeground(new Color(255, 255, 255));
        this.jLabel34.setText("jLabel17");
        this.jLabel36.setFont(new Font("Roboto", 1, 14));
        this.jLabel36.setForeground(new Color(255, 255, 255));
        this.jLabel36.setText("jLabel17");
        this.jLabel37.setFont(new Font("Roboto", 1, 14));
        this.jLabel37.setForeground(new Color(255, 255, 255));
        this.jLabel37.setText("jLabel17");
        this.jLabel38.setFont(new Font("Roboto", 1, 14));
        this.jLabel38.setForeground(new Color(255, 255, 255));
        this.jLabel38.setText("jLabel17");
        this.jLabel39.setFont(new Font("Roboto", 1, 14));
        this.jLabel39.setForeground(new Color(255, 255, 255));
        this.jLabel39.setText("jLabel17");
        this.jLabel40.setFont(new Font("Roboto", 1, 14));
        this.jLabel40.setForeground(new Color(255, 255, 255));
        this.jLabel40.setText("jLabel17");
        this.jLabel41.setFont(new Font("Roboto", 1, 14));
        this.jLabel41.setForeground(new Color(255, 255, 255));
        this.jLabel41.setText("jLabel17");
        this.jLabel42.setFont(new Font("Roboto", 1, 14));
        this.jLabel42.setForeground(new Color(255, 255, 255));
        this.jLabel42.setText("jLabel17");
        this.jLabel43.setFont(new Font("Roboto", 1, 24));
        this.jLabel43.setForeground(new Color(255, 255, 255));
        this.jLabel43.setHorizontalAlignment(0);
        this.jLabel43.setText("Datos del cliente");
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setFont(new Font("Roboto", 0, 18));
        this.jTextArea1.setLineWrap(true);
        this.jTextArea1.setRows(5);
        this.jTextArea1.setWrapStyleWord(true);
        this.jScrollPane8.setViewportView(this.jTextArea1);
        this.jLabel44.setFont(new Font("Roboto", 1, 14));
        this.jLabel44.setForeground(new Color(255, 255, 255));
        this.jLabel44.setText("jLabel17");
        this.jLabel45.setFont(new Font("Roboto", 1, 14));
        this.jLabel45.setForeground(new Color(255, 255, 255));
        this.jLabel45.setText("jLabel17");
        this.jLabel46.setFont(new Font("Roboto", 1, 14));
        this.jLabel46.setForeground(new Color(255, 255, 255));
        this.jLabel46.setText("jLabel17");
        this.jTextArea2.setEditable(false);
        this.jTextArea2.setColumns(20);
        this.jTextArea2.setFont(new Font("Roboto", 0, 18));
        this.jTextArea2.setLineWrap(true);
        this.jTextArea2.setRows(5);
        this.jTextArea2.setWrapStyleWord(true);
        this.jScrollPane9.setViewportView(this.jTextArea2);
        this.jButton9.setBackground(new Color(255, 255, 255));
        this.jButton9.setFont(new Font("Roboto", 1, 18));
        this.jButton9.setForeground(new Color(27, 48, 107));
        this.jButton9.setText("Entregar");
        this.jButton9.setBorder(null);
        this.jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton9ActionPerformed(evt);
            }
        });
        this.nombre1.setFont(new Font("Roboto", 1, 24));
        this.nombre1.setForeground(new Color(255, 255, 255));
        this.nombre1.setText("jLabel15");
        this.jLabel47.setFont(new Font("Roboto", 1, 14));
        this.jLabel47.setForeground(new Color(255, 255, 255));
        this.jLabel47.setText("jLabel17");
        this.imei.setFont(new Font("Roboto", 1, 14));
        this.imei.setForeground(new Color(255, 255, 255));
        this.imei.setText("jLabel17");
        this.jLabel104.setFont(new Font("Roboto", 1, 14));
        this.jLabel104.setForeground(new Color(248, 248, 46));
        this.jLabel104.setHorizontalAlignment(4);
        this.jLabel104.setText("Nombre:");
        this.jLabel103.setFont(new Font("Roboto", 1, 14));
        this.jLabel103.setForeground(new Color(248, 248, 46));
        this.jLabel103.setHorizontalAlignment(4);
        this.jLabel103.setText("Ci:");
        this.jLabel106.setFont(new Font("Roboto", 1, 14));
        this.jLabel106.setForeground(new Color(248, 248, 46));
        this.jLabel106.setHorizontalAlignment(4);
        this.jLabel106.setText("Telefono:");
        this.jLabel107.setFont(new Font("Roboto", 1, 14));
        this.jLabel107.setForeground(new Color(248, 248, 46));
        this.jLabel107.setHorizontalAlignment(4);
        this.jLabel107.setText("Marca:");
        this.jLabel108.setFont(new Font("Roboto", 1, 14));
        this.jLabel108.setForeground(new Color(248, 248, 46));
        this.jLabel108.setHorizontalAlignment(4);
        this.jLabel108.setText("Modelo:");
        this.jLabel109.setFont(new Font("Roboto", 1, 14));
        this.jLabel109.setForeground(new Color(248, 248, 46));
        this.jLabel109.setHorizontalAlignment(4);
        this.jLabel109.setText("Gama:");
        this.jLabel110.setFont(new Font("Roboto", 1, 14));
        this.jLabel110.setForeground(new Color(248, 248, 46));
        this.jLabel110.setHorizontalAlignment(4);
        this.jLabel110.setText("Modelo:");
        this.jLabel111.setFont(new Font("Roboto", 1, 14));
        this.jLabel111.setForeground(new Color(248, 248, 46));
        this.jLabel111.setHorizontalAlignment(4);
        this.jLabel111.setText("Sim:");
        this.jLabel112.setFont(new Font("Roboto", 1, 14));
        this.jLabel112.setForeground(new Color(248, 248, 46));
        this.jLabel112.setHorizontalAlignment(4);
        this.jLabel112.setText("Tapa:");
        this.jLabel113.setFont(new Font("Roboto", 1, 14));
        this.jLabel113.setForeground(new Color(248, 248, 46));
        this.jLabel113.setHorizontalAlignment(4);
        this.jLabel113.setText("Diagnosticar:");
        this.jLabel114.setFont(new Font("Roboto", 1, 14));
        this.jLabel114.setForeground(new Color(248, 248, 46));
        this.jLabel114.setHorizontalAlignment(4);
        this.jLabel114.setText("Tipo de falla:");
        this.jLabel115.setFont(new Font("Roboto", 1, 14));
        this.jLabel115.setForeground(new Color(248, 248, 46));
        this.jLabel115.setHorizontalAlignment(4);
        this.jLabel115.setText("Imei:");
        this.addemail1.setHorizontalAlignment(0);
        this.addemail1.setBorder(new SoftBevelBorder(0));
        this.jLabel50.setFont(new Font("Roboto", 1, 14));
        this.jLabel50.setForeground(new Color(255, 255, 255));
        this.jLabel50.setText("Precio Bs:");
        this.jTextArea3.setEditable(false);
        this.jTextArea3.setColumns(20);
        this.jTextArea3.setFont(new Font("Roboto", 0, 18));
        this.jTextArea3.setLineWrap(true);
        this.jTextArea3.setRows(5);
        this.jTextArea3.setWrapStyleWord(true);
        this.jScrollPane11.setViewportView(this.jTextArea3);
        final GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jScrollPane11).addComponent(this.jScrollPane8, GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane9, GroupLayout.Alignment.LEADING)).addGap(18, 18, 18).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.nombre, -1, -1, 32767).addComponent(this.imei, GroupLayout.Alignment.TRAILING, -2, 234, -2).addComponent(this.jLabel50, -1, -1, 32767).addComponent(this.nombre1, GroupLayout.Alignment.TRAILING, -2, 368, -2).addComponent(this.addemail1)).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel104, -2, 131, -2).addComponent(this.jLabel103, -2, 131, -2).addComponent(this.jLabel106, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel108, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel107, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel110, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel109, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel111, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel112, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel114, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel113, GroupLayout.Alignment.LEADING, -2, 131, -2).addComponent(this.jLabel115, GroupLayout.Alignment.LEADING, -2, 131, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel46, GroupLayout.Alignment.TRAILING, -1, 244, 32767).addComponent(this.jLabel45, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel44, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel42, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel41, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel34, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel36, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel37, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel38, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel39, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel40, GroupLayout.Alignment.TRAILING, -1, -1, 32767))).addComponent(this.jLabel47, GroupLayout.Alignment.TRAILING, -2, 381, -2))))).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel43, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jButton9, -2, 114, -2))).addContainerGap()));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.jLabel43, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.nombre, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel34).addComponent(this.jLabel104)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel36).addComponent(this.jLabel103)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel37).addComponent(this.jLabel106)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel38).addComponent(this.jLabel107)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel39).addComponent(this.jLabel108)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel40).addComponent(this.jLabel109))).addComponent(this.jScrollPane8, -2, 153, -2)).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel41).addComponent(this.jLabel110)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel42).addComponent(this.jLabel111)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel44).addComponent(this.jLabel112)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel45).addComponent(this.jLabel113)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel46).addComponent(this.jLabel114)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.imei).addComponent(this.jLabel115)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, -1, 32767).addComponent(this.jLabel47)).addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jScrollPane9, -2, 146, -2).addGap(14, 14, 14))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.nombre1, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel50).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.addemail1, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jButton9, -2, 40, -2)).addComponent(this.jScrollPane11)).addGap(10, 10, 10)));
        final GroupLayout informaLayout = new GroupLayout(this.informa.getContentPane());
        this.informa.getContentPane().setLayout(informaLayout);
        informaLayout.setHorizontalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        informaLayout.setVerticalGroup(informaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        this.setDefaultCloseOperation(3);
        this.setTitle("PhoneSystem");
        this.jTabbedPane1.setBackground(new Color(255, 255, 255));
        this.jTabbedPane1.setOpaque(true);
        this.jLabel1.setFont(new Font("Roboto", 1, 14));
        this.jPanel1.setBackground(new Color(18, 51, 144));
        this.jLabel9.setBackground(new Color(10, 28, 85));
        this.jLabel9.setFont(new Font("Roboto", 1, 24));
        this.jLabel9.setForeground(new Color(255, 255, 255));
        this.jLabel9.setHorizontalAlignment(0);
        this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_phone_android_white_18dp.png")));
        this.jLabel9.setText("Datos del dispositivo");
        this.jLabel9.setOpaque(true);
        this.jButton3.setBackground(new Color(255, 255, 255));
        this.jButton3.setFont(new Font("Roboto", 1, 14));
        this.jButton3.setForeground(new Color(14, 82, 151));
        this.jButton3.setText("Enviar");
        this.jButton3.setBorder(null);
        this.jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton3ActionPerformed(evt);
            }
        });
        this.chatrecepcion.setEditable(false);
        this.chatrecepcion.setColumns(20);
        this.chatrecepcion.setFont(new Font("Roboto", 0, 14));
        this.chatrecepcion.setLineWrap(true);
        this.chatrecepcion.setRows(5);
        this.chatrecepcion.setWrapStyleWord(true);
        this.chatrecepcion.setBorder(new SoftBevelBorder(0));
        this.chatrecepcion.setFocusable(false);
        this.jScrollPane2.setViewportView(this.chatrecepcion);
        this.bienvenida.setFont(new Font("Roboto", 1, 40));
        this.bienvenida.setForeground(new Color(255, 255, 255));
        this.bienvenida.setHorizontalAlignment(0);
        this.bienvenida.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_supervisor_account_white_36dp.png")));
        this.bienvenida.setText("bienvenida");
        this.diagnos.setBackground(new Color(18, 51, 144));
        this.diagnos.setFont(new Font("Roboto", 1, 14));
        this.diagnos.setForeground(new Color(255, 255, 255));
        this.diagnos.setText("Solo diagnostico");
        this.diagnos.setBorder(null);
        this.diagnos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.diagnosActionPerformed(evt);
            }
        });
        this.chatreceptor.setModel(this.combo);
        this.jButton5.setBackground(new Color(255, 255, 255));
        this.jButton5.setFont(new Font("Roboto", 1, 18));
        this.jButton5.setForeground(new Color(14, 82, 151));
        this.jButton5.setText("Inventario");
        this.jButton5.setBorder(null);
        this.jButton5.setFocusable(false);
        this.jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton7.setBackground(new Color(255, 255, 255));
        this.jButton7.setFont(new Font("Roboto", 1, 18));
        this.jButton7.setForeground(new Color(14, 82, 151));
        this.jButton7.setText("Por entregar");
        this.jButton7.setBorder(null);
        this.jButton7.setFocusable(false);
        this.jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton7ActionPerformed(evt);
            }
        });
        this.precio.setFont(new Font("Roboto", 1, 18));
        this.precio.setForeground(new Color(255, 255, 255));
        this.jButton8.setBackground(new Color(18, 51, 144));
        this.jButton8.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_highlight_off_white_18dp.png")));
        this.jButton8.setBorder(null);
        this.jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton8ActionPerformed(evt);
            }
        });
        this.errorrecepcion.setForeground(new Color(255, 255, 255));
        this.errorrecepcion.setText("    ");
        this.jLabel20.setHorizontalAlignment(0);
        this.jLabel20.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_forum_white_24dp.png")));
        this.jLabel20.setFocusable(false);
        this.jButton1.setBackground(new Color(10, 28, 85));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_send_white_18dp.png")));
        this.jButton1.setBorder(null);
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton1ActionPerformed(evt);
            }
        });
        this.addsolici.setFont(new Font("Roboto", 1, 14));
        this.addsolici.setForeground(new Color(255, 255, 255));
        this.addsolici.setHorizontalAlignment(0);
        this.addsolici.setText("Fallas");
        this.jLabel16.setBackground(new Color(10, 28, 85));
        this.jLabel16.setFont(new Font("Roboto", 1, 24));
        this.jLabel16.setForeground(new Color(255, 255, 255));
        this.jLabel16.setHorizontalAlignment(0);
        this.jLabel16.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_assignment_ind_white_18dp.png")));
        this.jLabel16.setText("Datos del cliente ");
        this.jLabel16.setOpaque(true);
        this.addfallas.setColumns(20);
        this.addfallas.setFont(new Font("Roboto", 0, 12));
        this.addfallas.setLineWrap(true);
        this.addfallas.setRows(5);
        this.addfallas.setWrapStyleWord(true);
        this.jScrollPane3.setViewportView(this.addfallas);
        this.jLabel10.setFont(new Font("Roboto", 1, 12));
        this.jLabel10.setForeground(new Color(255, 255, 255));
        this.jLabel10.setText("  ");
        this.jButton12.setBackground(new Color(255, 255, 255));
        this.jButton12.setFont(new Font("Roboto", 1, 18));
        this.jButton12.setForeground(new Color(14, 82, 151));
        this.jButton12.setText("Cancelar servicio");
        this.jButton12.setBorder(null);
        this.jButton12.setFocusable(false);
        this.jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton12ActionPerformed(evt);
            }
        });
        this.enviarecepcion.setColumns(20);
        this.enviarecepcion.setFont(new Font("Roboto", 0, 14));
        this.enviarecepcion.setLineWrap(true);
        this.enviarecepcion.setRows(3);
        this.enviarecepcion.setWrapStyleWord(true);
        this.jScrollPane7.setViewportView(this.enviarecepcion);
        this.ndispo.setBorder(new SoftBevelBorder(0));
        this.ndispo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.ndispoActionPerformed(evt);
            }
        });
        this.ndispo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Recepcion.this.ndispoKeyPressed(evt);
            }
        });
        this.jButton15.setBackground(new Color(153, 102, 255));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton15.setOpaque(false);
        this.jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton15ActionPerformed(evt);
            }
        });
        this.jLabel33.setFont(new Font("Roboto", 1, 14));
        this.jLabel33.setForeground(new Color(255, 255, 255));
        this.jLabel33.setHorizontalAlignment(4);
        this.jLabel33.setText("N° Servicio:");
        this.jLabel49.setFont(new Font("Roboto", 1, 14));
        this.jLabel49.setForeground(new Color(255, 255, 255));
        this.jLabel49.setHorizontalAlignment(4);
        this.jLabel49.setText("Ci:");
        this.jButton18.setBackground(new Color(153, 102, 255));
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton18.setOpaque(false);
        this.jButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton18ActionPerformed(evt);
            }
        });
        this.ndispo1.setBorder(new SoftBevelBorder(0));
        this.ndispo1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Recepcion.this.ndispo1KeyPressed(evt);
            }
        });
        this.jPanel9.setOpaque(false);
        this.jPanel9.setLayout(new GridLayout(2, 3, 25, 0));
        this.jLabel18.setFont(new Font("Roboto", 1, 14));
        this.jLabel18.setForeground(new Color(255, 255, 255));
        this.jLabel18.setHorizontalAlignment(0);
        this.jLabel18.setText("N° Servicio");
        this.jPanel9.add(this.jLabel18);
        this.jLabel2.setFont(new Font("Roboto", 1, 14));
        this.jLabel2.setForeground(new Color(255, 255, 255));
        this.jLabel2.setHorizontalAlignment(0);
        this.jLabel2.setText("Marca");
        this.jPanel9.add(this.jLabel2);
        this.jLabel11.setFont(new Font("Roboto", 1, 14));
        this.jLabel11.setForeground(new Color(255, 255, 255));
        this.jLabel11.setHorizontalAlignment(0);
        this.jLabel11.setText("Modelo");
        this.jPanel9.add(this.jLabel11);
        this.jLabel13.setFont(new Font("Roboto", 1, 14));
        this.jLabel13.setForeground(new Color(255, 255, 255));
        this.jLabel13.setHorizontalAlignment(0);
        this.jLabel13.setText("Serial bateria");
        this.jPanel9.add(this.jLabel13);
        this.jLabel29.setFont(new Font("Roboto", 1, 14));
        this.jLabel29.setForeground(new Color(255, 255, 255));
        this.jLabel29.setHorizontalAlignment(0);
        this.jLabel29.setText("Imei");
        this.jPanel9.add(this.jLabel29);
        this.jLabel48.setFont(new Font("Roboto", 1, 14));
        this.jLabel48.setForeground(new Color(255, 255, 255));
        this.jLabel48.setHorizontalAlignment(0);
        this.jLabel48.setText("sss     ");
        this.jPanel9.add(this.jLabel48);
        this.addmarca.setHorizontalAlignment(0);
        this.addmarca.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel9.add(this.addmarca);
        this.addmodelo.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel9.add(this.addmodelo);
        this.addbateria.setForeground(new Color(51, 51, 51));
        this.addbateria.setHorizontalAlignment(0);
        this.addbateria.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel9.add(this.addbateria);
        this.addtapa1.setHorizontalAlignment(0);
        this.addtapa1.setBorder(BorderFactory.createBevelBorder(0));
        this.jPanel9.add(this.addtapa1);
        this.jPanel10.setOpaque(false);
        this.jPanel10.setLayout(new GridLayout(2, 2, 25, 0));
        this.jLabel14.setFont(new Font("Roboto", 1, 14));
        this.jLabel14.setForeground(new Color(255, 255, 255));
        this.jLabel14.setHorizontalAlignment(0);
        this.jLabel14.setText("Memoria");
        this.jPanel10.add(this.jLabel14);
        this.jLabel15.setFont(new Font("Roboto", 1, 14));
        this.jLabel15.setForeground(new Color(255, 255, 255));
        this.jLabel15.setHorizontalAlignment(0);
        this.jLabel15.setText("SIM");
        this.jPanel10.add(this.jLabel15);
        this.jLabel22.setFont(new Font("Roboto", 1, 14));
        this.jLabel22.setForeground(new Color(255, 255, 255));
        this.jLabel22.setHorizontalAlignment(0);
        this.jLabel22.setText("Tapa");
        this.jPanel10.add(this.jLabel22);
        this.jLabel12.setFont(new Font("Roboto", 1, 14));
        this.jLabel12.setForeground(new Color(255, 255, 255));
        this.jLabel12.setHorizontalAlignment(0);
        this.jLabel12.setText("Gama");
        this.jPanel10.add(this.jLabel12);
        this.jLabel19.setFont(new Font("Roboto", 1, 14));
        this.jLabel19.setForeground(new Color(255, 255, 255));
        this.jLabel19.setHorizontalAlignment(0);
        this.jLabel19.setText("Tecnico");
        this.jPanel10.add(this.jLabel19);
        this.jLabel24.setFont(new Font("Roboto", 1, 14));
        this.jLabel24.setForeground(new Color(255, 255, 255));
        this.jLabel24.setHorizontalAlignment(0);
        this.jLabel24.setText("Tipo de falla");
        this.jPanel10.add(this.jLabel24);
        this.addmemoria.setModel(new DefaultComboBoxModel<String>(new String[] { "Si", "No" }));
        this.jPanel10.add(this.addmemoria);
        this.addsim.setModel(new DefaultComboBoxModel<String>(new String[] { "Si", "No" }));
        this.jPanel10.add(this.addsim);
        this.addtapa.setModel(new DefaultComboBoxModel<String>(new String[] { "Si", "No" }));
        this.jPanel10.add(this.addtapa);
        this.addgama.setFont(new Font("Roboto", 1, 12));
        this.addgama.setModel(new DefaultComboBoxModel<String>(new String[] { "Baja", "Media", "Alta" }));
        this.jPanel10.add(this.addgama);
        final Conectar2 conectar2 = new Conectar2();
        final DefaultComboBoxModel combo = new DefaultComboBoxModel();
        try {
            final Statement statement = conectar2.retorna();
            final ResultSet usuario = statement.executeQuery("SELECT * FROM `phonesystem`.`usuarios` WHERE `tipo` LIKE 'tecnico'");
            while (usuario.next()) {
                combo.addElement(usuario.getObject("nombre"));
            }
        }
        catch (SQLException ex) {}
        this.addtecnico.setModel(combo);
        this.jPanel10.add(this.addtecnico);
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[] { "Hardware", "Software", "Hardware y software" }));
        this.jPanel10.add(this.jComboBox1);
        this.jPanel12.setOpaque(false);
        this.jPanel12.setLayout(new GridLayout(2, 3, 80, 5));
        this.jLabel1.setFont(new Font("Roboto", 1, 14));
        this.jLabel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("Nombre");
        this.jPanel12.add(this.jLabel1);
        this.jLabel3.setFont(new Font("Roboto", 1, 14));
        this.jLabel3.setForeground(new Color(255, 255, 255));
        this.jLabel3.setHorizontalAlignment(0);
        this.jLabel3.setText("Ci");
        this.jPanel12.add(this.jLabel3);
        this.jLabel4.setFont(new Font("Roboto", 1, 14));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setHorizontalAlignment(0);
        this.jLabel4.setText("Telefono");
        this.jPanel12.add(this.jLabel4);
        this.addnombre.setHorizontalAlignment(0);
        this.addnombre.setBorder(new SoftBevelBorder(0));
        this.addnombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.addnombreActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.addnombre);
        this.addci.setBorder(null);
        this.jPanel12.add(this.addci);
        this.addtelefono.setHorizontalAlignment(0);
        this.addtelefono.setBorder(new SoftBevelBorder(0));
        this.jPanel12.add(this.addtelefono);
        this.jPanel13.setOpaque(false);
        this.jPanel13.setLayout(new GridLayout(2, 3, 80, 5));
        this.jLabel5.setForeground(new Color(255, 255, 255));
        this.jLabel5.setFont(new Font("Roboto", 1, 14));
        this.jLabel5.setHorizontalAlignment(0);
        this.jLabel5.setText("Telefono 2");
        this.jPanel13.add(this.jLabel5);
        this.jLabel6.setFont(new Font("Roboto", 1, 14));
        this.jLabel6.setForeground(new Color(255, 255, 255));
        this.jLabel6.setHorizontalAlignment(0);
        this.jLabel6.setText("Email");
        this.jPanel13.add(this.jLabel6);
        this.jLabel7.setFont(new Font("Roboto", 1, 14));
        this.jLabel7.setForeground(new Color(255, 255, 255));
        this.jLabel7.setHorizontalAlignment(0);
        this.jLabel7.setText("Direcci\u00f3n");
        this.jPanel13.add(this.jLabel7);
        this.addtelefono2.setHorizontalAlignment(0);
        this.addtelefono2.setBorder(new SoftBevelBorder(0));
        this.jPanel13.add(this.addtelefono2);
        this.addtelefono2.getAccessibleContext().setAccessibleName("");
        this.addemail.setHorizontalAlignment(0);
        this.addemail.setBorder(new SoftBevelBorder(0));
        this.jPanel13.add(this.addemail);
        this.adddireccion.setHorizontalAlignment(0);
        this.adddireccion.setBorder(new SoftBevelBorder(0));
        this.jPanel13.add(this.adddireccion);
        this.ndispo2.setBorder(new SoftBevelBorder(0));
        this.ndispo2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Recepcion.this.ndispo2KeyPressed(evt);
            }
        });
        this.jLabel51.setFont(new Font("Roboto", 1, 14));
        this.jLabel51.setForeground(new Color(255, 255, 255));
        this.jLabel51.setHorizontalAlignment(4);
        this.jLabel51.setText("Imei:");
        this.jButton20.setBackground(new Color(153, 102, 255));
        this.jButton20.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton20.setOpaque(false);
        this.jButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton20ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.bienvenida, -1, -1, 32767).addGap(249, 249, 249).addComponent(this.jButton8, -2, 30, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel49, -2, 92, -2).addComponent(this.jLabel33, -2, 92, -2).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(this.jLabel51, -2, 90, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.ndispo, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton15)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.ndispo2, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton20)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.ndispo1, -2, 112, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton18))).addGap(4, 4, 4)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel10, -2, 830, 32767).addComponent(this.jPanel9, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel12, -1, -1, 32767).addComponent(this.jPanel13, -1, -1, 32767).addComponent(this.jLabel16, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jLabel9, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.diagnos).addGap(47, 47, 47).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.addsolici, -2, 223, -2).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jButton3, -2, 80, -2).addGap(103, 103, 103)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel10, -2, 144, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.errorrecepcion, -2, 200, -2).addGap(33, 33, 33))))))).addGap(18, 18, 18))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel20, -1, -1, 32767).addComponent(this.jButton7, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jButton5, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jButton12, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane7, -2, 237, -2).addGap(0, 0, 0).addComponent(this.jButton1, -2, 30, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 5, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2, GroupLayout.Alignment.TRAILING, -2, 263, -2).addComponent(this.chatreceptor, GroupLayout.Alignment.TRAILING, -2, 263, -2)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton8, -2, 30, -2).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.bienvenida, -2, 41, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel16).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel12, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ndispo, -2, -1, -2).addComponent(this.jLabel33)).addComponent(this.jButton15, -2, 25, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ndispo1).addComponent(this.jLabel49)).addComponent(this.jButton18, -2, 0, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ndispo2, -2, -1, -2).addComponent(this.jLabel51)).addComponent(this.jButton20, -2, 0, 32767)))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel13, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel9, -2, 60, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel10, -2, 60, -2).addGap(18, 18, 18).addComponent(this.addsolici).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane3, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jButton3, -2, 40, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.errorrecepcion).addComponent(this.jLabel10))).addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(this.diagnos)))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton7, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton5, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton12, -2, 39, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel20).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 211, -2))).addGap(6, 6, 6).addComponent(this.chatreceptor, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane7, -2, -1, -2).addComponent(this.jButton1, -2, 30, -2)).addContainerGap(-1, 32767)));
        this.jTabbedPane1.addTab("Nuevo cliente", this.jPanel1);
        this.jPanel6.setBackground(new Color(18, 51, 144));
        this.jPanel6.setBorder(new SoftBevelBorder(0));
        this.jLabel27.setFont(new Font("Roboto", 1, 14));
        this.jLabel27.setForeground(new Color(255, 255, 255));
        this.jLabel27.setHorizontalAlignment(0);
        this.jLabel27.setText("Nombre");
        this.jLabel28.setFont(new Font("Comic Sans MS", 1, 36));
        this.jLabel28.setForeground(new Color(255, 255, 255));
        this.jLabel28.setHorizontalAlignment(0);
        this.jLabel28.setText("Vender");
        this.facturaventa3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.facturaventa3ActionPerformed(evt);
            }
        });
        this.jLabel52.setFont(new Font("Roboto", 1, 14));
        this.jLabel52.setForeground(new Color(255, 255, 255));
        this.jLabel52.setHorizontalAlignment(0);
        this.jLabel52.setText("Telefono:");
        this.jLabel61.setFont(new Font("Roboto", 1, 14));
        this.jLabel61.setForeground(new Color(255, 255, 255));
        this.jLabel61.setHorizontalAlignment(0);
        this.jLabel61.setText("CI:");
        this.jLabel62.setFont(new Font("Roboto", 1, 14));
        this.jLabel62.setForeground(new Color(255, 255, 255));
        this.jLabel62.setHorizontalAlignment(0);
        this.jLabel62.setText("Email");
        this.listacompra.setModel(this.molistacompra);
        this.jScrollPane5.setViewportView(this.listacompra);
        this.jLabel60.setFont(new Font("Roboto", 1, 18));
        this.jLabel60.setForeground(new Color(255, 255, 255));
        this.jLabel60.setHorizontalAlignment(0);
        this.jLabel60.setText("Productos a vender");
        this.addsolici.setFont(new Font("Roboto", 1, 14));
        this.productosli.setModel(this.combo2);
        this.productosli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Recepcion.this.productosliMouseClicked(evt);
            }
        });
        this.productosli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.productosliActionPerformed(evt);
            }
        });
        this.productosli.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent evt) {
                Recepcion.this.productosliPropertyChange(evt);
            }
        });
        this.jLabel26.setFont(new Font("Roboto", 1, 14));
        this.jLabel26.setForeground(new Color(255, 255, 255));
        this.jLabel26.setHorizontalAlignment(0);
        this.jLabel26.setText("Cantidad");
        this.cantidad.setModel(new SpinnerNumberModel(1, 1, null, 1));
        this.cantidad.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(final ChangeEvent evt) {
                Recepcion.this.cantidadStateChanged(evt);
            }
        });
        this.jLabel25.setFont(new Font("Roboto", 1, 14));
        this.jLabel25.setForeground(new Color(255, 255, 255));
        this.jLabel25.setHorizontalAlignment(0);
        this.jLabel25.setText("Producto");
        this.jButton33.setBackground(new Color(14, 82, 151));
        this.jButton33.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_add_circle_white_24dp.png")));
        this.jButton33.setBorder(null);
        this.jButton33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton33ActionPerformed(evt);
            }
        });
        this.addsolici.setFont(new Font("Roboto", 1, 14));
        this.jComboBox4.setModel(this.combolistapro);
        this.jLabel63.setFont(new Font("Roboto", 1, 14));
        this.jLabel63.setForeground(new Color(255, 255, 255));
        this.jLabel63.setHorizontalAlignment(0);
        this.jLabel63.setText("Eliminar");
        this.jButton28.setBackground(new Color(14, 82, 151));
        this.jButton28.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_remove_circle_white_24dp.png")));
        this.jButton28.setBorder(null);
        this.jButton28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton28ActionPerformed(evt);
            }
        });
        this.jButton13.setBackground(new Color(255, 255, 255));
        this.jButton13.setFont(new Font("Roboto", 1, 18));
        this.jButton13.setForeground(new Color(14, 82, 151));
        this.jButton13.setText("Vender");
        this.jButton13.setBorder(null);
        this.jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton13ActionPerformed(evt);
            }
        });
        this.totalventa.setFont(new Font("Roboto", 1, 14));
        this.totalventa.setForeground(new Color(255, 255, 255));
        this.totalventa.setText("Total:");
        this.facturaventa7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.facturaventa7ActionPerformed(evt);
            }
        });
        this.facturaventa7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Recepcion.this.facturaventa7KeyPressed(evt);
            }
            
            @Override
            public void keyReleased(final KeyEvent evt) {
                Recepcion.this.facturaventa7KeyReleased(evt);
            }
        });
        this.jButton57.setBackground(new Color(9, 46, 162));
        this.jButton57.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_search_white_18dp.png")));
        this.jButton57.setBorder(null);
        this.jButton57.setBorderPainted(false);
        this.jButton57.setFocusPainted(false);
        this.jButton57.setFocusable(false);
        this.jButton57.setOpaque(false);
        this.jButton57.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.jButton57ActionPerformed(evt);
            }
        });
        this.facturaventa8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Recepcion.this.facturaventa8ActionPerformed(evt);
            }
        });
        this.totalventa1.setFont(new Font("Roboto", 1, 14));
        this.totalventa1.setForeground(new Color(255, 255, 255));
        this.totalventa1.setText("Total Bs:");
        final GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel28, -1, -1, 32767).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jButton57).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.facturaventa7, -1, 294, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.cantidad).addComponent(this.jLabel26, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton33).addGap(4, 4, 4)).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel52, -1, -1, 32767).addComponent(this.facturaventa3).addComponent(this.jLabel27, -1, -1, 32767).addComponent(this.facturaventa1)).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.facturaventa2).addComponent(this.facturaventa4).addComponent(this.jLabel62, -1, -1, 32767).addComponent(this.jLabel61, -1, -1, 32767))).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jComboBox4, 0, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton28, -2, 40, -2)).addComponent(this.productosli, 0, -1, 32767).addComponent(this.jLabel25, -1, -1, 32767).addComponent(this.jLabel63, -1, -1, 32767)).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel60, -1, -1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 132, 32767).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addComponent(this.totalventa1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, 32767).addComponent(this.facturaventa8, -2, 292, -2)).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton13, -2, 150, -2).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.totalventa, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jScrollPane5, GroupLayout.Alignment.LEADING, -1, 400, 32767)))).addContainerGap(133, 32767)))));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel28).addGap(15, 15, 15).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel61).addComponent(this.jLabel60)).addComponent(this.jLabel27)).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.facturaventa2, -2, -1, -2).addComponent(this.facturaventa1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel52).addComponent(this.jLabel62)).addGap(13, 13, 13).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.facturaventa3, -2, -1, -2).addComponent(this.facturaventa4, -2, -1, -2)).addGap(34, 34, 34).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel26).addGap(7, 7, 7).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.cantidad, -2, -1, -2).addComponent(this.facturaventa7, -2, -1, -2)).addComponent(this.jButton33, -2, 26, -2))).addComponent(this.jButton57)).addGap(22, 22, 22).addComponent(this.jLabel25).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.productosli, -2, -1, -2).addGap(27, 27, 27).addComponent(this.jLabel63).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jComboBox4, -2, -1, -2).addComponent(this.jButton28, -2, 26, -2))).addComponent(this.jScrollPane5, -2, 332, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.totalventa).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.facturaventa8, -2, -1, -2).addComponent(this.totalventa1)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton13, -2, 50, -2).addContainerGap(68, 32767)));
        final GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
        this.jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
        this.jTabbedPane1.addTab("Nueva venta", this.jPanel11);
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1, GroupLayout.Alignment.TRAILING));
        this.pack();
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        this.inventariorecepcion.setVisible(false);
    }
    
    private void jButton16ActionPerformed(final ActionEvent evt) {
        this.metodos.cancelar_ser(Integer.parseInt(this.jLabel32.getText()));
        this.jFrame1.setVisible(false);
        this.elimimamo();
    }
    
    private void jButton17ActionPerformed(final ActionEvent evt) {
        this.jFrame1.setVisible(false);
    }
    
    private void jTable1MouseClicked(final MouseEvent evt) {
        final String t = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 7).toString();
        this.jLabel31.setText(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString());
        this.jLabel32.setText(t);
        this.jFrame1.setVisible(true);
        this.jFrame1.setSize(398, 240);
        this.jFrame1.setLocationRelativeTo(null);
    }
    
    private void jButton9ActionPerformed(final ActionEvent evt) {
        final String nd = this.nombre.getText();
        this.metodos.setentregado(Integer.parseInt(nd.substring(nd.indexOf("°:") + 2).trim()));
        final String[] arregloString = this.jTextArea3.getText().split("\n");
        String serviciosadd = "";
        for (int x = 0; x < arregloString.length; ++x) {
            try {
                System.out.println(arregloString[x]);
                final Conectar2 conectar2 = new Conectar2();
                final Statement statement = conectar2.retorna();
                final ResultSet consult = statement.executeQuery("SELECT * FROM `phonesystem`.`ventas` ");
                int fa = 0;
                while (consult.next()) {
                    ++this.j;
                    if (consult.isLast()) {
                        fa = consult.getInt("factura");
                        ++fa;
                    }
                }
                final String arr = arregloString[x].toString();
                serviciosadd = serviciosadd + arr.substring(arr.indexOf(":") + 2) + '\n';
                this.metodos.ventaservi(arr.substring(0, arr.indexOf(":")), this.jLabel34.getText(), this.jLabel36.getText(), this.jLabel37.getText(), fa + "");
            }
            catch (SQLException ex) {
                Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        final ToPDF pdf = new ToPDF();
        final String date1 = this.fecha.agno() + "-" + this.fecha.mes() + "-" + this.fecha.dia();
        final String ns = this.nombre.getText().substring(12).trim();
        System.out.println(ns);
        this.jLabel47.setText("El dispositivo ha sido entregado");
        final File fi = new File("C:/Servicios");
        fi.mkdir();
        pdf.createPDFtaller("C:/Servicios/" + nd.substring(nd.indexOf("°:") + 2).trim() + "_Servicio.pdf", this.nombre.getText(), this.jLabel34.getText(), this.jLabel36.getText(), date1, serviciosadd, this.addemail1.getText());
        try {
            final InputStream inputStream = new FileInputStream(new File("C:/Servicios/" + nd.substring(nd.indexOf("°:") + 2).trim() + "_Servicio.pdf"));
            this.metodos.add_recibo(nd.substring(nd.indexOf("°:") + 2).trim() + "_Servicio", inputStream);
        }
        catch (FileNotFoundException ex2) {}
        this.abrirarchivo("C:/Servicios/" + nd.substring(nd.indexOf("°:") + 2).trim() + "_Servicio.pdf");
        this.addemail1.setText("");
    }
    
    private void jTable2MousePressed(final MouseEvent evt) {
        System.out.println(this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 7).toString());
        final String t = this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 7).toString();
        this.setinfor(t);
        this.informa.setVisible(true);
        this.informa.setSize(681, 583);
        this.informa.setLocationRelativeTo(this);
    }
    
    private void jTable2MouseClicked(final MouseEvent evt) {
        System.out.println(this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 7).toString());
        final String t = this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 7).toString();
        this.setinfor(t);
        this.informa.setLocationRelativeTo(this);
        this.informa.setVisible(true);
        this.informa.setSize(800, 700);
        this.informa.setState(6);
    }
    
    private void addimeiActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton19ActionPerformed(final ActionEvent evt) {
        this.inventartio();
    }
    
    private void facturaventa8ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton57ActionPerformed(final ActionEvent evt) {
    }
    
    private void facturaventa7KeyReleased(final KeyEvent evt) {
        this.setcombocodigo();
    }
    
    private void facturaventa7KeyPressed(final KeyEvent evt) {
        this.setcombocodigo();
    }
    
    private void facturaventa7ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton13ActionPerformed(final ActionEvent evt) {
        try {
            int j = 0;
            final Conectar2 conectar2 = new Conectar2();
            final Statement statement = conectar2.retorna();
            final ResultSet consult = statement.executeQuery("SELECT * FROM `phonesystem`.`ventas` ");
            int fa = 0;
            while (consult.next()) {
                ++j;
                if (consult.isLast()) {
                    fa = consult.getInt("factura");
                    ++fa;
                }
            }
            final ArrayList<String> a = new ArrayList<String>();
            for (int i = 0; i < this.molistacompra.size(); ++i) {
                final String ele = this.molistacompra.get(i).toString();
                this.metodos.venta(ele.substring(0, ele.indexOf(":")), ele.substring(ele.indexOf("cant:") + 5, ele.indexOf(" total")), this.facturaventa1.getText(), this.facturaventa2.getText(), this.facturaventa3.getText(), this.facturaventa4.getText(), fa + "");
                if (this.metodos.email_habilitado()) {
                    final Email email = new Email();
                    email.envio(this.facturaventa4.getText(), this.metodos.empresa() + '\n' + this.metodos.getproducto(ele.substring(0, ele.indexOf(":"))) + '\n' + "Nombre: " + this.facturaventa1.getText() + " Apellido: " + this.facturaventa2.getText() + '\n' + "Factura: PS00" + j, this.totalventa);
                }
                a.add(i + 1 + ")  " + ele.substring(ele.indexOf(":") + 1, ele.indexOf("$")));
            }
            final ToPDF pdf = new ToPDF();
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
            final String date1 = annio + "-" + mes + "-" + dia;
            final File f = new File("C:/Recibos");
            f.mkdir();
            pdf.createPDF("C:/Recibos/Recibo " + fa + ".pdf", this.facturaventa1.getText(), this.facturaventa2.getText(), a, date1, this.facturaventa8.getText() + " Bs", fa + "");
            this.molistacompra.removeAllElements();
            this.listacompra.setModel(this.molistacompra);
            this.facturaventa1.setText("");
            this.facturaventa2.setText("");
            this.facturaventa3.setText("");
            this.facturaventa4.setText("");
            this.facturaventa8.setText("");
            this.setcombolistapro();
            this.totalventa.setText("Venta realizada");
            try {
                final InputStream inputStream = new FileInputStream(new File("C:/Recibos/Recibo " + fa + ".pdf"));
                this.metodos.add_recibo("Recibo " + fa, inputStream);
            }
            catch (FileNotFoundException ex2) {}
            this.abrirarchivo("C:/Recibos/Recibo " + fa + ".pdf");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private void jButton28ActionPerformed(final ActionEvent evt) {
        this.molistacompra.remove(this.jComboBox4.getSelectedIndex());
        this.setcombolistapro();
        this.setventatotal();
    }
    
    private void jButton33ActionPerformed(final ActionEvent evt) {
        final float pre = Float.parseFloat(this.productosli.getSelectedItem().toString().substring(this.productosli.getSelectedItem().toString().indexOf("$:") + 3, this.productosli.getSelectedItem().toString().indexOf("cant:")));
        final int preciocna = Integer.parseInt(this.cantidad.getValue().toString());
        final String pro = this.productosli.getSelectedItem().toString();
        this.molistacompra.addElement(pro.substring(0, pro.indexOf(" cant:")) + " cant:" + this.cantidad.getValue().toString() + " total: " + preciocna * pre);
        this.setcombolistapro();
        this.setventatotal();
    }
    
    private void cantidadStateChanged(final ChangeEvent evt) {
    }
    
    private void productosliPropertyChange(final PropertyChangeEvent evt) {
    }
    
    private void productosliActionPerformed(final ActionEvent evt) {
    }
    
    private void productosliMouseClicked(final MouseEvent evt) {
        final String codigo = this.productosli.getSelectedItem().toString().substring(0, this.productosli.getSelectedItem().toString().indexOf(":"));
    }
    
    private void facturaventa3ActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton20ActionPerformed(final ActionEvent evt) {
        this.f = this.ndispo1.getText();
        this.jLabel47.setText("");
        this.informa.setVisible(true);
        this.setinforimei(this.ndispo2.getText());
        this.informa.setSize(681, 583);
        this.informa.setLocationRelativeTo(this);
    }
    
    private void ndispo2KeyPressed(final KeyEvent evt) {
    }
    
    private void ndispo1KeyPressed(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.jLabel47.setText("");
            this.informa.setVisible(true);
            this.setinforci(this.ndispo1.getText());
            this.informa.setSize(681, 583);
            this.informa.setLocationRelativeTo(this);
        }
    }
    
    private void jButton18ActionPerformed(final ActionEvent evt) {
        this.f = this.ndispo1.getText();
        this.jLabel47.setText("");
        this.informa.setVisible(true);
        this.setinforci(this.ndispo1.getText());
        this.informa.setSize(681, 583);
        this.informa.setLocationRelativeTo(this);
    }
    
    private void jButton15ActionPerformed(final ActionEvent evt) {
        this.f = this.ndispo.getText();
        this.setinfor(this.ndispo.getText());
        this.informa.setExtendedState(6);
    }
    
    private void ndispoKeyPressed(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.informa.setVisible(true);
            this.setinfor(this.ndispo.getText());
            this.informa.setState(6);
            this.informa.setLocationRelativeTo(null);
        }
    }
    
    private void ndispoActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton12ActionPerformed(final ActionEvent evt) {
        this.jFrame2.setVisible(true);
        this.jFrame2.setSize(796, 506);
        this.jFrame2.setLocationRelativeTo(null);
        this.elimimamo();
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        if (!this.enviarecepcion.getText().equals("")) {
            this.metodos.enviar_chat((String)this.chatreceptor.getSelectedItem(), this.bienvenida.getText(), this.enviarecepcion.getText());
            this.enviarecepcion.setText("");
        }
    }
    
    private void jButton8ActionPerformed(final ActionEvent evt) {
        this.salir();
    }
    
    private void jButton7ActionPerformed(final ActionEvent evt) {
        this.entregar.setVisible(true);
        this.entregar.setSize(997, 449);
        this.entregar.setLocationRelativeTo(this);
        this.setdispoen();
    }
    
    private void jButton5ActionPerformed(final ActionEvent evt) {
        this.inventariorecepcion.setVisible(true);
        this.inventariorecepcion.setSize(795, 517);
        this.inventariorecepcion.setLocationRelativeTo(null);
        this.inventartio();
    }
    
    private void diagnosActionPerformed(final ActionEvent evt) {
    }
    
    private void jButton3ActionPerformed(final ActionEvent evt) {
        final String tipofa = "";
        if (this.addnombre.getText().equals("") || this.addci.getText().equals("") || this.addtelefono.getText().equals("") || this.adddireccion.getText().equals("") || this.addmarca.getText().equals("") || this.addmodelo.getText().equals("") || this.addfallas.getText().equals("")) {
            this.errorrecepcion.setText("Complete los campos necesarios");
        }
        else if (this.diagnos.isSelected()) {
            this.metodos.agregar_cliente(this.addnombre.getText(), this.addci.getText(), this.addtelefono.getText(), this.addtelefono2.getText(), this.addemail.getText(), this.adddireccion.getText(), this.addmarca.getText(), this.addmodelo.getText(), (String)this.addgama.getSelectedItem(), this.addbateria.getText(), this.addmemoria.getSelectedItem().toString(), this.addsim.getSelectedItem().toString(), this.addtapa.getSelectedItem().toString(), "si", this.addfallas.getText(), (String)this.addtecnico.getSelectedItem(), this.jComboBox1.getSelectedItem().toString(), this.addtapa1.getText());
            if (this.metodos.email_habilitado()) {
                final Email email = new Email();
                email.envio(this.facturaventa4.getText(), this.metodos.empresa() + '\n' + "Nombre:" + this.addnombre.getText() + " Identificaci\u00f3n: " + this.addci.getText() + " Telefono:" + this.addtelefono.getText() + " Telefono 2:" + this.addtelefono2.getText() + " Direcci\u00f3n: " + this.adddireccion.getText() + '\n' + "Marca: " + this.addmarca.getText() + " Modelo: " + this.addmodelo.getText() + " Gama: " + (String)this.addgama.getSelectedItem() + '\n' + "Bateria: " + this.addbateria.getText() + "Memoria: " + this.addmemoria.getSelectedItem().toString() + this.addsim.getSelectedItem().toString() + this.addtapa.getSelectedItem().toString() + "Diagnosticar: si " + this.addfallas.getText() + (String)this.addtecnico.getSelectedItem(), this.jLabel10);
            }
            this.errorrecepcion.setText("Enviado al tecnico");
            this.addnombre.setText("");
            this.addci.setText("");
            this.addtelefono.setText("");
            this.addtelefono2.setText("");
            this.adddireccion.setText("");
            this.addemail.setText("");
            this.addmarca.setText("");
            this.addmodelo.setText("");
            this.addbateria.setText("");
            this.addfallas.setText("");
            this.addtapa1.setText("");
            this.jLabel48.setText(this.metodos.nservicio() + "");
            final Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Recepcion.this.errorrecepcion.setText("");
                }
            });
            t.start();
        }
        else {
            this.metodos.agregar_cliente(this.addnombre.getText(), this.addci.getText(), this.addtelefono.getText(), this.addtelefono2.getText(), this.addemail.getText(), this.adddireccion.getText(), this.addmarca.getText(), this.addmodelo.getText(), (String)this.addgama.getSelectedItem(), this.addbateria.getText(), this.addmemoria.getSelectedItem().toString(), this.addsim.getSelectedItem().toString(), this.addtapa.getSelectedItem().toString(), "no", this.addfallas.getText(), (String)this.addtecnico.getSelectedItem(), this.jComboBox1.getSelectedItem().toString(), this.addtapa1.getText());
            this.errorrecepcion.setText("Enviado al tecnico");
            this.addnombre.setText("");
            if (this.metodos.email_habilitado()) {
                final Email email = new Email();
                email.envio(this.facturaventa4.getText(), this.metodos.empresa() + '\n' + "Nombre:" + this.addnombre.getText() + " Identificaci\u00f3n: " + this.addci.getText() + " Telefono:" + this.addtelefono.getText() + " Telefono 2:" + this.addtelefono2.getText() + " Direcci\u00f3n: " + this.adddireccion.getText() + '\n' + "Marca: " + this.addmarca.getText() + " Modelo: " + this.addmodelo.getText() + " Gama: " + (String)this.addgama.getSelectedItem() + '\n' + "Bateria: " + this.addbateria.getText() + "Memoria: " + this.addmemoria.getSelectedItem().toString() + this.addsim.getSelectedItem().toString() + this.addtapa.getSelectedItem().toString() + "Diagnosticar: no " + this.addfallas.getText() + (String)this.addtecnico.getSelectedItem(), this.jLabel10);
            }
            this.errorrecepcion.setText("Enviado al tecnico");
            this.addci.setText("");
            this.addtelefono.setText("");
            this.addtelefono2.setText("");
            this.adddireccion.setText("");
            this.addemail.setText("");
            this.addmarca.setText("");
            this.addmodelo.setText("");
            this.addbateria.setText("");
            this.addtapa1.setText("");
            this.addfallas.setText("");
            this.jLabel48.setText(this.metodos.nservicio() + "");
            final Timer t = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Recepcion.this.errorrecepcion.setText("");
                }
            });
            t.start();
        }
    }
    
    private void addnombreActionPerformed(final ActionEvent evt) {
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
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Recepcion.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Recepcion().setVisible(true);
            }
        });
    }
    
    static {
        Recepcion.pausa = false;
    }
}
