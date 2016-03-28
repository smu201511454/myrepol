package com.j2.w4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.awt.goem.*;

  

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent e){
        Point2D.Double p;
        p = toTurtlePos(e.getPoint());
        d= distance(p);
        w= towards(p);
        heading(w);
        forvward(d);
        setStatusText("pos"+p.toSting());
      }
    });
    addMouseMotionListener(new MouseEvent() {
      public void mouseDragged(MouseEvent e) {
      Point2D.Double p;
      double d;
      double w;
      
      p= toTurtlePos(e.getPoint());
      moveTo(p);
      setStatusText("pos" +p,toString());
      }
      });
    }
}



          



public class TurtleMouseObserverMain {
  public static void main(String[] args) {
    TurtleMouseListener t =new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or drag");
  }
}