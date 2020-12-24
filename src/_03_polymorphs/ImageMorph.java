package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.*;

public class ImageMorph extends Polymorph{

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		Toolkit t=Toolkit.getDefaultToolkit();
		BufferedImage i=null;
		try {
			i = ImageIO.read(this.getClass().getResourceAsStream("phut_0.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(i, 250, 250, null);
		//System.out.println("print");
		
	}

}
