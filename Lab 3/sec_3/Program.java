package sec_3;

public class Program {
    public static void main(String[] args) {
        Board board = new Board();
        // Bishop b = new Bishop(3, 4);
        // Queen q = new Queen(3, 4);
        // King k = new King(2, 3);

        Piece king = new King(5, 8);
        Piece bishop = new Bishop(4, 2);
        Piece queen = new Queen(4, 6);

        board.movePiece(king, 3, 3);
        board.movePiece(queen, 3, 3);
        board.movePiece(bishop, 3, 3);

        // b.move(4, 5, board);
        // q.move(3, 2, board);
        // k.move(1, 1, board);
    }
}
