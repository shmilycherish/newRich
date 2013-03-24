package RichMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-22
 * Time: 下午10:46
 * To change this template use File | Settings | File Templates.
 */
public class MapPrintPatternTest {
    @Test
    public void shouldGetRightDataWhenGenerateMapPrintPattern(){
        RichGameMap richGameMap=new RichGameMap();
        MapPrintPattern  mapPrintPattern=new MapPrintPattern();
        List<Ground> groundList=new ArrayList<Ground>();
        for(int i=0;i<richGameMap.getTotalGroundNumber();i++){
            groundList.add(richGameMap.getGround(i)) ;
        }
        String mapPattern=mapPrintPattern.generateMapPrintPattern(groundList);
        System.out.print(mapPattern);
        assertThat(mapPattern.charAt(0),is('S'));
        assertThat(mapPattern.charAt(1),is('0'));
        assertThat(mapPattern.charAt(13),is('0'));
        assertThat(mapPattern.charAt(14),is('H'));
        assertThat(mapPattern.charAt(15),is('0'));
        assertThat(mapPattern.charAt(27),is('0'));
        assertThat(mapPattern.charAt(28),is('T'));
        assertThat(mapPattern.charAt(29),is('\n'));
        assertThat(mapPattern.charAt(30),is('$'));
        assertThat(mapPattern.charAt(31),is(' '));
        assertThat(mapPattern.charAt(57),is(' '));
        assertThat(mapPattern.charAt(58),is('0'));
        assertThat(mapPattern.charAt(59),is('\n'));
        assertThat(mapPattern.charAt(180),is('$'));
        assertThat(mapPattern.charAt(208),is('0'));
        assertThat(mapPattern.charAt(210),is('M'));
        assertThat(mapPattern.charAt(211),is('0'));
        assertThat(mapPattern.charAt(223),is('0'));
        assertThat(mapPattern.charAt(224),is('P'));
        assertThat(mapPattern.charAt(225),is('0'));
        assertThat(mapPattern.charAt(237),is('0'));
        assertThat(mapPattern.charAt(238),is('G'));
        assertThat(mapPattern.charAt(239),is('\n'));
    }
}
