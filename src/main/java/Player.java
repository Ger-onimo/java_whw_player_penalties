import java.util.ArrayList;
import java.util.HashMap;

public class Player {

    private String playerName;
    private String playerNumber;
    private ArrayList<Penalty> penalties;
    private int maxPenalties;
    private String exPenalty;
//    private HashMap<String, String> penaltyCounts;


    public Player(String playerName, String playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.penalties = new ArrayList<>();
        this.maxPenalties = 7;
        this.exPenalty = "Expulsion";
//        this.penaltyCounts = new HashMap<>();

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

    public boolean maximumPenalties(){
        if (getNumberOfPenalties() == this.maxPenalties);
        return true;
    }

    public boolean expulsionPenalty() {
        for (Penalty penalty : this.penalties) {
            if (penalty.getPenaltyValue() == this.exPenalty);
        }
        return true;
    }
}

