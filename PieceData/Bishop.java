package Pieces;

public class Bishop extends Piece{

	public Bishop(String colorIn, int yPosIn, int xPosIn){
		
		super(colorIn, yPosIn, xPosIn);
		
		determineType("bishop",color);
		
		
	}
}