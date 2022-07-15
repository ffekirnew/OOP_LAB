package sec_3;

public class Piece {
    int row;
    int col;

    Piece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    void move(int row, int col, Board b) {
        System.out.println("moving to " + row + "," + col);
    }
}
