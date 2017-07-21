import java.awt.Image;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;



public class Game extends JFrame{
	
	ChessBoard chessBoard = new ChessBoard();
	boolean pieceSelected;
	
	
/////////////CONSTRUCTOR/////////////////////////////////////////	
	public Game (String name){
		super("PC VS " + name);
		add(chessBoard.board);
		HandlerClass moveHandler = new HandlerClass();
		
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				
				chessBoard.spaces[i][j].addMouseListener(moveHandler);
			}
		}

		pieceSelected = false;
		

		
	}
	
//////////////////////////////////////////////////////////////////////
	private class HandlerClass implements MouseListener {
			
		Space space;

		public void mouseClicked(MouseEvent event){
			
			space = (Space) event.getComponent();
		
			if (space.occupied && pieceSelected == false){
				
				space.piece.selected = true;
				pieceSelected = true;
				
				System.out.println("selected a piece");
				
		}
			

		}
		public void mousePressed(MouseEvent event) {
			
		}
		public void mouseReleased(MouseEvent event){
			
		}
		public void mouseEntered(MouseEvent event){
			
		}
		public void mouseExited(MouseEvent event){
			
		}
	}

//////////////////////////////////////////////////////////////
}