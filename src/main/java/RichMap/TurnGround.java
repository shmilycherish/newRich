package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-26
 * Time: 下午10:21
 * To change this template use File | Settings | File Templates.
 */
public class TurnGround extends Ground{

    @Override
    public GroundType getGroundType() {
        return GroundType.Turn;
    }
}