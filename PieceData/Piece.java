import java.awt.Image;
import java.awt.Image.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;
import javax.swing.*;

public class Piece{
	
	public String color;
	public int xPos, yPos;
	public Image image;
	boolean captured;
	public boolean selected;
	public Move [] moves;
	

///////////////CONSTRUCTOR//////////////////////////////	
	public Piece (String color, int yPos, int xPos){
		
		this.color = color;
		this.xPos = xPos;
		this.yPos = yPos;
		this.captured = false;
		this.selected = false;
	}
	
/////////////////////////////////////////////////////////////
	public Image scaleImage(int height, int width){
	
		return this.image.getScaledInstance(
					width, height, Image.SCALE_SMOOTH);
	
}

///////////////////////////////////////////////////////////
	public void determineType(String type, String color){
		
		try {
			if (color.equalsIgnoreCase("w")){
				
				switch (type){
					
				case "pawn": this.image = 
							ImageIO.read(new File("IMGwhitePawn.png"));
							break;
								
				case "rook": this.image =
							ImageIO.read(new File("IMGwhiteRook.png"));
							break;
								
				case "knight": this.image =
							ImageIO.read(new File("IMGwhiteKnight.png"));
							break;
								
				case "bishop": this.image =
							ImageIO.read(new File("IMGwhiteBishop.png"));
							break;
								
				case "king": this.image =
							ImageIO.read(new File("IMGwhiteKing.png"));
							break;
								
				case "queen": this.image =
							ImageIO.read(new File("IMGwhiteQueen.png"));
							break;
				default: System.out.println("failed to load a white piece");
							break;
				}
			}
				
			else{ switch (type) {
					
				case "pawn": this.image = 
							ImageIO.read(new File("IMGblackPawn.png"));
							break;
								
				case "rook": this.image =
							ImageIO.read(new File("IMGblackRook.png"));
							break;
								
				case "knight": this.image =
							ImageIO.read(new File("IMGblackKnight.png"));
							break;
								
				case "bishop": this.image =
							ImageIO.read(new File("IMGblackBishop.png"));
							break;
								
				case "king": this.image =
							ImageIO.read(new File("IMGblackKing.png"));
							break;
								
				case "queen": this.image =
							ImageIO.read(new File("IMGblackQueen.png"));
							break;
				default: System.out.println("failed to load a black piece");
							break;
					
				}
			}
		}
		catch(Exception e){ System.out.println(
							"failed to load piece in catch: "+e);}
		
	}
	
/////////////////////////////////////////////////////////////////////////////
	public int getxPos()
		{return this.xPos;}
		
	public int getyPos()
		{return this.yPos;}
		
/////////////////////////////////////////////////////////////////////////////


}