package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-17
 * Time: 下午11:29
 * To change this template use File | Settings | File Templates.
 */
public class HospitalGround extends Ground {
    @Override
    public String getDisplayName() {
        return "H";
    }

    @Override
    public GroundType getGroundType() {
        return GroundType.Hospital;
    }
}
