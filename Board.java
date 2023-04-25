import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.ImageIO;


public class Board {
    private ArrayList<BoardPiece> listOfPieces;
    private ArrayList<BoardPiece> piecesChosen;
    KBNode[][] bigBoard;
    private BoardPiece b1 = new BoardPiece("YYYDDWDDDDMMYDDWDDDDMMYMMWDD7FMYMMWMDFFFYYOOWMMYFFYOOWYYYMFFY7OOWFFFFFGGOWGCGFGOGGOOWGGGGOGGOOWGGGOO"); //add by Emily // we need to insert String in this code ( will do in class 3/6/2023 ; )
    private BoardPiece b2 = new BoardPiece("FDDMMDDYYYFFDDDMMYYYFFFFFFFMMMWWFCGGOOMMFFWWGGGOOYFYYWGOOCCCDF6YWOO6YGDDYWOOGGGGDDDWOOOGGGDDWWOOOGGG");//add by Emily
    private BoardPiece b3 = new BoardPiece("OOOOMMGMYYOMOOFGMMMYFFOFFFGGWMDFFFD5GWMMDDDDFWGWYYDYDDDWWYGYDDYDDWFCGYYY5DWFFFGGDYWWWOOFGGDYYWOOOGGG"); //add by Emily
    private BoardPiece b4 = new BoardPiece("GGOOOWGOOFGFOOWGOOFFGFFOWGGFFFFFOOWGMFDDYFCOWGDDDDYYOWGGMMDDYYWWWGDDDYWWGGWW1YMYWDCGWMWYYYWDDWWWWYYY"); //add by Emily
    private BoardPiece b5 = new BoardPiece("DDYWWOOGGGDYWFFOOOGGDDWFFOO2FGWWWFGOFFFFWWWWGGGGFFWOOWGGYYDYWOYOWGYYDYWCYFW2DDYWWWYFWWWDDWWWWWWWWWWW"); //RECOUNT
    private BoardPiece b6 = new BoardPiece("GGGOOWGOOOGGGCOWGOOOGFFGOOWGGOFFYGOWF4OOFFFYYWFFWWMMYGGWWWDDYYYMGFFFDDYYCDMDFFYYWWWDDDDMYYWWWWDDDDDY"); 
    private BoardPiece b7 = new BoardPiece("DDYWWOOOGGDCYWOOO3GGYYYFFFOYFFYYFFWDDYYFYGGWFFDDYYGG3FWFWDDYGGGOFFWWDDGGOOMWWWDWGMOOWWWWWWOOOWWWWWWW");
    private BoardPiece b8 = new BoardPiece("YDDDDDDDDDYYYDDDDDYDMMMDMMCDDYYMMMMMFFYYYYYMMWFFFYGYYYMFFWOYGG1OFFWFFOGGOOFFG1OOGGGOOWGGOOGGGOWGGOOO");


    public Board() {
        listOfPieces = new ArrayList<BoardPiece>(); // why tf we have this? We use this for the random method, so we draw 4 random cards from a List;
        piecesChosen = new ArrayList <BoardPiece>();
        bigBoard = new KBNode [20][20];
        Collections.addAll(listOfPieces, b1,b2,b3,b4,b5,b6,b7,b8); // all 8 boards are added
        
        try {
        	b1.setImage(ImageIO.read(this.getClass().getResource("/Images/B1.png")));
        	b2.setImage(ImageIO.read(this.getClass().getResource("/Images/B2.png")));
        	b3.setImage(ImageIO.read(this.getClass().getResource("/Images/B3.png")));
        	b4.setImage(ImageIO.read(this.getClass().getResource("/Images/B4.png")));
        	b5.setImage(ImageIO.read(this.getClass().getResource("/Images/B5.png")));
        	b6.setImage(ImageIO.read(this.getClass().getResource("/Images/B6.png")));
        	b7.setImage(ImageIO.read(this.getClass().getResource("/Images/B7.png")));
        	b8.setImage(ImageIO.read(this.getClass().getResource("/Images/B8.png")));

        }catch(Exception e) { System.out.println("Can't read images"); }
       
      }
    
	public void choosePieces() {
		int ind = 0;

		while(piecesChosen.size() <= 4) {
			ind = (int)((Math.random()*7)+1);

			if(!(piecesChosen.contains(listOfPieces.get(ind))))
				piecesChosen.add(listOfPieces.get(ind));
		}
	} 
      
    public void buildGraph2() {
    	choosePieces();
    	KBNode[][][] temp = new KBNode[4][10][10]; //normally int[][] cannot int[]
    	
    	temp[0] = piecesChosen.get(0).getHexes(); //KBNode[][]
    	temp[1] = piecesChosen.get(1).getHexes();
    	temp[2] = piecesChosen.get(2).getHexes();
    	temp[3] = piecesChosen.get(3).getHexes();
    	
    	
    	for(int i = 0; i <= 1; i++) {
    		for(int j = 0; j <= 1; j++) {
    			for(int k = 0; k <= 9; k++) {
    				for(int l = 0; l <= 9; l++) {
    					bigBoard[i*10+k][j*10+l] = temp[i*2+j][k][l];
    					
    				}
    			}
    		}
    	}
    	
    	for(int r = 0; r<bigBoard.length; r++) {
    		for(int c = 0; c< bigBoard[0].length; c++) {
    			System.out.print(bigBoard[r][c]);
    		}
    		System.out.println();
    	}
    }
    
    public BoardPiece getBoardPiece(int i) {
    	return piecesChosen.get(i);
    }
    
    public KBNode[][] getBoardNodes(){
    	return bigBoard;
    }
    
   /* public void display (Graphics g) {
    	for(int i = 0; i < bigBoard.length; i++) {
    		for(int j = 0; j < bigBoard[0].length; j++) {
    			g.drawPolygon(null);
    		}
    	}
    }*/
    
    


}
