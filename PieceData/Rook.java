

public class Rook extends Piece{

	public Rook(String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("rook",color);
	}
}