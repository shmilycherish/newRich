package RichMap;

import Tool.ColorPrint;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午8:30
 * To change this template use File | Settings | File Templates.
 */
public class StartGround  extends Ground{




    @Override
    public GroundType getGroundType() {
        return GroundType.Start;
    }

    @Override
    public void printGroundDisplayName(ColorPrint colorPrint) {
        colorPrint.printColorString(GroundType.Start.getDisplayName());
    }
}
