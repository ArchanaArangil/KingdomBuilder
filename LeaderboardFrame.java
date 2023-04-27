import java.io.IOException;

import javax.swing.JFrame;

public class LeaderboardFrame extends JFrame {
	public static int WIDTH = 1600, HEIGHT = 960;
	
	public LeaderboardFrame(String title) throws IOException {
		super(title);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new LeaderboardPanel());
		setVisible(true);
	}
}
