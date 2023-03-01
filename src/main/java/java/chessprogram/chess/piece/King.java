package java.chessprogram.chess.piece;


import java.awt.*;
import java.chessprogram.bordgame.Board;
import java.chessprogram.chess.ChessPiece;
import java.chessprogram.chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
