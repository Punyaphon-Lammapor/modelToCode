import java.util.ArrayList;

public class Player {
    public String name;
    private Board board;
    private Piece piece;
    private ArrayList<Die> dies;


    public Player(String name, ArrayList<Die> dies, Board board, Piece piece) {
        this.name = name;
        this.board = board;
        this.piece = piece;
        this.dies = dies;
    }

    public void takeTurn(){
        int faceValue = 0;
        for(Die die : dies){
            die.roll();
            faceValue += die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, faceValue);
        piece.setLocation(newLoc);
    }


}