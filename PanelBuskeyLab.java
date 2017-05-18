import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class PanelBuskeyLab extends JPanel
{
   private JLabel label; //a private field 
   
   public void paintComponent(Graphics g)
   {
      ImageIcon SOL1 = new ImageIcon("SOL1.PNG");
      g.drawImage(SOL1.getImage(), 0, 0, getWidth(), getHeight(), null);
      ImageIcon SOL2 = new ImageIcon("SOL2.PNG");
      ImageIcon SOL3 = new ImageIcon("SOL3.PNG");
      ImageIcon SOL4 = new ImageIcon("SOL4.PNG");
      ImageIcon SOL5 = new ImageIcon("SOL5.PNG");
      ImageIcon SOL6 = new ImageIcon("SOL6.PNG");
      ImageIcon SOL7 = new ImageIcon("SOL7.PNG");
      ImageIcon SOL8 = new ImageIcon("SOL8.PNG");
      ImageIcon SOL9 = new ImageIcon("SOL9.PNG");
      //g.drawImage(SOL9.getImage(), 0, 0, getWidth(), getHeight(), null);
      ImageIcon SOL10 = new ImageIcon("SOL10.PNG");
      ImageIcon SOL11 = new ImageIcon("SOL11.PNG");
      ImageIcon SOL12 = new ImageIcon("SOL12.PNG");

     /*ImageIcon[] sol = new ImageIcon[12];
     //sol[0] = SOL1;
     sol[1] = SOL2;
     sol[2] = SOL3;
     sol[3] = SOL4;
     sol[4] = SOL5;
     sol[5] = SOL6;
     sol[6] = SOL7;
     sol[7] = SOL8;
     sol[8] = SOL9;
     sol[9] = SOL10;
     sol[10] = SOL11;
     sol[11] = SOL12;*/
     
   }

   public PanelBuskeyLab()
   {
      setLayout(new FlowLayout());
      
      /*ImageIcon SOL1 = new ImageIcon("SOL1.PNG");
         JLabel label1 = new JLabel(SOL1);
         add(label1);*/

      JButton A = new JButton("A");
      JButton B = new JButton("B");
      JButton C = new JButton("C");
      JButton D = new JButton("D");
      
      //A.addActionListener(new ButtonListener());
     //B.addActionListener(new ButtonListener());
      //C.addActionListener(new ButtonListener());
      //D.addActionListener(new ButtonListener());
      setLayout(new GridLayout(16,1,1,1));
      JLabel label1 = new JLabel("");
      JLabel label2 = new JLabel("");
      JLabel label3 = new JLabel("");
      JLabel label4 = new JLabel("");
      JLabel label5 = new JLabel("");
      JLabel label6 = new JLabel("");
      JLabel label7 = new JLabel("");
      JLabel label8 = new JLabel("");
      JLabel label9 = new JLabel("");
      JLabel label10 = new JLabel("");
      JLabel label11 = new JLabel("");
      JLabel label12 = new JLabel("");
      add(label1);
      add(label2);
      add(label3);
      add(label4);
      add(label5);
      add(label6);
      add(label7);
      add(label8);
      add(label9);
      add(label10);
      add(label11);
      add(label12);
      add(A);
      add(B);
      add(C);
      add(D);
      
      
   }  
}
