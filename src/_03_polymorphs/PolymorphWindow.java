package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
   ArrayList<Polymorph> Poly = new ArrayList<Polymorph>();
   BluePolymorph bluePoly = new BluePolymorph(50, 50);
 	 RedMorph redPoly = new RedMorph(200, 200);
 	 MovingMorph MovingMorph=new MovingMorph(50, 50);
 	 CircleMorph CircleMorph=new CircleMorph(250, 250);
 	 mouseMorph MouseMorph=new mouseMorph(20, 20);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 Poly.add(bluePoly);
   	 Poly.add(redPoly);
   	 Poly.add(MovingMorph);
   	 Poly.add(CircleMorph);
   	 Poly.add(MouseMorph);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for(int i=0; i<Poly.size(); i++) {
   		Poly.get(i).draw(g);
   	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(int i=0; i<Poly.size(); i++) {
   		Poly.get(i).update();
   	}
   	 
    }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Poly.size(); i++) {
			if(Poly.get(i) instanceof mouseMorph) {
				Poly.get(i).setX(arg0.getX());
				Poly.get(i).setY(arg0.getY());
	   		}
			
		}

	}
    
}
