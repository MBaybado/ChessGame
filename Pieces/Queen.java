

public class Queen extends Piece{

	public Queen(String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("queen",color);
	}
}