import javax.swing.*;
import java.util.*;

import java.io.*;

import java.awt.*;

import java.awt.event.*;

import java.awt.image.*;

import javax.imageio.*;

import javax.swing.border.*;

public class Settlement {

            public static final int WIDTH = 45;

            public static final int HEIGHT = 48;

            private int settlementIndex = 0;

            public static final int BORDER_WIDTH = 5;

            private double sizeFactor = 1;
            

            private boolean hasMoved = false;      
            /* 0: Orange Settlement
            * 1: Black Settlement
            * 2: Blue Settlement
            * 3: Beige Settlement
            */
/* Image of each settlement */
            private static String [] images = "Orange Black Blue Beige".split(" ");

/* Index of the settlement (0-3) */

/* The actual width and height of a settlement */
            private int width = WIDTH;
            private int height = HEIGHT;
/* The x and y coordinates of the top-left corner of the settlement */
            private int x, y;
/* Boolean denoting whether or not the tile is highlighted */

            public boolean highlighted;

            public boolean scored = false;

            public Settlement(int settlementIndex) {

                        this.settlementIndex = settlementIndex;

            }

            public Settlement(int settlementIndex, int x, int y) {

                        this.settlementIndex = settlementIndex;

                        this.x = x;

                        this.y = y;
            }

            /* Returns the image of the settlement */

            public BufferedImage getImage() {

                        try {

                                   return ImageIO.read(Settlement.class.getResource("/Images/" + images[settlementIndex] + "Settlement.png"));

                        } catch(Exception e) { System.out.println("error reading settlement image"); }

                        return null;

            }

           

            public String getName() { return images[settlementIndex]; }

            public int getWidth() { return width; }

            public int getHeight() { return height; }

            public int getX() { return x; }

            public int getY() { return y; }

            public int getTileIndex() { return settlementIndex; }

 

            public void setX(int x) { this.x = x; }

            public void setY(int y) { this.y = y; }

            public void setCoords(int x, int y) { setX(x); setY(y); }

 
            public void setHighlighted(boolean highlighted) {

                        this.highlighted = highlighted;

            }

 

            /* Returns if a Settlement contains the coordinate (x2, y2) */

            public boolean isClicked(int x2, int y2) {

                        return x2 >= x && x2 <= x + width && y2 >= y && y2 <= y + height;

            }

 
            /*  Displays the Settlement on Game Board */

            public void displaySettlement(Graphics g) {

                        if (highlighted) {

                                   int border = (int) (BORDER_WIDTH * sizeFactor);

                                   g.setColor(Color.YELLOW);

                                   g.fillRect(x - border, y - border, width + 2 * border, height + 2 * border);

                        } g.drawImage(getImage(), x, y, width, height, null);
            }

            public String toString() {

                        if(settlementIndex == 0) {
                        	return "OrangeSettlement";
                        }else if(settlementIndex == 1) {
                        	return "BlackSettlement";
                        }else if (settlementIndex == 2) {
                        	return "BlueSettlement";
                        }
                        return "BeigeSettlement";
            }         
}

