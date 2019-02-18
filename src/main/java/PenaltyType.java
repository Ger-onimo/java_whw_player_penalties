public enum PenaltyType {

    BACKBLOCK("Backblock"),
    CUT_TRACK("Cut Track"),
    FOREARMS("Forearms"),
    CLOCKWISE("Clockwise"),
    MULTIPLAYER("Multi-player"),
    PACK_DESTRUCTION("Pack Destruction"),
    LOW_BLOCK("Low Block"),
    HEAD_BLOCK("Head Block"),
    ILLEGAL_PROCEDURE("Illegal Procedure"),
    MISCONDUCT("Misconduct"),
    EXPULSION("Expulsion"); //if player expelled at any point they leave the game.


    private final String value;

    PenaltyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
