package chessModel.piece;

import chessModel.SquareStatus;

public interface IPiece {

    String getChar();

    boolean validMove(int x, int y, SquareStatus status);

    int getX();
    int getY();

    int getSide();
    boolean move(int x, int y, SquareStatus status);
    void forceMove(int x, int y);

    int getValue();
    boolean hasMoved();


}
