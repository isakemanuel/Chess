package chessModel.piece;

public class PieceFactory {

    private PieceFactory(){}

    public static IPiece makeBishop(int x, int y, int side){
        return new Bishop(x, y, side);
    }

    public static IPiece makeKing(int x, int y, int side){
        return new King(x, y, side);
    }

    public static IPiece makeKnight(int x, int y, int side){
        return new Knight(x, y, side);
    }

    public static IPiece makePawn(int x, int y, int side){
        return new Pawn(x, y, side);
    }

    public static IPiece makeQueen(int x, int y, int side){
        return new Queen(x, y, side);
    }

    public static IPiece makeRook(int x, int y, int side){
        return new Rook(x, y, side);
    }

}
