public enum PenaltyType {

    BACKBLOCK("B"),
    CUT_TRACK("X"),
    FOREARMS("F"),
    CLOCKWISE("C"),
    MULTIPLAYER("M"),
    PACK_DESTRUCTION("P"),
    LOW_BLOCK("L"),
    HEAD_BLOCK("H"),
    ILLEGAL_PROCEDURE("I"),
    MISCONDUCT("G"),
    EXPULSION("G"); //if player expelled at any point they leave the game.


    private final String value;

    PenaltyType(String value) {
        this.value = value;
    }

}
