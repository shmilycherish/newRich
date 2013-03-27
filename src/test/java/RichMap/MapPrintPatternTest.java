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
    public void shouldGetRightDataWhenGenerateMapPrintPattern1(){
        RichGameMap richGameMap=new RichGameMap();
        MapPrintPattern  mapPrintPattern=new MapPrintPattern();
        List<Ground> groundList=new ArrayList<Ground>();
        for(int i=0;i<richGameMap.getTotalGroundNumber();i++){
            groundList.add(richGameMap.getGround(i)) ;
        }
        List<Ground> mapPattern=mapPrintPattern.generateMapPrintPattern(groundList);
        assertThat(mapPattern.get(0).getGroundType(),is(GroundType.Start));
        assertThat(mapPattern.get(1).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(13).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(14).getGroundType(),is(GroundType.Hospital));
        assertThat(mapPattern.get(15).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(27).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(28).getGroundType(),is(GroundType.Toy));
        assertThat(mapPattern.get(29).getGroundType(),is(GroundType.Turn));
        assertThat(mapPattern.get(30).getGroundType(),is(GroundType.Points));
        assertThat(mapPattern.get(31).getGroundType(),is(GroundType.Empty));
        assertThat(mapPattern.get(57).getGroundType(),is(GroundType.Empty));
        assertThat(mapPattern.get(58).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(59).getGroundType(),is(GroundType.Turn));
        assertThat(mapPattern.get(60).getGroundType(),is(GroundType.Points));
        assertThat(mapPattern.get(61).getGroundType(),is(GroundType.Empty));
        assertThat(mapPattern.get(87).getGroundType(),is(GroundType.Empty));
        assertThat(mapPattern.get(88).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(89).getGroundType(),is(GroundType.Turn));
        assertThat(mapPattern.get(180).getGroundType(),is(GroundType.Points));
        assertThat(mapPattern.get(208).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(209).getGroundType(),is(GroundType.Turn));
        assertThat(mapPattern.get(210).getGroundType(),is(GroundType.Magic));
        assertThat(mapPattern.get(211).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(223).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(224).getGroundType(),is(GroundType.Prison));
        assertThat(mapPattern.get(225).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(237).getGroundType(),is(GroundType.Clearing));
        assertThat(mapPattern.get(238).getGroundType(),is(GroundType.Gift));
        assertThat(mapPattern.get(239).getGroundType(),is(GroundType.Turn));
    }
}
