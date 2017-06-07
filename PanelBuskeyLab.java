import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelBuskeyLab extends JPanel
{
   int score = 0;
   int counter = 0;
   int val;
   int[] integer = new int[10];
   private JLabel label; //a private field 
   
   JButton A = new JButton("A");
   JButton B = new JButton("B");
   JButton C = new JButton("C");
   JButton D = new JButton("D");
   JButton Quit = new JButton("Quit");
   JButton Restart = new JButton("Restart");
   JButton NextQuestion = new JButton("Next Question");
   
   public boolean checkNum()
   {
      val = (int)(Math.random() * 12);
      for(int i = 0; i < integer.length; i++)
      {
         if(val == integer[i])
         {
            return false;
         }
      }
      integer[counter] = val;
      return true;
   }
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.CYAN.brighter());
      g.fillRect(0, 0, getWidth(), getHeight());
   }

   public PanelBuskeyLab()
   {
      setLayout(new FlowLayout());
      
      while(!checkNum());
            
      QuestionBox[] solQuestions = new QuestionBox[12];
      solQuestions[0] = new QuestionBox("SOL1.PNG", "A");
      solQuestions[1] = new QuestionBox("SOL2.PNG", "B");
      solQuestions[2] = new QuestionBox("SOL3.PNG", "B");
      solQuestions[3] = new QuestionBox("SOL4.PNG", "A");
      solQuestions[4] = new QuestionBox("SOL5.PNG", "A");
      solQuestions[5] = new QuestionBox("SOL6.PNG", "D");
      solQuestions[6] = new QuestionBox("SOL7.PNG", "D");
      solQuestions[7] = new QuestionBox("SOL8.PNG", "B");
      solQuestions[8] = new QuestionBox("SOL9.PNG", "C");
      solQuestions[9] = new QuestionBox("SOL10.PNG", "C");
      solQuestions[10] = new QuestionBox("SOL11.PNG", "D");
      solQuestions[11] = new QuestionBox("SOL12.PNG", "C");
    
         
      //before adding, find sol png to add
      add(solQuestions[val].getLabelName());
         
      Dimension d = new Dimension(100,100);
      A.setPreferredSize(d);
      B.setPreferredSize(d);
      C.setPreferredSize(d);
      D.setPreferredSize(d);
      
      A.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               System.out.println("A");
               boolean check = solQuestions[val].answerCheck("A");
               if(check == true)
               {
                  System.out.println("Correct Answer");
                  score++;
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }
               remove(A);
               remove(B);
               remove(C);
               remove(D);
               repaint();
               counter++;
               String CorAns = solQuestions[val].getCorrectAnswer();
               JLabel correctAns = new JLabel("The correct answer is " + CorAns + ".\n Your answer was A.");
               JLabel scoreKeeper = new JLabel("Score: " + score);
               correctAns.setFont(new Font("", Font.BOLD, 40));
               correctAns.setForeground(Color.red); 
               setLayout(new FlowLayout());
               scoreKeeper.setFont(new Font("", Font.BOLD, 40));
               scoreKeeper.setForeground(Color.red);
               add(correctAns);
               add(scoreKeeper);
               add(NextQuestion);
               repaint();
               revalidate();
                    
                                
            }
         });
   
      B.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               System.out.println("B");
               boolean check = solQuestions[val].answerCheck("B");
               if(check == true)
               {
                  System.out.println("Correct Answer");
                  score++;
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }
               remove(A);
               remove(B);
               remove(C);
               remove(D);
               repaint();
               counter++;
               String CorAns = solQuestions[val].getCorrectAnswer();
               JLabel correctAns = new JLabel("The correct answer is " + CorAns + ".\n Your answer was B.");
               JLabel scoreKeeper = new JLabel("Score: " + score);
               correctAns.setFont(new Font("", Font.BOLD, 40));
               correctAns.setForeground(Color.red); 
               setLayout(new FlowLayout());
               scoreKeeper.setFont(new Font("", Font.BOLD, 40));
               scoreKeeper.setForeground(Color.red);
               add(correctAns);
               add(scoreKeeper);
               add(NextQuestion);
               repaint();
               revalidate();        
            }
         });
      C.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               System.out.println("C");
               boolean check = solQuestions[val].answerCheck("C");
               if(check == true)
               {
                  System.out.println("Correct Answer");
                  score++;
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }
               remove(A);
               remove(B);
               remove(C);
               remove(D);
               repaint();
               counter++;
               String CorAns = solQuestions[val].getCorrectAnswer();
               JLabel correctAns = new JLabel("The correct answer is " + CorAns + ".\n Your answer was C.");
               JLabel scoreKeeper = new JLabel("Score: " + score);
               correctAns.setFont(new Font("", Font.BOLD, 40));
               correctAns.setForeground(Color.red); 
               setLayout(new FlowLayout());
               scoreKeeper.setFont(new Font("", Font.BOLD, 40));
               scoreKeeper.setForeground(Color.red);
               add(correctAns);
               add(scoreKeeper);
               add(NextQuestion);
               repaint();
               revalidate();
            }
         });
   
      D.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               System.out.println("D");
               boolean check = solQuestions[val].answerCheck("D");
               if(check == true)
               {
                  System.out.println("Correct Answer");
                  score++;
               }
               else
               {   
                  System.out.println("Wrong Answer");
               }
               remove(A);
               remove(B);
               remove(C);
               remove(D);
               repaint();
               counter++;
               String CorAns = solQuestions[val].getCorrectAnswer();
               JLabel correctAns = new JLabel("The correct answer is " + CorAns + ".\n Your answer was D.");
               JLabel scoreKeeper = new JLabel("Score: " + score);
               correctAns.setFont(new Font("", Font.BOLD, 40));
               correctAns.setForeground(Color.red); 
               setLayout(new FlowLayout());
               scoreKeeper.setFont(new Font("", Font.BOLD, 40));
               scoreKeeper.setForeground(Color.red);
               add(correctAns);
               add(scoreKeeper);
               add(NextQuestion);
               repaint();
               revalidate();
                
            }
         });
      Quit.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               System.exit(0);
            }
         });
      Restart.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               removeAll();
               repaint();
               score = 0;
               counter = 0;
               val = 0;
               for(int k = 0; k < integer.length; k++)
               {
                  integer[k] = -1;
               }
               while(!checkNum());
               add(solQuestions[val].getLabelName());
               add(A);
               add(B);
               add(C);
               add(D);
               repaint();
               revalidate();
               
               
            }
         });
      NextQuestion.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               if(counter >= 10)
               {
                  removeAll();
                  repaint();
                  JLabel scoreKeeper = new JLabel("Final Score: " + score + "/10");
                  scoreKeeper.setFont(new Font("", Font.BOLD, 40));
                  scoreKeeper.setForeground(Color.red);
                  JLabel lose = new JLabel("Wow....you're pretty bad at this");
                  lose.setFont(new Font("Lucida Calligraphy", Font.BOLD, 50));
                  lose.setForeground(Color.black);
                  JLabel win = new JLabel("Eh...you can do better");
                  win.setFont(new Font("Lucida Calligraphy", Font.BOLD, 60));
                  win.setForeground(Color.black);
                  add(scoreKeeper);
                  add(Quit);
                  add(Restart);
                  if(score < 10)
                  {
                     add(lose);
                  }
                  else
                  {
                     add(win);
                  }
                  repaint();
                  revalidate();
               }
               else
               {
                  removeAll();
                  repaint();
                  revalidate();
                  while(!checkNum());
                  add(solQuestions[val].getLabelName());            
                  add(A);
                  add(B);
                  add(C);
                  add(D);
                  repaint();
                  revalidate();
               
               }
            
            }
         });
   
      add(A);
      add(B);
      add(C);
      add(D);
      
      
   }  
}
