package Player;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午10:07
 * To change this template use File | Settings | File Templates.
 */
public class SunMeiMeiPlayer extends Player {
    public SunMeiMeiPlayer(int funds) {
        super(funds);
    }

    @Override
    public String getCharacterName() {
        return "孙美美";
    }

    @Override
    public String getDisplayName() {
        return "S";
    }
}
