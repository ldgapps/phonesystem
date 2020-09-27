// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.net.URI;
import java.awt.Desktop;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Acerca extends JFrame
{
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    
    public Acerca() {
        this.initComponents();
        this.setSize(512, 292);
        this.setLocationRelativeTo(this);
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.setUndecorated(true);
        this.jPanel1.setBackground(new Color(0, 51, 153));
        this.jLabel1.setBackground(new Color(16, 35, 123));
        this.jLabel1.setFont(new Font("Roboto", 1, 36));
        this.jLabel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("PhoneSystem");
        this.jLabel1.setOpaque(true);
        this.jLabel2.setFont(new Font("Roboto", 1, 14));
        this.jLabel2.setForeground(new Color(255, 255, 255));
        this.jLabel2.setHorizontalAlignment(0);
        this.jLabel2.setText("Para obtener soporte tecnico haz click aqui");
        this.jLabel2.setToolTipText("<html>\n<a href=\"http://www.facebook.com/ldgapps\">LDGApps</a>\n</html>");
        this.jLabel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent evt) {
                Acerca.this.jLabel2MouseClicked(evt);
            }
        });
        this.jLabel3.setFont(new Font("Roboto", 1, 14));
        this.jLabel3.setForeground(new Color(255, 255, 255));
        this.jLabel3.setHorizontalAlignment(0);
        this.jLabel3.setText("Desarrollado por: Luis David Gonzalez Duerto");
        this.jLabel4.setBackground(new Color(16, 35, 123));
        this.jLabel4.setFont(new Font("Roboto", 1, 18));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setText(" V:1.0");
        this.jLabel4.setOpaque(true);
        this.jButton1.setBackground(new Color(16, 35, 123));
        this.jButton1.setFont(new Font("Roboto", 1, 14));
        this.jButton1.setForeground(new Color(255, 255, 255));
        this.jButton1.setText("Aceptar");
        this.jButton1.setBorder(null);
        this.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                Acerca.this.jButton1ActionPerformed(evt);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3, -1, 500, 32767).addComponent(this.jLabel2, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel4, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1, -2, 100, -2))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1, -2, 82, -2).addGap(4, 4, 4).addComponent(this.jLabel3, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel4, -1, 50, 32767).addComponent(this.jButton1, -1, -1, 32767)).addContainerGap()));
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        this.pack();
    }
    
    private void jLabel2MouseClicked(final MouseEvent evt) {
        try {
            if (Desktop.isDesktopSupported()) {
                final Desktop d = Desktop.getDesktop();
                if (d.isSupported(Desktop.Action.BROWSE)) {
                    d.browse(new URI("http://www.facebook.com/ldgapps"));
                }
            }
        }
        catch (Exception ex) {}
    }
    
    private void jButton1ActionPerformed(final ActionEvent evt) {
        this.dispose();
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
            Logger.getLogger(Acerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Acerca.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Acerca.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Acerca.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Acerca().setVisible(true);
            }
        });
    }
}
