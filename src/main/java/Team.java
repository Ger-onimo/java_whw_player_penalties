import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers;


    public Team(String teamName){
        this.teamName = teamName;
        this.teamPlayers = new ArrayList<>();
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
        this.teamPlayers.remove(player);
        }

}


