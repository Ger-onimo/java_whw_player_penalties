import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Penalty penalty1, penalty2, penalty3, penalty4, penalty5, penalty6, penalty7, penaltyEx;

    @Before
    public void before() {
        player = new Player("Hardy", "125");
        penalty1 = new Penalty(PenaltyType.CUT_TRACK);
        penalty2 = new Penalty(PenaltyType.BACKBLOCK);
        penalty3 = new Penalty(PenaltyType.FOREARMS);
        penalty4 = new Penalty(PenaltyType.MULTIPLAYER);
        penalty5 = new Penalty(PenaltyType.CUT_TRACK);
        penalty6 = new Penalty(PenaltyType.HEAD_BLOCK);
        penalty7 = new Penalty(PenaltyType.EXPULSION);
        penaltyEX = new Penalty(PenaltyType.EXPULSION);
    }

    @Test
    public void canGetPlayerName(){
        assertEquals("Hardy", player.getPlayerName());
    }

    @Test
    public void canGetPlayerNumber(){
        assertEquals("125", player.getPlayerNumber());
    }

    @Test
    public void canGetNumberOfPenalties(){
        assertEquals(0, player.getNumberOfPenalties());
    }

    @Test
    public void canAddPenalty(){
        player.addPenalty(penalty1);
        player.addPenalty(penalty2);
        player.addPenalty(penalty3);
        player.addPenalty(penalty4);
        player.addPenalty(penalty5);
        player.addPenalty(penalty6);
        player.addPenalty(penalty7);
        assertEquals(7, player.getNumberOfPenalties());
    }

    @Test
    public void HasMaximumNumberOfPenaltiesAllowed(){
        player.addPenalty(penalty1);
        player.addPenalty(penalty2);
        player.addPenalty(penalty3);
        player.addPenalty(penalty4);
        player.addPenalty(penalty5);
        player.addPenalty(penalty6);
        player.addPenalty(penalty7);
        assertEquals(true, player.maximumPenalties());
    }

    @Test
    public void HasExpulsionPenalty(){
//        expulsionPenalty = new Penalty(PenaltyType.EXPULSION);
        player.addPenalty(penaltyEx);
        assertEquals(true, player.expulsion());
    }
}
