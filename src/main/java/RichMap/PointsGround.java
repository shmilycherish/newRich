package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午7:33
 * To change this template use File | Settings | File Templates.
 */
public class PointsGround extends Ground {
    private  int points;
    public PointsGround(int points) {
        this.points=points;
    }

    public PointsGround() {

    }

    @Override
    public String getDisplayName() {
        return "$";
    }

    @Override
    public GroundType getGroundType() {
        return GroundType.Points;
    }

    public int getPoints() {
        return points;
    }
}
