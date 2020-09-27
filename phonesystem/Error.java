// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Error extends JFrame
{
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    
    public Error() {
        this.initComponents();
    }
    
    public void texto(final String texto) {
        this.jLabel3.setText(texto);
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel3 = new JLabel();
        this.setDefaultCloseOperation(2);
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setBorder(new SoftBevelBorder(0));
        this.jPanel1.setForeground(new Color(255, 255, 255));
        this.jLabel2.setFont(new Font("Roboto", 1, 18));
        this.jLabel2.setForeground(new Color(172, 12, 12));
        this.jLabel2.setText("*Conectese a la red donde este el servidor");
        this.jLabel4.setBackground(new Color(173, 49, 17));
        this.jLabel4.setFont(new Font("Roboto", 1, 36));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setHorizontalAlignment(0);
        this.jLabel4.setText("Error al conectar");
        this.jLabel4.setOpaque(true);
        this.jLabel3.setFont(new Font("Roboto", 1, 18));
        this.jLabel3.setForeground(new Color(172, 12, 12));
        this.jLabel3.setText("*Compruebe que el servidor este encendido");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel4, -2, 508, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel2)).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel4, -2, 55, -2).addGap(33, 33, 33).addComponent(this.jLabel3, -2, 16, -2).addGap(38, 38, 38).addComponent(this.jLabel2, -2, 16, -2).addContainerGap(340, 32767)));
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();
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
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Error().setVisible(true);
            }
        });
    }
}
