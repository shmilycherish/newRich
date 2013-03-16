package Player;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午10:10
 * To change this template use File | Settings | File Templates.
 */
public class JinBaoBeiPlayer extends Player {
    public JinBaoBeiPlayer(int funds) {
        super(funds);
    }

    @Override
    public String getCharacterName() {
        return "金宝贝";
    }

    @Override
    public String getDisplayName() {
        return "J";
    }
}
