public class Penalty {

    private PenaltyType penalty;

    public Penalty(PenaltyType penalty){
        this.penalty = penalty;
    }

    public PenaltyType getPenalty(){
        return this.penalty;
    }

    public String getPenaltyValue() {
        return this.penalty.getValue();
    }
}
