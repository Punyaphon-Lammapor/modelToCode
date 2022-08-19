import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class MGame {
    private int roundCount;

    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private Board board;

    public MGame(ArrayList<Player> players){
        roundCount = 0;
        this.players = players;
    }

    public void playGame(int n){
        while (roundCount < n){
            playRound();
        }
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}