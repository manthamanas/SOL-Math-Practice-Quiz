import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class PanelBuskeyLab extends JPanel
{
   private JLabel label; //a private field 
   
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.CYAN.brighter());
      g.fillRect(0, 0, getWidth(), getHeight());
      //g.drawImage(SOL1.getImage(), 0, 0, getWidth(), getHeight(), null);
      ImageIcon SOL1 = new ImageIcon("SOL1.PNG");
      ImageIcon SOL2 = new ImageIcon("SOL2.PNG");
      ImageIcon SOL3 = new ImageIcon("SOL3.PNG");
      ImageIcon SOL4 = new ImageIcon("SOL4.PNG");
      ImageIcon SOL5 = new ImageIcon("SOL5.PNG");
      ImageIcon SOL6 = new ImageIcon("SOL6.PNG");
      ImageIcon SOL7 = new ImageIcon("SOL7.PNG");
      ImageIcon SOL8 = new ImageIcon("SOL8.PNG");
      ImageIcon SOL9 = new ImageIcon("SOL9.PNG");
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
      
      QuestionBox sol1 = new QuestionBox("SOL1.PNG", "B");
      QuestionBox sol2 = new QuestionBox("SOL2.PNG", "B");
      QuestionBox sol3 = new QuestionBox("SOL3.PNG", "B");
      QuestionBox sol4 = new QuestionBox("SOL4.PNG", "B");
      QuestionBox sol5 = new QuestionBox("SOL5.PNG", "B");
      QuestionBox sol6 = new QuestionBox("SOL6.PNG", "B");
      QuestionBox sol7 = new QuestionBox("SOL7.PNG", "B");
      QuestionBox sol8 = new QuestionBox("SOL8.PNG", "B");
      QuestionBox sol9 = new QuestionBox("SOL9.PNG", "B");
      QuestionBox sol10 = new QuestionBox("SOL10.PNG", "B");
      QuestionBox sol11 = new QuestionBox("SOL11.PNG", "B");
      QuestionBox sol12 = new QuestionBox("SOL12.PNG", "B");
      
      //ImageIcon SOL1 = new ImageIcon("SOL1.PNG");
         //JLabel label1 = new JLabel(SOL1);
      add(sol1.getLabelName());
   
      JButton A = new JButton("A");
      JButton B = new JButton("B");
      JButton C = new JButton("C");
      JButton D = new JButton("D");
      //before adding, find sol png to add
      Dimension d = new Dimension(100,100);
      A.setPreferredSize(d);
      B.setPreferredSize(d);
      C.setPreferredSize(d);
      D.setPreferredSize(d);
      A.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               boolean check = QuestionBox.answerCheck("A");
               if(check)
               {
                  System.out.println("Correct Answer");
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }    
            }
         });
   
      B.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               boolean check = QuestionBox.answerCheck("B");
               if(check)
               {
                  System.out.println("Correct Answer");
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }    
            }
         });
      C.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               boolean check = QuestionBox.answerCheck("C");
               if(check)
               {
                  System.out.println("Correct Answer");
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }    
            }
         });
   
      D.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               boolean check = QuestionBox.answerCheck("D");
               if(check)
               {
                  System.out.println("Correct Answer");
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }    
            }
         });
   
      
      add(A);
      add(B);
      add(C);
      add(D);
      
      
   }  
}
