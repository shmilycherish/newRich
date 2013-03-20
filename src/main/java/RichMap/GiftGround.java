package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public class GiftGround extends Ground {
    @Override
    public String getDisplayName() {
        return "G";
    }

    @Override
    public GroundType getGroundType() {
        return GroundType.Gift;
    }
}
