package export;

import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;

public class Jbox extends javax.swing.JDialog
{
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  
  public Jbox(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }
  
  public Jbox() {
    Jbox dialog = new Jbox(new javax.swing.JFrame(), true);
    dialog.addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        dispose();
      }
    });
    dialog.setVisible(true);
  }
  
  @javax.xml.ws.Action
  public void closeAboutBox() { dispose(); }
  








  private void initComponents()
  {
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    
    setDefaultCloseOperation(2);
    setTitle("About us");
    setBounds(new java.awt.Rectangle(230, 250, 0, 0));
    addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        Jbox.this.formMouseClicked(evt);
      }
      
    });
    jLabel1.setText("V 1.0  Devlopper par Nad  2014");
    
    jLabel2.setText("Original functions  by Mohammed Shakat");
    
    jLabel3.setFont(new java.awt.Font("Verdana", 1, 12));
    jLabel3.setText("NadjemNadir47@gmail.com");
    
    jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12));
    jLabel4.setText("www.nadjemnadir.fr");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(26, 26, 26)
      .addComponent(jLabel1, -2, 194, -2)
      .addGap(0, 0, 32767))
      .addGroup(layout.createSequentialGroup()
      .addGap(143, 143, 143)
      .addComponent(jLabel2, -1, 242, 32767)
      .addContainerGap())
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jLabel3, -2, 144, -2)
      .addGap(55, 55, 55)
      .addComponent(jLabel4, -2, 151, -2)
      .addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jLabel1, -2, 22, -2)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(jLabel2)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, 32767)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
      .addComponent(jLabel3)
      .addComponent(jLabel4))
      .addGap(4, 4, 4)));
    

    pack();
  }
  
  private void formMouseClicked(java.awt.event.MouseEvent evt) {
    dispose();
  }
  






  public static void main(String[] args)
  {
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Jbox.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Jbox.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Jbox.class.getName()).log(Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Jbox.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Jbox dialog = new Jbox(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }
}
