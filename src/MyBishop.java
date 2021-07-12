public class MyBishop extends ChessPiece {
    private boolean inCycle = true;
    private int x, y;

    public MyBishop(String color) {
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
                y = line;
                x = column;
                while (inCycle) { //to left top
                    y += 1;
                    x -= 1;
                    if(y == toLine && x == toColumn){
                        return true;
                    } else if(y > 7 || x < 0){
                        inCycle = false;
                    }
                }

                inCycle = true;
                y = line;
                x = column;
                while (inCycle) { //to right bottom
                    y -= 1;
                    x += 1;
                    if(y == toLine && x == toColumn){
                        return true;
                    } else if(y < 0 || x > 7){
                        inCycle = false;
                    }
                }

                inCycle = true;
                y = line;
                x = column;
                while (inCycle) {//to left bottom
                    y -= 1;
                    x -= 1;
                    if(y == toLine && x == toColumn){
                        return true;
                    } else if(y < 0 || x < 0){
                        inCycle = false;
                    }
                }

                inCycle = true;
                y = line;
                x = column;
                while (inCycle) {//to right top
                    y += 1;
                    x += 1;
                    if(y == toLine && x == toColumn){
                        return true;
                    } else if(y > 7 || x > 7){
                        inCycle = false;
                    }
                }
                return false;
            }
        }
    }

    @Override
    public String getSymbol() {
        return "B";
    }

}
