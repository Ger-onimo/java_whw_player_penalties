import java.util.ArrayList;
import java.util.HashMap;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers;
    private HashMap<Player, ArrayList<Penalty>> playersPenalties;


    public Team(String teamName){
        this.teamName = teamName;
        this.teamPlayers = new ArrayList<>();
        this.playersPenalties = new HashMap<>();
    }


    public String getTeamName(){
        return this.teamName;
    }

    public int getNumberOfPlayers(){
        return this.teamPlayers.size();
    }

    public void addPlayer(Player player){
        this.teamPlayers.add(player);
    }

    public void removePlayer(Player player) {
        player.maximumPenalties();
        this.teamPlayers.remove(player);
        }

    public void expelPlayer(Player player){
        player.expulsionPenalty();
        this.teamPlayers.remove(player);
        }

}


