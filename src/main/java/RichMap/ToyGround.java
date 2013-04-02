package RichMap;

import Tool.ColorPrint;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午6:53
 * To change this template use File | Settings | File Templates.
 */
public class ToyGround extends Ground {


    @Override
    public GroundType getGroundType() {
        return GroundType.Toy;
    }

    @Override
    public void printGroundDisplayName(ColorPrint colorPrint) {
        colorPrint.printColorString(GroundType.Toy.getDisplayName());
    }
}
