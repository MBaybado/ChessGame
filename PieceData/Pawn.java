

public class Pawn extends Piece{
	
	private boolean firstMove;
	
	public Pawn(String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("pawn",color);
		
		firstMove = true;
		
		this.moves = new Move[2];
		this.moves[0] = new Move(1,0);
		this.moves[1] = new Move(2,0);
	}
	

}