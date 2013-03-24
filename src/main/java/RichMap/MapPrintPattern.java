package RichMap;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-23
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
public class MapPrintPattern {

    private final int LENGTH=29;
    private final int WIDTH=6;
    private String[][] map=new String[LENGTH][WIDTH];
    private StringBuffer stringBuffer=new StringBuffer();
    public String generateMapPrintPattern(List<Ground> groundList) {
        generateFirstLine(groundList);
        generateMiddleLine(groundList);
        generateLastLine(groundList);
        return stringBuffer.toString();
    }



    private void generateFirstLine(List<Ground> groundList) {
        for(int count=0;count<LENGTH;count++) {
            stringBuffer.append(groundList.get(count).getGroundType().getDisplayName()) ;
        }
        stringBuffer.append("\n");
    }

    private void generateMiddleLine(List<Ground> groundList) {
        for(int lastGroundIndex=LENGTH,firstGroundIndex=groundList.size()-1,count=0;count<WIDTH;count++,lastGroundIndex++,firstGroundIndex--) {
            generateLine(groundList.get(firstGroundIndex),groundList.get(lastGroundIndex));
        }
    }

    private void generateLine(Ground firstGround, Ground lastGround) {
        stringBuffer.append(firstGround.getGroundType().getDisplayName());
        stringBuffer.append(generateSpaceString());
        stringBuffer.append(lastGround.getGroundType().getDisplayName());
        stringBuffer.append("\n");
    }

    private StringBuffer generateSpaceString() {
        StringBuffer stringBuffer=new StringBuffer();
        for(int count=0;count<LENGTH-2;count++){
            stringBuffer.append(" ");
        }
        return stringBuffer;
    }


    private void generateLastLine(List<Ground> groundList) {
        for(int index=groundList.size()-WIDTH-1,count=0;count<LENGTH;count++,index--) {
            stringBuffer.append(groundList.get(index).getGroundType().getDisplayName()) ;
        }
        stringBuffer.append("\n");
    }
}
