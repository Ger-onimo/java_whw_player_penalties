import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    private Team team1, team2;
    private Player player1, player2, player3, player4, player5;
    private Penalty penalty1, penalty2, penalty3, penalty4, penalty5, penalty6, penalty7;


    @Before
    public void before(){
        team1 = new Team("ASTRO");
        team2 = new Team("ASR");
        player1 = new Player("Hardy", "125");
        player2 = new Player("So Solid Sue", "251");
        player3 = new Player("Belt-her", "51");
        player4 = new Player("Ger-onimo!", "08");
        player5 = new Player("Life", "10");
        penalty1 = new Penalty(PenaltyType.CUT_TRACK);
        penalty2 = new Penalty(PenaltyType.BACKBLOCK);

    }

    @Test
    public void canGetTeamName(){
        assertEquals("ASTRO", team1.getTeamName());
        assertEquals("ASR", team2.getTeamName());
    }

    @Test
    public void canGetNumberOfPlayers(){
        assertEquals(0, team1.getNumberOfPlayers());
    }

    @Test
    public void canAddPlayerToTeam1(){
        team1.addPlayer(player1);
        team1.addPlayer(player4);
        assertEquals(2, team1.getNumberOfPlayers());
    }

    @Test
    public void canAddPlayerToTeam2(){
        team2.addPlayer(player2);
        team2.addPlayer(player3);
        assertEquals(2, team2.getNumberOfPlayers());
    }

    @Test
    public void canRemovePlayerFromTeam1(){
        team1.addPlayer(player1);
        team1.addPlayer(player4);
        assertEquals(2, team1.getNumberOfPlayers());
        team1.removePlayer(player1);
        assertEquals(1, team1.getNumberOfPlayers());
    }


}
