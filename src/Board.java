import java.util.ArrayList;

public class Board {
    private Square[] squares;

    public Board(){
        squares = new Square[40];
    }

    public Square getSquare(Square oldLoc, int fvTot){
        for (int i=0; i<squares.length; i++){
            if(oldLoc.equals(squares[i])){
                return squares[(i+fvTot)%40];
            }
        }
        return null;
    }
}