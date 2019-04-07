package export;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.PrintStream;
import java.util.Arrays;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Kmapping extends JFrame
{
  static String output = "";
  JButton[] btn = new JButton[16];
  static int[] value = new int[16];
  static int[][] A = new int[4][4];
  static int[][] checked = new int[4][4];
  
  public Kmapping() {
    initComponents();
    


    ActionListener listener = new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        if ((e.getSource() instanceof JButton)) {
          String text = ((JButton)e.getSource()).getText();
          JButton button = (JButton)e.getSource();
          String Jb = button.getName();
          




          if (text == "0")
          {
            button.setText("1");
          }
          if (text == "1")
          {
            button.setText("0");
          }
        }
      }
    };
    




    for (int i = 0; i < btn.length; i++) {
      btn[i] = new JButton("0");
      btn[i].addActionListener(listener);
      table.add(btn[i]);
    }
  }
  































































































































































































  private void initComponents()
  {
    table = new JPanel();
    CALCULER = new JButton();
    RESET = new JButton();
    text = new JLabel();
    jLabel1 = new JLabel();
    RESULTAT = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    text1 = new JLabel();
    jButton1 = new JButton();
    txt = new JTextField();
    jButton2 = new JButton();
    jButton3 = new JButton();
    
    setDefaultCloseOperation(3);
    setTitle("TABLEAU DE KARNAUGH BY NAD");
    setBounds(new java.awt.Rectangle(250, 100, 0, 0));
    setCursor(new java.awt.Cursor(0));
    setResizable(false);
    
    table.setBackground(new Color(-1, true));
    table.setLayout(new GridLayout(4, 4));
    
    CALCULER.setText("CALCULER");
    CALCULER.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Kmapping.this.CALCULERActionPerformed(evt);
      }
      
    });
    RESET.setText("RESET ");
    RESET.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Kmapping.this.RESETActionPerformed(evt);
      }
      
    });
    text.setBackground(new Color(-1, true));
    text.setFont(new Font("Dialog", 1, 18));
    
    RESULTAT.setBackground(new Color(-16711681, true));
    RESULTAT.setToolTipText("");
    
    jLabel2.setBackground(new Color(44975, true));
    jLabel2.setFont(new Font("Dialog", 0, 14));
    jLabel2.setText(" A'B'");
    
    jLabel3.setBackground(new Color(44975, true));
    jLabel3.setFont(new Font("Dialog", 0, 14));
    jLabel3.setText("A'B");
    
    jLabel4.setBackground(new Color(44975, true));
    jLabel4.setFont(new Font("Dialog", 0, 14));
    jLabel4.setText(" AB");
    
    jLabel5.setBackground(new Color(44975, true));
    jLabel5.setFont(new Font("Dialog", 0, 14));
    jLabel5.setText(" AB'");
    
    jLabel6.setBackground(new Color(44975, true));
    jLabel6.setFont(new Font("Dialog", 0, 14));
    jLabel6.setText("C'D'");
    
    jLabel7.setBackground(new Color(44975, true));
    jLabel7.setFont(new Font("Dialog", 0, 14));
    jLabel7.setText(" CD");
    
    jLabel8.setBackground(new Color(44975, true));
    jLabel8.setFont(new Font("Dialog", 0, 14));
    jLabel8.setText("CD'");
    
    jLabel9.setBackground(new Color(44975, true));
    jLabel9.setFont(new Font("Dialog", 0, 14));
    jLabel9.setText("C'D");
    
    text1.setFont(new Font("Dialog", 1, 18));
    text1.setText("SOLUTION");
    
    jButton1.setText("A propos");
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Kmapping.this.jButton1ActionPerformed(evt);
      }
      
    });
    txt.setText("Ecrire la fonction");
    txt.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent evt) {
        Kmapping.this.txtMouseClicked(evt);
      }
      
    });
    jButton2.setText("Affecter");
    jButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Kmapping.this.jButton2ActionPerformed(evt);
      }
      
    });
    jButton3.setText("Guide ");
    jButton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Kmapping.this.jButton3ActionPerformed(evt);
      }
      
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jLabel1))
      .addGroup(layout.createSequentialGroup()
      .addGap(69, 69, 69)
      .addComponent(RESULTAT, -2, 97, -2))
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(CALCULER, -2, 147, -2))
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(RESET, -2, 147, -2)))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(jLabel4, -2, 29, -2)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(jLabel5, -2, 25, -2)
      .addGap(4, 4, 4))
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(jLabel3, -1, -1, 32767)
      .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))))
      .addGap(18, 18, 18)
      .addComponent(table, -2, 361, -2)
      .addContainerGap())
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(txt, -2, 159, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jButton2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(jLabel6)
      .addGap(54, 54, 54)
      .addComponent(jLabel9, -2, 25, -2)
      .addGap(49, 49, 49)
      .addComponent(jLabel7, -2, 25, -2)
      .addGap(49, 49, 49)
      .addComponent(jLabel8, -2, 25, -2)
      .addGap(67, 67, 67))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 0, 32767)
      .addComponent(text1, -2, 131, -2)
      .addGap(50, 50, 50)
      .addComponent(text, -2, 356, -2)
      .addGap(41, 41, 41))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(jButton3)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addComponent(jButton1)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addGroup(layout.createSequentialGroup()
      .addGap(28, 28, 28)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(jLabel8, -2, 25, -2)
      .addComponent(jLabel7, -2, 25, -2)
      .addComponent(jLabel9, -2, 25, -2)
      .addComponent(jLabel6, -2, 25, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(table, -2, 276, -2)
      .addGap(37, 37, 37))
      .addGroup(layout.createSequentialGroup()
      .addGap(19, 19, 19)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(txt, -2, -1, -2)
      .addComponent(jButton2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(CALCULER, -2, 36, -2)
      .addComponent(jLabel2, -2, 25, -2))
      .addGap(28, 28, 28)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(RESET, -2, 36, -2)
      .addComponent(jLabel3, -2, 25, -2))
      .addGap(42, 42, 42)
      .addComponent(jLabel4, -2, 25, -2)
      .addGap(39, 39, 39)
      .addComponent(jLabel5, -2, 25, -2)
      .addGap(51, 51, 51)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(jLabel1)
      .addComponent(RESULTAT, -2, 14, -2))))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(text1, -2, 36, -2)
      .addComponent(text, -2, 36, -2))
      .addGap(35, 35, 35)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(jButton1)
      .addComponent(jButton3))));
    

    pack();
  }
  


  private void RESETActionPerformed(ActionEvent evt)
  {
    txt.setText("");
    haha();
    text.setText("");
    int l = btn.length;
    for (int i = 0; i < l; i++) {
      btn[i].setText("0");
    }
    
    output = "";
  }
  

  private void CALCULERActionPerformed(ActionEvent evt)
  {
    haha();
    boolean trouve = true;
    boolean trouve2 = true;
    






    for (int i = 0; i < value.length; i++) {
      if (value[i] != 0) trouve = false;
      if (value[i] != 1) trouve2 = false;
    }
    if ((trouve) || (trouve2)) {
      if (trouve) { text.setText("0");
      } else {
        text.setText("1");
      }
      
    }
    else
    {
      text.setText("COMPUTE A eté appuyer");
      output = "";
      compute();
      
      text.setText(output.substring(1));
    }
  }
  

  private void jButton1ActionPerformed(ActionEvent evt)
  {
    JDialog d = new Jbox();
    d.setDefaultCloseOperation(2);
  }
  



  private void jButton2ActionPerformed(ActionEvent evt)
  {
    if ((txt.getText().equals("")) || (txt.getText().equals("Ecrire la fonction"))) {
      System.out.println("Erreur !");
    }
    else {
      btn();
      btn();
    }
  }
  






  private void btn()
  {
    chargement();
    str = txt.getText();
    

    System.out.println(str);
    
    String[] parts = str.split("\\+");
    int[] vsss = new int[16];
    int[] vss = new int[16];
    System.out.println(parts.length);
    if (parts.length >= 1) {
      vss = reduction(parts[0]);
      vsss = Arrays.copyOf(vss, 16);
    }
    
    if (parts.length >= 2)
    {
      vss = reduction(parts[1]);
      
      vsss = rassembler(vss, vsss);
    }
    

    if (parts.length >= 3) {
      vss = reduction(parts[2]);
      vsss = rassembler(vss, vsss);
    }
    

    if (parts.length >= 4) {
      vss = reduction(parts[3]);
      vsss = rassembler(vss, vsss);
      for (int i = 0; i < 16; i++) { System.out.println("3   " + vsss[i]);
      }
    }
    
    for (int i = 0; i < 16; i++)
    {
      String n = String.valueOf(value[i]);
      btn[i].setText(n);
    }
    

    value = Arrays.copyOf(vsss, 16);
  }
  



  private void txtMouseClicked(MouseEvent evt)
  {
    clik += 1;
    if (clik == 1) {
      txt.setText("");
    }
  }
  


  private void jButton3ActionPerformed(ActionEvent evt)
  {
    JDialog d2 = new Jbox1();
    d2.setDefaultCloseOperation(2);
  }
  

  public void chargement()
  {
    for (int i = 0; i < 16; i++) {
      st[i] = 0;
      v[i] = 1;
      if (i < 8) {
        a[i] = 0;
        a1[i] = 1;
      }
      else {
        a[i] = 1;
        a1[i] = 0;
      }
      
      if ((i > 3) && (i < 12)) {
        b[i] = 1;
        b1[i] = 0;
      }
      else
      {
        b1[i] = 1;
        b[i] = 0;
      }
      
      if ((i == 2) || (i == 3) || (i == 6) || (i == 7) || (i == 10) || (i == 11) || (i == 14) || (i == 15)) {
        c[i] = 1;
        c1[i] = 0;
      }
      else {
        c[i] = 0;
        c1[i] = 1;
      }
      
      if ((i == 1) || (i == 2) || (i == 5) || (i == 6) || (i == 9) || (i == 10) || (i == 13) || (i == 14)) {
        d[i] = 1;
        d1[i] = 0;
      }
      else {
        d[i] = 0;
        d1[i] = 1;
      }
    }
  }
  

  public int[] compar(int[] v, int[] a)
  {
    int[] rezul = new int[16];
    for (int i = 0; i < 16; i++) {
      if ((v[i] == 1) && (a[i] == 1)) {
        rezul[i] = 1;
      } else
        rezul[i] = 0;
    }
    return rezul;
  }
  
  public int[] reduction(String str)
  {
    chargement();
    
    int l = str.length();
    for (int i = 0; i < l; i++) {
      if (String.valueOf(str.charAt(i)).equals("A"))
      {
        v = compar(v, a);
      }
      if (String.valueOf(str.charAt(i)).equals("B"))
      {
        v = compar(v, b);
      }
      if (String.valueOf(str.charAt(i)).equals("C"))
      {
        v = compar(v, c);
      }
      if (String.valueOf(str.charAt(i)).equals("D"))
      {
        v = compar(v, d);
      }
      if (String.valueOf(str.charAt(i)).equals("a"))
      {
        v = compar(v, a1);
      }
      if (String.valueOf(str.charAt(i)).equals("b"))
      {
        v = compar(v, b1);
      }
      
      if (String.valueOf(str.charAt(i)).equals("c"))
      {
        v = compar(v, c1);
      }
      if (String.valueOf(str.charAt(i)).equals("d"))
      {
        v = compar(v, d1);
      }
    }
    

    return v;
  }
  







  public int[] rassembler(int[] v, int[] s)
  {
    int[] sts = new int[16];
    for (int i = 0; i < 16; i++) {
      if ((v[i] == 1) || (s[i] == 1)) sts[i] = 1; else {
        sts[i] = 0;
      }
    }
    
    return sts;
  }
  



  static void compute()
  {
    
    


    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        if ((A[i][j] == 1) && (checked[i][j] == 0))
        {
          int pass8 = check8(i, j);
          if (pass8 == 0)
          {
            int pass4 = check4(i, j);
            if (pass4 == 0)
            {
              int pass2 = check2(i, j);
              if (pass2 == 0)
              {
                nogrouping(i, j);
              }
            }
          }
        }
      }
    }
  }
  


  static int check8(int r, int c)
  {
    int result = 0;
    
    if ((A[r][0] == 1) && (A[r][1] == 1) && (A[r][2] == 1) && (A[r][3] == 1) && (A[((r + 1) % 4)][0] == 1) && (A[((r + 1) % 4)][1] == 1) && (A[((r + 1) % 4)][2] == 1) && (A[((r + 1) % 4)][3] == 1))
    {
      String local = "";
      if (r == 0)
      {
        local = "A'";
      }
      if (r == 1)
      {
        local = "B";
      }
      if (r == 2)
      {
        local = "A";
      }
      if (r == 3)
      {
        local = "B'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][0] = 1;checked[r][1] = 1;checked[r][2] = 1;checked[r][3] = 1;
      checked[((r + 1) % 4)][0] = 1;checked[((r + 1) % 4)][1] = 1;checked[((r + 1) % 4)][2] = 1;checked[((r + 1) % 4)][3] = 1;



    }
    else if ((A[r][0] == 1) && (A[r][1] == 1) && (A[r][2] == 1) && (A[r][3] == 1) && (A[((4 + (r - 1)) % 4)][0] == 1) && (A[((4 + (r - 1)) % 4)][1] == 1) && (A[((4 + (r - 1)) % 4)][2] == 1) && (A[((4 + (r - 1)) % 4)][3] == 1))
    {
      String local = "";
      if (r == 0)
      {
        local = "B'";
      }
      if (r == 1)
      {
        local = "A'";
      }
      if (r == 2)
      {
        local = "B";
      }
      if (r == 3)
      {
        local = "A";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][0] = 1;checked[r][1] = 1;checked[r][2] = 1;checked[r][3] = 1;
      checked[((4 + (r - 1)) % 4)][0] = 1;checked[((4 + (r - 1)) % 4)][1] = 1;checked[((4 + (r - 1)) % 4)][2] = 1;checked[((4 + (r - 1)) % 4)][3] = 1;

    }
    else if ((A[0][c] == 1) && (A[1][c] == 1) && (A[2][c] == 1) && (A[3][c] == 1) && (A[0][((c + 1) % 4)] == 1) && (A[1][((c + 1) % 4)] == 1) && (A[2][((c + 1) % 4)] == 1) && (A[3][((c + 1) % 4)] == 1))
    {
      String local = "";
      if (c == 0)
      {
        local = "C'";
      }
      if (c == 1)
      {
        local = "D";
      }
      if (c == 2)
      {
        local = "C";
      }
      if (c == 3)
      {
        local = "D'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[0][c] = 1;checked[1][c] = 1;checked[2][c] = 1;checked[3][c] = 1;
      checked[0][((c + 1) % 4)] = 1;checked[1][((c + 1) % 4)] = 1;checked[2][((c + 1) % 4)] = 1;checked[3][((c + 1) % 4)] = 1;

    }
    else if ((A[0][c] == 1) && (A[1][c] == 1) && (A[2][c] == 1) && (A[3][c] == 1) && (A[0][((4 + (c - 1)) % 4)] == 1) && (A[1][((4 + (c - 1)) % 4)] == 1) && (A[2][((4 + (c - 1)) % 4)] == 1) && (A[3][((4 + (c - 1)) % 4)] == 1))
    {
      String local = "";
      if (c == 0)
      {
        local = "D'";
      }
      if (c == 1)
      {
        local = "C'";
      }
      if (c == 2)
      {
        local = "D";
      }
      if (c == 3)
      {
        local = "C";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[0][c] = 1;checked[1][c] = 1;checked[2][c] = 1;checked[3][c] = 1;
      checked[0][((4 + (c - 1)) % 4)] = 1;checked[1][((4 + (c - 1)) % 4)] = 1;checked[2][((4 + (c - 1)) % 4)] = 1;checked[3][((4 + (c - 1)) % 4)] = 1;
    }
    
    return result;
  }
  

  static int check4(int r, int c)
  {
    int result = 0;
    String local = "";
    
    if ((A[r][0] == 1) && (A[r][1] == 1) && (A[r][2] == 1) && (A[r][3] == 1))
    {
      if (r == 0)
      {
        local = "A'B'";
      }
      if (r == 1)
      {
        local = "A'B";
      }
      if (r == 2)
      {
        local = "AB";
      }
      if (r == 3)
      {
        local = "AB'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][0] = 1;checked[r][1] = 1;checked[r][2] = 1;checked[r][3] = 1;

    }
    else if ((A[0][c] == 1) && (A[1][c] == 1) && (A[2][c] == 1) && (A[3][c] == 1))
    {
      if (c == 0)
      {
        local = "C'D'";
      }
      if (c == 1)
      {
        local = "C'D";
      }
      if (c == 2)
      {
        local = "CD";
      }
      if (c == 3)
      {
        local = "CD'";
      }
      
      output = output + "+" + local;
      result = 1;
      
      checked[0][c] = 1;checked[1][c] = 1;checked[2][c] = 1;checked[3][c] = 1;

    }
    else if ((A[r][c] == 1) && (A[r][((c + 1) % 4)] == 1) && (A[((r + 1) % 4)][c] == 1) && (A[((r + 1) % 4)][((c + 1) % 4)] == 1))
    {
      if (r == 0)
      {
        local = "A'";
      }
      if (r == 1)
      {
        local = "B";
      }
      if (r == 2)
      {
        local = "A";
      }
      if (r == 3)
      {
        local = "B'";
      }
      if (c == 0)
      {
        local = local + "C'";
      }
      if (c == 1)
      {
        local = local + "D";
      }
      if (c == 2)
      {
        local = local + "C";
      }
      if (c == 3)
      {
        local = local + "D'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][c] = 1;checked[r][((c + 1) % 4)] = 1;checked[((r + 1) % 4)][c] = 1;checked[((r + 1) % 4)][((c + 1) % 4)] = 1;

    }
    else if ((A[r][((4 + (c - 1)) % 4)] == 1) && (A[r][c] == 1) && (A[((r + 1) % 4)][((4 + (c - 1)) % 4)] == 1) && (A[((r + 1) % 4)][c] == 1))
    {
      if (r == 0)
      {
        local = "A'";
      }
      if (r == 1)
      {
        local = "B";
      }
      if (r == 2)
      {
        local = "A";
      }
      if (r == 3)
      {
        local = "B'";
      }
      if (c == 0)
      {
        local = local + "D'";
      }
      if (c == 1)
      {
        local = local + "C'";
      }
      if (c == 2)
      {
        local = local + "D";
      }
      if (c == 3)
      {
        local = local + "C'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][((4 + (c - 1)) % 4)] = 1;checked[r][c] = 1;checked[((r + 1) % 4)][((4 + (c - 1)) % 4)] = 1;checked[((r + 1) % 4)][c] = 1;


    }
    else if ((A[((4 + (r - 1)) % 4)][((4 + (c - 1)) % 4)] == 1) && (A[((4 + (r - 1)) % 4)][c] == 1) && (A[r][((4 + (c - 1)) % 4)] == 1) && (A[r][c] == 1))
    {
      if (r == 0)
      {
        local = "B'";
      }
      if (r == 1)
      {
        local = "A'";
      }
      if (r == 2)
      {
        local = "B";
      }
      if (r == 3)
      {
        local = "A";
      }
      if (c == 0)
      {
        local = local + "D'";
      }
      if (c == 1)
      {
        local = local + "C'";
      }
      if (c == 2)
      {
        local = local + "D";
      }
      if (c == 3)
      {
        local = local + "C'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[((4 + (r - 1)) % 4)][((4 + (c - 1)) % 4)] = 1;checked[((4 + (r - 1)) % 4)][c] = 1;checked[r][((4 + (c - 1)) % 4)] = 1;checked[r][c] = 1;

    }
    else if ((A[((4 + (r - 1)) % 4)][c] == 1) && (A[((4 + (r - 1)) % 4)][((c + 1) % 4)] == 1) && (A[r][c] == 1) && (A[r][((c + 1) % 4)] == 1))
    {
      if (r == 0)
      {
        local = "B'";
      }
      if (r == 1)
      {
        local = "A'";
      }
      if (r == 2)
      {
        local = "B";
      }
      if (r == 3)
      {
        local = "A";
      }
      if (c == 0)
      {
        local = local + "C'";
      }
      if (c == 1)
      {
        local = local + "D";
      }
      if (c == 2)
      {
        local = local + "C";
      }
      if (c == 3)
      {
        local = local + "D'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[((4 + (r - 1)) % 4)][c] = 1;checked[((4 + (r - 1)) % 4)][((c + 1) % 4)] = 1;checked[r][c] = 1;checked[r][((c + 1) % 4)] = 1;
    }
    
    return result;
  }
  
  static int check2(int r, int c)
  {
    int result = 0;
    String local = "";
    
    if ((A[r][c] == 1) && (A[r][((c + 1) % 4)] == 1))
    {
      if (r == 0)
      {
        local = "A'B'";
      }
      if (r == 1)
      {
        local = "A'B";
      }
      if (r == 2)
      {
        local = "AB";
      }
      if (r == 3)
      {
        local = "AB'";
      }
      if (c == 0)
      {
        local = local + "C'";
      }
      if (c == 1)
      {
        local = local + "D";
      }
      if (c == 2)
      {
        local = local + "C";
      }
      if (c == 3)
      {
        local = local + "D'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][c] = 1;checked[r][((c + 1) % 4)] = 1;


    }
    else if ((A[r][((4 + (c - 1)) % 4)] == 1) && (A[r][c] == 1))
    {
      if (r == 0)
      {
        local = "A'B'";
      }
      if (r == 1)
      {
        local = "A'B";
      }
      if (r == 2)
      {
        local = "AB";
      }
      if (r == 3)
      {
        local = "AB'";
      }
      if (c == 0)
      {
        local = local + "D'";
      }
      if (c == 1)
      {
        local = local + "C'";
      }
      if (c == 2)
      {
        local = local + "D";
      }
      if (c == 3)
      {
        local = local + "C";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][((4 + (c - 1)) % 4)] = 1;checked[r][c] = 1;

    }
    else if ((A[r][c] == 1) && (A[((r + 1) % 4)][c] == 1))
    {
      if (r == 0)
      {
        local = "A'";
      }
      if (r == 1)
      {
        local = "B";
      }
      if (r == 2)
      {
        local = "A";
      }
      if (r == 3)
      {
        local = "B'";
      }
      if (c == 0)
      {
        local = local + "C'D'";
      }
      if (c == 1)
      {
        local = local + "C'D";
      }
      if (c == 2)
      {
        local = local + "CD";
      }
      if (c == 3)
      {
        local = local + "CD'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][c] = 1;checked[((r + 1) % 4)][c] = 1;

    }
    else if ((A[r][c] == 1) && (A[((4 + (r - 1)) % 4)][c] == 1))
    {
      if (r == 0)
      {
        local = "B'";
      }
      if (r == 1)
      {
        local = "A'";
      }
      if (r == 2)
      {
        local = "B";
      }
      if (r == 3)
      {
        local = "A";
      }
      if (c == 0)
      {
        local = local + "C'D'";
      }
      if (c == 1)
      {
        local = local + "C'D";
      }
      if (c == 2)
      {
        local = local + "CD";
      }
      if (c == 3)
      {
        local = local + "CD'";
      }
      output = output + "+" + local;
      result = 1;
      
      checked[r][c] = 1;checked[((4 + (r - 1)) % 4)][c] = 1;
    }
    return result;
  }
  
  static void nogrouping(int r, int c)
  {
    String local = "";
    if (r == 0)
    {
      local = "A'B'";
    }
    if (r == 1)
    {
      local = "A'B";
    }
    if (r == 2)
    {
      local = "AB";
    }
    if (r == 3)
    {
      local = "AB'";
    }
    if (c == 0)
    {
      local = local + "C'D'";
    }
    if (c == 1)
    {
      local = local + "C'D";
    }
    if (c == 2)
    {
      local = local + "CD";
    }
    if (c == 3)
    {
      local = local + "CD'";
    }
    output = output + "+" + local;
    
    checked[r][c] = 1;
  }
  

  static void initialize()
  {
    int count = 0;
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        A[i][j] = value[count];
        checked[i][j] = 0;
        count++;
      } }
  }
  
  public void haha() {
    for (int i = 0; i < value.length; i++) {
      if (btn[i].getText() == "x")
      {
        value[i] = 2;
      }
      else {
        value[i] = Integer.parseInt(btn[i].getText());
      }
    }
  }
  



  public static void main(String[] args)
  {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Kmapping().setVisible(true);
      }
    });
  }
  
  int clik = 0;
  static String str;
  static int[] st = new int[16];
  static int[] v = new int[16];
  static int[] a = new int[16];
  static int[] b = new int[16];
  static int[] a1 = new int[16];
  static int[] b1 = new int[16];
  static int[] c = new int[16];
  static int[] c1 = new int[16];
  
  static int[] d = new int[16];
  static int[] d1 = new int[16];
  private JButton CALCULER;
  private JButton RESET;
  private JLabel RESULTAT;
  private JButton jButton1;
  private JButton jButton2;
  private JButton jButton3;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel table;
  private JLabel text;
  private JLabel text1;
  private JTextField txt;
}
