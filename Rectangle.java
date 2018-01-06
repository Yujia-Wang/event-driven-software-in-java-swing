import java.awt.*;

public class Rectangle {
   //private int x, y, width, height;
   private int start_x, start_y;
   private int end_x, end_y;
   
   public Rectangle(int tmpstart_x, int tmpstart_y, int tmpend_x, int tmpend_y) {
      start_x = tmpstart_x;
      start_y = tmpstart_y;
      end_x = tmpend_x;
      end_y = tmpend_y;
   }
   
   public void draw(Graphics g) {
      //g.drawRect(x, y, width, height);
      g.drawLine(start_x, start_y, start_x, end_y);
      g.drawLine(start_x, start_y, end_x, start_y);
      g.drawLine(start_x, end_y, end_x, end_y);
      g.drawLine(end_x, start_y, end_x, end_y);
   }
}