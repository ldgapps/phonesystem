// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.Border;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import DB.Metodos;
import Tecnico.Tecnicoview;
import recepcio.Recepcion;
import Administrador.Admin;
import javax.swing.JFrame;

public class Inicio extends JFrame
{
    private Admin ser;
    private Recepcion rec;
    private Tecnicoview tec;
    private Metodos metodos;
    private JPasswordField Pass;
    private JTextField Usua;
    private JLabel error;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    
    public Inicio() {
        this.ser = new Admin();
        this.rec = new Recepcion();
        this.tec = new Tecnicoview();
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.metodos = new Metodos();
        System.out.println(this.metodos.nservicio() + "ddddd");
    }
    
    private void iniciar() {
        this.metodos = new Metodos();
        if (this.metodos.iniciar(this.Usua.getText(), this.Pass.getText()).equals("admin")) {
            this.setVisible(false);
            this.ser.setUsuario(this.Usua.getText());
            this.ser.setVisible(true);
            this.ser.setLocationRelativeTo(null);
            this.ser.setExtendedState(6);
        }
        else if (this.metodos.iniciar(this.Usua.getText(), this.Pass.getText()).equals("tecnico")) {
            this.setVisible(false);
            this.tec.setUsuario(this.Usua.getText());
            this.tec.setVisible(true);
            this.tec.setLocationRelativeTo(null);
            this.tec.setExtendedState(6);
        }
        else if (this.metodos.iniciar(this.Usua.getText(), this.Pass.getText()).equals("recepcion")) {
            this.setVisible(false);
            this.rec.setVisible(true);
            this.rec.setUsuario(this.Usua.getText());
            this.rec.setLocationRelativeTo(null);
            this.rec.setExtendedState(6);
        }
        else if (this.Usua.getText().equals("")) {
            this.error.setText("Introduzca usuario");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Inicio.this.error.setText("");
                }
            });
            t.start();
        }
        else if (this.Pass.getText().equals("")) {
            this.error.setText("Introduzca clave");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Inicio.this.error.setText("");
                }
            });
            t.start();
        }
        else {
            this.error.setText("Usuario o clave incorrecta");
            final Timer t = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent e) {
                    Inicio.this.error.setText("");
                }
            });
            t.start();
        }
    }
    
    private void initComponents() {
        this.jLabel4 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jButton2 = new JButton();
        this.Pass = new JPasswordField();
        this.Usua = new JTextField();
        this.jLabel1 = new JLabel();
        this.error = new JLabel();
        this.jButton1 = new JButton();
        this.jButton10 = new JButton();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setUndecorated(true);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(this.jLabel4);
        this.jLabel4.setBounds(0, 0, 0, 0);
        this.jLabel2.setFont(new Font("Roboto", 1, 18));
        this.jLabel2.setForeground(new Color(255, 255, 255));
        this.jLabel2.setHorizontalAlignment(0);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_vpn_key_white_18dp.png")));
        this.jLabel2.setText("Contrase\u00f1a");
        this.getContentPane().add(this.jLabel2);
        this.jLabel2.setBounds(0, 360, 500, 27);
        this.jButton2.setBackground(new Color(255, 255, 255));
        this.jButton2.setFont(new Font("Roboto", 1, 18));
        this.jButton2.setForeground(new Color(14, 82, 151));
        this.jButton2.setText("Entrar");
        this.jButton2.setBorder(null);
        this.jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Inicio.this.jButton2ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton2);
        this.jButton2.setBounds(180, 470, 150, 50);
        this.Pass.setFont(new Font("Roboto", 1, 14));
        this.Pass.setHorizontalAlignment(0);
        this.Pass.setBorder(new SoftBevelBorder(0));
        this.Pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Inicio.this.PassActionPerformed(evt);
            }
        });
        this.Pass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Inicio.this.PassKeyPressed(evt);
            }
        });
        this.getContentPane().add(this.Pass);
        this.Pass.setBounds(180, 400, 150, 30);
        this.Pass.getAccessibleContext().setAccessibleName("");
        this.Usua.setFont(new Font("Roboto", 1, 14));
        this.Usua.setHorizontalAlignment(0);
        this.Usua.setBorder(new SoftBevelBorder(0));
        this.Usua.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent evt) {
                Inicio.this.UsuaKeyPressed(evt);
            }
        });
        this.getContentPane().add(this.Usua);
        this.Usua.setBounds(180, 310, 150, 30);
        this.jLabel1.setFont(new Font("Roboto", 1, 18));
        this.jLabel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_contacts_white_18dp.png")));
        this.jLabel1.setText("Usuario");
        this.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(0, 260, 500, 27);
        this.error.setFont(new Font("Roboto", 1, 14));
        this.error.setForeground(new Color(255, 255, 255));
        this.error.setHorizontalAlignment(0);
        this.error.setText("     ");
        this.getContentPane().add(this.error);
        this.error.setBounds(0, 440, 500, 17);
        this.jButton1.setBackground(new Color(18, 51, 144));
        this.jButton1.setFont(new Font("Roboto", 1, 14));
        this.jButton1.setForeground(new Color(255, 255, 255));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_close_white_18dp.png")));
        this.jButton1.setBorder(null);
        this.jButton1.setFocusable(false);
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Inicio.this.jButton1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton1);
        this.jButton1.setBounds(470, 0, 30, 30);
        this.jButton10.setBackground(new Color(18, 51, 144));
        this.jButton10.setIcon(new ImageIcon(this.getClass().getResource("/img/ic_arrow_drop_down_white_18dp.png")));
        this.jButton10.setBorder(null);
        this.jButton10.setBorderPainted(false);
        this.jButton10.setFocusable(false);
        this.jButton10.setSelected(true);
        this.jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Inicio.this.jButton10ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton10);
        this.jButton10.setBounds(440, 0, 30, 30);
        this.jLabel5.setBackground(new Color(18, 50, 109));
        this.jLabel5.setHorizontalAlignment(0);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/img/FB_IMG_1566929253792.jpg")));
        this.jLabel5.setOpaque(true);
        this.getContentPane().add(this.jLabel5);
        this.jLabel5.setBounds(0, 0, 500, 280);
        this.jLabel6.setBackground(new Color(18, 50, 109));
        this.jLabel6.setOpaque(true);
        this.getContentPane().add(this.jLabel6);
        this.jLabel6.setBounds(-10, 230, 520, 330);
        this.pack();
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        System.exit(0);
    }
    
    private void jButton10ActionPerformed(final ActionEvent evt) {
        this.toBack();
    }
    
    private void jButton2ActionPerformed(final ActionEvent evt) {
        this.iniciar();
    }
    
    private void PassKeyPressed(final KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            this.iniciar();
        }
    }
    
    private void UsuaKeyPressed(final KeyEvent evt) {
    }
    
    private void PassActionPerformed(final ActionEvent evt) {
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
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
}
