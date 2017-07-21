

public class Knight extends Piece{

	public Knight(String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("knight",color);
	}
}