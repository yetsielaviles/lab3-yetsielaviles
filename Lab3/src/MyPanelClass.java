import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
import java.awt.Polygon;
public class MyPanelClass extends JPanel {
            /**
     *
     */
    private static final long serialVersionUID = 1L;

            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
                       
                       
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+5, y1+5, width-10, height-10);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x1, y2, x2, y1);
//                        
//                        g.setColor(Color.RED);
//                        g.fillOval((width-55)/2, (height-55)/2, 55,55);
                        
                        //Tres rectangulos rojos
                        g.setColor(Color.RED);
                        g.fillRect(x1, 4*(y1+y2)/5, width+1, height/5 +2);
                        g.fillRect(x1, 2*(y1+y2)/5, width+1, height/5);
                        g.fillRect(x1, y1/5, width+1, height/5);
                       
                        //Triangulo
                        Polygon p = new Polygon();
                         p.addPoint(x1, y1);
                         p.addPoint(x1, y2);
                         p.addPoint((x1+x2)/2, (y1+y2)/2);
                         g.setColor(Color.BLUE);
                         g.fillPolygon(p);
                       
                         //Estrella
                         Polygon p2 = new Polygon();
                         p2.addPoint((width*25)/300, (height*73)/160);
                         p2.addPoint( (width*41)/300, (height*73)/160);
                         p2.addPoint( (width*47)/300, (height*58)/160);
                         p2.addPoint( (width*53)/300, (height*73)/160);
                         p2.addPoint( (width*69)/300, (height*73)/160);
                         p2.addPoint( (width*56)/300, (height*83)/160);
                         p2.addPoint( (width*61)/300, (height*98)/160);
                         p2.addPoint( (width*47)/300, (height*88)/160);
                         p2.addPoint( (width*34)/300, (height*98)/160);
                         p2.addPoint((width*38)/300, (height*83)/160);
                         g.setColor(Color.WHITE);
                         g.fillPolygon(p2);
            }
}