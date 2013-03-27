package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-26
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
public class GroundFactory {
    static Ground newEmptyGround(){
        return new EmptyGround();
    }
    static Ground newTurnGround(){
        return new TurnGround();
    }
}
