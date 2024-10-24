/**
 * Represents a player in a game.
 */
public class Player {
    private String name;
    private String gamerTag;
    /*
     * Field type has been changed to 'Rollable' from 'PairOfDice'
     */    
    private  Rollable roller;

    /**
     * Default constructor that assigns default values to all fields.
     */
    public Player() {
        this.name = "Sahil Mahbub";
        this.gamerTag = "swampy3429";
        /*
         * Updated the field 'dice' into 'roller' 
         */
        this.roller = new PairOfDice();
    }

    /**
     * Constructor that accepts a gamerTag and a Name object.
     *
     * @param gamerTag The gamer tag of the player.
     * @param name The name of the player.
     */
    public Player(String gamerTag, Name name) {
        this.gamerTag = gamerTag;
        this.name = name.toString();
        /*
         * Updated the field 'dice' into 'roller'
         */
        this.roller = new PairOfDice();
    }

    /**
     * Constructor that accepts values for all three fields.
     *
     * @param gamerTag The gamer tag of the player.
     * @param name The name of the player.
     * @param dice The pair of dice used by the player.
     */
    public Player(String gamerTag, String name, PairOfDice dice) {
        this.gamerTag = gamerTag;
        this.name = name;
        /*
         * Updated Field and Parameter from 'dice' to 'roller'
         */
        this.roller = roller;
    }
    
    /**
     * Sets the full player name.
     *
     * @param fullName The full player name (e.g., "Joe Bloggs").
     */
/*
 * Referencing fullname to name
 */
    private String fullname=name;
    public void setFullPlayerName(String fullName) {
        String[] parts = fullName.split(" ");
        String firstName = parts.length > 0 ? capitalize(parts[0]) : "";
        String familyName = parts.length > 1 ? capitalize(parts[1]) : "";
        this.name.setFirstName(firstName);
        this.name.setFamilyName(familyName);
    }
    /**
     * Generates a gamertag based on the player's name and a number.
     *
     * @param number The number to include in the gamertag.
     */
    public void generateGamertag(int number) {
        if (number >= 1 && number <= 100) {
            String firstNameReversed = new StringBuilder(name.getFirstName()).reverse().toString().toLowerCase();
            String familyNameReversed = new StringBuilder(name.getFamilyName()).reverse().toString().toLowerCase();
            this.gamerTag = firstNameReversed + familyNameReversed + number;
        }
    }
    /**
     * Capitalizes the first letter of a string.
     *
     * @param str The string to capitalize.
     * @return The capitalized string.
     */
    private String capitalize(String str) {
        return str.isEmpty() ? "" : Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The new name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the gamer tag of the player.
     *
     * @return The gamer tag of the player.
     */
    public String getGamerTag() {
        return gamerTag;
    }

    /**
     * Sets the gamer tag of the player.
     *
     * @param gamerTag The new gamer tag of the player.
     */
    public void setGamerTag(String gamerTag) {
        this.gamerTag = gamerTag;
    }
    /**
     * Gets the object used for rolling (e.g., PairOfDice).
     *
     * @return The object used for rolling.
     */
    public Rollable getRollable() {
        return roller;
    }
    
    /**
     * Sets the object used for rolling (e.g., PairOfDice).
     *
     * @param roller The object used for rolling.
     */
    public void setRollable(Rollable roller) {
        this.roller = roller;
    }


    /**
     * Rolls the dice and gets the score.
     *
     * @return The sum of the dice values.
     */
    public int rollDice() {
        return dice.rollDice();
    }

    /**
     * Gets the score of the dice.
     *
     * @return The sum of the dice values.
     */
    public int getDiceScore() {
        return dice.getDiceScore();
    }

    /**
     * Gets the pair of dice used by the player.
     *
     * @return The pair of dice.
     */
    public PairOfDice getDice() {
        return dice;
    }

    /**
     * Returns a string representation of the player.
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", gamerTag='" + gamerTag + '\'' +
                ", dice=" + dice +
                '}';
    }
}