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
	public int count = 0;
	Iterator iter = settlementList.iterator();
	private Settlement removedSettlements;
	int playerClickCounter = 0;
	


	

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
	
	public Settlement removeSettlement(int index) {
		
			removedSettlements = settlementList.remove(index);
			count--;
			return removedSettlements;
			
		
	}
	
	public int getPlayerClickCounter() {
		return playerClickCounter;
	}
	

	public void removeSettlement() {
		
			removedSettlements = settlementList.remove(0);
			
	
	}
	
	
	

	
	
	public void display(Graphics g) {
		
		if(settlementList.size() > 0) {
			
		
			temp1 = settlementList.get(0);
			temp2 = settlementList.get(1);
			temp3 = settlementList.get(2);
		
		if(playerNum == 0) {
			settlementList.get(0).setX(56);
			settlementList.get(0).setY(233);
			
			settlementList.get(1).setX(108);
			settlementList.get(1).setY(233);
			
			
			settlementList.get(2).setX(160);
			settlementList.get(2).setY(233);

		}else if(playerNum == 1) {
			/*temp1.setX(56);
			temp1.setY(719);
			
			temp2.setX(108);
			temp2.setY(719);
			
			temp3.setX(160);
			temp3.setY(719);;*/
			
			settlementList.get(0).setX(56);
			settlementList.get(0).setY(719);
			
			settlementList.get(1).setX(108);
			settlementList.get(1).setY(719);
			
			
			settlementList.get(2).setX(160);
			settlementList.get(2).setY(719);

		}else if(playerNum == 2) {
			//temp1.setX(1400);
			//temp1.setY(233);
			
			/*temp2.setX(1454);
			temp2.setY(233);
			
			temp3.setX(1511);
			temp3.setY(233);;*/
			
			settlementList.get(0).setX(1400);
			settlementList.get(0).setY(233);
			
			settlementList.get(1).setX(1454);
			settlementList.get(1).setY(233);
			
			
			settlementList.get(2).setX(1511);
			settlementList.get(2).setY(233);
			
		}else if(playerNum == 3) {
			//temp1.setX(1400);
			//temp1.setY(721);
			
			//temp2.setX(1454);
			//temp2.setY(721);
			
			//temp3.setX(1511);
			//temp3.setY(721);;
			
			settlementList.get(0).setX(1400);
			settlementList.get(0).setY(721);
			
			settlementList.get(1).setX(1454);
			settlementList.get(1).setY(721);
			
			
			settlementList.get(2).setX(1511);
			settlementList.get(2).setY(721);
		}
		
		settlementList.get(0).displaySettlement(g);
		settlementList.get(1).displaySettlement(g);
		settlementList.get(2).displaySettlement(g);
		
		}
		
		
		

	}
	
	public Settlement getSettlement() {
		return temp1;
	}
	
	
	public int getCount() {
		return count;
	}
	
}
