import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenaltyTest {

    private Penalty penalty;

    @Before
    public void before(){
        penalty = new Penalty(PenaltyType.BACKBLOCK);
    }

    @Test
    public void canGetPenalty(){
        assertEquals(PenaltyType.BACKBLOCK, penalty.getPenaltyName());
    }

    @Test
    public void canGetPenaltyValue(){
        assertEquals("Backblock", penalty.getPenaltyValue());
    }
}
