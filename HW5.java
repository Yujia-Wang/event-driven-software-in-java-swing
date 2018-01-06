import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW5 {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Homework5");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      
      Canvas canvas = new Canvas();
      canvas.setPreferredSize(new Dimension(600, 600));
      
      JButton clearButton = new JButton("CLEAR");
      clearButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ev) {
            Graphics g = canvas.getGraphics();
            canvas.clearCanvas(g);
         }
      });
      
      frame.add(BorderLayout.CENTER, canvas);
      frame.add(BorderLayout.SOUTH, clearButton);
      
      frame.pack();
      frame.show();
   }
}