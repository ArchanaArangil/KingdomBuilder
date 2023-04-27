import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class StartScreenPanel extends JPanel implements MouseListener{
	public static BufferedImage image;
	public StartScreenPanel() throws IOException {
		image = ImageIO.read(this.getClass().getResource("/Images/StartScreen.JPG"));
		addMouseListener(this);
		repaint();
	}
	public void paint(Graphics g) {
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
//		g.setColor(Color.BLACK);
//		g.fillRect(100, 100, 100, 100);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(x>=0 && x<=getWidth() && y>=0 && y<=getHeight()) {
			try {
				KingdomBuilder a = new KingdomBuilder("KB");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Error");
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
