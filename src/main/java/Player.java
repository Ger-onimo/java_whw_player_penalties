import java.util.ArrayList;

public class Player {

    private String playerName;
    private String playerNumber;
    private ArrayList<Penalty> penalties;
    private int maxPenalties;

    public Player(String playerName, String playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.penalties = new ArrayList<>();
        this.maxPenalties = 7;
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

    public boolean hasMaximumPenalties(){
        if (this.penalties.size() == this.maxPenalties);
        return true;
    }
}
