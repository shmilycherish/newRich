package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
public  abstract class Ground {
    public Ground(){};
    public abstract  String getDisplayName();


    public abstract GroundType getGroundType();
}
