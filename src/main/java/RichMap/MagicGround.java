package RichMap;

import Tool.ColorPrint;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午7:10
 * To change this template use File | Settings | File Templates.
 */
public class MagicGround extends Ground {



    @Override
    public GroundType getGroundType() {
        return GroundType.Magic;
    }

    @Override
    public void printGroundDisplayName(ColorPrint colorPrint) {
        colorPrint.printColorString(GroundType.Magic.getDisplayName());
    }
}
