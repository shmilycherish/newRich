package Player;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午9:33
 * To change this template use File | Settings | File Templates.
 */
public class QianFuRenPlayer extends Player {
    public QianFuRenPlayer(int funds) {
        super(funds);
    }

    @Override
    public String getCharacterName() {
        return "钱夫人";
    }

    @Override
    public String getDisplayName() {
        return "Q";
    }
}
