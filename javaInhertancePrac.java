package javaInhertancePrac;

class knight extends pawn {
	String knightMoves = "3steps";
}

public class javaInhertancePrac {
	public static void main(String[] args) {
		
		pawn Pawn = new pawn();
		knight Knight = new knight();
		
		System.out.println("Pawn Moves: "+Pawn.pawnMoves);
		System.out.println("Knight Moves: "+Knight.knightMoves);
	}
}

