import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener {
   private ArrayList<Rectangle> rectangles= new ArrayList<Rectangle>();
   private int startPoint_x,startPoint_y;
   private int tmpPoint_x, tmpPoint_y;
   private int endPoint_x, endPoint_y;
   
   public Canvas() { 
      super();     
      addMouseListener(this);
      addMouseMotionListener(this);
   }
   
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      for (int i=0; i<rectangles.size(); i++) {
         rectangles.get(i).draw(g);
      }
      
      //g.drawRect(startPoint_x, startPoint_y, Math.abs(tmpPoint_x - startPoint_x), Math.abs(tmpPoint_y - startPoint_y));
      g.drawLine(startPoint_x, startPoint_y, startPoint_x, tmpPoint_y);
      g.drawLine(startPoint_x, startPoint_y, tmpPoint_x, startPoint_y);
      g.drawLine(startPoint_x, tmpPoint_y, tmpPoint_x, tmpPoint_y);
      g.drawLine(tmpPoint_x, startPoint_y, tmpPoint_x, tmpPoint_y);
   }
   
   public void clearCanvas(Graphics g) {
      g.clearRect(0, 0, 600, 600);
      rectangles.clear();
   }
   
   public void mousePressed(MouseEvent ev) {
      startPoint_x = ev.getX();
      startPoint_y = ev.getY();
   }
   
   public void mouseClicked(MouseEvent ev) {
   }
   
   public void mouseReleased(MouseEvent ev) {
      endPoint_x = ev.getX();
      endPoint_y = ev.getY();
      if (endPoint_x == startPoint_x && endPoint_y == startPoint_y) {
      } else {
         //Rectangle rectangle = new Rectangle(startPoint_x, startPoint_y, Math.abs(endPoint_x - startPoint_x), Math.abs(endPoint_y - startPoint_y));
         Rectangle rectangle = new Rectangle(startPoint_x, startPoint_y, endPoint_x, endPoint_y);
         rectangles.add(rectangle);
         repaint();
         tmpPoint_x = startPoint_x;
         tmpPoint_y = startPoint_y;
      }
   }
   
   public void mouseEntered(MouseEvent ev) {
   }
   
   public void mouseExited(MouseEvent ev) {
   }
   
   public void mouseDragged(MouseEvent ev) {
      tmpPoint_x = ev.getX();
      tmpPoint_y = ev.getY();
      repaint();
   }
   
   public void mouseMoved(MouseEvent ev) {
   }
}