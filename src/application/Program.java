package application;

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); //criei a classe User Interface para imprimir as peças dessa partida. a partir do printBoard já é um método.

	}

}
