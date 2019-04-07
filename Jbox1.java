package export;

import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;

public class Jbox1 extends javax.swing.JDialog
{
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  
  public Jbox1(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
  }
  
  public Jbox1() {
    Jbox1 dialog = new Jbox1(new javax.swing.JFrame(), true);
    dialog.addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowClosing(java.awt.event.WindowEvent e) {
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
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jLabel3 = new JLabel();
    
    setDefaultCloseOperation(2);
    setTitle("Guid d'utilisation");
    setBounds(new java.awt.Rectangle(230, 250, 0, 0));
    addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        Jbox1.this.formMouseClicked(evt);
      }
      
    });
    jLabel1.setText("Guide d'utilisation:");
    
    jLabel2.setText("-L'application n'accepte que 4 terme pour le moment.");
    
    jLabel4.setText("- Pour les terme positive on utilise la Majiscul , et pour le negatifs on utilisera la miniscul.");
    
    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
    jLabel5.setText("pour obtenir le code source ou nous soumettre des propositions   -> fb /nadir.nadjem");
    
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel3.setText("KarnaughNad v1.0:");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(jLabel2, -1, -1, 32767)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(jLabel4, -2, 431, -2)
      .addComponent(jLabel1, -2, 194, -2))
      .addGap(0, 0, 32767))))
      .addGroup(layout.createSequentialGroup()
      .addGap(90, 90, 90)
      .addComponent(jLabel3, -2, 217, -2)
      .addGap(0, 0, 32767))
      .addComponent(jLabel5, GroupLayout.Alignment.TRAILING, -1, 491, 32767));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(jLabel3)
      .addGap(9, 9, 9)
      .addComponent(jLabel1, -2, 22, -2)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jLabel4)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jLabel2, -2, 14, -2)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(jLabel5, -2, 33, -2)
      .addContainerGap()));
    

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
      Logger.getLogger(Jbox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Jbox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Jbox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Jbox1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    



    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Jbox1 dialog = new Jbox1(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }
}
