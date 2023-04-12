import java.util.*;
import java.io.*;
import java.awt.image.*;

public class ObjectiveCard {
	private BufferedImage face;
	private String type;
	private static String [] allFaces = "Citizens Discoverers Farmers Fisherman Hermans Knights Miners Workers".split(" ");
	private int index;
	
	public ObjectiveCard(String t, BufferedImage f) {
		face = f;
		type = t;
	}
	
	public BufferedImage display() {
		return face;
	}

}
