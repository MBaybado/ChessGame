import java.awt.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import spaceFile.Space;

public class ChessBoard{
	
	public JPanel board = new JPanel();
	public Space[][] spaces = new Space [8][8];
	public Piece [] whitePieces = new Piece[16];
	public Piece [] blackPieces = new Piece[16];

	
	////////CONSTRUCTOR//////////////////////////////
	public ChessBoard(){
		
		generateBoard();
		
		generatePieces();
		
	}
	
	//////////////////////////////////////////////////
	public void generateBoard(){
		
		int colorSwitch = 1;
	
		board.setLayout(new GridLayout(8,8));
		
		for (int i = 0; i < 8; i++){
			
			colorSwitch *= -1;
			
			for (int j = 0; j < 8; j++){
				
				this.spaces[i][j] = new Space();
				this.spaces[i][j].setBorder(
									new LineBorder(Color.darkGray));
				
				if (colorSwitch < 0)
				{this.spaces[i][j].setBackground(Color.white);}
				else {this.spaces[i][j].setBackground(Color.black);}
				
				this.spaces[i][j].setOpaque(true);
				
				this.board.add(spaces[i][j]);
				
				colorSwitch *= -1;
			}
		}
	}

	///////////////////////////////////////////////////
	public void generatePieces(){
		
				//white pieces
		for (int i = 0; i < 8; i++){
			
			this.spaces[1][i].piece = new Pawn ("w",1,i);
			this.spaces[1][i].occupied = true;
				
			this.spaces[1][i].setIcon(
					new ImageIcon(spaces[1][i].piece.scaleImage(50, 50)));
			
		}
		
		this.spaces[0][0].piece = new Rook("w",0,0);
		this.spaces[0][0].occupied = true;
		this.spaces[0][0].setIcon(
					new ImageIcon(spaces[0][0].piece.scaleImage(50,50)));
					
		this.spaces[0][7].piece = new Rook("w",0,7);
		this.spaces[0][7].occupied = true;
		this.spaces[0][7].setIcon(
					new ImageIcon(spaces[0][7].piece.scaleImage(50,50)));
					
		this.spaces[0][1].piece = new Knight("w",0,1);
		this.spaces[0][1].occupied = true;
		this.spaces[0][1].setIcon(
					new ImageIcon(spaces[0][1].piece.scaleImage(50,50)));
					
		this.spaces[0][6].piece = new Knight("w",0,6);
		this.spaces[0][6].occupied = true;
		this.spaces[0][6].setIcon(
					new ImageIcon(spaces[0][6].piece.scaleImage(50,50)));
					
		this.spaces[0][2].piece = new Bishop("w",0,2);
		this.spaces[0][2].occupied = true;
		this.spaces[0][2].setIcon(
					new ImageIcon(spaces[0][2].piece.scaleImage(50,50)));
					
		this.spaces[0][5].piece = new Bishop("w",0,5);
		this.spaces[0][5].occupied = true;
		this.spaces[0][5].setIcon(
					new ImageIcon(spaces[0][5].piece.scaleImage(50,50)));
					
		this.spaces[0][4].piece = new Queen("w",0,4);
		this.spaces[0][4].setIcon(
					new ImageIcon(spaces[0][4].piece.scaleImage(50,50)));
					
		this.spaces[0][3].piece = new King("w",0,3);
		this.spaces[0][3].occupied = true;
		this.spaces[0][3].setIcon(
					new ImageIcon(spaces[0][3].piece.scaleImage(50,50)));
					
					
				///////// black pieces /////////
		for (int i = 0; i < 8; i++){
			
			this.spaces[6][i].piece = new Pawn("b",i,6);
			this.spaces[6][i].occupied = true;	
			this.spaces[6][i].setIcon(
					new ImageIcon(spaces[6][i].piece.scaleImage(50, 50)));
			
		}
		
		this.spaces[7][0].piece = new Rook("b",7,0);
		this.spaces[7][0].occupied = true;
		this.spaces[7][0].setIcon(
					new ImageIcon(spaces[7][0].piece.scaleImage(50,50)));
					
		this.spaces[7][7].piece = new Rook("b",7,7);
		this.spaces[7][7].occupied = true;
		this.spaces[7][7].setIcon(
					new ImageIcon(spaces[7][7].piece.scaleImage(50,50)));
					
		this.spaces[7][1].piece = new Knight("b",7,1);
		this.spaces[7][1].occupied = true;
		this.spaces[7][1].setIcon(
					new ImageIcon(spaces[7][1].piece.scaleImage(50,50)));
					
		this.spaces[7][6].piece = new Knight("b",7,6);
		this.spaces[7][6].occupied = true;
		this.spaces[7][6].setIcon(
					new ImageIcon(spaces[7][6].piece.scaleImage(50,50)));
					
		this.spaces[7][2].piece = new Bishop("b",7,2);
		this.spaces[7][2].occupied = true;
		this.spaces[7][2].setIcon(
					new ImageIcon(spaces[7][2].piece.scaleImage(50,50)));
					
		this.spaces[7][5].piece = new Bishop("b",7,5);
		this.spaces[7][5].occupied = true;
		this.spaces[7][5].setIcon(
					new ImageIcon(spaces[7][5].piece.scaleImage(50,50)));
					
		this.spaces[7][4].piece = new Queen("b",7,4);
		this.spaces[7][4].occupied = true;
		this.spaces[7][4].setIcon(
					new ImageIcon(spaces[7][4].piece.scaleImage(50,50)));
					
		this.spaces[7][3].piece = new King("b",7,3);
		this.spaces[7][3].occupied = true;
		this.spaces[7][3].setIcon(
					new ImageIcon(spaces[7][3].piece.scaleImage(50,50)));
		
	}
////////////////////////////////////////////////////////////////





}