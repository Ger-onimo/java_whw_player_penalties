import java.util.ArrayList;

public class Player {

    private String playerName;
    private String playerNumber;
    private ArrayList<Penalty> penalties;

    public Player(String playerName, String playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.penalties = new ArrayList<>();
    }

    public String getPlayerName(){
        return playerName;
    }

    public String getPlayerNumber(){
        return playerNumber;
    }
    public void addPenalty(Penalty penalty){
        this.penalties.add(penalty);
    }

    public int getNumberOfPenalties(){
        return this.penalties.size();
    }

}
