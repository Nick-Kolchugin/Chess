public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) {//if destination is not to start position
            return false;
        } else {
            if ((line > 7 || line < 0) || (column > 7 || column < 0) || (toLine > 7 || toLine < 0) || (toColumn > 7 || toLine < 0)) { //if destination or start position is not outOfBounce
                return false;
            } else {
                if (this.getColor().equals("White")) {
                    if (line == 1) { //if Pawn on a start position
                        if ((line + 1 == toLine && column == toColumn) || (line + 2 == toLine && column == toColumn)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        if (line + 1 == toLine && column == toColumn) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                } else {
                    if (line == 6) { //if Pawn on a start position
                        if ((line - 1 == toLine && column == toColumn) || (line - 2 == toLine && column == toColumn)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        if (line - 1 == toLine && column == toColumn) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }



}
