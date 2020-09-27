// 
// Decompiled by Procyon v0.5.36
// 

package phonesystem;

import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class cargar extends JFrame
{
    private JLabel jLabel31;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JProgressBar jProgressBar1;
    
    public cargar() {
        this.initComponents();
        this.setSize(402, 300);
        this.jProgressBar1.setIndeterminate(true);
    }
    
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel4 = new JLabel();
        this.jProgressBar1 = new JProgressBar();
        this.jLabel31 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(18, 51, 144));
        this.setUndecorated(true);
        this.jPanel1.setBackground(new Color(18, 51, 144));
        this.jLabel4.setBackground(new Color(0, 0, 0));
        this.jLabel4.setFont(new Font("Roboto", 1, 36));
        this.jLabel4.setForeground(new Color(255, 255, 255));
        this.jLabel4.setHorizontalAlignment(0);
        this.jLabel4.setText("Conectando al sevidor");
        this.jProgressBar1.setBackground(new Color(255, 255, 255));
        this.jProgressBar1.setForeground(new Color(14, 87, 194));
        this.jProgressBar1.setBorder(null);
        this.jLabel31.setFont(new Font("Roboto", 1, 14));
        this.jLabel31.setForeground(new Color(255, 255, 255));
        this.jLabel31.setHorizontalAlignment(0);
        this.jLabel31.setText("Por favor espere...");
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4, -1, 402, 32767).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jProgressBar1, -1, -1, 32767).addContainerGap()).addComponent(this.jLabel31, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel4, -2, 105, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel31).addGap(33, 33, 33).addComponent(this.jProgressBar1, -2, -1, -2).addGap(0, 127, 32767)));
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
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
            Logger.getLogger(cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(cargar.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(cargar.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(cargar.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cargar().setVisible(true);
            }
        });
    }
}
