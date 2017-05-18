import javax.swing.JFrame;

public class BuskeyMathLab

{
   public static void main(String[] args)
   
   {
      JFrame frame = new JFrame("Buskey Lab");
      frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelBuskeyLab());
      frame.setVisible(true);
   }
}