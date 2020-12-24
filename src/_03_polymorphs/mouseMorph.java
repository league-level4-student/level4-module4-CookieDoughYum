package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class mouseMorph extends Polymorph{

	mouseMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		
	}

}
