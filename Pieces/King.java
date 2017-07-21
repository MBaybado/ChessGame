

public class King extends Piece{

	public King (String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("king",color);
	}
}