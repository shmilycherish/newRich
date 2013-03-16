package Player;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午8:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class Player {
    private int funds;
    private int points ;
    private String  characterName ;
    private String  displayName ;
    public Player(int funds){
        this.funds = funds;
    }
    public abstract String getCharacterName();
    public abstract String getDisplayName();

    public int getFunds(){
        return this.funds;
    }
}
