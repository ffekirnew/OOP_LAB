package sec_3;

public class Bishop extends Piece {
    Bishop(int row, int col) {
        super(row, col);
    }

    @Override
    void move(int row, int col, Board board) {
        System.out.print("moving a bishop ");
        super.move(row, col, board);
    }

    void jump() {
    }
}
