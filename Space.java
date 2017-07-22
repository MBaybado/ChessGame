import javax.swing.JLabel;

public class Space extends JLabel{

	public boolean occupied;
	public Piece piece;
	
	public Space(){
		
		this.occupied = false;
		this.piece = null;
		
	}
	
	public boolean hasPiece()
		{return occupied;}
}