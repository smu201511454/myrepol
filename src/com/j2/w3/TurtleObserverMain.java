
package com.j2.w3;
import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;


public class TurtleObserverMain{
  public static void main(String[] args){
    babyTurtle baby = new babyTurtle;
    MomTurtle mom= new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObserver();
  }
}

class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  public void update(Observable o, Object arg){
    system.out.println("update called, counted is" +((integer)arg).intvalue());
    babyCurpos=((BabyTutle)o).myCurpos;
    system.out.println(babyCurpos)
      moveTo(babyCurpos);
 }
}

class BabyTurtle extends Observable {
  Turtle baby;
  Doubke myCurpos;
  ArrayList<Observer>obs;
  public BabyTurtle(){
    baby = new Turtle()
      myCurpos=baby.getPos();
    obs= new Arraylist<Observer>();
  }public void assObserver(Obserber o){
    obs.add(o);
  }
  protected void setChainges(){
    myCurpos=baby.getPos();
  }
  public void notiGyObservers() {
    for (Observer, o:obs)
      o.ubdate(this,1)
  }
  public void move(int x, int y){
    baby.moveTo(x,y);
  }
}
      