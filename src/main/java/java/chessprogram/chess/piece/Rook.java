package java.chessprogram.chess.piece;

import java.chessprogram.bordgame.Board;
import java.chessprogram.chess.ChessPiece;
import java.chessprogram.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
