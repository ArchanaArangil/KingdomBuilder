import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class PlayerSlot {
	private ArrayList<Settlement> settlementList = new ArrayList<>();
	private Settlement temp1;
	private Settlement temp2;
	private Settlement temp3;
	private int terrainCardIndex; // will go from 0-24, as we rotate player turns, this value will increment; The number will be used in 
	public int count = 0;

	

	private int playerNum = 0;
	public PlayerSlot(int p) {
		playerNum = p;
		for(int i = 0; i < 40; i++) {
			if (p == 0) {
				settlementList.add(new Settlement(0));

			}else if(p == 1) {
				settlementList.add(new Settlement(1));

			}else if(p == 2) {
				settlementList.add(new Settlement(2));

			}else if(p == 3) {
				settlementList.add(new Settlement(3));

			}
		}
		
		count = settlementList.size();

		
	}
	
	
	public void display(Graphics g) {
		
		if(settlementList.size() > 0) {
			temp1 = settlementList.get(0);
			temp2 = settlementList.get(1);
			temp3 = settlementList.get(2);
		

		if(playerNum == 0) {
			temp1.setX(56);
			temp1.setY(233);
			
			temp2.setX(108);
			temp2.setY(233);
			
			temp3.setX(160);
			temp3.setY(233);;

		}else if(playerNum == 1) {
			temp1.setX(56);
			temp1.setY(719);
			
			temp2.setX(108);
			temp2.setY(719);
			
			temp3.setX(160);
			temp3.setY(719);;

		}else if(playerNum == 2) {
			temp1.setX(1400);
			temp1.setY(233);
			
			temp2.setX(1454);
			temp2.setY(233);
			
			temp3.setX(1511);
			temp3.setY(233);;
			
		}else if(playerNum == 3) {
			temp1.setX(1400);
			temp1.setY(721);
			
			temp2.setX(1454);
			temp2.setY(721);
			
			temp3.setX(1511);
			temp3.setY(721);;
		}
		
		temp1.displaySettlement(g);
		temp2.displaySettlement(g);
		temp3.displaySettlement(g);
		
		}
		
		

	}
	
	public int getCount() {
		return count;
	}
	

	public String getTerrainCardType() {   // this method will call incrementTerrainCardIndex 
		
		TerrainCards tc = new TerrainCards();
		String[] terraindeck = tc.getTerrainCardDeck();
		
	    incrementTerrainCardIndex();
		return terraindeck[terrainCardIndex]; 
		
	}
	
	public void incrementTerrainCardIndex() {
		if (terrainCardIndex < 25) {
			terrainCardIndex++;
		}
	}
	
	
	
}
