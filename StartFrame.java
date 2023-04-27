import java.io.IOException;

import javax.swing.JFrame;

public class StartFrame extends JFrame {
	public static int WIDTH = 1600, HEIGHT = 960;
	
	public StartFrame(String title) throws IOException {
		super(title);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new StartScreenPanel());
		setVisible(true);
	}
}
