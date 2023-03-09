import java.util.*;

public class Tile {
	private char terrain; 
	String type;
	
	public Tile (char t) {
		terrain = t;
		if(terrain == 'G')
			type = "grass";
		else if (terrain == 'Y')
			type = "canyon";
		else if (terrain == 'D')
			type = "desert";
		else if (terrain == 'F')
			type = "flower field";
		else if (terrain == 'O')
			type = "forest";
		else if (terrain == 'C')
			type = "castle";
		else if (terrain == 'W')
			type = "water";
		else if (terrain == 'M')
			type = "mountain";
		else if (terrain == '2')
			type = "oasis";
		else if (terrain == '3')
			type = "farm";
		else if (terrain == '4')
			type = "oracle";
		else if (terrain == '5')
			type = "harbor";
		else if (terrain == '6')
			type = "tower";
		else if (terrain == '7')
			type = "tavern";
		else
			type = "paddock";
	}
}
