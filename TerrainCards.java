import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.imageio.*;
public class TerrainCards { 
	
     private String[] terrainTypes = {"canyon", "grass", "forest", "flower", "flower", "desrt"};
     private String imagePackage = "images/";
     
     private int firstIndex = 0; // will use in the getFirstCard method;
     
     private String[] terrainDeck = new String[25];
     
     public TerrainCards() { // creates 25 elements ( 5 types are duplicated 5 times)
    	 for (int i=0; i<5; i++) {             // 0 multiply 5,  add next int 0 = 0, 0,1, 0,2 0,3 0,4) test result: good
    		 for (int j = 0; j<5; j++) {
    			 terrainDeck[i*5+j] = terrainTypes[i];         
    		 }
    	 }
     }
     
     public BufferedImage getImage(String strOfTerrainType) {
    	 
    	 String imagePath = imagePackage + strOfTerrainType + ".png";
    	 BufferedImage image = null; // set to null to start of; will change later
    	 
    	 try {
    		 image = ImageIO.read(new File(imagePath));
    	 } catch (IOException e) {
    		 System.out.println("error in reading terrain type card; from TERRAIN CARD CLASS");
    		 
    	 }
    	 
    	 return image;
     }
     
     public String[] getTerrainCardDeck() { // Can use in the Player Class, to deal with everything manually from there
    	 return terrainDeck;
     }
     
     public String[] randomizeDeck() {
    	 ArrayList<String> tempDeck = new ArrayList<String>();
    	 for (int i = 0; i< terrainTypes.length; i++) {
    		 
    		 
    		 
    	 }
     }
     
     public String getFirstCard {
    	 
     }
     
     
		
}

