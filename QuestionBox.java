import javax.swing.*;

public class QuestionBox
{
   static String imageName, answer;
   JLabel label1;
   ImageIcon SOL1;
   
   public QuestionBox(String image, String ans)
   {
      imageName = image;
      answer = ans;
      SOL1 = new ImageIcon(imageName);
      label1 = new JLabel(SOL1);

      
   }
   public JLabel getLabelName()
   {
      return label1;
   }
   public static boolean answerCheck(String userAnswer)
   {
      boolean correct = answer.equals(userAnswer);
      
      return correct;
   }   
}