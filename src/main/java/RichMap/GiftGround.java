package RichMap;

import Tool.ColorPrint;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午7:07
 * To change this template use File | Settings | File Templates.
 */
public class GiftGround extends Ground {


    @Override
    public GroundType getGroundType() {
        return GroundType.Gift;
    }

    @Override
    public void printGroundDisplayName(ColorPrint colorPrint) {
        colorPrint.printColorString(GroundType.Gift.getDisplayName());
    }
}
